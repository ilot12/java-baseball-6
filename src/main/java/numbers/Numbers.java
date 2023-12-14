package numbers;

import java.util.ArrayList;
import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;

public class Numbers {

    private List<Integer> numbers;
    
    public Numbers() {
        numbers = new ArrayList<Integer>();
        while (numbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
        }
    }
    
    public Numbers(String inputNumbersText) {
        validateInputNumbersText(inputNumbersText);
        numbers = processNumbersInput(inputNumbersText);
    }
    
    private void validateInputNumbersText(String inputNumbersText) throws IllegalArgumentException {
        //3자리 입력이 아닌 경우
        if (inputNumbersText.length() != 3) {
            throw new IllegalArgumentException("[ERROR] 3자리 입력을 해야합니다.");
        }
        //1 ~ 9에 해당하는 입력이 아닌 경우
        if (!inputNumbersText.matches("[1-9]+")) {
            throw new IllegalArgumentException("[ERROR] 1 ~ 9에 해당하는 입력을 해야합니다.");
        }
    }
    
    private List<Integer> processNumbersInput(String inputNumbersText){
        List<Integer> inputNumbers = new ArrayList<Integer>();
        int i = 0;
        for (i = 0; i < 3; i++) {
            int number = Character.getNumericValue(inputNumbersText.charAt(i));
            //중복이 있는 경우 예외 처리
            if (inputNumbers.contains(number)) {
                throw new IllegalArgumentException("[ERROR] 중복되지 않은 입력을 해야합니다.");
            }
            inputNumbers.add(number);
        }
        return inputNumbers;
    }
    
    public List<Integer> getNumbers() {
        return this.numbers;
    }
    
}
