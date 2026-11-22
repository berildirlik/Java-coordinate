/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coordinateproject;

/**
 *
 * @author beril
 */
public class Line {
    private Point start;
    private Point end;
    private double length;
    public Line(Point start,Point end){
        this.start=start;
        this.end=end;
        this.length=start.calculateDistance(end);
        
    }
    public Line(){
        this.start=new Point(0,0);
        this.end=new Point(1,1);
        this.length=start.calculateDistance(end);
    }
    public Point getStart(){
        return this.start;
    }
     public Point getEnd(){
        return this.end;
    }
      public double getLength(){
        return start.calculateDistance(end);
    }
}
    

