package v0;

public class Main {

    public static void main(String[] args) {

        Server server = new Server();

        // 요청 데이터
        String method = "POST";
        String name = "gygim";

        // 서버 로직 실행
        String response = server.saveMemberAPI(method, name);

        // 응답
        System.out.println("response = " + response);
    }
}
