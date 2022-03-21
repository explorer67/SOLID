import java.util.Scanner;

public class Main {
    //Magic Numbers Principle - вместо чисел используем константы
    public static final int WALLET = 20000;

    public static void main(String[] args) {
        //Liskov substitution principle - наследники класса Product полностью играют роль предка
        Product[] products = {new Bread(), new Apple(), new Milk(), new Phone()};
        //принцип DRY - повторяющийся вывод списка товаров вынесен в отдельный метод
        printProducts(products);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер товара и количество или введите `end` ");
            String input = scanner.nextLine();
            if ("end".equals(input)) break;
            String[] parts = input.split(" ");
            int productNumber = Integer.parseInt(parts[0]) - 1;
            products[productNumber].setCount(Integer.parseInt(parts[1]));
        }
        printProducts(products);
        printBasket(products);
    }

    private static void printProducts(Product[] products) {
        System.out.println("Список возможных товаров для покупки: ");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " " + products[i].getPrice() + " " + "руб.");
        }
    }

    private static void printBasket(Product[] products) {
        int costProducts = 0;
        System.out.println("Ваша корзина: ");
        for (Product product : products) {
            if (product.getCount() != 0) {
                costProducts += product.getCount() * product.getPrice();
                System.out.println(product + " 'количество'= " + product.getCount() + " шт."
                        + " 'цена'= " + product.getPrice() + " " + " руб."
                        + " 'стоимость'= " + product.getCount() * product.getPrice() + " " + " руб.");
            }
        }
        System.out.println("Итого: " + costProducts + " " + "руб.");
        if (costProducts > WALLET) {
            System.out.println("Внимание! В кошельке только " + WALLET + " руб.");
            System.out.println("Не хватает " + (costProducts - WALLET) + " руб.");
        }
    }
}