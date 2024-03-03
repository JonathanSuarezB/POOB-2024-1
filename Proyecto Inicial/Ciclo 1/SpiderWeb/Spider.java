import java.awt.*;

/**
 * A figure that represents a Spider
 * 
 * @author Santiago Sánchez y Jonathan Suárez 
 * @version 20/02/2024
 */

public class Spider{
    private Circle body;
    private double xCenter;
    private double yCenter;
    
    /**
     * Constructor Spider
     * @param location, location in coordinates [x, y] where the spider spawn
     */
    public Spider(int[] location){
        body = new Circle(location[0]-10, location[1]-10);
        body.changeColor("blue");
        body.makeVisible();
    }
    
    /**
     * Make visible the Spider in the Canvas
     */
    public void makeVisible(){
        body.makeVisible();
    }
    
    /**
     * Make invisible the Spider in the Canvas
     */
    public void makeInvisible(){
        body.makeInvisible();
    }
    
}
