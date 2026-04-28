package poly.diamond;

public class DiamondMain {

    public static void main(String[] args) {
        //Interface A에서 먼저 찾은 후, 하위 타입인 Child에서 오버라이딩 메소드를 찾는다.
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        //Interface B에서 먼저 찾은 후, 하위 타입인 Child에서 오버라이딩 메소드를 찾는다.
        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();

        //Child에서 바로 method를 찾는다.
        Child c = new Child();
        c.methodA();
        c.methodCommon();
    }
}
