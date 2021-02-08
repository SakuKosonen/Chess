public class YourEvaluator extends Evaluator {

    // Implement your heuristic evaluation function here!
    // The below default function prefers:
    //  * not to lose (white king is worth at lot)
    //  * to win (black not having a king is worth a lot)
    //  * to have more white pieces (+1) and less black pieces (-1)

	public double eval(Position p) {
		double ret = 0;
                    
                
                
                    
                    	for(int x = 0; x < p.board.length; ++x) {
                            for(int y = 0; y < p.board[x].length; ++y) {
				if(p.board[x][y] == Position.Empty) continue;
				if(p.board[x][y] == Position.WKing) {
                                    
                                    ret += 20000;
                                }
				if(p.board[x][y] == Position.WQueen) {
                                    int bonus = 0;
                                    if((x==2 || x==3) && (y==2 || y==3)) {
                                        bonus = 10;
                                    } else if ((x==0||x==5) &&(y==0 || y==5)){
                                        bonus = -20;
                                    } else if (x==0 || x == 5) {
                                        bonus = -5;
                                    } else if (y==0 || y== 5) {
                                        bonus = -5;
                                    }
                                    ret += (900 + bonus);
                                }
				if(p.board[x][y] == Position.WRook)  {
                                    int bonus = 0;
                                    if((y==4 && x==5) || (y==4 && x==0)) {
                                        bonus = 5;
                                    } else if(y==4) {
                                        bonus = 10;
                                    } else if ((x==0 || x==5) && (y==0 || y==5)) {
                                        bonus = 0;
                                    } else if(x==0 || x==5) {
                                        bonus = -5;
                                    } else if (y==0 && (x==2 || x==3)) {
                                        bonus = 5;
                                    }
                                    ret += (bonus + 500);
                                }
                                    
                                                    
				if(p.board[x][y] == Position.WBishop) ret += 330;
				if(p.board[x][y] == Position.WKnight) {
                                    int bonus = 0;
                                    if((x==2 || x==3) && (y==2 || y==3)){
                                        bonus = 20;
                                    } else if ((y==5 || y==0) && (x==0 || x==5)) {
                                        bonus = -40;
                                    } else if (x==0 || x==5) {
                                        bonus = -30;
                                    } else if (y==0 || y==5) {
                                        bonus = -30;
                                    }
                                    ret += (320 + bonus);
                                }
				if(p.board[x][y] == Position.WPawn)  {
                                    
                                  int bonus = 0;
                                    if(y==4){
                                        bonus = 50;
                                    } else if((y==3 && x==3) || (y==3 && x==2)){
                                        bonus  = 30;
                                    } else if ((y==3 && x==1) || y==3 && x==4) {
                                        bonus = 20;
                                    } else if (y==3) {
                                        bonus = 10;
                                    } else if ((y==2 && x==3) || (y==2 && x==2)) {
                                        bonus = 20;
                                    } else if ((y==1 && x==2) || ((y==1 && x==3))) {
                                        bonus = -20;
                                    } else if ((y==1 && x==1) || (y==1 && x==4)) {
                                        bonus = 10;
                                    } else if ((y==1 && x==0) || (y==1 && x==5)) {
                                        bonus = 5;
                                    }
                                    
                                ret += (bonus + 100);
                                
                            }
				if(p.board[x][y] == Position.BKing) ret -= 20000;
				if(p.board[x][y] == Position.BQueen) {
                                    int bonus = 0;
                                    if((x==2 || x==3) && (y==2 || y==3)) {
                                        bonus = 10;
                                    } else if ((x==0||x==5) &&(y==0 || y==5)){
                                        bonus = -20;
                                    } else if (x==0 || x == 5) {
                                        bonus = -5;
                                    } else if (y==0 || y== 5) {
                                        bonus = -5;
                                    }
                                    ret -= (900 + bonus);
                                }
				if(p.board[x][y] == Position.BRook)  {
                                     int bonus = 0;
                                    if((y==1 && x==5) || (y==1 && x==0)) {
                                        bonus = 5;
                                    } else if(y==1) {
                                        bonus = 10;
                                    } else if ((x==0 || x==5) && (y==0 || y==5)) {
                                        bonus = 0;
                                    } else if(x==0 || x==5) {
                                        bonus = -5;
                                    } else if (y==5 && (x==2 || x==3)) {
                                        bonus = 5;
                                    }
                                    ret -= (bonus + 500);
                                }
				if(p.board[x][y] == Position.BBishop) ret -= 330;
				if(p.board[x][y] == Position.BKnight) {
                                     int bonus = 0;
                                    if((x==2 || x==3) && (y==2 || y==3)){
                                        bonus = 20;
                                    } else if ((y==5 || y==0) && (x==0 || x==5)) {
                                        bonus = -40;
                                    } else if (x==0 || x==5) {
                                        bonus = -30;
                                    } else if (y==0 || y==5) {
                                        bonus = -30;
                                    }
                                    ret -= (320 + bonus);
                                }
				if(p.board[x][y] == Position.BPawn)  {
                                    int bonus = 0;
                                    if(y==1){
                                        bonus = 50;
                                    } else if((y==2 && x==3) || (y==2 && x==2)){
                                        bonus  = 30;
                                    } else if ((y==2 && x==1) || y==2 && x==4) {
                                        bonus = 20;
                                    } else if (y==2) {
                                        bonus = 10;
                                    } else if ((y==3 && x==3) || (y==3 && x==2)) {
                                        bonus = 20;
                                    } else if ((y==4 && x==2) || ((y==4 && x==3))) {
                                        bonus = -20;
                                    } else if ((y==4 && x==1) || (y==4 && x==4)) {
                                        bonus = 10;
                                    } else if ((y==4 && x==0) || (y==4 && x==5)) {
                                        bonus = 5;
                                    }
                                    
                                ret -= (bonus + 100);
                                
                            }
			}
		}
                
                
		return ret;
	}
}
