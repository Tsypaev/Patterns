package ru.tsypaev.patterns.strategy;

/**
 * @author Vladimir Tsypaev
 */
public class Character {

    private int weight;
    private int height;
    private String name;
    private Weapon weapon;

    public Character(int weight, int height, String name, Weapon weapon) {
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void about(){
        System.out.println(String.format("My name is %s, my weight is %d, my height is %d", name, weight, height));
    }
}
