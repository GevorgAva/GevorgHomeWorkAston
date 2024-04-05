public abstract class Animal {
    String name;
    private int count = 0;

    abstract void run(int var1);

    abstract void swim(int var1);

    abstract void getCount();

    public Animal(String name) {
        this.name = name;
        ++this.count;
    }

    public void getAnimalInfo() {
        System.out.println("Животное: " + this.name);
    }
}