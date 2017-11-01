public class Net {
    double xPos, yPos, xInc, yInc;
    double rotation;
    double rotationInc;
    boolean swing;
    double [] position = {xPos, yPos, xInc, yInc};

    public Net (double xPox, double yPox, double xInc, double yInc, double rotation, double rotationInc, boolean swing){
        this.position = new double[]{xPox, yPox, xInc, yInc};
        this.rotation = rotation;
        this.rotationInc = rotationInc;
        this.swing = swing;
    }

    public void updateRotation(){}
    public void updatePosition(){}
    public void updateInc(){};
    public void rotate(){};
}
