package collections;

import java.util.HashMap;
import java.util.Map;

public class UserMapAddSystem {

    private Map<String, User> users;

    public UserMapAddSystem() {
        users = new HashMap<>();
    }

    // users 접근해서 데이터를 추가하는 기능 만들어 보자
    public void addUser(String name, String email) {
        // 1. map 자료구조에 넣어야 한다
        // 2. 키값을 명시하고 value 에는 User Object 들어 가야 한다
        users.put(name, new User(name, email));
    }

    public void printAllUser() {
        for (User u : users.values()) {
            System.out.println("u : " + u.getName());
        }
    }

}

class User {
    String name;
    String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        UserMapAddSystem user = new UserMapAddSystem();
        user.addUser("양금명" , "yageummeng");
        user.addUser("양은명" , "yageunmeng");
        user.printAllUser();
    }
}
