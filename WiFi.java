//package itec3030.assignments.a2;

public class WiFi extends AddOnDecorator {
    public WiFi(OurFurnace ourFurnace) { super.ourFurnace =ourFurnace; }
    @Override
    public void turnOn() {
        System.out.print("\"Wifi: Initialized\". ");
        ourFurnace.turnOn();
    }
}
