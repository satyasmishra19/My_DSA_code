public class interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
            q.moves();
    }
}

interface Chessplayer {
    void moves();
}

class Queen implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,riht,diagonal(in all 4 direction)");
    }
}

class Rook implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,riht");
    }
}
class King implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,riht,diagonal - (by 1 step)");
    }
}