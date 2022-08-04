package homework;

public class Triunghi extends Figura
{
    public Triunghi(double height, double width) {
        super(height, width);
    }

    public double getArea()
    {
        return ((getHeight() * getWidth()) / 2);
    }
}
