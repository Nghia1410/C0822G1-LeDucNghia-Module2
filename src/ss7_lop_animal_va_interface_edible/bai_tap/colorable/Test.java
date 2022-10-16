package ss7_lop_animal_va_interface_edible.bai_tap.colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];

        shape[0] = new Square(7);
        shape[1] = new Rectangle(7, 15);
        shape[2] = new Circle(8);
        Shape.printShape(shape);
        for (Shape x : shape) {
            if (x instanceof Colorable) {
                ((Colorable) x).howToColor();

            }
        }
    }
}
