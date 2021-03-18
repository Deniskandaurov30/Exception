public class Nio {

    private String name;
    private int mileage;

    public Nio(String name, int mileage) {
        this.name = name;
        this.mileage = mileage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    public void DriveAtSpeed(int KmPerHour){
        System.out.println("Drives at"+KmPerHour);
    }
}
