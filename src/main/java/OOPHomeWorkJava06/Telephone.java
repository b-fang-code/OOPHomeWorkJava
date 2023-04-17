package OOPHomeWorkJava06;

import java.util.Objects;

/** Класс телефон
 *
 */
public class Telephone<T, V, E> {
    private T label;
    private T model;
    private E displaySize;
    private V batteryCapacity;
    private E price;
    private T typeOs;

    /**
     * Берет данные из приватного поля "Производитель"
     */
    public T getLabel() {
        return label;
    }

    /**
     * Позволяет изменить данные в приватном поле "Производитель"
     */
    public void setLabel(T label) {
        this.label = label;
    }

    /**
     * Позволяет изменить данные в приватном поле "Модель"
     */
    public void setModel(T model) {
        this.model = model;
    }
    /**
     * Позволяет изменить данные в приватном поле "Размер экрана"
     */
    public void setDisplaySize(E displaySize) {
        this.displaySize = displaySize;
    }

    /**
     * Позволяет изменить данные в приватном поле "Ёмкость батареи"
     */
    public void setBatteryCapacity(V batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    /**
     * Позволяет изменить данные в приватном поле "Цена"
     */
    public void setPrice(E price) {
        this.price = price;
    }
    /**
     * Позволяет изменить данные в приватном поле "Операционная система"
     */
    public void setTypeOs(T typeOs) {
        this.typeOs = typeOs;
    }

    public Telephone() {

    }

    /**
     * Конструктор
     * @param label   Производитель
     * @param model  Модель
     * @param displaySize  Размер экрана
     * @param batteryCapacity  Ёмкость батареи
     * @param price  Цена
     * @param typeOs  Операционная система
     */
    public Telephone(T label, T model, E displaySize, V batteryCapacity, E price, T typeOs) {
        this.label = label;
        this.model = model;
        this.displaySize = displaySize;
        this.batteryCapacity = batteryCapacity;
        this.price = price;
        this.typeOs = typeOs;
    }

    /**
     * Метод вывода на экран
     */
    @Override
    public String toString() {
        return "Телефон: " +
                "Производитель = '" + label + '\'' +
                ", Модель = '" + model + '\'' +
                ", Размер экрана = " + displaySize +
                ", Емкость батареи = " + batteryCapacity +
                ", Цена = " + price +
                ", Операционная система = '" + typeOs + '\'' +
                ' ';
    }

    /**
     * Метод сравнения
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telephone telephone = (Telephone) o;
        return Double.compare((Double) telephone.displaySize, (Double) displaySize) == 0 && batteryCapacity == telephone.batteryCapacity && Double.compare((Double) telephone.price, (Double) price) == 0 && Objects.equals(label, telephone.label) && Objects.equals(model, telephone.model) && Objects.equals(typeOs, telephone.typeOs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, model, displaySize, batteryCapacity, price, typeOs);
    }
}
