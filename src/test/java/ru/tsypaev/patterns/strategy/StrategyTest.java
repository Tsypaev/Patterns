package ru.tsypaev.patterns.strategy;

import org.junit.jupiter.api.Test;
import ru.tsypaev.patterns.strategy.characters.King;
import ru.tsypaev.patterns.strategy.characters.Skywalker;
import ru.tsypaev.patterns.strategy.characters.Troll;
import ru.tsypaev.patterns.strategy.weapons.Axe;
import ru.tsypaev.patterns.strategy.weapons.Blade;
import ru.tsypaev.patterns.strategy.weapons.LightBlade;

/**
 * @author Vladimir Tsypaev
 */
public class StrategyTest {

    @Test
    public void test(){
        Character king = new King(80, 180, "Artur", new Blade("Убивач"));
        Character troll = new Troll(140, 200, "Iron", new Axe("Херач"));
        Character skywalker = new Skywalker(100, 160, "Skywalker", new LightBlade("Разорвач"));

        king.about();
        king.getWeapon().attack();

        troll.about();
        troll.getWeapon().attack();

        skywalker.about();
        skywalker.getWeapon().attack();

        troll.setWeapon(new Blade("Обычный"));
        troll.getWeapon().attack();
    }
}
