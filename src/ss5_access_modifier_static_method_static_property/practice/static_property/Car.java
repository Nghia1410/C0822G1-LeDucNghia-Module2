package ss5_access_modifier_static_method_static_property.practice.static_property;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;
    public Car(String name,String engine){
        this.name=name;
        this.engine=engine;
        numberOfCars++;
    }

    public Car() {

    }

    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
