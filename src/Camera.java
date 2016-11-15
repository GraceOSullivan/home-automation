abstract class Camera {
    String type;

    abstract void turnOn();

    void setType(String type) {
        this.type = type;
    }

    String getType(){
        return this.type;
    }

    void displayTurningOnQuery(){
        System.out.println("Turning the " + getType() + " cameras on...");
    }
}