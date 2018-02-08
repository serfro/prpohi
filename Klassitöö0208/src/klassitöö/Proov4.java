/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klassitöö;
import java.io.*;
/**
 *
 * @author student
 */
public class Proov4 {
    public static void main(String[] args) throws Exception{
       PrintWriter pw=new PrintWriter(new FileWriter("f1.txt"));
       pw.println(new Pall(3,5,2));
       pw.close();
    }
}
