package package01;

public class ValueOfExam {
    public static void main(String[] args) {
        char ch = 'A';  // 문자
        String strData1 = "A";  // 문자열
        String strData2;
        // ch가 가지고 있는 문자 데이터를 문자열로 변경
        // valueOf(ch); 메소드는 static으로 정의 되어있어 클래스 이름으로 호출
        strData2 = String.valueOf(ch);

        if(strData1.equals(strData2))
            System.out.println("같음");
        else
            System.out.println("다름");
    }
}