package de.uni.koeln.se;

public class BetMoreGame {

    private int number;

    Shuffle s = new Shuffle();
    GameChair gs = new GameChair();

    public void pickCard() {
        s.generateList();
        number = s.getMyList().get(0);
        gs.getComputer().setNumber(number);

    }
}
