import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

import java.util.ArrayList;

public class Popup {

    /*
    ----- TYPES OF POPUPS -----
    1. Info - white border, white text
    2. Option - green border/title, white text
    3. Warning - yellow border/title, white text
    4. Error - red border/title, white text
     */

    // popup global config
    private static final int maxWidth = 25;

    // instance data
    private String title;
    private String message;
    private int type;
    private int locationX;
    private int locationY;
    private Color color;
    private String[] selections;


    // constructor without selections
    public Popup(String title, String message, int type, int locationX, int locationY) {
        this.title = title;
        this.message = message;
        this.type = type;
        this.locationX = locationX;
        this.locationY = locationY;
    }
    // constructor with selections
    public Popup(String title, String message, int type, int locationX, int locationY, String[] selections) {
        this.title = title;
        this.message = message;
        this.type = type;
        this.locationX = locationX;
        this.locationY = locationY;
        this.selections = selections;
    }

    // this method renders the popup on the screen
    public void render(Graphics g) {

        // set color based on type of popup
        if (type == 1)
            g.setColor(Color.white);
        else if (type == 2)
            g.setColor(Color.green);
        else if (type == 3)
            g.setColor(Color.yellow);
        else if (type == 4)
            g.setColor(Color.red);

        // split message up into several lines if it is over maxWidth
        ArrayList<String> messages = new ArrayList<String>();
        if (message.length() > maxWidth) {
            String[] splitted = message.split(" ");
            int i = 0;
            while (i < splitted.length) {
                String nextLine = "";
                for (int j = i; j < splitted.length; j++) {
                    if ((nextLine + splitted[j]).length() < maxWidth) {
                        i = j-1;
                        break;
                    } else {
                        nextLine += splitted[j];
                    }
                }
                messages.add(nextLine);
            }
        } else {
            messages.add(message);
        }

        // get popup width based on length of title and message
        int width = title.length();
        for (String message : messages) {
            if (message.length() > width)
                width = message.length();
        }
        width += 4;

        // create strings for borders based on width
        String topBot = "#";
        String mid = "#";
        for (int i = 0; i < width-2; i++) {
            topBot += "#";
            mid += " ";
        }
        topBot += "#";
        mid += "#";

        // render the borders
        g.drawString(topBot, locationX, locationY);
        g.drawString(mid, locationX, locationY+10);
        g.drawString(mid, locationX, locationY+20);
        g.drawString(mid, locationX, locationY+30);
        g.drawString(mid, locationX, locationY+40);
        g.drawString(mid, locationX, locationY+50);
        g.drawString(mid, locationX, locationY+60);
        g.drawString(topBot, locationX, locationY+70);

        // render the title
        g.drawString(title, locationX+15, locationY+20);

        // change color to white for body
        g.setColor(Color.white);

        // render the message
        g.drawString(message, locationX+15, locationY+50);

    }
}
