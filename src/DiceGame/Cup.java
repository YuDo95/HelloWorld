package DiceGame;

public class Cup {
    Dice d1 = new Dice();
    Dice d2 = new Dice();
    Dice d3 = new Dice();
    Dice d4 = new Dice();

    int result1;
    int result2;
    int result3;
    int result4;

    void roll(){
        result1 = d1.roll();
        result2 = d2.roll();
        result3 = d3.roll();
        result4 = d4.roll();
    }

    int getSum(){
        return result1 + result2 + result3 + result4;
    }

    public static void main(String[] args) {
        Cup c = new Cup();
        for (int i = 1; i <= 10; i++) {
        }
        c.roll();
        System.out.println(c.getSum());
    }
}
