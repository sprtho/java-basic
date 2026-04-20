package extends1.overriding;

public class ElectricCar extends Car {

    // 메소드 오버라이딩 (애노테이션)
    @Override //Override 애노테이션을 쓰면, 오버라이딩을 잘못 하더라도, 컴파일 오류로 잡을 수 있음 (실수 방지용)
    public void move() {
        System.out.println("전기자를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }

}
