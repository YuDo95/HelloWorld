package DiceGame;

public class OneHundred {
        Player p1 = new Player("Yusuf");
        Player p2 = new Player("Ali");
        Player p3 = new Player("Hamsa");

        int rounds = 0;

        void play() {
            System.out.println(p1.name + "\t" + p2.name + "\t\t" + p3.name);
            while (true) {
                rounds++;
                p1.turn();
                if (p1.points >= 100) {
                    System.out.println("Tillykke " + p1.name +  "du har " + p1.points + " og har brugt " + rounds + " ture");
                    break;
                }
                p2.turn();
                if (p2.points >= 100) {
                    System.out.println("Tillykke " + p2.name + " du har " + p2.points + " og har brugt " + rounds + " ture");
                    break;
                }
                p3.turn();
                if (p3.points >= 100) {
                    System.out.println("Tillykke " + p3.name + " du har " + p3.points + " og har brugt " + rounds + " ture");
                    break;

                }
                System.out.println(p1.points+"\t\t "+p2.points+"\t\t"+p3.points);
            }
        }

    public static void main(String[] args) {
            OneHundred game = new OneHundred();
            game.play();
    }
}
