/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klassitöö;

public class Proov {
    public static void main(String[] arg){
       Pall p1=new Pall(3, 5);
       Pall p2=new Pall(4, 6);
       Pall p3=new Pall(-10, 8, 2);
       if(p1.kasPuutub(p2)){System.out.println("1 ja 2 puutuvad");}
       if(p1.kasPuutub(p3)){System.out.println("1 ja 3 puutuvad");}
       else{System.out.println("1 ja 3 ei puutu");}
       System.out.println(p1 + "\nKaugus algkohast: "+p1.kaugusNullist());
       System.out.println(p2);
       System.out.println("Omavaheline kaugus: "+p1.kaugusPallist(p2));
    }
}
