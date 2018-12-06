package ru.tsypaev.patterns.proxy.dynamic;

import org.junit.jupiter.api.Test;
import ru.tsypaev.patterns.proxy.LightRobot;
import ru.tsypaev.patterns.proxy.Robot;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DynamicProxyTest {

    @Test
    void dontDamageWhileLiveShieldIsWorking() {
        Robot robot = (Robot) DynamicProxy.RobotProxy.newInstance(new LightRobot(50, "T2W5"));
        damageRepeat(robot, 45, 3);
        assertEquals(robot.getPoints(), 50);
    }

    @Test
    void haveDamageWhenLiveShieldIsNotWorking() {
        Robot robot = (Robot) DynamicProxy.RobotProxy.newInstance(new LightRobot(50, "T2W5"));
        damageRepeat(robot, 45,4);
        assertEquals(robot.getPoints(), 5);
    }

    @Test
    void pointsOfRobotCantBeNegative() {
        Robot robot = (Robot) DynamicProxy.RobotProxy.newInstance(new LightRobot(50, "T2W5"));
        damageRepeat(robot, 50, 5);
        assertEquals(robot.getPoints(), 0);
    }

    private void damageRepeat(Robot robot, int damage, int count) {
        for (int i = 0; i < count; i++) {
            robot.damage(damage);
        }
    }
}