package checkers;

import java.awt.Color;
import java.util.ArrayList;
import game.*;

public class CheckersGame extends Game{
	
	public CheckersGame() {
		
		/*Initialize and set team colors, as it's a checkers game, default is red and black*/
		/* Initialize, generate and add each team pieces generated to the ArrayList of pieces
		 * I know, it's too many nested 'for's */
		Teams.setTeamColors(Color.RED, Color.BLACK);
		pieces = new ArrayList<Piece>();
		for (int team = 0; team < 2; team++) {
			for (int column = 0; column < 8; column++) {
				for (int line = 0; line < 3; line++) {
					if ((line + column + team) % 2 == 1) {
						Piece p = new CheckersPiece(Teams.getTeamColor(team),new Position(line + (team * 5),column));
						pieces.add(p);
					}
				}
			}
		}
		
		/* Finally, initializes the board with the lines, columns and pieces */
		board = new CheckersBoard(pieces);
	}
}
