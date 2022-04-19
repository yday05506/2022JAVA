package package01;

public class EqualExam {
    public static void main(String[] args) {
        String str1 = "mirim";
        String str2 = "mirim";
        String str3 = new String("meister");
        String str4 = new String("meister");

        // str1과 str2 주소 비교
        if(str1 == str2)
            System.out.println("주소가 같다.");
        else
            System.out.println("주소가 다르다.");

        // str3과 str4 주소 비교
        if(str3 == str4)
            System.out.println("주소가 같다.");
        else
            System.out.println("주소가 다르다.");

        // str1과 str2 내용 비교
        if(str1.equals(str2))
            System.out.println("내용이 같다.");
        else
            System.out.println("내용이 다르다.");
        // str1이 가리키는 문자열의 내용과 str2가 가리키는 문자열의 내용이 같을 경우
        // true값을 반환

        // str3과 str4 내용 비교
        if(str3.equals(str4))
            System.out.println("내용이 같다.");
        else
            System.out.println("내용이 다르다.");
    }
}
