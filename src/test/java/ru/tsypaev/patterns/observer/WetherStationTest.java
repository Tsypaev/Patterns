package ru.tsypaev.patterns.observer;

import org.junit.jupiter.api.Test;

/**
 * @author Vladimir Tsypaev
 */
class WetherStationTest {

    @Test
    public void observerTest(){
        WetherStation wetherStation = new WetherStation();
        wetherStation.addObserver(new TemperatureObserver());
        wetherStation.addObserver(new PressureObserver());
        wetherStation.addObserver(new HumidityObserver());

        wetherStation.setAttribute(1,2,3);
    }

}