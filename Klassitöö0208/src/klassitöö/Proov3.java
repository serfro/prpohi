/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klassitöö;
import java.util.*;

public class Proov3 {
    public static void main(String[] arg) {
        List<Pall> pallid=new ArrayList<Pall>();
        pallid.add(new Pall(3,5));
        pallid.add(new Pall(3,8));
        pallid.add(new Pall(2,5,2));
        pallid.add(new Pall(-3,5));
        
        Pall suurim=pallid.get(0);        
        for(Pall p:pallid){
            if(p.getR()>suurim.getR()){suurim=p;}
            System.out.println(p);
        }
        System.out.println("Suurim: " + suurim);
    }
}
