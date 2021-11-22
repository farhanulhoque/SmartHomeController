//package itec3030.assignments.a2;

import newtemp.NewTempSensor.NewTempSensorDriver;
import newtemp.NewTempSensor.Observer;


public class NewTempSensorAdapter implements Observer, AbstractNewTempSensorAdapter {
    private NewTempSensorDriver driver = new NewTempSensorDriver();
    private String id;
    private int reading;

    public NewTempSensorAdapter(){
        driver.registerObserver(this);
    }

    @Override
    public NewTempSensorDriver getAdatptee() {
        return driver;
    }

    @Override
    public void update(int temp) {
        reading = temp;
        System.out.printf("Sensor(%s) receiving new temperature: %d \n" ,id, temp);
    }
    public void setID(String id){
        this.id = id;
    }
    public int getReading(){
        return reading;
    }
    public void  newTemperature (int temp){
        driver.newTemperature(temp);
    }
}
