public abstract class Animal {
    String name;
    private static int count = 0;

    abstract void run(int var1);

    abstract void swim(int var1);

     public static int getCount() {
        return count;
    }

    public Animal(String name) {
        this.name = name;
        ++count;
    }

    public void getAnimalInfo() {
        System.out.println("Животное: " + name);
    }
}