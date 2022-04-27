package package03;

public class RandExam {
    public static void main(String[] args) {
        // 0보다는 크고 1보다는 작은 어떤 실수값
        System.out.println(Math.random());
        System.out.println(Math.random());
        // 1. Math.random() 값은 0에서 1 사이의 값
        // 2. (int)Math.random()은 항상 0이 출력 -> (int)(0.000001 ~ 0.999999)
        // 3. (int)Math.random()*5는 0 * 5이기 때문에 결과는 항상 0
        System.out.println((int)Math.random() * 5);
        // 0 ~ 4 사이의 값 출력
        System.out.println((int)(Math.random() * 5));
        // 0 ~ 9 사이의 값 출력
        System.out.println((int)(Math.random() * 10));
        // 0 ~ 99 사이의 값 출력
        System.out.println((int)(Math.random() * 100));

        // 1 ~ 6 사이의 값 출력
        System.out.println((int)(Math.random() * 6) + 1);
    }
}
