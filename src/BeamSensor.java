public class BeamSensor extends Sensor {

    @Override
    public void turnOn() {
        setType("beam");
        System.out.println("Turning the " + getType() + " sensors on...");
    }


}
