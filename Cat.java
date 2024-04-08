    public class Cat extends Animal {
        private int wellFedValue;
        private static int count = 0;
        private boolean hungry;


        public Cat(String name, int wellFedValue) {
            super(name);
            this.wellFedValue = wellFedValue;
            hungry = true;
            ++count;
        }

        void run(int length) {
            int MAX_RUN_LENGTH = 200;
            if (length > 0 && length <= MAX_RUN_LENGTH) {
                System.out.println(name + " пробежал " + length + "м.");
            } else {
                System.out.println("Кот может пробежать не более " + MAX_RUN_LENGTH + " м.");
            }

        }

        void swim(int length) {
            System.out.println("Кошки не плавают");
        }

        public static int getCount() {
            return count;
        }

        public void eat(Bowl bowl) {
            if (hungry && bowl.decreaseFood(wellFedValue)) {
                hungry = false;
            }

        }

        public void catInfo() {
            String isHungry = !hungry ? "сыт" : "голоден";
            System.out.println("Кот: " + name + " - " + isHungry);
        }
    }
