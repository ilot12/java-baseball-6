package baseball;

import game.Game;

public class Application {
    public static void main(String[] args) {
        
        Game game;
        do {
            game = new Game();
        }while(game.getRepeatGame());
        
    }
}
