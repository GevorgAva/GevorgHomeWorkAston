public class Dog extends Animal {
    private int count;

    public Dog(String name) {
        super(name);
        ++this.count;
    }

    void run(int length) {
        int MAX_RUN_LENGTH = 500;
        if (length > 0 && length <= MAX_RUN_LENGTH) {
            System.out.println(this.name + " пробежал " + length + "м.");
        } else {
            System.out.println("Собака может пробежать не более " + MAX_RUN_LENGTH + "м.");
        }

    }

    void swim(int length) {
        int MAX_SWIM_LENGTH = 10;
        if (length > 0 && length <= MAX_SWIM_LENGTH) {
            System.out.println(this.name + " проплыл " + length + "м.");
        } else {
            System.out.println("Собака может проплыть не более " + MAX_SWIM_LENGTH + "м.");
        }

    }

    void getCount() {
        System.out.println("Количество собак: " + this.count);
    }
}
