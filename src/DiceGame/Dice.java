package DiceGame;

import java.util.Random;

public class Dice {
    static Random gen = new Random();

    int roll() {
        return gen.nextInt(6) + 1;
    }

    public static void main(String[] args) {
        Dice d = new Dice();
        for (int i = 1; i <= 10; i++) {
            System.out.println(d.roll());
        }
    }
}
