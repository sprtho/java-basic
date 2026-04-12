package static2;

public class DecoData {

    private int instanceValue;

    private static int staticValue;

    public static void staticCall() {
        /* 아직 생성되지 않은 인스턴스를 컴파일 전에 참조할 수 없다. */
        //instanceValue++;  //인스턴스 변수 접근, compileerror
        //instanceMethod(); //인스턴스 메서드 접근, compile error

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    public void instanceCall() {
        instanceValue++;  //인스턴스 변수 접근
        instanceMethod(); //인스턴스 메서드 접근

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}
