import java.awt.*;

/**
 * Create a Spiderweb
 * 
 * @author Santiago Sánchez y Jonathan Suárez 
 * @version 20/02/2024
 */

public class Spiderweb{
    private int strands;
    private int radio;
    private double angle;
    private Web web;
    private Spider spider;
    private Strand strand;
    private Bridge bridge;
    
    /**
     * Constructor Spiderweb
     * @param strands, quantity of the strands in the Spiderweb
     * @param radio, radio of the strands in the SpiderWeb
     */
    public Spiderweb(int strands, int radio){
        int[] center = {150,150};
        this.web = new Web(radio);
        this.strand = new Strand (strands, radio);
        this.spider = new Spider (center);
        this.angle = 360/strands;
    }
    
    /**
     * Add a new bridge into the Spiderweb
     * @param color, color of the Bridge
     * @param distance, distance from the center where the Bridge is
     * @param firsStrand, Strand where the bridge start
     */
    public void addBridge(String color, int distance, int firstStrand){
        bridge = new Bridge(color, angle , distance, firstStrand);  
        bridge.addBridge(distance, firstStrand);
    }
    
    /**
     * Relocate an existent Bridge to the desired distance
     * @param color, color of the Bridge
     * @param distance, distance from the center where the Bridge will be
     */
    public void relocateBridge(String color, int distance){
        bridge.relocateBridge(color, distance);
    }
    
    /**
     * Delete a Bridge given its color.
     * @param color, color of the Bridge
     * @param distance, distance from the center where the Bridge is
     */
    public void delBridge(String color){
        bridge.delBridge(color);
        }
        
    
}

