package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: con gà cục tác lá chanh";
    }

    @Override
    public String howToEat() {
        return "Gà tẩm bột chiên giòn";
    }
}
