package ru.tsypaev.patterns.strategy.weapons;

import ru.tsypaev.patterns.strategy.Weapon;

/**
 * @author Vladimir Tsypaev
 */
public class Axe implements Weapon {

    private String name;

    public Axe(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println(String.format("Топор %s совершил удар!", name));
    }
}
