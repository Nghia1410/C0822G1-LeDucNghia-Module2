package ss7_lop_animal_va_interface_edible.bai_tap.resizeable;

public class Square extends Shape {
    private double size;

    public Square() {

    }

    public Square(double size) {
        this.size = size;
    }

    public Square(double size, String color, boolean filled) {
        super(color, filled);
        this.size = size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public double getAreaSquare() {
        return size * size;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSize()
                + ", which is a subclass of "
                + super.toString()
                + ", Area=" +
                +getAreaSquare();
    }

    public void resize(double percent) {
        this.size += this.size * percent / 100;
    }
}