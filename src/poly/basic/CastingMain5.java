package poly.basic;

public class CastingMain5 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);

        System.out.println(parent1 instanceof Parent);
        System.out.println(parent2 instanceof Child);

    }

    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child) { //new Parent() instanceof Child
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }

    }
}
