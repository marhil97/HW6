package de.uni.koeln.se;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {

    private ArrayList<Integer> myList = new ArrayList<Integer>(100);

    public ArrayList<Integer> getMyList() {
        return myList;
    }

    public void setMyList(ArrayList<Integer> myList) {
        this.myList = myList;
    }

    public ArrayList generateList() {

        for(int i = 1; i < 101; i++) {
            myList.add(i);
        }

        Collections.shuffle(myList);
        return myList;
    }
}
