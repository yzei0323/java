package day14.학생.teamproject_권지언이수민;

public class ColdBrewLatte implements Order{

	@Override
	public String Order() {
		String menu="콜드브루라떼";
		return menu;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 3000;
	}

}
