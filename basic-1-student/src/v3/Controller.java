package v3;

import v4.dto.CreateMemberRequestDto;
import v4.dto.CreateMemberResponseDto;

/**
 * A = Controller 역할을 수행 ( C -> S -> R ) ( A -> B -> C)
 **/
public class Controller {
    // 속성
    private Service service; // Service 비즈니스 역할

    // 생성자
    public Controller(Service service) {
        this.service = service;
    }

    // 기능

    /**
     * 회원 저장 API
     * @param method (GET, POST, PATCH, DELETE)
     * @param name 회원이름
     * @return 응답 메시지
     */
    public CreateMemberResponseDto saveMemberAPI(CreateMemberRequestDto request) {
        // 1. 요청 검증
        if (!request.getMethod == "POST") {
            return "bad request";
        }

        // 2. 비즈니스 로직 처리(예: 검증 - 비속어)
        CreateMemberResponseDto reponse = this.service.business(request);

        // 4. 응답 반환
        return reponse;
    }
}
