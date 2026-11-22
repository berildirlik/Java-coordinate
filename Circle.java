/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coordinateproject;

/**
 *
 * @author beril
 */
public class Circle {
    
    private double radius;
    private double perimeter;
    private double area;
    public void calculatePerimeter(){
        this.perimeter=Math.PI*2*radius;
    }
    public void calculateArea(){
        this.area=Math.PI*Math.pow(radius, 2);
    }
    public double getRadius(){
        return this.radius;
    }
    public double  getArea(){
        return this.area;
    }
        public double getPerimeter(){
        return this.perimeter;
}
        public Circle(){
            this.radius=1.0;
            this.calculateArea();
            this.calculatePerimeter();
        }
        public Circle(double radius){
        this.radius = radius;
        this.calculateArea();
        this.calculatePerimeter();
    }
        public void setRadius(double radius){
            this.radius=radius;
            this.calculateArea();
            this.calculatePerimeter();
        }
}
