package radeui;

// commands that work throughout the game
public class Commands implements commandInterface {

	@Override
	public void useExit() {
		// move to room associated with exit
		// load exit "number int"
	}

	@Override
	public void save() {
		// save room item and possibly exit data
		// save.getUsername;
	}

	@Override
	public void quit() {
		// Closes game
		System.exit(0);
	}

	@Override
	public String help() {
		// returns a string of the 3 above commands and gives an answer to a
		// Common problem.
		return "Quit; stops game. save; saves game for later play under your username. "
				+ "Exit; goes to room associated with exit. "
				+ "Remember to chose your commands for your"
				+ " answers correctly a single wrong letter will make it incorrect."
				+ "also the Load and new command can only be used during the first phase."
				+ " If you wish to do these quit the game and reenter.";
	}

}
