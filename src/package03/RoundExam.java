package package03;

public class RoundExam {
    public static void main(String[] args) {
        System.out.println(Math.round(25));
        System.out.println(Math.round(25.3));
        System.out.println(Math.round(25.5));   // 반올림
        // 매개 변수 값과 같거나 가장 가까운 정수를 리턴
        System.out.println(Math.round(-25.4));
        System.out.println(Math.round(-25.5));
        System.out.println(Math.round(-25.6));
    }
}
