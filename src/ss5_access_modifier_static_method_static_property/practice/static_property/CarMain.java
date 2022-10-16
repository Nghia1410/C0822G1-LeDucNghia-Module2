package ss5_access_modifier_static_method_static_property.practice.static_property;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("mazda","skyadfs12");
        Car car2 = new Car();
//        car1.setName("mazda 3");
//        car1.setEngine("skyadc12");
//        car2.setName("kia");
//        car2.setEngine("sytaib14");
        System.out.println(car1.toString());
    }
}
