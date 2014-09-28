
public class Megaminx {
	EdgePiece[] e = new EdgePiece[30];
	CornerPiece[] c = new CornerPiece[20];

	public CornerPiece getCorner(int f1, int f2, int f3) {
		return c[getCornerNumber(f1, f2, f3)];
	}
	
	public EdgePiece getEdge (int f1, int f2){
		return e[getEdgeNumber(f1,f2)];
	}
	
	
	public void turn0(){
		int c1 = getCorner(0,1).getColor1();
		int c1 = getCorner(0,1).getColor2();
		getCorner(0,2).setColor1(getCorner(0,1).getColor1(););
		getCorner(0,2).setColor2(getCorner(0,1).getColor1(););
	}
	

	public int getCornerNumber(int f1, int f2, int f3){

		switch(f1+f2+f3){
		case 3: return 0;
		case 6: return 1;
		case 5: return 2;
		case 7: return 3;
		case 9: 
			if (f1 == 0 || f2 == 0 || f3 == 0)
				return 4;
			return 5;
		case 16: return 6;
		case 17: 
			if (f1 == 1 || f2 == 1 || f3 == 1)
				return 7;
			return 8;
		case 12: return 9;
		case 15:
			if (f1 == 2 || f2 == 2 || f3 == 2)
				return 10;
			return 11;
		case 18: return 12;
		case 21: return 13;
		case 24:
			if (f1 == 5 || f2 == 5 || f3 == 5)
				return 14;
			return 15;
		case 27: return 16;
		case 26: return 17;
		case 28: return 18;
		case 30: return 19;



		}

		public int getEdgeNumber(int f1, int f2){
			if (f1 > f2){
				int t = f1;
				f1 = f2;
				f2 = t;
			}

			int n = f1*10+f2;

			switch(n){
			case 1: return 0;
			case 2: return 1;
			case 3: return 2;
			case 4: return 3;
			case 5: return 4;
			case 12: return 5;
			case 15: return 6;
			case 19: return 7;
			case 20: return 8;
			case 23: return 9;
			case 26: return 10;
			case 27: return 11;
			case 34: return 12;
			case 37: return 13;
			case 38: return 14;
			case 45: return 15;
			case 48: return 16;
			case 49: return 17;
			case 59: return 18;
			case 60: return 19;
			case 67: return 20;
			case 70: return 21;
			case 71: return 22;
			case 78: return 23;
			case 81: return 24;
			case 89: return 25;
			case 91: return 26;
			case 100: return 27;
			case 101: return 28;
			case 111: return 29;
			










			}



		}


	}
}
