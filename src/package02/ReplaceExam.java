package package02;

public class ReplaceExam {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("java Programming");
        StringBuffer sb11 = new StringBuffer("java Programming");
        StringBuffer sb2 = null;
        StringBuffer sb3 = null;

        // start(0) 문자에서 시작하여 end-1(4-1)까지의 문자열을 "JAVA"로 치환
        sb2 = sb1.replace(0, 4, "JAVA");
        System.out.println("sb2 =>" + sb2);
        
        // "jav" => "JAVA"로 변경
        sb3 = sb11.replace(0, 3, "JAVA");
        System.out.println("sb3 =>" + sb3);
    }
}
