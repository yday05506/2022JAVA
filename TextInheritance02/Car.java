package TextInheritance02;

public class Car {
	//멤버 변수
	String carname;
	String color = "검정색";
	int velocity;	//속도
	
	//메소드
	void speedUp() {	//속도 증가
		velocity += 5;
	}
	void speedDown() {	//속도 감소
		velocity -= 5;
	}
}
