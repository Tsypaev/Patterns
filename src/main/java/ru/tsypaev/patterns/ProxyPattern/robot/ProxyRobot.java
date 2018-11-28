package ru.tsypaev.patterns.ProxyPattern.robot;

public class ProxyRobot implements Robot {

    private int liveShield = 3;

    private final Robot robot;

    public ProxyRobot(Robot robot, int lives) {
        this.robot = robot;
        this.liveShield = lives;
    }

    public ProxyRobot(int points, String name) {
        robot = new LightRobot(points, name);
    }

    public int getPoints() {
        return robot.getPoints();
    }

    public void damage(int points) {
        if (liveShield>0){
            liveShield--;
        } else {
            robot.damage(points);
        }
    }

    @Override
    public String toString() {
        return "robot.ProxyRobot{" +
                "liveShield=" + liveShield +
                ", robot=" + robot +
                '}';
    }
}
