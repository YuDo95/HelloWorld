package DAT23B;

import java.util.ArrayList;

public class FigurApp {
    public static void main(String[] args) {
        Figur f1 = new Rektangel(4, 3);
        Figur f2 = new Punkt();
        Figur f3 = new Cirkel(5);
        System.out.println(f3);
        System.out.println(f3.beregnOmkreds());

        ArrayList<Figur> list = new ArrayList<>();
        list.add(f1);
        list.add(f2);
        list.add(f3);
        list.add(new Rektangel(2,5));
        for (Figur f: list) {
            System.out.println(f + " O = " + f.beregnOmkreds() + " A = " + f.beregnAreal());
            System.out.println(f3.beregnAreal());
            System.out.println(f3.beregnOmkreds());
        }
    }
}

abstract class Figur {
    abstract double beregnAreal();
    abstract double beregnOmkreds();
}

class Punkt extends Figur {
    double beregnAreal() {return 0;}
    double beregnOmkreds() {return 0;}
    @Override
    public String toString() {return "Punkt";}
}

class Rektangel extends Figur {
    double hojde;
    double bredde;
    Rektangel (double h, double b){
        hojde = h;
        bredde = b;
    }

    double beregnOmkreds(){
        return 2 * (hojde * bredde);
    }

    double beregnAreal(){
        return hojde * bredde;
    }

    @Override
    public String toString() {
        return "Rektangel h= " + hojde + " b= " + bredde;
    }
}

class Cirkel extends Figur {
    double radius;
    Cirkel (double r){
        radius = r;
    }

    double beregnOmkreds(){
        return (2 * radius) * 3.14;
    }

    double beregnAreal(){
        return (radius * radius) * 3.14;
    }

    @Override
    public String toString() {
        return "Cirkel r = " + radius;
    }
}
