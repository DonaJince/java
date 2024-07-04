import java.awt.*;
import java.awt.event.*;
public class  calculator extends Frame implements ActionListener
{
	TextField t1,t2,t3;
	Label l1,l2,l3;
	Button b1;
	Button b2;
	Button b3;
	Button b4;
	calculator()
	{
		setLayout(new FlowLayout());
		t1=new TextField(20);
		t2=new TextField(20);
		t3=new TextField(20);
		l1=new Label("number 1");
		l2=new Label("number 2");
		l3=new Label("result");
		b1=new Button("+");
		b2=new Button("-");
		b3=new Button("*");
		b4=new Button("/");
		add(l1);
		add (t1);
		add (l2);
		add (t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add (l3);
		add (t3);
	
		t1.setText("");
		t2.setText("");
		t3.setText("");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}	
	public void actionPerformed(ActionEvent ae)
	{
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());

            if (ae.getSource() == b1) 
                t3.setText(Double.toString(a + b));
            else if (ae.getSource() == b2) 
                t3.setText(Double.toString(a - b));
            else if (ae.getSource() == b3) 
                t3.setText(Double.toString(a * b));
            else if (ae.getSource() == b4)
	        {
                if (b == 0)
                    t3.setText("ERROR");
        	else
                    t3.setText(Double.toString(a / b));
                }
	}
	public static void main(String arg[])
	{
		calculator ob=new calculator();
		ob.setVisible(true);
		ob.setSize(200,300);
	}
}
