package day09.practice;

public class Main {
    public static void main(String[] args) {
        Bank4 user1 = new Bank4();
        Bank4 user2 = new Bank4();

        // 첫 번째 사용자 입금
        user1.입금("홍길동");
        
        // 두 번째 사용자 입금
        user2.입금("김철수");
        
        // 홍길동이 김철수에게 송금
        user1.송금("홍길동", user2);
        
        // 출금 테스트
        user1.출금("홍길동");
        user2.출금("김철수");
    }
}
