package OOPHomeWorkJava05;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop implements CreateTelephone, SellTelephone, AddPhone {

   private ArrayList<Telephone> listTelephon;

    @Override
    public ArrayList<Telephone> create(ArrayList<Telephone> listTelephone) {


        Telephone nokia = new Telephone("nokia", "n95", 6.12, 3000,
                7000, "simbian");
        Telephone samsung = new Telephone("samsung", "C100", 13.2, 3500,
                7.110, "android");
        Telephone apple = new Telephone("apple", "iphone13", 16.3, 4000,
                20000, "ios");
        Telephone xiaomi = new Telephone("xiaomi", "mi13", 11, 5000,
                12.230, "android");

        listTelephone.add(nokia);
        listTelephone.add(samsung);
        listTelephone.add(apple);
        listTelephone.add(xiaomi);

        return listTelephone;
    }

    @Override
    public ArrayList<Telephone> sell(ArrayList<Telephone> listTelephone) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Телефон какого производителя продали? ");
        String buyPhone = sc.next().toLowerCase();;
        ArrayList<Telephone> tempList = new ArrayList<>();
        for(Telephone telephone:listTelephone){
            if(!buyPhone.equals(telephone.getLabel())){
                tempList.add(telephone);
            }
        }
        listTelephone.clear();
        listTelephone.addAll(tempList);
        return listTelephone;

    }

    @Override
    public ArrayList<Telephone> add(ArrayList<Telephone> listTelephone) {
        Telephone phone = new Telephone();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите название производителя: ");
        String label = sc.next().toLowerCase();
        System.out.println("Введите модель телефона: ");
        String model = sc.next().toLowerCase();;
        System.out.println("Введите размер экрана: ");
        double displaySize =  sc.nextDouble();
        System.out.println("Введите емкость батареи: ");
        int capacity = sc.nextInt();
        System.out.println("Введите тип операционной системы: ");
        String os = sc.next().toLowerCase();;
        System.out.println("Введите стоимость телефона: ");
        double price = sc.nextDouble();
        phone.setLabel(label);
        phone.setModel(model);
        phone.setDisplaySize(displaySize);
        phone.setBatteryCapacity(capacity);
        phone.setTypeOs(os);
        phone.setPrice(price);
        listTelephone.add(phone);
        return listTelephone;
    }
}
