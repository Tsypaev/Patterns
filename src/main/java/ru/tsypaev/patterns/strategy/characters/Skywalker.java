package ru.tsypaev.patterns.strategy.characters;

import ru.tsypaev.patterns.strategy.Character;
import ru.tsypaev.patterns.strategy.Weapon;

/**
 * @author Vladimir Tsypaev
 */
public class Skywalker extends Character {

    public Skywalker(int weight, int height, String name, Weapon weapon) {
        super(weight, height, name, weapon);
    }
}
