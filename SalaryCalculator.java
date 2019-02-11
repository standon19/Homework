import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SalaryCalculator {

	public static void main(String[] args) {
		

		JFrame calc = new JFrame();
		calc.setLayout(null);
		calc.setBounds(300,300,300,200);
		
		calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel rate = new JLabel ("Hourly Rate:");
		rate.setBounds(25,25,100,25);
		calc.add(rate);
		
		JLabel time = new JLabel("Hours/Week:");
		time.setBounds(25,50,100,25);
		calc.add(time);
		
		JLabel salary = new JLabel("Annual Salary: $");
		salary.setBounds(125,125,100,25);
		calc.add(salary);
		
		JTextField rateinput = new JTextField();
		rateinput.setBounds(150,25,100,25);
		calc.add(rateinput);
		
		JTextField timeinput = new JTextField();
		timeinput.setBounds(150,50,100,25);
		calc.add(timeinput);
		
		
		
		JCheckBox full = new JCheckBox("Full Time");
		full.setBounds(20,75,100,25);
		calc.add(full);
		
		JButton calculate = new JButton("Calculate");
		calculate.setBounds(10,125,100,25);
		calc.add(calculate);
		
		
			calculate.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				String sal;
			
				if (full.isSelected())
				{
					sal = Double.toString(Double.parseDouble(rateinput.getText()) * 40);
				}
				else
				{
				sal = Double.toString(Double.parseDouble(rateinput.getText()) * Double.parseDouble(timeinput.getText()));
				}
				
				
				JLabel money = new JLabel(sal);
				money.setBounds(220,125,50,25);
				calc.add(money);
				
				calc.repaint();
				
				
			}
				});
		
		
		
		calc.setVisible(true);
		
	}

}
