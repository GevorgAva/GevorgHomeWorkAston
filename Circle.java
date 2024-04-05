public class Circle implements Figure {
    private double radius;
    private String color;
    private String borderColor;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 6.283185307179586 * this.radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public void setFillColor(String color) {
        this.color = color;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public void displayInfo() {
        System.out.println("Круг⁚");
        System.out.println("Периметр⁚ " + this.getPerimeter());
        System.out.println("Площадь⁚ " + this.getArea());
        System.out.println("Цвет заливки⁚ " + this.color);
        System.out.println("Цвет границы⁚ " + this.borderColor);
    }
}