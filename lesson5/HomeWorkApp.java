package lesson5;

/**
 * @author Sveta
 * @version 26.01.2022
 */
public class HomeWorkApp {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Severe I.I", "Chief Technology Officer", "severe@mail.ru", "12345678999", 200000,
                50);
        persArray[1] = new Person("Gloomy F.F", "Network Administrator", "Gloomy@mail.ru", "12345678888", 150000, 45);
        persArray[2] = new Person("Cheerful D.D", "Architect", "Cheerful@mail.ru", "12345678777", 100000, 40);
        persArray[3] = new Person("AcidBurn K.K", "QA Engineer", "AcidBurn@mail.ru", "12345678666", 80000, 25);
        persArray[4] = new Person("ZeroCool D.I", "Software Developer", "ZeroCool@mail.ru", "12345678555", 150000, 41);

        for (Person person : persArray) {
            if (person.getAge() >= 40) {
                System.out.println(person);
            }
        }
    }
}
