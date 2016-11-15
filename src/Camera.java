abstract class Camera implements SecurityProduct {
    String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
    public void displayTurningOnQuery() {
        System.out.println("Turning the " + getType() + " cameras on...");
    }
}