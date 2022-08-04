import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;






public class Calculator implements ActionListener {   
	
	boolean isOperatorClicked=false,isDotPressed=false;
	
	float first,second,result;
	
	int opr=0;
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton zeroButton;
	JButton dotButton;
	JButton equalButton;
	JButton divButton;
	JButton mulButton;
	JButton minusButton;
	JButton plusButton;
	JButton clearButton;
	
	
    public Calculator() {  
        jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(300,150);

        displayLabel=new JLabel();
        displayLabel.setBounds(30,50,540,40);
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        jf.add(displayLabel);


        sevenButton=new JButton("7");
        sevenButton.setBounds(30,130,80,80);
        jf.add(sevenButton);  
        sevenButton.addActionListener(this);
        
        eightButton=new JButton("8");
        eightButton.setBounds(120,130,80,80);
        jf.add(eightButton);
        eightButton.addActionListener(this);

        nineButton=new JButton("9");
        nineButton.setBounds(210,130,80,80);
        jf.add(nineButton);
        nineButton.addActionListener(this);

        fourButton=new JButton("4");
        fourButton.setBounds(30,220,80,80);
        jf.add(fourButton);
        fourButton.addActionListener(this);

        fiveButton=new JButton("5");
        fiveButton.setBounds(120,220,80,80);
        jf.add(fiveButton);
        fiveButton.addActionListener(this);

        sixButton=new JButton("6");
        sixButton.setBounds(210,220,80,80);
        jf.add(sixButton);
        sixButton.addActionListener(this);

        oneButton=new JButton("1");
        oneButton.setBounds(30,310,80,80);
        jf.add(oneButton);
        oneButton.addActionListener(this);

        twoButton=new JButton("2");
        twoButton.setBounds(120,310,80,80);
        jf.add(twoButton);
        twoButton.addActionListener(this);

        threeButton=new JButton("3");
        threeButton.setBounds(210,310,80,80);
        jf.add(threeButton);
        threeButton.addActionListener(this);

        zeroButton=new JButton("0");
        zeroButton.setBounds(120,400,80,80);
        jf.add(zeroButton);
        zeroButton.addActionListener(this);

        dotButton=new JButton(".");
        dotButton.setBounds(30,400,80,80);
        jf.add(dotButton);
        dotButton.addActionListener(this);

        equalButton=new JButton("=");
        equalButton.setBounds(210,400,80,80);
        jf.add(equalButton);
        equalButton.addActionListener(this);

        divButton=new JButton("/");
        divButton.setBounds(300,130,80,80);
        jf.add(divButton); 
        divButton.addActionListener(this);

        mulButton=new JButton("x");
        mulButton.setBounds(300,220,80,80);
        jf.add(mulButton);
        mulButton.addActionListener(this);

        minusButton=new JButton("-");
        minusButton.setBounds(300,310,80,80);
        jf.add(minusButton);
        minusButton.addActionListener(this);

        plusButton=new JButton("+");
        plusButton.setBounds(300,400,80,80);
        jf.add(plusButton);
        plusButton.addActionListener(this);
        
        clearButton=new JButton("Clear");
        clearButton.setBounds(390, 440, 80, 40);
        jf.add(clearButton);
        clearButton.addActionListener(this);


        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
    }

