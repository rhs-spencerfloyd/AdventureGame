import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.*;

public class Game extends BasicGame {
    public Game(String gamename)
    {
        super(gamename);
    }
    int popupType = 1;
    int delta = 0;
    ArrayList<Popup> popups = new ArrayList<Popup>();

    @Override
    public void init(GameContainer gc) throws SlickException {}

    @Override
    public void update(GameContainer gc, int i) throws SlickException {
        delta += i;
        if (delta > 1000) {
            delta = 0;
            popupType++;
            if (popupType == 5)
                popupType = 1;
        }
    }

    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException
    {
        for (Popup p : popups) {
            p.render(g);
        }
        Popup p = new Popup("Hello", "12345678 234t q5 y q5y q 5yeq y ", 4, 50, 50);
        p.render(g);
    }

    public static void main(String[] args)
    {
        try
        {
            AppGameContainer appgc;
            appgc = new AppGameContainer(new Game("Spencer's Adventure Game: NAME TBD"));
            appgc.setDisplayMode(1280, 720, false);
            appgc.setTargetFrameRate(60);
            appgc.start();
        }
        catch (SlickException ex)
        {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // create new popup when mouse clicked
    public void mouseReleased(int button, int x, int y) {
        popups.add(new Popup("You pressed the mouse.", "Coords: (" + x + "," + y + ")", popupType, x, y));
    }
}
