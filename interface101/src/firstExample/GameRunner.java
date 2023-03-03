package firstExample;

public class GameRunner {

	public static void main(String[] args) {
		Game MyGame = new Game();
		otherGame OtherGame = new otherGame();
		MyGame.up();
		MyGame.down();
		MyGame.right();
		MyGame.left();

		OtherGame.up();
		OtherGame.down();
		OtherGame.right();
		OtherGame.left();

	}

}
