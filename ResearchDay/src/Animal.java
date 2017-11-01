import java.util.Random;

public class Animal {
    String name;
    String description;
    double xPos, yPos, xInc, yInc;
    boolean caught;
    double position[] = {xPos, yPos, xInc, yInc};
    final int x = 0;
    final int y = 1;
    final int xi = 2;
    final int yi = 3;

    public Animal(String name, String description, double xPos, double yPos, double xInc,double yInc, boolean caught){
        this.name = name;
        this.description = description;
        this.caught = caught;
        this.position = new double[] {xPos, yPos, xInc, yInc};
    }



    // change animal direction randomly
    public int randomDirection(){
        Random rand = new Random();
        int n = rand.nextInt(100)+1;
        return (n > 98) ? -1: 1;
    }

    public void updateDirection(){
        if(position[x] >= 900 || position[x] < 0) {
            position[xi] *= -1;
        }
        else {
            position[xi] = position[xi] * randomDirection();
        }

        if(position[y] >= 550 || position[y] < 100) {
            position[yi] *= -1;
        }
        else {
            position[yi] = position[yi] * randomDirection();
        }
    }

    public void updatePosition() {
//        position[x] = position[x] + position[xi];
//        position[y] = position[y] + position[yi];
          position[x] += position[xi];
          position[y] += position[yi];

    }

    public void move(){
        updateDirection();
        updatePosition();
    }

    // just for test
    public String toString() {
        return name + " is on position" + "("+position[x]+", "+ position[y]+") with speed"+ "("+position[xi]+", "+ position[yi]+")" ;
    }
    // just for test
    public static void main(String[] args) {
        Animal a1 = new Animal("a1 ", " ", 400, 100, 2, 2, false);
        for (int i = 0; i < 1000; i++) {
            a1.move();
            System.out.println(a1);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