    public static void main(String[] args) {
        new Calculator();
    }



	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== sevenButton) { if(isOperatorClicked==true)
			{displayLabel.setText("7");
			isOperatorClicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"7");
			}
		
	}
		
		else if(e.getSource()== eightButton) { if(isOperatorClicked==true)
		{displayLabel.setText("8");
		isOperatorClicked=false;
		}
		else {
		displayLabel.setText(displayLabel.getText()+"8");
		}
		}
		
		else if(e.getSource()== nineButton) { if(isOperatorClicked==true)
		{displayLabel.setText("9");
		isOperatorClicked=false;
		}
		else {
		displayLabel.setText(displayLabel.getText()+"9");
		}
		}
		
		else if(e.getSource()== fourButton) { if(isOperatorClicked==true)
		{displayLabel.setText("4");
		isOperatorClicked=false;
		}
		else {
		displayLabel.setText(displayLabel.getText()+"4");
		}
		}
		
		else if(e.getSource()== fiveButton) { if(isOperatorClicked==true)
		{displayLabel.setText("5");
		isOperatorClicked=false;
		}
		else {
		displayLabel.setText(displayLabel.getText()+"5");
		}
		}
		
		else if(e.getSource()== sixButton) { if(isOperatorClicked==true)
		{displayLabel.setText("6");
		isOperatorClicked=false;
		}
		else {
		displayLabel.setText(displayLabel.getText()+"6");
		}
		}
		
		else if(e.getSource()== oneButton) { if(isOperatorClicked==true)
		{displayLabel.setText("1");
		isOperatorClicked=false;
		}
		else {
		displayLabel.setText(displayLabel.getText()+"1");
		}
		}
		
		else if(e.getSource()== twoButton) { if(isOperatorClicked==true)
		{displayLabel.setText("2");
		isOperatorClicked=false;
		}
		else {
		displayLabel.setText(displayLabel.getText()+"2");
		}
		}
		
		else if(e.getSource()== threeButton) { if(isOperatorClicked==true)
		{displayLabel.setText("3");
		isOperatorClicked=false;
		}
		else {
		displayLabel.setText(displayLabel.getText()+"3");
		}
		}
		
		else if(e.getSource()== zeroButton) { if(isOperatorClicked==true)
		{displayLabel.setText("0");
		isOperatorClicked=false;
		}
		else {
		displayLabel.setText(displayLabel.getText()+"0");
		}
		}
		
		
		
		
		
		
		
		
		else if(e.getSource()==dotButton) {
			if (isDotPressed==false)
			{
				isDotPressed=true;
				if(isOperatorClicked==true)
				{
					displayLabel.setText(".");
					isOperatorClicked=false;
					}
				else
				{
			displayLabel.setText(displayLabel.getText()+".");
			}
			}
			else {displayLabel.setText(displayLabel.getText()+"");}
			}
		
		
		
		
		
		
		else if(e.getSource()== clearButton) {
			isOperatorClicked=false;
			isDotPressed=false;
					displayLabel.setText("");
		}
		
		
		
		
		
		
		
		
		
		else if(e.getSource()== divButton) { 
			isOperatorClicked=true;
			opr=1;
			first=Float.valueOf(displayLabel.getText()).floatValue();
			displayLabel.setText("/");
		}
		else if(e.getSource()== mulButton) {
			isOperatorClicked=true;
			opr=2;
			first=Float.valueOf(displayLabel.getText()).floatValue();
			displayLabel.setText("X");
		}
		else if(e.getSource()== plusButton) { 
			isOperatorClicked=true;
			opr=3;
			first=Float.valueOf(displayLabel.getText()).floatValue();
			displayLabel.setText("+");
		}
		else if(e.getSource()== minusButton) { 
			isOperatorClicked=true;
			opr=4;
			first=Float.valueOf(displayLabel.getText()).floatValue();
			displayLabel.setText("-");
		}
		else if(e.getSource()== equalButton) { 
			isOperatorClicked=true;
			isDotPressed=false;
			second=Float.valueOf(displayLabel.getText()).floatValue();
			
			switch (opr) {
			case 1: {result=first/second;
			displayLabel.setText(result+"");
			break;
			}
			case 2: {result=first*second;
			displayLabel.setText(result+"");
			break;
			}
			case 3: {result=first+second;
			displayLabel.setText(result+"");
			break;
			}
			case 4: {result=first-second;
			displayLabel.setText(result+"");
			break;
			}
			default:
				displayLabel.setText("Wrong Input");
			}
			
		}
		
	}
	
}