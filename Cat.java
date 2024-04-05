    public class Cat extends Animal {
        private int wellFedValue;
        private int count = 0;
        private boolean hungry;


        public Cat(String name, int wellFedValue) {
            super(name);
            this.wellFedValue = wellFedValue;
            this.hungry = true;
            ++this.count;
        }

        void run(int length) {
            int MAX_RUN_LENGTH = 200;
            if (length > 0 && length <= MAX_RUN_LENGTH) {
                System.out.println(this.name + " пробежал " + length + "м.");
            } else {
                System.out.println("Кот может пробежать не более " + MAX_RUN_LENGTH + " м.");
            }

        }

        void swim(int length) {
            System.out.println("Кошки не плавают");
        }

        public void getCount() {
            System.out.println("Количество котов: " + this.count);
        }

        public void eat(Bowl bowl) {
            if (this.hungry && bowl.decreaseFood(this.wellFedValue)) {
                this.hungry = false;
            }

        }

        public void catInfo() {
            String isHungry = !this.hungry ? "сыт" : "голоден";
            System.out.println("Кот: " + this.name + " - " + isHungry);
        }
    }
