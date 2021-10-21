package core.basesyntax.figures;

public class Square extends Figure {
    private int radius;

    public Square(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public void about() {
        System.out.println("Figure " + getName()
                + ", with color " + getColor()
                + ", and " + radius + " radius");
    }
}