package day16.prac.io.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) {

		int total=0;
		int cnt=0;
		double avg;
		
		try (BufferedReader br = new BufferedReader( new FileReader("res/math.txt"))){
			
			while(true) {
			String data = br.readLine();
			if(data == null) break;
			cnt++;
			int score = Integer.parseInt(data);
			total = total + score;	//total += temp
			}
			
			//평균구하기
			avg = total/(double)cnt;
			System.out.println("수학점수평균"+avg);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
