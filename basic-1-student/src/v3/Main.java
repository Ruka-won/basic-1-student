package v3;


/*
* 클라이언트 역할
* */

public class Main {

    public static void main(String[] args) {
        Repository repository = new Repository(); // Repository
        Service service = new Service(repository); // Service
        Controller controller = new Controller(service); //Controller

        // 요청 데이터
        String method = "POST";
        String name = "gygim";

        // 서버 로직 실행
        String response = controller.saveMemberAPI(method, name);

        // 응답
        System.out.println("response = " + response);
    }
}
