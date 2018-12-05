package ru.tsypaev.patterns.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class ProxyTest {

    @Test
    void dontDamageWhileLiveShieldIsWorking() {
        Robot robot = new ProxyRobot(50, "T2W5");
        damageRepeat(robot, 45, 3);
        assertEquals(robot.getPoints(), 50);
    }

    @Test
    void haveDamageWhenLiveShieldIsNotWorking() {
        Robot robot = new ProxyRobot(50, "T2W6");
        damageRepeat(robot, 45,4);
        assertEquals(robot.getPoints(), 5);
    }

    @Test
    void pointsOfRobotCantBeNegative() {
        Robot robot = new ProxyRobot(50, "T2W7");
        damageRepeat(robot, 50, 5);
        assertEquals(robot.getPoints(), 0);
    }

    private void damageRepeat(Robot robot, int damage, int count) {
        for (int i = 0; i < count; i++) {
            robot.damage(damage);
        }
    }
}