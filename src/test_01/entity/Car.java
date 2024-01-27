package test_01.entity;

public class Car {
    private int id;
    private String name;
    private double speed;

    public Car(int id, String name, double speed) {
        this.id = id;
        this.name = name;
        this.speed = speed;
    }

    public Car() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", speed=" + speed +
               '}';
    }
}
