//Interface Segregation Principle - применяем разные интерфейсы вместо одного большого
//Dependency Inversion Principle - проектируем на уровне интерфесов, а не реализаций
public class Phone extends Product implements Device, Mobile {
    private final String name = "Телефон";
    private final int price = 8500;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void on() {
        System.out.println("Телефон включен");
    }

    @Override
    public void call() {
        System.out.println("С телефона сделан звонок");
    }
}
