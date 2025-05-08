package collections;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueUserIdSystem {

    // 상황 : 사용자가 키보드로 입력한 ID 데이터를 많이 저장해야 한다
    // 고유한 값이여야 한다. 메모리상으로 관리할 계정
    private HashSet<String> registerIDs;

    public UniqueUserIdSystem(){
        registerIDs = new HashSet<>();
        
        // printAllIDs 메서드를 테스트 하기 위해서 샘플 데이터 입력해 보기
        // 샘플 데이터 입력 - 추후 삭제 예정
        registerIDs.add("양금명");
        registerIDs.add("양은명");
        registerIDs.add("양동명");

    }
    
    // 사용자 ID를 등록하는 메서드
    public boolean addUserId(String userid){
        return registerIDs.add(userid);
    }

    public void ShowId(){
        System.out.println(registerIDs);
    }

    // 시스템을 실해알 메서드
    public void start(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("사용하고 싶은 ID를 입력하세여 : '종료 exit' 입력");
            String input = scanner.nextLine().trim(); // trim 공백제거
            
            // 사용자가 키보드에서 값을 넣지 않고 바로 엔터를 누르는 경우
            // 빈 입력 처리
            if(input.isEmpty()){
                System.out.println("ID를 입력해주세요");
                continue;
            }
            
            if("exit".equals(input)){
                System.out.println("시스템을 종료 합니다");
                break;
            }
            boolean isRegister = addUserId(input);
            if (isRegister){
                System.out.println("새로운 사용자 ID 가 등록되었습니다");
            }else {
                System.out.println("이미 등록된 ID 입니다");
            }
        }
        scanner.close(); // 자원 해제
    }

    public static void main(String[] args) {

        UniqueUserIdSystem newl = new UniqueUserIdSystem();
        newl.start();
        newl.ShowId();

    }
}
