package view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String readNumbers() {
        System.out.println("숫자를 입력해주세요 : ");
        String input = Console.readLine();
        return input;
    }
    
    public static String readRepetition() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = Console.readLine();
        return input;
    }
}
