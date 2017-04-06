import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.event.*;
public class Test extends JFrame implements ChangeListener{
private OvalPanel pan;
private JSlider sl;
	public Test()
	{
		super();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,400);
		sl=new JSlider(SwingConstants.HORIZONTAL,0,300,10);
		sl.addChangeListener(this);
		sl.setMajorTickSpacing(10);
		sl.setPaintLabels(true);
		sl.setPaintTicks(true);
		sl.setSnapToTicks(true);
		pan=new OvalPanel();
		this.add(pan, BorderLayout.CENTER);
		this.add(sl, BorderLayout.SOUTH);
		
		
		
		
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
	/*
	 * Databases
	 * Need MS Access or Oracle - management system
	 * database- lots of tables(files)
	 * tables are related so relational database management system
	 * (RDBMS)
	 * we use SQL (Structured Query Language) for writing databases
	 * db is a collection of tables 
	 * table is a collection of records
	 * records are a collection of fields ex(Student id,first name)
	 * fields are a collection of characters.
	 * famous word: select (look up other two famous words in database)
	 * SELECT(field,...)if you want all the fields just put *
	 * FROM (table 1,table2,...)
	 * WHERE (Condition(s))
	 * ex:
	 * SELECT(first name)
	 * FROM(Student)
	 * WHERE(State='MI')
	 */
		/*
		 * sliders
		 * JSlider
		 */
		Test t=new Test();
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		pan.setDi(sl.getValue());
		
	}

}
