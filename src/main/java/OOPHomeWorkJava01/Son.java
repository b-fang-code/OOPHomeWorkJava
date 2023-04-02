package OOPHomeWorkJava01;

public class Son extends Parent {
    public Son(String name, String sex, Integer age, String eyeColor, Integer height, String hairColor) {
        super(name, sex, age, eyeColor, height, hairColor);
    }

    @Override
    public void hello() {
        System.out.println("Привет, меня зовут " + name);
    }
}
