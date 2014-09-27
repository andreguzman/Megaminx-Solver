import java.util.ArrayList;

public class Corner_Piece extends Piece {
	private ArrayList<Color> piece = new ArrayList<Color>();
	private int orientation = 0;
	private Corner_Position pos; 

	public Corner_Piece(Color a, Color b, Color c) {
		piece.add(a);
		piece.add(b);
		piece.add(c);
	}

	public int Orientation() {
		return orientation;
	}

	public void setOrientation(int a) {
		orientation = a;
	}
	
	public Corner_Position getCorner_Position(){
		return pos;
	}
}
