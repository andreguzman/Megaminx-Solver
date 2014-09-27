public class Center_Piece extends Piece {
	private Color piece = Color.WHITE;
	private int orientation = 0;

	public Center_Piece(Color a) {
		piece = a;
	}

	public Color getColor(){
		return piece;
	}
	
	public int Orientation() {
		return orientation;
	}

}
