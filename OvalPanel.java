import java.awt.*;
import java.util.*;
import javax.swing.*;

public class OvalPanel extends JPanel {
private int di=10;
public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.fillOval(10, 10, di, di);
	}
	public void setDi(int i)
	{
		di=i;
		repaint();
	}
	
}
