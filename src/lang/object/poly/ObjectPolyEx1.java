package lang.object.poly;

public class ObjectPolyEx1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }
    private static void action(Object o){
        //o.sound(); 컴파일 오류
        //o.move(); 컴파일 오류
        // 클래스에서 메서드를 찾아가는건 부모 클래스로만 찾아갈 수 있음. 위에서 아래는 X
        // 자식클래스로 찾아갈 수 있는 유일한 것. overriding

        //객체에 맞는 다운캐스팅을 해줘야함.
        if(o instanceof Dog dog){
            dog.sound();
        }else if(o instanceof  Car car){
            car.move();
        }
    }
}
