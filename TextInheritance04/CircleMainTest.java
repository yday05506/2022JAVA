package TextInheritance04;

public class CircleMainTest {

	public static void main(String[] args) {
		CircleArea_Exam cp = new CircleArea_Exam();
		
		System.out.println("���� ������ " + cp.area(10));	//area() �޼ҵ尡 private�� �Ǿ��ֱ� ������ �ش� Ŭ���� �������� ��� ����
		System.out.println("���� �ѷ��� " + cp.round(10));	//protected�� ����� �޼ҵ�� ��� ���迡�� ���� ����
															//���� ��Ű���� �־ ���� ����
	}

}