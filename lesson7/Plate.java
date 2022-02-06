package lesson7;

/**
 * @author Sveta
 */
public class Plate {
    private int maxFood;
    private int food;

    Plate(int maxFood, int food) {
        this.maxFood = maxFood;
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int food) {
        this.food -= food;
    }

    public void addfoodToPlate(int amountFood) {
        if (amountFood + getFood() > maxFood) {
            System.out.println("You can't put in a plate " + amountFood + " food, max: " + (maxFood - getFood()));

        } else {
            food = getFood() + amountFood;
        }
    }

    @Override
    public String toString() {
        return "Plate: " + food;
    }
}
