import javax.swing.JFrame;
public class App {
    public static void main(String[] args) throws Exception {
        int rowCount= 21; // there will be 21 rows
        int columnCount=19; //
        int tileSize=32;// 32px
        int boardWidth =rowCount*tileSize;  //21c *32px
        int boardHeight = columnCount*tileSize; //19r *32px



        JFrame frame = new JFrame("Pac Man"); // window title name
       // frame.setVisible(true);
        frame.setSize(boardWidth,boardHeight); // set the window size 
        frame.setLocationRelativeTo(null); // appear at the center of the screen
        frame.setResizable(false); // this will make the window non resizable using mouse
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // make it abel to terminate the game by closing the window 

          

        PacMan pacmanGame =new PacMan();
        frame.add(pacmanGame);
        frame.pack();
        pacmanGame.requestFocus();
        frame.setVisible(true);
                            
    }
}
