/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodutöö;

/**
 *
 * @author student
 */
public class Objekt1 {
    

   protected double x;    
   protected double y;    
   protected double z;
   
   public Objekt1(double x, double y, double r){
       this.x=x;
       this.y=y;
       this.z=z;
   }
   
   public Objekt1(double x, double y){
       this(x, y, 1);
   }

   public boolean kasPuutub(Objekt1 teine){
       return kaugusPallist(teine)<this.getR()+teine.getZ();
   }
   public double kaugusNullist(){
      return Math.sqrt(x*x+y*y);
   }
   public double getX(){return x;}
   public double getY(){return y;}
   public double getR(){return z;}
   public double kaugusPallist(Objekt1 teine){
       double dx=getX()-teine.getX();
       double dy=getY()-teine.getY();
       return Math.sqrt(dx*dx+dy*dy);
   }
   @Override
   public String toString(){
      return "Pall kohal ("+x+", "+y+" - raadius "+z+")";
   }
}


