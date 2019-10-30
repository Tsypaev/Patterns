package ru.tsypaev.patterns.strategy.weapons;

import ru.tsypaev.patterns.strategy.Weapon;

/**
 * @author Vladimir Tsypaev
 */
public class Blade implements Weapon {

    private String name;

    public Blade(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println(String.format("Меч %s соверишл удар!", name));
    }
}
