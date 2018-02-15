
package ee.tlu.sergei.klassitoo0215;

public class Pallivise {
    Pall lendaja;
    Pall sihtkoht;
    boolean kasPihtas(){
        return lendaja.kasPuutub(sihtkoht);
    }
    void alusta(){
        lendaja=new Pall(10, 200, 10);
        sihtkoht = new Pall(250, 120, 20);
    }
    void liigu(){
        lendaja.liigu();
        System.out.println(lendaja + " " + kasPihtas());
    }
}
