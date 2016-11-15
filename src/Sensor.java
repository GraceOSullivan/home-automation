abstract class Sensor {
    String type;

    abstract void turnOn();

    void setType(String type) {
        this.type = type;
    }

    String getType(){
        return this.type;
    }
}
