package HomeTaskSeven.Main;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int count) {
        if (food >= count) {
            food -= count;
        }
    }

    public int getFood() {
        return food;
    }

    public void printInfoPlate() {
        System.out.printf("in plate amount eat = %d\n", food);
    }
}
