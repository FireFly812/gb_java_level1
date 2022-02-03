package lesson7;

/**
 * @author Sveta
 * @version 02.02.2022
 */
/*
//@formatter:off
+Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). 
Если коту удалось покушать (хватило еды), сытость = true.
Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.

Добавить ограничение на кол-во еды в тарелке
//@formatter:on
*/

public class HomeWorkApp7 {
    public static void main(String[] args) {
        Cat[] catArray = new Cat[5];
        catArray[0] = new Cat("Cat1", 5);
        catArray[1] = new Cat("Cat2", 10);
        catArray[2] = new Cat("Cat3", 15);
        catArray[3] = new Cat("Cat4", 20);
        catArray[4] = new Cat("Cat5", 30);
        Plate plate = new Plate(70,70);
        printStatus(catArray,plate);
        feedAllCats(catArray,plate);
        printStatus(catArray,plate);
        System.out.println("Add food to the plate");
        plate.addfoodToPlate(50);
        printStatus(catArray,plate);
        feedAllCats(catArray,plate);
        printStatus(catArray,plate);
    }

    static void printStatus(Cat[] catArray, Plate plate){
        System.out.println("Food in the plate: " + plate.getFood());
        System.out.println("Cats:");
        for (Cat cat : catArray) {
            System.out.println(cat);
        }
    }
    static void feedAllCats(Cat[] catArray,Plate plate){
        for (Cat cat : catArray) {
            if (cat.tryToEat(plate)){
                System.out.println("The "+cat.getName()+" ate");
            }else {
                System.out.println("The "+cat.getName()+" didn't eat");
            }
        }
    }
}
