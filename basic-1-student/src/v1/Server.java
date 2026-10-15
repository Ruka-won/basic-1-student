package v1;

import java.util.ArrayList;
import java.util.List;

/**
 * A = Controller 역할을 수행 ( C -> S -> R ) ( A -> B -> C)
 **/
public class Server {
    // 속성
    private C c ; // 데이터베이스 조작 역할

    // 생성자
    public Server(C c) {
        this.c = c;
    }

    // 기능

    /**
     * 회원 저장 API
     * @param method (GET, POST, PATCH, DELETE)
     * @param name 회원이름
     * @return 응답 메시지
     */
    public String saveMemberAPI(String method, String name) {
        // 1. 요청 검증
        if (!method.equals("POST")) {
            return "bad request";
        }

        // 2. 비즈니스 로직 처리(예: 검증 - 비속어)
        if (name.equals("비속어")) {
            return "bad request";
        }

        // 3. 저장
        this.c.save(name);


        // 4. 응답 반환
        return "save success";
    }
}
