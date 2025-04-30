package ch03;

public class ifTest3 {
    public static void main(String[] args) {
        int studentAge = 30;

        // if else 는 순서도 조건식의 순서가 중요하다
        // 만약 학생이 13 살 이하라면 -> 초등학생
        // 만약 학생이 16 살 이하라면 -> 중학생
        // 만약 학생이 19 살 이하라면 -> 고등학생
        // 만약 학생이 7 살 이하라면 -> 유치원생
//        ! 수행이 될수도 있고 안될 수 도있다.
//        if(studentAge <= 7){
//            System.out.println("유치원생");
//        }else if(studentAge <= 13){
//            System.out.println("초등학생");
//        }else if(studentAge <= 16){
//            System.out.println("중학생");
//        }else if(studentAge <= 19) {
//            System.out.println("고등학생");
//        }
        if(studentAge <= 7){
            System.out.println("유치원생");
        }else if(studentAge <= 13){
            System.out.println("초등학생");
        }else if(studentAge <= 16){
            System.out.println("중학생");
        }else if(studentAge <= 19) {
            System.out.println("고등학생");
        }else {
            // 위 조건들이 하나도 포함이 안된다면 else 구문이 수행이 된다.
        }


    }
}
