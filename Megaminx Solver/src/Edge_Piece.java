import java.util.ArrayList;


public class Edge_Piece extends Piece{
	private ArrayList<Color> piece = new ArrayList<Color>();
	private int orientation = 0;
	private Edge_Position pos;
	
	public Edge_Piece(Color a, Color b, Edge_Position c){
		piece.add(a);
		piece.add(b);
		pos = c;
	}
	public int Orientation() {
		return orientation;
	}
	public void setOrientation(int a){
		orientation = a; 
	}
	public Edge_Position getCorner_Position(){
		return pos;
	}
}
