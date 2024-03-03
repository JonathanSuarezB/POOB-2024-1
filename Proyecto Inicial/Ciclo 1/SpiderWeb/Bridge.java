import java.awt.*;

/**
 * Create a Bridge between two Strands in the Web.
 * 
 * @author Santiago Sánchez y Jonathan Suárez 
 * @version 20/02/2024
 */

public class Bridge{
    private String color;
    private double radio;
    private Line bridge;
    private double distance;
    private double angle;
    private int firstStrand;
    
    /**
     * Constructor of the Bridge
     * 
     * @param color, color of the Bridge
     * @param bridge, Line that draw the Bridge
     * @param distance, distance from the centre where the bridge is
     * @param angle, angle between each strand
     * @param firstStrand, Strand where the bridge start
     */
    public Bridge(String color, double angle, int distance, int firstStrand){
        this.color = color;
        this.radio = radio;
        this.distance = distance;
        this.firstStrand = firstStrand;
        this.angle = angle;
    }
    
    /**
     * Give a Brigde the given properties.
     * @param color, color of the Bridge
     * @param distance, distance from the center where the Bridge is
     * @param firsStrand, Strand where the bridge start
     */
    public void addBridge(int distance, int firstStrand){
        double ang = 360/angle;
        double xInitial = 150 + (distance * Math.cos(Math.toRadians(angle * (10 - firstStrand))));
        double yInitial = 150 + (distance * Math.sin(Math.toRadians(angle * (10 - firstStrand))));
        double xFinal = 150 + (distance * Math.cos(Math.toRadians(angle * (9 - firstStrand))));
        double yFinal = 150 + (distance * Math.sin(Math.toRadians(angle * (9 - firstStrand))));
        double [] start = {xInitial, yInitial};
        double [] end = {xFinal, yFinal};
        bridge = new Line(color, start, end);
        bridge.makeVisible();
    }
    
    /**
     * Relocate a Bridge given its color.
     * @param color, color of the Bridge
     * @param distance, distance from the center where the Bridge is
     */
    public void relocateBridge(String color, int distance){
        if (this.color == color){
            this.bridge.makeInvisible();
            this.addBridge(distance, this.firstStrand);
            this.bridge.makeVisible();
        }
    }

    /**
     * Delete a Bridge given its color.
     * @param color, color of the Bridge
     * @param distance, distance from the center where the Bridge is
     */
    public void delBridge(String color){
        if (this.color == color){
            this.bridge.makeInvisible();
        }
    }
}

    