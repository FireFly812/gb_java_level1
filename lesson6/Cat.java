package lesson6;

/**
 * @author Sveta
 */
public class Cat extends Animal {

    Cat(String name, int maxRunDistance) {
        super(name, maxRunDistance, 0);
    }

    @Override
    public String swim(int distance) {
        return getClass().getSimpleName() + " don't swim";
    }
}
