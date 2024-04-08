public class Circle implements Figure {
    private double radius;
    private String color;
    private String borderColor;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void setFillColor(String color) {
        this.color = color;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public void displayInfo() {
        System.out.println("Круг⁚");
        System.out.println("Периметр⁚ " + getPerimeter());
        System.out.println("Площадь⁚ " + getArea());
        System.out.println("Цвет заливки⁚ " + color);
        System.out.println("Цвет границы⁚ " + borderColor);
    }
}