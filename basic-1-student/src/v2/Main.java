package v2;


/*
* 클라이언트 역할
* */

public class Main {

    public static void main(String[] args) {
        C c = new C(); // Repository
        B b = new B(c); // Service
        Server server = new Server(b);

        // 요청 데이터
        String method = "POST";
        String name = "gygim";

        // 서버 로직 실행
        String response = server.saveMemberAPI(method, name);

        // 응답
        System.out.println("response = " + response);
    }
}
