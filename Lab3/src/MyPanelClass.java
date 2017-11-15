import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.DARK_GRAY);
                        g.fillRect(x1, y1, width + 1, height + 1);
//                        //Draw a border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
////                        //Draw a second border inside the first border
//                        g.setColor(Color.BLACK);                       
//                        g.drawRect(x1 + 5, y1 + 5, width - 10, height - 10);
                        
//                      //Draws a diagonal line running from the upper left to bottom right
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        //Draws a diagonal line running from the upper right to bottom left
//                        g.setColor(Color.RED);
//                        g.drawLine(getWidth(), height - height, height - height, getWidth());
                     
                        //Draws an oval
                        g.setColor(Color.LIGHT_GRAY);
                        g.fillOval((width -55)/2, (height -55)/2, 55, 55);
                      


            }
}
