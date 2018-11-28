package ru.tsypaev.patterns.ProxyPattern.robot;

public class LightRobot implements Robot {

    private String name;
    private int points;

    LightRobot(int points, String name) {
        this.points = points;
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void damage(int points) {
        if (this.points - points < 0) {
            System.out.println(this.name + " is suicide!");
            this.points=0;
        } else {
            this.points -= points;
        }
    }

    @Override
    public String toString() {
        return "robot.LightRobot{" +
                "points=" + points +
                '}';
    }
}
