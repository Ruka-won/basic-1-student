package v4.dto;

public class CreateMemberResponseDto {

    //속성
    private final String name;
    private final int age;


    //생성자
    public CreateMemberResponseDto(String method, String name, int age) {
        this.name = name;
        this.age = age;
    }

    //기능
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }


}
