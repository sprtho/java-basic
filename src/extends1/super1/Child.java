package extends1.super1;

public class Child extends Parent{

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value); //this 생략 가능 (child)
        System.out.println("super vale = " + super.value); //(parent)

        this.hello(); // 현재 클래스의 메소드
        super.hello(); // 부모 클래스의 메소드
    }



}
