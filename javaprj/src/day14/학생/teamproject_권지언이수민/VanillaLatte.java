package day14.학생.teamproject_권지언이수민;

public class VanillaLatte implements Order{

	@Override
	public String Order() {
		String menu="바닐라라떼";
		return menu;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 2500;
	}

}
