public class Main {

    public static void main(String[] args) {

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Барсик", 10);
        cats[1] = new Cat("Мурзик", 50);
        cats[2] = new Cat("Рыжий", 25);
        cats[3] = new Cat("Серый", 100);
        cats[4] = new Cat("Батон", 10);


        Bowl bowl = new Bowl(150);


        for (Cat cat : cats) {
            cat.eat(bowl);
            cat.catInfo();
        }
        Dog dog = new Dog("Шарик");

        System.out.println("Количество котов: " + Cat.getCount());
        System.out.println("Количество собак: " + Dog.getCount());
        System.out.println("Количество животных: " + Animal.getCount());


        Circle circle1 = new Circle(2.0);
        circle1.setFillColor("Красный");
        circle1.setBorderColor("Синий");
        circle1.displayInfo();
        Rectangle rectangle1 = new Rectangle(3.0, 2.0);
        rectangle1.setFillColor("Желтый");
        rectangle1.setBorderColor("Фиолетовый");
        rectangle1.displayInfo();
        Triangle triangle1 = new Triangle(3.0, 2.0, 3.0);
        triangle1.setFillColor("Зеленый");
        triangle1.setBorderColor("Оранжевый");
        triangle1.displayInfo();
    }


}
