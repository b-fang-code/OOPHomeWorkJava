package OOPHomeWorkJava06;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        ArrayList<Telephone> listTelephone = new ArrayList<>();
        shop.create(listTelephone);

        /**
         * Создание меню, которое позволяет работать с пользователем через терминал
         */
        Scanner scan = new Scanner(System.in);
        String menu = "\nВыберите пункт меню :\n" + "1 - Показать остаток телефонов на складе\n" +
                "2 - Продать телефон\n"
                + "3 - Добавить телефон на склад\n" + "4 - Выход";
        System.out.println(menu);
        boolean flag = false;
        while (!flag) {
            int choice = scan.nextInt();
            switch (choice) {
                case (1):
                    for(Telephone temp:listTelephone){
                        System.out.println(temp.toString());
                    }
                    System.out.println(menu);
                    break;
                case 2:
                    if(listTelephone.isEmpty()){
                        System.out.println("Склад пуст!");
                        System.out.println(menu);
                        break;
                    }
                    else {
                        shop.sell(listTelephone);
                        System.out.println("\nТелефон удалён со склада\n");
                        System.out.println(menu);
                    }
                    break;
                case 3:
                    shop.add(listTelephone);
                    System.out.println("\nТелефон добавлен на склад\n");
                    System.out.println(menu);
                    break;
                case 4:
                    System.out.println("Всего хорошего ");
                    flag = true;
                    break;
            }
        }
    }
}
