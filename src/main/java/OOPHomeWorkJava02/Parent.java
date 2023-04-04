package OOPHomeWorkJava02;

public class Parent extends Human implements Hello{

    public Parent(String name, String sex, Integer age, String eyeColor, Integer height, String hairColor) {
        super(name, sex, age, eyeColor, height, hairColor);
    }



    public void hello() {
        System.out.println("Привет, меня зовут " + getName());
    }
}
