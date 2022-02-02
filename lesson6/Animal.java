package lesson6;

/**
 * @author Sveta
 */

abstract class Animal implements IAnimal {
    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;

    Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public String run(int distance) {
        if (distance > maxRunDistance) {
            return this + " run " + maxRunDistance + "m and fell down";
        }
        if (distance < 0) {
            return this + " is at a loss. Run back?";
        }
        if (distance == 0) {
            return this + " can't run on the spot, but it can JUMP!";
        }
        return this + " run " + distance + "m";
    };

    public String swim(int distance) {
        if (distance > maxSwimDistance) {
            return this + " swim " + maxSwimDistance + "m and drowned";
        }
        return this + " swim " + distance + "m";
    };

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + name;
    }
}
