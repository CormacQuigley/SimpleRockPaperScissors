import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI1 extends JFrame implements ActionListener{
	JButton Button1;
	JButton Button2;
	JButton Button3;
	int winCounterr = 0;
	JLabel Label1;
	JLabel Label3;
	
	 GUI1() {
		 ImageIcon icon = new ImageIcon(getClass().getResource("rock.png"));
		 ImageIcon icon2 = new ImageIcon(getClass().getResource("paper.png"));
		 ImageIcon icon3 = new ImageIcon(getClass().getResource("scissors.png"));
		JFrame Frame = new JFrame();
		 Button1 = new JButton();
		 Button1.addActionListener(this);
		 Button1.setIcon(icon);
		 Button2 = new JButton();
		 Button2.addActionListener(this);
		 Button2.setIcon(icon2);
		 Button3 = new JButton();
		 Button3.addActionListener(this);
		 Button3.setIcon(icon3); 
		 Label1 = new JLabel("Number of Wins: " + winCounterr);
		 Label3 = new JLabel(" ");
		JLabel Label2 = new JLabel("Choose Rock, Paper or Scissors:");
		
		JPanel Panel = new JPanel();
		Panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		Panel.setLayout(new GridLayout(0,1));
		Panel.add(Label2);
		Panel.add(Button1);
		Panel.add(Button2);
		Panel.add(Button3);
		Panel.add(Label3);
		Panel.add(Label1);
		
		Frame.add(Panel, BorderLayout.CENTER);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setTitle("Rock Paper Scissors");
		Frame.pack();
		Frame.setVisible(true);
				
}

	@Override
	public void actionPerformed(ActionEvent e) {
		RockPaperScissors rockPaperScissors = new RockPaperScissors();
		if(e.getSource() == Button1) {
			rockPaperScissors.chooseR();
			System.out.println("Rock Chosen");
		}else if(e.getSource() == Button2) {
			rockPaperScissors.chooseP();
			System.out.println("Paper Chosen");
		}else if(e.getSource() == Button3) {
			rockPaperScissors.chooseS();
			System.out.println("Paper Scissors");
		}
		
		rockPaperScissors.randomBot();
		Label3.setText(rockPaperScissors.Play(rockPaperScissors.Chosen, rockPaperScissors.botChosen));
		winCounterr += rockPaperScissors.WinCounter;
		Label1.setText("Number of Wins: " + winCounterr);
		
		
	}	
}
