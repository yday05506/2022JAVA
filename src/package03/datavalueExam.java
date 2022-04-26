package package03;

import java.util.StringTokenizer;

public class datavalueExam {
    public static void main(String[] args) {
        String line;
        String tmpStr = "hong 용산구 10.5 20.5";
        //기본적으로 토큰(구분자)은 공백으로 설정되어 있음
        StringTokenizer parse = new StringTokenizer(tmpStr, " ");
        //토큰(구분자)를 ,로 설정
        //데이터를 분리할 때 ,가 기준
        //StringTokenizer parse = new StringTokenizer(tmpStr, ", ");

        String name;
        String address;
        double math;
        double english;
        double total;
        double avg;

        // parse는 "hong 용산구 10.5 20.5" 문자열에서 hong을 가리킴
        // "hong" 문자열을 name에 저장한 후에 parse는 "용산구" 문자열을 가리킴
        name = parse.nextToken();
        // address에 "용산구" 문자열을 저장한 후에 parse 10.5를 가리킴
        address = parse.nextToken();
        // 1. parse.nextToken()은 "10.5"를 뽑아내고, parse는 20.5를 가리킴
        // 2. Double.valueOf(parse.nextToken())은 "10.5"를 Wrapper형 실수형으로 변환
        // 3. .doubleValue();는 기본 실수형(double)로 변환
        // math = 10.5 저장
        math = Double.valueOf(parse.nextToken()).doubleValue();
        // 1. parse.nextToken()은 "20.5"를 뽑아내고, parse는 토큰이 없는 위치를 가리킴
        // 2. Double.valueOf(parse.nextToken())은 "20.5"를 Wrapper형 실수형으로 변환
        // 3. .doubleValue();는 기본 실수형(double)로 변환
        // english = 20.5 저장장
       english = Double.valueOf(parse.nextToken()).doubleValue();
        total = math + english;
        avg = total / 2.0;

        System.out.println(name + "\t" + address + "\t" + math + "\t" + english + "\t" + total + "\t" + avg);
    }
}
