package ru.tsypaev.patterns.ProxyPattern;

import org.junit.jupiter.api.Test;
import ru.tsypaev.patterns.ProxyPattern.robot.ProxyRobot;
import ru.tsypaev.patterns.ProxyPattern.robot.Robot;

import static org.junit.jupiter.api.Assertions.assertEquals;
class ProxyTest {

    @Test
    void dontDamageWhileLiveShieldIsWorking() {
        Robot robot = new ProxyRobot(50, "T2W5");
        for (int i = 0; i < 3; i++) {
            robot.damage(45);
        }
        assertEquals(robot.getPoints(), 50);
    }

    @Test
    void haveDamageWhenLiveShieldIsNotWorking() {
        Robot robot = new ProxyRobot(50, "T2W6");
        for (int i = 0; i < 4; i++) {
            robot.damage(45);
        }
        assertEquals(robot.getPoints(), 5);
    }

    @Test
    void pointsOfRobotCantBeNegative() {
        Robot robot = new ProxyRobot(50, "T2W7");
        for (int i = 0; i < 5; i++) {
            robot.damage(45);
        }
        assertEquals(robot.getPoints(), 0);
    }
}