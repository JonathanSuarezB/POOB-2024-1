import java.awt.*;

/**
 * A figure that represents a Web
 * 
 * @author Santiago Sánchez y Jonathan Suárez 
 * @version 20/02/2024
 */

public class Web{
    private Circle area;
    
    /**
     * Constructor Web
     * @param radio, lenght of the Web
     */
    public Web(int radio){
        area = new Circle (150-radio, 150-radio);
        area.changeSize(radio*2);
        area.changeColor("black");
        area.makeVisible();
    }
    
    /**
     * Make visible the Web in the Canvas
     */
    public void makeVisible(){
        area.makeVisible();
    }
    
    /**
     * Make Invisible the Web in the Canvas
     */
    public void makeInvisible(){
        area.makeInvisible();
    }
    
}
