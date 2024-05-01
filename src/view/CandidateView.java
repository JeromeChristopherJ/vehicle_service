package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import bean.Candidate;
import controller.CandidateController;

public class CandidateView {
	
	CandidateView()
	{
		JLabel l1 = new JLabel("Name");
		JLabel l2 = new JLabel("M1");
		JLabel l3 = new JLabel("M2");
		JLabel l4 = new JLabel("M3");
		JTextField tf1 = new JTextField(30);
		JTextField tf2 = new JTextField(30);
		JTextField tf3 = new JTextField(30);
		JTextField tf4 = new JTextField(30);
		JButton Add1 = new JButton("Add");
		JPanel jp = new JPanel(new GridLayout(5,2));
		JFrame jf = new JFrame();
		jp.add(l1);
		jp.add(tf1);
		jp.add(l2);
		jp.add(tf2);
		jp.add(l3);
		jp.add(tf3);
		jp.add(Add1);
		jf.add(jp);
		jf.setVisible(true);
		
		Add1.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						Candidate cb = new Candidate();
						cb.setName(tf1.getText());
						cb.setM1(Integer.parseInt(tf2.getText()));
						cb.setM2(Integer.parseInt(tf3.getText()));
						cb.setM3(Integer.parseInt(tf3.getText()));
						CandidateController cao = new CandidateController();
						try {
							cao.addCandidate(cb);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
			
				});
		
	}
	public static void main(String[] args)
	{
		CandidateView cv = new CandidateView();
	}
	
	
	
	

}
