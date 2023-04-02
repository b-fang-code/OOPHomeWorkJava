package OOPHomeWorkJava01;

public  class Human {
    private String name;
    public String sex;
    public Integer age;
    public String eyeColor;
    public Integer height;
    public String hairColor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human(String name, String sex, Integer age, String eyeColor, Integer height, String hairColor) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.eyeColor = eyeColor;
        this.height = height;
        this.hairColor = hairColor;
    }


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

    public void hello(){
        System.out.println("Привет, меня зовут... ");
    }
}
