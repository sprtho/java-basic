package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가
    MemberConstruct(String name, int age) {
        this(name, age, 50); // this()는 생성자 내부에서 자신의 다른 생성자를 호출할 수 있다. 생성자 첫줄에서만 사용가능
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
