package Triangle;

public class Triangle {

	// 밑변과 높이의 정보저장메서드

	// 변수 :밑변, 높이

	float width;// 삼각형의 밑변
	float height;// 삼각형의 높이

	void setData(float w, float h) {

		width = w;
		height = h;
		System.out.println("밑변:" + w);
		System.out.println("높이:" + h);

	}

	// 삼각형의 넓이 구하고 넓이를 반환하는메서드 ->결과는 실수타입

	float area() {
		float result = 0.0f;
		result = width * height / 2f;
		return result;
		// return width*height/2f;

	}
	public static void main(String[] args) {

		Triangle t=new Triangle();
		
		//밑변과 높이 값을 설정
		
		t.setData(5, 5);
		
		//넓이를 구하고 변수에 담는다
		float result=t.area();
		
		System.out.println(result);

	}

}
