package de.uni.koeln.se;

import java.util.Scanner;

public class GameChair {

    private Player computer;
    private Player player2;
    private Player winner;
    private int i = 0;
    private int n;

    //Shuffle s = new Shuffle();
    Player p = new Player();

    public Player getComputer() {
        return computer;
    }

    public void setComputer(Player computer) {
        this.computer = computer;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public void start() {
        p.play();
        System.out.println("Number Computer: " + computer.getNumber());
        System.out.println("Your Number: " + player2.getNumber());

        Scanner scanner = new Scanner(System.in);
        while (true){
            if(i<5) {
                System.out.println("type in true or false: ");
                String s = scanner.next();
                int r = ((int) (Math.random()*(100 - 1))+1);
                //System.out.println("random: " + r);
                n = s.getMyList().get(r); // Hier ist noch ein Problem, aber hab kein Plan warum es nicht funktioniert!
                //System.out.println("your number is " + n);
                if (s.equals("true")) {
                    getPlayer2().setNumber(n);
                    break;

                } else if (s.equals("false")) {
                    i++;
                    System.out.println("attempt: " + i);

                } else {
                    System.out.println("type in valid value!");
                }
            } else {
                getPlayer2().setNumber(n);
                break;
            }
        }
        //System.out.println("Bye...");
        scanner.close();

        findWinner(computer, player2);
    }



    public Player findWinner(Player c, Player p2) {
        int cNumber = c.getNumber();
        int p2Number = p2.getNumber();
        if(cNumber>p2Number) {
            winner = c;
            System.out.println("Number Computer: " + computer.getNumber());
            System.out.println("Your Number: " + player2.getNumber());
            System.out.println("lol you lost, douchebag!");
        }
        if(p2Number>cNumber) {
            winner = p2;
            System.out.println("Number Computer: " + computer.getNumber());
            System.out.println("Your Number: " + player2.getNumber());
            System.out.println("Winner, Winner Chicken Dinner!");
        } else {
            System.out.println("Number Computer: " + computer.getNumber());
            System.out.println("Your Number: " + player2.getNumber());
            System.out.println("Error!");
        }
        return winner;
    }
}
