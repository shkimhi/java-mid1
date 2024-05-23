package lang.object.poly;

import lang.object.ObjectMain;

public class ObjectPolyEx2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object o = new Object();

        Object[] os = {dog, car, o};
        size(os);
    }
    private static void size(Object[] os) {
        System.out.println(os.length);
    }
}
