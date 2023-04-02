package OOPHomeWorkJava01;

public class Daughter extends Parent {

    public Daughter(String name, String sex, Integer age, String eyeColor, Integer height, String hairColor) {
        super(name, sex, age, eyeColor, height, hairColor);
    }


    @Override
    public void hello() {
        System.out.println("Привет, меня зовут " + getName());
    }
}

