package homework;

public class Figura implements FiguraInterface {
        private double height;
        private double width;

        public Figura(double height, double width)
        {
            super();
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

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
            return 0;
    }
}

