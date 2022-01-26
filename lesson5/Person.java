package lesson5;

/**
 * @author Sveta
 * @version 26.01.2022
 */
//@formatter:off
/*
 * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст. 
 * Конструктор класса должен заполнять эти поля при создании объекта. 
 * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль. 
 * Создать массив из 5 сотрудников. 
 * Пример: Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
 * persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
 * // потом для каждой ячейки массива задаем объект persArray[1] = new Person(...); ... persArray[4] = new Person(...);
 * С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 * 
//@formatter:on
 */
public class Person {

    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setFullName(String fullName) {
        if (fullName != null) {
            this.fullName = fullName;
        }

    }

    public void setPosition(String position) {
        if (position != null) {
            this.position = position;
        }
    }

    public void setEmail(String email) {
        if (email != null) {
            this.email = email;
        }
    }

    public void setPhone(String phone) {
        if (phone != null) {
            this.phone = phone;
        }
    }

    public void setSalary(int salary) {
        if (salary >= 20000) {
            this.salary = salary;
        } else {
            System.out.println("The salary cannot be lower than 20 000");
        }
    }

    public void setAge(int age) {
        if (age >= 20) {
            this.age = age;
        } else {
            System.out.println("The employee cannot be younger than 20 years old");
        }

    }

    @Override
    public String toString() {
        return "Person: " + fullName + "," + position + "," + email + "," + phone + "," + salary + "," + age;
    }
}
