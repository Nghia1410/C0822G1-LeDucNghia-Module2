package ss7_lop_animal_va_interface_edible.bai_tap.resizeable;

public class InterfaceResizeableTest {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10) + 1;
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(x, "gray", false);
        shapes[1] = new Rectangle(x, x, "black", true);
        shapes[2] = new Square(x, "white", true);
        for (Shape a : shapes) {
            System.out.println(a);
        }

        for (Shape a : shapes) {
            a.resize((int) Math.floor(Math.random() * 100) + 1);
        }
        System.out.println("\n");
        Shape.printShape(shapes);
    }
}

