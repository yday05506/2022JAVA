package Inheritance08;

public class SmartPhone extends PDA implements MobliePhoneInterface, MP3Interface{
	//�������̽��� ���� �� PDA Ŭ������ SmartPhone Ŭ������ ��� �޾ұ� ������
	//�߻� �޼ҵ�� ���� �� ��� �޼ҵ带 ���⼭ ������(Overriding) �ؾ� ��
	//MobilePhoneInterface�� �߻� �޼ҵ� ����
	
	@Override
	public void sendCall() {
		System.out.println("������ ������");
	}
	
	@Override
	public void receiveCall() {
		System.out.println("��ȭ�� �Ծ��.");
	}
	
	@Override
	public void sendSMS() {
		System.out.println("���� ���ϴ�.");
	}
	
	@Override
	public void receiveSMS() {
		System.out.println("���� �Ծ��.");
	}
	
	//MP3Interface�� �߻� �޼ҵ� ����
	@Override
	public void play() {
		System.out.println("���� �����մϴ�.");
	}
	
	@Override
	public void stop() {
		System.out.println("���� �ߴ��մϴ�.");
	}
	
	//�߰��� �ۼ��� �޼ҵ�
	public void schedule() {
		System.out.println("���� ����");
	}
}