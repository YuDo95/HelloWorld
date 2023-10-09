package DAT23B;

public class Pyramid {
    public static void main(String[] args) {
        Volume a1= new Volume(5, 10, 6);
        Volume a2= new Volume(7, 4, 5);
        Volume a3= new Volume(3, 11, 3);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}

class Volume {
    int side1;
    int side2;
    int højde;
    double volume;

    public Volume(int side1, int side2, int højde) {
        this.side1 = side1;
        this.side2 = side2;
        this.højde = højde;
        this.volume = calc();
    }

    double calc() {
        return (double) (this.side1 * this.side2 * this.højde) /4;
    }

    @Override
    public String toString() {
        return "BankApp.Volume{" + "side1=" + side1 + ", side2=" + side2 + ", højde=" + højde + ", volume=" + volume + '}';
    }
}
