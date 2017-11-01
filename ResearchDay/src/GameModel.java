import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

public class GameModel {
    Net net;
    ArrayList<Animal> blueCrabList;
    ArrayList<Animal> blueFishList;
    ArrayList<Animal> sturgeonList;
    JellyFish jellyFish;
    HashMap<String, Integer> scoreBoard;
    LocalTime time;

    public GameModel(Net net, ArrayList<Animal> bcList, ArrayList<Animal> bfList,
                     ArrayList<Animal> stList, JellyFish jellyF, HashMap<String,Integer> scoreBoard, LocalTime time){
        this.net = net;
        this.blueCrabList = bcList;
        this.blueFishList = bfList;
        this.sturgeonList = stList;
        this.jellyFish = jellyF;
        this.scoreBoard = scoreBoard;
        this.time = time;
    }

    public boolean collisionDetect(Net net, Animal a){
        return false;
    }

    public void updatePosition(Net n, Animal a){

    }

    public void updateAniamlList(ArrayList<Animal> animalList){
        for(Animal a: animalList){
            a.move();
        }
    }
    public void updateModel(){
        updateAniamlList(this.sturgeonList);
        updateAniamlList(this.blueCrabList);
        updateAniamlList(this.blueFishList);
    }


//    public static void main(String[] args) {
//        GameModel model = new GameModel();
//        for(int i = 0; i < 1000; i++){
//
//            model.updateModel();
//            System.out.println(model.getNet());
//            System.out.println(" NumberOfBlueCrab: "+model.getBlueCrabList());
//            System.out.println(" NumberOfBlueFish: "+model.getBlueFishList());
//            System.out.println(" One " +model.getBlueCrabList().getAnimals().get(0));
//            System.out.println(" One " +model.getBlueFishList().getAnimals().get(0));
//            System.out.println(" ");
//
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }

}
