package DAT23B;

import java.time.LocalDate;
import java.util.ArrayList;

public class BankApp3 {
    public static void main(String[] args) {
        Account a1 = new Indlaan("Joe Pass", 5);
        Account a2 = new Hojrente("jimmy Hendrix", 10, 10000, LocalDate.of(2023, 6, 24));
        Account a3 = new Kredit("John Hitler", 5 , 10000);
        Account a4 = new BørneOpsparing("Jan Doski", 5, 19000, LocalDate.of(2000, 7, 31));

        ArrayList<Account> list = new ArrayList<Account>();
        list.add(a1);
        list.add(a2);

        for (Account a: list) a.printTransactions();
        for (Account a: list) a.deposit(100);
        for (Account a: list) a.printTransactions();

        a3.withdraw(15000);
        a3.printTransactions();

        a4.withdraw(15000);
        a4.printTransactions();
    }
}

class Indlaan extends Account {
    Indlaan(String ow, double ir){
        super(ow, ir);
    }
    void withdraw(double amount) {
        if (balance>=amount) {
            super.withdraw(amount);
        }
        else
            System.out.println("Du kan højst hæve " + balance + "Kr.");
    }
}


class Hojrente extends Account {
    LocalDate releaseDate;

    Hojrente(String ow, double ir, double startBalance, LocalDate rd) {
        super(ow, ir);
        super.deposit(startBalance);
        releaseDate = rd;

    }

    void deposit(double amount) {
        System.out.println("Du kan ikke sætte penge ind på denne konto");
    }

    void withdraw(double amount) {
        if (releaseDate.isAfter(LocalDate.now()))
            System.out.println("Du kan først hæve efter " + releaseDate);
        else
            super.withdraw(amount);
    }
}

class Kredit extends Account {
    Kredit(String ow, double ir, double startBalance) {
        super(ow, ir);
        super.deposit(startBalance);
    }

    @Override
    void withdraw(double amount) {
        if ((balance - amount) >= -10000) {
            super.withdraw(amount);
        } else
            System.out.println("Du har kredit på max 10.000 Kr.");

    }

        }
    class BørneOpsparing extends Account {
        LocalDate birthdate;

        BørneOpsparing(String ow, double ir, double startBalance, LocalDate bd) {
            super(ow, ir);
            super.deposit(startBalance);
            birthdate = bd;
        }

        void withdraw(double amount) {
            int yearsOld = LocalDate.now().compareTo(birthdate);
            if (yearsOld < 18) {
                System.out.println("Du kan først hæve pengene, når du fylder 18 år"); }
                else
                super.withdraw(amount);
        }
    }