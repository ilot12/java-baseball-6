package game;

import numbers.Numbers;
import strikeballs.StrikeBalls;
import view.InputView;
import view.OutputView;

public class Game {
    
    Numbers userInputNumbers;
    StrikeBalls strikeBalls;
    boolean repeatGuess;
    boolean repeatGame;
    
    public Game(){
        OutputView.initialMessage();
        strikeBalls = new StrikeBalls();
        startGuess();
        
        OutputView.printGuessEnd();
        setRepeatGame();
    }
    
    public void startGuess() {
        repeatGuess = true;
        while (repeatGuess) {
            userInputNumbers = new Numbers(InputView.readNumbers());
            strikeBalls.calculateStrikeBalls(userInputNumbers);
            OutputView.printStrikeBalls(strikeBalls);
            setRepeatGuess(strikeBalls);
        }
    }
    
    private void setRepeatGuess(StrikeBalls strikeBalls) {
        if (strikeBalls.getStrikes() == 3) {
            repeatGuess = false;
            return;
        }
        repeatGuess = true;
        return;
    }
    
    private void setRepeatGame() {
        String repeatText = InputView.readRepetition();
        validateRepeatGameText(repeatText);
        
        if (Integer.parseInt(repeatText) == 1) {
            repeatGame = true;
        }
        
        if (Integer.parseInt(repeatText) == 2) {
            repeatGame = false;
        }
        
    }
    
    private void validateRepeatGameText(String repeatText) throws IllegalArgumentException {
        if (repeatText.length() != 1) {
            throw new IllegalArgumentException("[Error] 반복 입력은 1자리 입력을 해야합니다.");
        }
        if (!repeatText.matches("[1-2]")) {
            throw new IllegalArgumentException("[Error] 반복 입력은 1과 2만 입력해야 합니다.");
        }
    }
    
    public boolean getRepeatGame() {
        return this.repeatGame;
    }
}
