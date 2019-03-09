import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;

public class Main {
    //The Main just creates the object of MonopolyGame and call the play method nothing more.
    public static void main(String[] args) {
        System.out.println("Welcome to Monopoly. Let's play.");
        MonopolyGame m = new MonopolyGame();
        m.play();
    }
}
