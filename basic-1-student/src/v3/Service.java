package v3;

import v4.dto.CreateMemberRequestDto;
import v4.dto.CreateMemberResponseDto;

/**
 * B 비즈니스 역할 - Service
 */
public class Service {
    //속성
    private Repository repository; // Repository 데이터베이스 역할

    //생성자
    public Service(Repository repository) {
        this.repository = repository;
    }

    //기능
    public CreateMemberResponseDto business(CreateMemberRequestDto request) {

        // 2. 비즈니스 로직 처리
        if (name.equals("비속어")) {
            return "bad request";
        }
        // 3. 저장
        this.repository.save(request.getName(), request.getAge());


        // 4. 응답 반환
        return "save success";
    }
}



