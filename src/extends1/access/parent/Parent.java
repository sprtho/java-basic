package extends1.access.parent;

public class Parent {

    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod() {
        System.out.println("Parent.publicMethod");
    }

    protected void protectedMethod() {
        System.out.println("Praent.protectedMethod");
    }

    void defaultMethod() {
        System.out.println("Parent.defaultMethod");
    }

    private void privateMethod() {
        System.out.println("Parent.privatedMethod");
    }

    public void printParent() {
        System.out.println("==Parent 메서드 안==");
        System.out.println("publicVlaue = " + publicValue);
        System.out.println("protectedvalue = " + protectedValue);
        System.out.println("Defaultvalue = " + defaultValue);
        System.out.println("privatevalue = " + privateValue);

        //부모 메서드 안에서 모두 접근 가능
        defaultMethod();
        privateMethod();
    }

}
