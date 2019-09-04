package com.company;

/**
 * @author madnan
 */
public class WizzardToFighterAdapter implements IFighter{
    IWizzard iWizzard;

    public WizzardToFighterAdapter(IWizzard iWizzard) {
        this.iWizzard = iWizzard;
    }

    @Override
    public void attack() {
        this.iWizzard.castSpell();
    }

    @Override
    public void defense() {
        this.iWizzard.block();
    }

    @Override
    public void evade() {
        this.iWizzard.teleport();
    }
}
