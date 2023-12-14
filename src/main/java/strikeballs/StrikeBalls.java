package strikeballs;

import java.util.List;

import numbers.Numbers;

public class StrikeBalls {
    
    private int strikes;
    private int balls;
    private Numbers computerNumbers;
    
    public StrikeBalls() {
        computerNumbers = new Numbers();
    }
    
    public void calculateStrikeBalls(Numbers userInputNumbers) {
        strikes = calculateStrikes(userInputNumbers);
        balls = calculateBalls(userInputNumbers);
    }
    
    private int calculateStrikes(Numbers userInputNumbers) {
        int strikes = 0;
        
        List<Integer> computerNumbersList = computerNumbers.getNumbers();
        List<Integer> userInputNumbersList = userInputNumbers.getNumbers();
        
        int i = 0;
        for (i = 0; i < 3; i++) {
            if (userInputNumbersList.get(i) == computerNumbersList.get(i)) {
                strikes++;
            }
        }
        
        return strikes;
    }
    
    private int calculateBalls(Numbers userInputNumbers) {
        int balls = 0;
        
        List<Integer> computerNumbersList = computerNumbers.getNumbers();
        List<Integer> userInputNumbersList = userInputNumbers.getNumbers();
        
        int i = 0;
        int j = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (i == j) {
                    continue;
                }
                if (userInputNumbersList.get(i) == computerNumbersList.get(j)) {
                    balls++;
                }
            }
        }
        
        return balls;
    }
    
    public int getStrikes() {
        return this.strikes;
    }
    
    public int getBalls() {
        return this.balls;
    }
}
