package OOPHomeWorkJava01;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent("Павел", "Мужской", 35, "Голубой", 175,
                "Тёмный");
        parent.hello();
        System.out.println(parent.display());
        System.out.println("========================================================================================");
        Daughter daughter = new Daughter("Полина", "Женский", 14, "Голубой",
                167, "Коричневый");
        daughter.hello();
        System.out.println(daughter.display());
        System.out.println("========================================================================================");
        Son son = new Son("Аркаша", "Мужской", 11, "Серый", 150,
                "Тёмный");
        son.hello();
        System.out.println(son.display());
    }
}