package v2;

/**
 * A = Controller 역할을 수행 ( C -> S -> R ) ( A -> B -> C)
 **/
public class Server {
    // 속성
    private B b ; // Service 비즈니스 역할

    // 생성자
    public Server(B b) {
        this.b = b;
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
        String reponse = this.b.business(name);

        // 4. 응답 반환
        return reponse;
    }
}
