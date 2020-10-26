package ikbo2419.pr3.mirea;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint (int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {return "Point (" + x + ", " + y + ")";}

    public void moveUp() {y++;}
    public void moveDown() {y--;}
    public void moveRight() {x++;}
    public void moveLeft() {x--;}
}
