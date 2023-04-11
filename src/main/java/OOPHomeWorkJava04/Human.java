package OOPHomeWorkJava04;

/**
 * Абстрактный класс Человек
 */
public abstract class Human<T, V, E> implements InterfaceDisplay, Inter_Name {
    private T name;
    public T sex;
    public V age;
    public T eyeColor;
    private E height;
    public T hairColor;

    /**
     * Берет данные из приватного поля "Имя"
     */
    public String getName() {
        return (String) name;
    }

    /**
     * Берет данные из приватного поля "Рост"
     *
     */
    public E getHeight() {
        return height;
    }

    /**
     * Позволяет изменить данные из приватного поля "Имя"
     *
     * @param name Имя
     */
    public void setName(T name) {
        this.name = (T) name;
    }

    /**
     * Консткуктор
     *
     * @param name      имя
     * @param sex       пол
     * @param age       возраст
     * @param eyeColor  цвет глаз
     * @param height    рост
     * @param hairColor цвет волос
     */
    public Human(T name, T sex, V age, T eyeColor, E height, T hairColor) {
        this.name = (T) name;
        this.sex = (T) sex;
        this.age = (V) age;
        this.eyeColor = (T) eyeColor;
        this.height = (E) height;
        this.hairColor = (T) hairColor;
    }

    /**
     * Метод вывода на экран
     *
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
