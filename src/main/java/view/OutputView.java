package view;

import strikeballs.StrikeBalls;

public class OutputView {
    
    public static void initialMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }
    
    public static void printStrikeBalls(StrikeBalls strikeBalls) {
        if (strikeBalls.getBalls() == 0 && strikeBalls.getStrikes() == 0) {
            System.out.println("낫싱");
            return;
        }
        
        StringBuilder sb = new StringBuilder();
        if (strikeBalls.getBalls() != 0) {
            sb.append(strikeBalls.getBalls());
            sb.append("볼 ");
        }
        
        if (strikeBalls.getStrikes() != 0) {
            sb.append(strikeBalls.getStrikes());
            sb.append("스트라이크 ");
        }
        System.out.println(sb.toString());
    }
    
    public static void printGuessEnd() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
