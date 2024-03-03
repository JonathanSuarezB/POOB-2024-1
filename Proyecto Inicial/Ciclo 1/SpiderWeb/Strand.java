import java.awt.*;
import java.util.ArrayList;

/**
 * Create the Strands for the Spiderweb
 * 
 * @author Santiago Sánchez y Jonathan Suárez 
 * @version 20/02/2024
 */

public class Strand{
    private Line strand;
    private int radius;
    
    /**
     * Constructor of the Strands in the Web
     * @param strands, quantity of the strands in the Spiderweb
     * @param radio, radio of the strands in the SpiderWeb
     */
    public Strand(int strands, int radius){
        double angles = 360/strands;
        double r = radius;
        double [] center = {150, 150};
        for (int s = 1; s < strands+1; s++){
            double xPos = 150 + (r * Math.cos(Math.toRadians(angles*s)));
            double yPos = 150 + (r * Math.sin(Math.toRadians(angles*s)));
            double [] external = {xPos, yPos};
            strand = new Line("white", center, external);
            strand.makeVisible();
        }
    }
    
    /**
     * Make visible the Strand
     */
    public void makeVisible(){
        strand.makeVisible();
    }
    
    /**
     * Make Invisible the Strand
     */
    public void makeInvisible(){
    strand.makeInvisible();
    }
    
    

}