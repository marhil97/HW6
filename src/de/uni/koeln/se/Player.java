package de.uni.koeln.se;

public class Player {

    private int number;

    BetMoreGame bmg = new BetMoreGame();

    public void play() {
        bmg.pickCard();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
