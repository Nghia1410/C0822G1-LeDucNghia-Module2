package ss7_lop_animal_va_interface_edible.thuc_hanh.lop_animal_va_interface_edible;

public class  Chicken extends Animal implements Edible {
    public String howToEat() {
       return "By Mouth";
    }
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
}
