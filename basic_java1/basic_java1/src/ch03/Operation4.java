package ch03;

/*
* 비교 연산자 2
* 연산의 결과값은 treu , false 로 변환 된다
 */
public class Operation4 {

    // 메인 함수
    public static void main(String[] args) {

        // 게임 캐릭터의 상태를 설정
        int playerHealth = 50; // 플레이어 체력
        int playerLevel = 10; // 플레이어 레벨
        int enemyHealth = 30; // 적의 체력
        int requiredLevel = 15; // 특정 퀘스트를 수행하기 위한 최소 레벨

        // 1. 플레이어의 체력이 적 체력보다 높은지 확인 -> true , false
        boolean isStronger = playerHealth > enemyHealth;
        System.out.println("isStronger : " + isStronger);
        
        // 2. 플레이어의 체력이 위험 수준(20 이하) 인지 확인
        boolean isDanger = playerHealth <= 20;
        System.out.println("플레이어가 위험 상태이다 : " + isDanger);

        // 3. 플레이어 레벨이 퀘스트 수행 가능한 레벨 이상인지 확인
        boolean canDoQuest = playerLevel >= requiredLevel;
        System.out.println("퀘스트를 수행 할 수 있다 : " + canDoQuest);

        // 4. 플레이어와 적의 체력이 같은지 확인
        boolean isHeath = playerHealth == enemyHealth;
        System.out.println("체력이 서로 같습니다 : " + isHeath);

        // 5. 플레이어 레벨이 특정 레벨과 같은지 확인 (10)
        boolean isSameCheckLevel = playerLevel == 10;
        System.out.println("서로 레벨이 같습니다 : " + isSameCheckLevel);

        // 5. 플레이어 레벨이 특정 레벨과 다른지 확인 (10)
        boolean isDifCheckLevel = playerLevel != 10;
        System.out.println("서로 레벨이 다릅니다 : " + isDifCheckLevel);

    }
}
