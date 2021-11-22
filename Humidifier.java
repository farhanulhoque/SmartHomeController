//package itec3030.assignments.a2;

public class Humidifier extends AddOnDecorator {
    public Humidifier(OurFurnace ourFurnace) {
        super.ourFurnace = ourFurnace;
    }
    @Override
    public void turnOn() {
        System.out.print("\"Humidifier: On\". ");
        ourFurnace.turnOn();
    }
}
