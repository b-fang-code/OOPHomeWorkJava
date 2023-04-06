package OOPHomeWorkJava03;
/**
 * Абстрактный класс Человек
 */
public abstract class Human implements InterfaceDisplay, Inter_Name {
    private String name;
    public String sex;
    public Integer age;
    public String eyeColor;
    public Integer height;
    public String hairColor;

    /**
     *
     * Берет данные из приватного поля "Имя"
     */
    public String getName() {
        return name;
    }

    /**
     * Позволяет изменить данные из приватного поля "Имя"
     * @param name Имя
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Консткуктор
     * @param name имя
     * @param sex пол
     * @param age возраст
     * @param eyeColor цвет глаз
     * @param height рост
     * @param hairColor цвет волос
     */
    public Human(String name, String sex, Integer age, String eyeColor, Integer height, String hairColor) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.eyeColor = eyeColor;
        this.height = height;
        this.hairColor = hairColor;
    }

    /**
     * Метод вывода на экран
     * @return
     */
    public String display() {
        return "Мои данные: {" +
                " Имя - " + name + '\'' +
                ", Пол - " + sex + '\'' +
                ", Возраст - " + age +
                ", Цвет глаз - " + eyeColor + '\'' +
                ", Рост - " + height +
                ", Цвет волос - " + hairColor + '\'' +
                '}';
    }
}
