//Open Closed Principle - имплементируя интерфейс ToUse мы добавляем
// классу функциональности, не изменяя его код
public class Apple extends Product implements ToUse {

    private final String name = "Яблоки";
    private final int price = 200;

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
        System.out.println("Яблоко съедено");
    }
}
