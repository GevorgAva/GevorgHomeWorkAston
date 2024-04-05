public class Triangle implements Figure {
    private String color;
    private String borderColor;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getPerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    public double getArea() {
        double p = this.getPerimeter() / 2.0;
        return Math.sqrt(p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC));
    }

    public void setFillColor(String color) {
        this.color = color;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public void displayInfo() {
        System.out.println("Треугольник⁚");
        System.out.println("Периметр⁚ " + this.getPerimeter());
        System.out.println("Площадь⁚ " + this.getArea());
        System.out.println("Цвет заливки⁚ " + this.color);
        System.out.println("Цвет границы⁚ " + this.borderColor);
    }
}
