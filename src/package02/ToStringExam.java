package package02;

public class ToStringExam {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("java Programming");
        String str = null;

        // sb1은 StringBuffer 클래스 타입의 문자열인데 Stirng타입으로 변경해서 str에게 넘겨줌
        // String str = "java Programming"과 같음
        str = sb1.toString();
        System.out.println("str => " + str);
        // str이 가리키는 문자열을 대문자로 변경해서 출력력
       System.out.println("str.toUpperCase -> " + str.toUpperCase());
       System.out.println("str => " + str);
    }
}
