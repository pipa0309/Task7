package HomeTaskSeven.Main;

public class WorkClass {
    public static void main(String[] args) {
        Cat[] cats = createArrayCats();
        Plate plate = createPlate();
        eatingCats(cats, plate);
    }

    private static Cat[] createArrayCats() {
        Cat[] cats = {
                new Cat("Vasya", 8, false),
                new Cat("Barsik", 13, false),
                new Cat("Murzik", 10, false),
                new Cat("Zhorik", 22, false),
                new Cat("Pushok", 8, false)
        };
        return cats;
    }

    private static Plate createPlate() {
        Plate plate = new Plate(50);
        return plate;
    }

    private static void eatingCats(Cat[] cats, Plate plate) {
        for (int i = 0; i < cats.length; i++) {
            plate.printInfoPlate();
            cats[i].eat(plate);
        }
    }
}
