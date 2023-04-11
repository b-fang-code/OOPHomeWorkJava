package OOPHomeWorkJava04;

public class Parent extends Human implements Inter_Greeting {
    /**
     * Экземляр Родитель на основе класса Человек
     * @param name Имя
     * @param sex Пол
     * @param age Возраст
     * @param eyeColor Цвет глаз
     * @param height Рост
     * @param hairColor Цвет волос
     */
    public Parent(String name, String sex, Integer age, String eyeColor, Double height, String hairColor) {
        super(name, sex, age, eyeColor, height, hairColor);
    }


    /**
     * приветствие
     */
    public void hello() {
        System.out.println("Привет, меня зовут " + getName());
    }
}
