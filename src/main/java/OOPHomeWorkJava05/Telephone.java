package OOPHomeWorkJava05;

import java.util.Objects;

public class Telephone<T, V, E> {
    private T label;
    private T model;
    private E displaySize;
    private V batteryCapacity;
    private E price;
    private T typeOs;

    public T getLabel() {
        return label;
    }

    public T getModel() {
        return model;
    }

    public E getDisplaySize() {
        return displaySize;
    }

    public V getBatteryCapacity() {
        return batteryCapacity;
    }

    public E getPrice() {
        return price;
    }

    public T getTypeOs() {
        return typeOs;
    }

    public void setLabel(T label) {
        this.label = label;
    }

    public void setModel(T model) {
        this.model = model;
    }

    public void setDisplaySize(E displaySize) {
        this.displaySize = displaySize;
    }

    public void setBatteryCapacity(V batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setPrice(E price) {
        this.price = price;
    }

    public void setTypeOs(T typeOs) {
        this.typeOs = typeOs;
    }

    public Telephone() {

    }

    public Telephone(T label, T model, E displaySize, V batteryCapacity, E price, T typeOs) {
        this.label = label;
        this.model = model;
        this.displaySize = displaySize;
        this.batteryCapacity = batteryCapacity;
        this.price = price;
        this.typeOs = typeOs;
    }

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
