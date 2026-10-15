package v4.entity;


/*
* 클라이언트 역할
* */

import v3.Controller;
import v3.Repository;
import v3.Service;
import v4.dto.CreateMemberResponseDto;

public class Main {

    public static void main(String[] args) {
        // 의존성 부여
        Repository repository = new Repository(); // Repository
        Service service = new Service(repository); // Service
        Controller controller = new Controller(service); //Controller

        // 요청 데이터
        String method = "POST";
        String name = "gygim";

        // 서버 로직 실행
        CreateMemberResponseDto response = controller.saveMemberAPI(request);

        // 응답
        System.out.println("response = " + response);
    }
}
