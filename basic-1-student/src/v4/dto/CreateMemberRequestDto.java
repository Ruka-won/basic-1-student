package v4.dto;

public class CreateMemberRequestDto {

    //속성
    private String method;
    private String name;
    private int age;

    //생성자

    //기능
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }

    public String getMethod() {
        return this.method;
    }
}
