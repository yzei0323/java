package day14.학생.이동우황예지;

//해외, 국내에 배송

public interface 이동우황예지_Delivery {

	public void productCnt(); //보조배터리 + 가격 / 총가격
	
	public void transportation(); //주소입력+유효성검사
	
	public int getDeliveryTime();  //주소에 따른 운송기간 반환
	
	
	
}
