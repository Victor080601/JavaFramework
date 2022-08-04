package homework;

public class Patrat extends Figura
{
    public Patrat(double height, double width) {
        super(height, width);
    }

    public double getArea()
    {
        return getHeight() * getWidth();
    }
}

