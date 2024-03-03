import java.awt.*;

/**
 * A line that can be manipulated and draw itself on the Canvas
 * 
 * @author Santiago Sánchez y Jonathan Suárez 
 * @version 20/02/2024
 */
public class Line
{
    private double xInitial;
    private double yInitial;
    private double xFinal;
    private double yFinal;
    private String color;
    private boolean isVisible;

    /**
     * Constructor Line
     * 
     * @param color, color of the Line
     * @param xInitial, initial position in x
     * @param yInitial, initial position in y
     * @param xFinal, final position in x
     * @param yFinal, final position in y
     */
    public Line(String color, double[] from, double[] to){
        this.color = color;
        this.xInitial = from[0];
        this.yInitial = from[1];
        this.xFinal = to[0];
        this.yFinal = to[1];
    }

    /** 
     * Give the lenght of the Line
     * @return int, value of the lenght of the Line
     */
    public int distanciaTotal(){
        System.out.println(Math.abs(Math.sqrt(Math.pow(xFinal - xInitial, 2) + Math.pow(yFinal - yInitial, 2))));
        return (int) Math.abs(Math.sqrt(Math.pow(xFinal - xInitial, 2) + Math.pow(yFinal - yInitial, 2)));
    }
    
    /**
     * Make visible the Line in the Canvas
     */
    public void makeVisible(){
        isVisible = true;
        draw();
    }
    
    /**
     * Make invisible the Line
     */
    public void makeInvisible(){
        erase();
        isVisible = false;
    }
    
    /*
     * Draw the structure of the Line
     */

    private void draw() {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color,
                new java.awt.geom.Line2D.Double(xInitial, yInitial, xFinal, yFinal));
            canvas.wait(10);
        }
    }

    /*
     * Erase the structure of the Line
     */
    private void erase(){
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}
