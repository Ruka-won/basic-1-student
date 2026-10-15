package v2;

/**
 * B 비즈니스 역할 - Service
 */
public class B {
    //속성
    private C c; // Repository 데이터베이스 역할

    //생성자
    public B(C c) {
        this.c = c;
    }

    //기능
    public String business(String name) {

        // 2. 비즈니스 로직 처리
        if (name.equals("비속어")) {
            return "bad request";
        }

        // 3. 저장
        this.c.save(name);

        // 4. 응답 반환
        return "save success";
    }
}



