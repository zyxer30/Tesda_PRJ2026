/***
 * Task12.java
 * 
 * Write a new method in Poin called scale, that will make the point closer by half to (0,0). So for example, point(8,4) after scale wikk be (4,2).
 * 
 * class Point {
 *  private double x;
 *  private double y;
 * }
 * 
 * public Point(double x, double y){
 *  this.x = x;
 *  this.y = y;
 * }
 * 
 * public void print(){
 *  System.Out.println("(" + x + "," + y + ")");
 * }
 * 
 * // Your code goes here
 * 
 * public class Tasksheet124 {
 *  public static void main(String[] args){
 *      Point p = new Point (32), 32};
 *      for (int i = 0; i <5; i++) {
 *          p.scale();
 *          p.print();
 *      }
 * }
 *
 */

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }

    // Your code goes here
    public void scale() {
        this.x = this.x / 2;
        this.y = this.y / 2;
    }
}

public class Task12 { // Renamed file/class to match Task12.java standard
    public static void main(String[] args) {
        // Fixed the array/parentheses syntax typo here:
        Point p = new Point(32, 32); 
        
        for (int i = 0; i < 5; i++) {
            p.scale();
            p.print();
        }
    }
}
