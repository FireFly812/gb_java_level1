package lesson6;

/**
 * @author Sveta
 * @version 01.02.2022
 */
public class HomeWorkApp {

    public static void main(String[] args) {
        IAnimal[] animals = { new Cat("Murzic", 200),
                new Dog("Buran", 500, 10)
        };
        for (IAnimal animal : animals) {
            System.out.println(animal.run(-1));
            System.out.println(animal.swim(-1));
            System.out.println(animal.run(0));
            System.out.println(animal.swim(0));
            System.out.println(animal.run(1));
            System.out.println(animal.swim(1));
            System.out.println(animal.run(200));
            System.out.println(animal.run(500));
            System.out.println(animal.swim(10));
            System.out.println(animal.run(201));
            System.out.println(animal.run(501));
            System.out.println(animal.swim(11));
        }
    }
}
