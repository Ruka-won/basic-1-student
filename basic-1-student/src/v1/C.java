package v1;

import java.util.ArrayList;
import java.util.List;

/*
 * 데이터베이스를 조작하는 역할 = Repository
 * */

public class C {

    //속성
    private List<String> database;

    //생성자
    public C() {
        this.database = new ArrayList<>();
    }

    //기능
    public void save(String name) {
        this.database.add(name);
    }
}
