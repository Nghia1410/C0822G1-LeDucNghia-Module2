package ss7_lop_animal_va_interface_edible.bai_tap.colorable;

public class Square extends Shape
        implements Colorable {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println(" Color all four sides");
    }
}
