package ru.tsypaev.patterns.strategy.weapons;

import ru.tsypaev.patterns.strategy.Weapon;

/**
 * @author Vladimir Tsypaev
 */
public class LightBlade implements Weapon {

    private String name;

    public LightBlade(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println(String.format("Световой меч %s совершил удар!", name));
    }
}
