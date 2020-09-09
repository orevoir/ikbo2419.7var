package ikbo2419.pr1.mirea;

import java.lang.*;
public class Ball {
    private String colour;
    private int radius;
    public Ball(String n, int a){
        colour = n;
        radius = a;
    }
    public Ball(String n){
        colour = n;
        radius = 0;

    }
    public Ball(){
        colour = "Purple";
        radius = 13;
    }
    public void setradius(int radius) {
        this.radius = radius;
    }
    public void setcolour(String colour) {
        this.colour = colour;
    }
    public String toString(){
        return this.colour+", radius "+this.radius;
    }
}
