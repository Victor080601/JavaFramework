package homework;

public class Figura implements FiguraInterface {
        private double height;
        private double width;

        public Figura(double height, double width)
        {
            this.height = height;
            this.width = width;
        }

        public double getHeight()
        {
            return height;
        }

        public double getWidth()
        {
            return width;
        }
    public double getArea(){
            return 0;
    }
}

