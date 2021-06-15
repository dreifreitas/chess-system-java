package boardgame;

public abstract class Piece {
	protected Position position;
	private Board board;

	public Piece() {

	}

	public Piece(Board board) {
		this.board = board;

	}

	
	protected Board getBoard() {
		return board;
	}

	//public abstract boolean possibleMoves();

	
}
