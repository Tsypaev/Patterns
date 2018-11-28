package ru.tsypaev.patterns.ProxyPattern;

import ru.tsypaev.patterns.ProxyPattern.robot.ProxyRobot;
import ru.tsypaev.patterns.ProxyPattern.robot.Robot;

public class War {

    public static void main(String[] args) {

        Robot robot = new ProxyRobot(50, "T2W5");
        System.out.println(robot);
        robot.damage(45);


        System.out.println(robot);
        robot.damage(45);
        System.out.println(robot);
        robot.damage(45);
        System.out.println(robot);
        robot.damage(45);
        System.out.println(robot);
        robot.damage(45);
        System.out.println(robot);
    }
}
