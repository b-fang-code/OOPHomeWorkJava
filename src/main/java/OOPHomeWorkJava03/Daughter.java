package OOPHomeWorkJava03;

public class Daughter extends Parent {
    /**
     * Экземляр Дочь на основе класса Родителя
     * @param name Имя
     * @param sex Пол
     * @param age Возраст
     * @param eyeColor Цвет глаз
     * @param height Рост
     * @param hairColor Цвет волос
     */
    public Daughter(String name, String sex, Integer age, String eyeColor, Integer height, String hairColor) {
        super(name, sex, age, eyeColor, height, hairColor);
    }


    @Override
    public void hello() {
        System.out.println("Привет, меня зовут " + getName());
    }
}

