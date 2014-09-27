import java.util.ArrayList;

public class Face {
	private ArrayList<Piece> face = new ArrayList<Piece>();
	private Color number;
	public Face(Center_Piece c, Corner_Piece a, Edge_Piece b, Corner_Piece a2,
			Edge_Piece b2, Corner_Piece a3, Edge_Piece b3, Corner_Piece a4,
			Edge_Piece b4, Corner_Piece a5, Edge_Piece b5) {
		{
			number = c.getColor();
			face.add(a);
			face.add(b);
			face.add(a2);
			face.add(b2);
			face.add(a3);
			face.add(b3);
			face.add(a4);
			face.add(b4);
			face.add(a5);
			face.add(b5);
		}
	}
	
	public Color getColor(){
		return number;
	}
	
}
