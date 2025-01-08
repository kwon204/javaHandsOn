package kr.codesquad;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class StringQuizTest {

    @Test
    @DisplayName("같은 문자열의 해시코드 비교 ")
    public void compareStringHashCode() {
        String abc1 = "abc";
        String abc2 = new String("abc");
        // TODO 1 변수에 정의한 문자열과 new 를 통해 생성한 인스턴스가 같은 주소를 가리키는지 비교
        assertEquals(abc1.hashCode(), abc2.hashCode());
        assertNotSame(abc1, abc2);
    }

    @Test
    @DisplayName("문자열 길이 구하기")
    public void test_stringLongLong() throws Exception {
        String teacher = "Honux";
        // TODO 2 문자열 길이 구하기
        int length = teacher.length();
        System.out.println(length);
    }

    @Test
    @DisplayName("문자열 합치기")
    public void assembleStrings() throws Exception {
        String teacher = "Crong";
        String frontend = "Hello";
        // TODO 3 문자열 합치기
        String frontendTeacher = frontend + teacher;
        System.out.println(frontendTeacher);
    }

    @Test
    @DisplayName("string 을 char 단위로 각각 출력")
    public void testPrintStringAsAChar() throws Exception {
        String teacher = "Pobi";
        // TODO 4 string 을 char 단위로 출력
        for(int i = 0; i < teacher.length(); i++) {
            System.out.println(teacher.charAt(i));
        }
        // 출력결과:
        // P
        // o
        // b
        // i
    }

    @Test
    @DisplayName("+을 이용해 String을 거꾸로 출력하기")
    public void stringReversedWithPlus() throws Exception {
        String teacher = "Dangle";
        String reverse = "";
        for(int i = teacher.length() - 1; i >= 0; i--) {
            reverse += teacher.charAt(i);
        }
        System.out.println(reverse);
        // TODO 5 더하기 연산을 이용해 String을 거꾸로 출력하기
        // 결과: elgnaD
    }


    @Test
    @DisplayName("StringBuilder을 이용해 String을 거꾸로 출력하기")
    public void 문자열_뒤집기() throws Exception {
        String developer = "Zello";
        StringBuilder sb = new StringBuilder(developer);

        System.out.println(sb.reverse());
        // TODO 6 StringBuilder를 이용해 String을 거꾸로 출력하기
        // 결과: olleZ
    }
}