package package04;

public class TestExam {
    public static void main(String[] args) {
        // 주사위(1 ~ 6)를 10번 던져
        // 1의 눈이 나오면 500원을 받고,
        // 2의 눈이 나오면 1000원을 받고,
        // 3의 눈이 나오면 1500원을 받고,
        // 4의 눈이 나오면 2000원을 받고,
        // 5의 눈이 나오면 2500원을 받고,
        // 6의 눈이 나오면 3000원을 받을 때
        // 전체 금액은 얼마인가?

        int dice;
        int money= 0;
        int i;

        for(i = 1; i <= 10; i++) {
            dice = (int)(Math.random() * 6) + 1;
            money += dice * 500;
            System.out.println(i + "번째 : " + dice);
        }

        System.out.println("얻은 금액의 합계 : " + money);
    }
}
