package com.company;

/**
 * @author madnan
 */
public class Wizzard implements IWizzard {
    int spellDamage;
    int teleportCd;
    int spellShield;

    @Override
    public void castSpell() {
        System.out.println("Wizzard is casting spell with: " + spellDamage);
    }

    @Override
    public void block() {
        System.out.println("Defensive spell used and blocks: " + spellShield);
    }

    @Override
    public void teleport() {
        System.out.println("Teleporting, attack evaded");
    }
}
