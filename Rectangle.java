public class Rectangle implements Figure {
    private String color;
    private String borderColor;
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2.0;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public void setFillColor(String color) {
        this.color = color;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public void displayInfo() {
        System.out.println("Прямоугольник⁚");
        System.out.println("Периметр⁚ " + this.getPerimeter());
        System.out.println("Площадь⁚ " + this.getArea());
        System.out.println("Цвет заливки⁚ " + this.color);
        System.out.println("Цвет границы⁚ " + this.borderColor);
    }
}
