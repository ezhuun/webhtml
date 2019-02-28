package js;

public class Test {

	public static void main(String[] args) {
		String url = "http://www.kma.go.kr";
		System.out.println(url);
		
		Snow snow = new Snow();
		snow.weather();
		
		if (5 % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}

}

class Snow {
	String seson = "봄"; //전역변수
	public void weather() {
		String season = "봄";  //지역변수
		System.out.println("눈");
	}
}