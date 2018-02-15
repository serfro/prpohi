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
public class Proov {
    public static void main(String[] arg){
       Objekt1 p1=new Objekt1(3, 5);
       Objekt1 p2=new Objekt1(4, 6);
       Objekt1 p3=new Objekt1(-10, 8, 2);
       if(p1.kasPuutub(p2)){System.out.println("1 ja 2 puutuvad");}
       if(p1.kasPuutub(p3)){System.out.println("1 ja 3 puutuvad");}
       else{System.out.println("1 ja 3 ei puutu");}
       System.out.println(p1 + "\nKaugus algkohast: "+p1.kaugusNullist());
       System.out.println(p2);
       System.out.println("Omavaheline kaugus: "+p1.kaugusPallist(p2));
    }
}
