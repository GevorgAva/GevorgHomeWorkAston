public class Dog extends Animal {
    private static int count;

    public Dog(String name) {
        super(name);
        ++count;
    }

    void run(int length) {
        int MAX_RUN_LENGTH = 500;
        if (length > 0 && length <= MAX_RUN_LENGTH) {
            System.out.println(name + " пробежал " + length + "м.");
        } else {
            System.out.println("Собака может пробежать не более " + MAX_RUN_LENGTH + "м.");
        }

    }

    void swim(int length) {
        int MAX_SWIM_LENGTH = 10;
        if (length > 0 && length <= MAX_SWIM_LENGTH) {
            System.out.println(name + " проплыл " + length + "м.");
        } else {
            System.out.println("Собака может проплыть не более " + MAX_SWIM_LENGTH + "м.");
        }

    }

    public static int getCount() {
        return count;
    }
}
