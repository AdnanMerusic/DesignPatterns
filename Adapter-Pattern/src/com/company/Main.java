package com.company;

public class Main {

    public static void main(String[] args) {
        IFighter warrior = new Fighter();
        warrior.attack();
        //Wizzard is IWizzard type here..this doesnt suite us, need addapter to make it IFighter type
        IWizzard merlini = new Wizzard();
        merlini.castSpell();

        IFighter merliniFighter = new WizzardToFighterAdapter(merlini);

        merliniFighter.attack();

    }
}
