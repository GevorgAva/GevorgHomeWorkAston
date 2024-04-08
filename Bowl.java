public class Bowl {
    public int foodCount;

    public Bowl(int foodCount) {
        this.foodCount = foodCount;
    }

    public void addFoodInBowl(int value) {
        if (value > 0) {
            foodCount += value;
        } else {
            System.out.println("Некорректное занчение value");
        }

    }

    public boolean decreaseFood(int valueOfWellFed) {
        int diff = foodCount - valueOfWellFed;
        if (diff >= 0) {
            foodCount -= valueOfWellFed;
            return true;
        } else {
            return false;
        }
    }

    public void getInfoOfBowl() {
        System.out.println("Еды в миске: " + foodCount);
    }
}