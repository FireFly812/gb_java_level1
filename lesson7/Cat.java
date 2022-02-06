package lesson7;

/**
 * @author Sveta
 */
public class Cat {
    private String name;
    private int appetite;
    private boolean isFull = false;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

    }

    public int getAppetite(){
        return appetite;
    }
    public String getName(){
        return name;
    }

    public boolean tryToEat(Plate plate) {
        if (!isFull && getAppetite() <= plate.getFood()) {
            plate.decreaseFood(appetite);
            isFull = true;
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return name + " "+ appetite + (isFull ?" Full":" Hungry");
    }
}
