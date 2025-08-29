package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        
        action(dog);
        action(car);
    }
    
    private static void action(Object obj) {
        switch (obj) {
            case Dog dog -> dog.sound();
            case Car car -> car.move();
            default -> System.out.println("없음");
        };
    }
}
