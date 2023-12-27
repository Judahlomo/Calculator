import javax.swing.*;
import java.awt.event.*;

class CalculatorApp implements ActionListener{//Declare the aspects of the calculator
	JFrame frame1;
	JTextField text;
	JButton num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,division,multiply,subtraction,addtion,decPoint,equalsign,delete,theClear;

static double a=0,b=0,res=0;
	static int operator=0;

CalculatorApp(){//Initialize all objects of the calculator
	frame1=new JFrame("The Judah Calculator");//Naming the frame
	text=new JTextField();
	num1=new JButton("1");
	num2=new JButton("2");
	num3=new JButton("3");
	num4=new JButton("4");
	num5=new JButton("5");
	num6=new JButton("6");
	num7=new JButton("7");
	num8=new JButton("8");
	num9=new JButton("9");
	num10=new JButton("0");
	
	division=new JButton("/");
	multiply=new JButton("*");
	subtraction=new JButton("-");
	addtion=new JButton("+");
	decPoint=new JButton(".");
	equalsign=new JButton("=");
	delete=new JButton("Delete");
	theClear=new JButton("Clear");
	
	//Set bounds for all aspects of the calculator
	text.setBounds(30,40,280,30);
	num1.setBounds(40,240,50,40);
	num2.setBounds(110,240,50,40);
	num3.setBounds(180,240,50,40);
	subtraction.setBounds(250,240,50,40);
	
	num4.setBounds(40,170,50,40);
	num5.setBounds(110,170,50,40);
	num6.setBounds(180,170,50,40);
	multiply.setBounds(250,170,50,40);
	
	num7.setBounds(40,100,50,40);
	num8.setBounds(110,100,50,40);
	num9.setBounds(180,100,50,40);
	division.setBounds(250,100,50,40);
	
	decPoint.setBounds(40,310,50,40);
	num10.setBounds(110,310,50,40);
	equalsign.setBounds(180,310,50,40);
	addtion.setBounds(250,310,50,40);
	
	delete.setBounds(60,380,100,40);
	theClear.setBounds(180,380,100,40);
	
	//Next we will add each element by their respective row
	frame1.add(text);
	frame1.add(num1);
	frame1.add(num2);
	frame1.add(num3);
	frame1.add(division);
	
	frame1.add(num4);
	frame1.add(num5);
	frame1.add(num6);
	frame1.add(multiply);
	
	frame1.add(num7);
	frame1.add(num8);
	frame1.add(num9);
	frame1.add(subtraction);
	
	frame1.add(decPoint);
	frame1.add(num10);
	frame1.add(equalsign);
	frame1.add(addtion);
	frame1.add(delete);
	frame1.add(theClear);
	
	frame1.setLayout(null);
	frame1.setVisible(true);
	frame1.setSize(500,500);
	frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame1.setResizable(false);
	
	//Set the action listener for each available button
	num1.addActionListener(this);
	num2.addActionListener(this);
	num3.addActionListener(this);
	num4.addActionListener(this);
	num5.addActionListener(this);
	num6.addActionListener(this);
	num7.addActionListener(this);
	num8.addActionListener(this);
	num9.addActionListener(this);
	num10.addActionListener(this);
	
	addtion.addActionListener(this);
	division.addActionListener(this);
	multiply.addActionListener(this);
	subtraction.addActionListener(this);
	
	decPoint.addActionListener(this);
	equalsign.addActionListener(this);
	delete.addActionListener(this);
	theClear.addActionListener(this);
	}

public void actionPerformed(ActionEvent ae){
	if(ae.getSource()==num1)
		text.setText(text.getText().concat("1"));

	if(ae.getSource()==num2)
		text.setText(text.getText().concat("2"));

	if(ae.getSource()==num3)
		text.setText(text.getText().concat("3"));

	if(ae.getSource()==num4)
		text.setText(text.getText().concat("4"));

	if(ae.getSource()==num5)
		text.setText(text.getText().concat("5"));

	if(ae.getSource()==num6)
		text.setText(text.getText().concat("6"));

	if(ae.getSource()==num7)
		text.setText(text.getText().concat("7"));

	if(ae.getSource()==num8)
		text.setText(text.getText().concat("8"));

	if(ae.getSource()==num9)
		text.setText(text.getText().concat("9"));

	if(ae.getSource()==num10)
		text.setText(text.getText().concat("0"));

	if(ae.getSource()==decPoint)
		text.setText(text.getText().concat("."));

	if(ae.getSource()==addtion){
		a=Double.parseDouble(text.getText());
		operator=1;
		text.setText("");
	}

	if(ae.getSource()==subtraction){
		a=Double.parseDouble(text.getText());
		operator=2;
		text.setText("");
	}

	if(ae.getSource()==multiply){
		a=Double.parseDouble(text.getText());
		operator=3;
		text.setText("");
	}

	if(ae.getSource()==division){
		a=Double.parseDouble(text.getText());
		operator=4;
		text.setText("");
	}

	if(ae.getSource()==equalsign){
		b=Double.parseDouble(text.getText());

		switch(operator){
		case 1: res=a+b;
		break;

		case 2: res=a-b;
		break;

		case 3: res=a*b;
		break;

		case 4: res=a/b;
		break;

		default: res=0;
		}

		text.setText(""+res);
	}

	if(ae.getSource()==theClear)
		text.setText("");

	if(ae.getSource()==delete){
		String j=text.getText();
		text.setText("");
		for(int i=0;i<j.length()-1;i++)
			text.setText(text.getText()+j.charAt(i));
		}
	}

public static void main(String...j){
	new Calculator();
	}
}

