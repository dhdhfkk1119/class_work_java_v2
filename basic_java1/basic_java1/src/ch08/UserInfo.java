package ch08;

import ch06.User;

// 사용자의 정보를 저장해 두어야 한다.(나중에 사용하기 위해서)
public class UserInfo {

    // 생성자가 여러개라면 -> 생성자 오버로딩이라고 한다.

    int userId;
    String password;
    String name;
    String tel;

    // 기본 생성자
    public UserInfo(){

    }

    // 사용자 정의 생성자
    public UserInfo(int uid){
        System.out.println("사용자 정의 생성자");
        // 맴버 변수에 값을 초기화 시키는 코드를 작성한다
        userId = uid;
    }

    // 사용자 정의 생성자
    public UserInfo(int uid,String p){
        userId = uid;
        password = p;

    }

    // 사용자 정의 생성자
    public UserInfo(int uid,String p,String n){
        userId = uid;
        password = p;
        name = n;
    }

    // 사용자 정의 생성자
    public UserInfo(int uid,String p,String n,String t){
        userId = uid;
        password = p;
        name = n;
        name = t;

    }

    //

}
