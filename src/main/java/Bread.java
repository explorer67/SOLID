public class Bread extends Product implements ToUse {
    private final String name = "Хлеб";
    private final int price = 80;

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
        System.out.println("Хлеб съеден");
    }
}
