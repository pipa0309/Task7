
package HomeTaskSeven.Main;

public class Cat {
    private final String name;
    private final int appetite;
    private final boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            System.out.printf("Cat %s eating on %d!!!\n", name, appetite);
            boolean flag = !satiety;
            System.out.printf("cat's %s satiety is %b\n\n", name, flag);
        } else {
            System.out.printf("not so much food %d for %s !!!\n", appetite, name);
            boolean flag = satiety;
            System.out.printf("cat's %s satiety is %b\n\n", name, flag);
        }
    }
}
