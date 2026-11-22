/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coordinateproject;

/**
 *
 * @author beril
 */
public class Quadratic {
    private int a,b,c;
    private double discriminant;
    private boolean hasRoot;
    private double[] roots;
    public Quadratic(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
        this.calculateDiscriminant();
        this.calculateRoots();
    }
    public Quadratic(){
    this(2,3,4);
    this.calculateDiscriminant();
    this.calculateRoots();
    
    }
    public void calculateDiscriminant(){
        this.discriminant=(Math.pow(b,2)-4*a*c);
       
       
    }
    public boolean hasRoot(){
        if(this.discriminant>0 || this.discriminant==0){
            return true;
        }
        else{
            return false;
        }
    }
    public void calculateRoots(){
        this.roots=new double[2];
        this.roots[0]=(-b+(Math.sqrt(this.discriminant))/(2*a));
        this.roots [1]=(-b-(Math.sqrt(this.discriminant))/(2*a));
    }
    public int getA(){
        return this.a;
    }
    public int getB(){
        return this.b;
}
    public int getC(){
        return this.c;
    }
    public boolean getHasRoot(){
        return hasRoot;
    }
    public double[] getRoots(){
        return this.roots;
    }
    public void setA(int a){
        this.a=a;
        this.calculateDiscriminant();
        this.calculateRoots();
        
    }
    public void setB(int b){
       this.b=b; 
       this.calculateDiscriminant();
       this.calculateRoots();
        
    }
    public void setC(int c){
        this.c=c;
        this.calculateDiscriminant();
        this.calculateRoots();
        
    
    }
    public void writeAllAttributes(){
        System.out.println("Denklem:"+a+"x^2"+b+"x"+" "+c);
        System.out.println("Discriminant:"+this.discriminant);
        System.out.println("Kök var mı:"+this.hasRoot());
        if(this.discriminant>0||this.discriminant==0){
            System.out.println("kök 1:"+roots[0]);
            System.out.println("kök 2:"+roots[1]);
        }
        else{
            System.out.println("Gerçel kök yok");
        }
    }
    
    
    
    
    
    
}
