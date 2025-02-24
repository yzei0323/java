package day07.practice;

public class 함수문제4번 {

	public static void main(String[] args) {
		
		//4. 오늘 메뉴 추천해주는 함수 만들기 (Math.random()) 사용하여 메뉴배열에서 임의의 메뉴를 반환하기
		
		String[] menus = new String[] 
				{"김밥","마라탕","떡볶이","라면","제육볶음","김치찌개","토스트","피자","치킨"};

		String menu = 오늘메뉴(menus);
		System.out.println("오늘의 메뉴는 "+menu);
		
		
	}

	
	public static String 오늘메뉴(String[] menus) {
		
		int index = (int) (Math.random()*menus.length); 
		return menus[index];
	}
}
