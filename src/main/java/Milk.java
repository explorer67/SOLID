//Single Responsibility Principle - класс Milk описывает только молоко, а не все продукты
public class Milk extends Product implements ToUse {
    private final String name = "Молоко";
    private final int price = 110;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void eat() {
        System.out.println("Молоко выпито");
    }
}
