import java.awt.Color;

import javax.swing.*;
class ManagementPanel extends JPanel{
	private SearchInfoPanel searchInfoPanel = new SearchInfoPanel();	
	private ListPanel listPanel = new ListPanel();
	private StudentInfoPanel studentInfoPanel = new StudentInfoPanel();
	
	public ManagementPanel() {
		this.setLayout(null);
		
		searchInfoPanel.setBackground(Color.BLUE);
		searchInfoPanel.setBounds(50, 30, 600, 150);
		
		listPanel.setBackground(Color.BLUE);
		listPanel.setBounds(50, 230, 600, 450);
		
		studentInfoPanel.setBackground(Color.BLUE);
		studentInfoPanel.setBounds(730, 30, 700, 650);
		
		this.add(searchInfoPanel);
		this.add(listPanel);
		this.add(studentInfoPanel);
	}
}
