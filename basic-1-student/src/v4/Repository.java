package v4;

import java.util.ArrayList;
import java.util.List;

/**
 * C 데이터베이스를 조작하는 역할 = Repository
 **/

public class Repository {

    //속성
    private List<String> database;

    //생성자
    public Repository() {
        this.database = new ArrayList<>();
    }

    //기능
    public void save(String name, int age) {
        this.database.add(name,age);
    }
}
