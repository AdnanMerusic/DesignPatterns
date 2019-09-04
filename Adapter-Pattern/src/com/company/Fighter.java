package com.company;

/**
 * @author madnan
 */
public class Fighter implements IFighter {
    private int hitPoints;
    private int attack;
    private int defense;
    private int level;

    @Override
    public void attack() {
        System.out.println("Fighter class attacks: " + attack);
    }

    @Override
    public void defense() {
        System.out.println("Fighter blocks attack with: " + defense);
    }

    @Override
    public void evade() {
        System.out.println("Evading attack...");
    }
}
