import javax.swing.*;

class SearchInfoPanel extends JPanel{
	private String[] searchPoint = {"�й�", "�̸�", "�а�"};
	
	private JComboBox<String> search_comboBox = new JComboBox<String>(searchPoint);
	private JTextField search_textField = new JTextField(15);
	private	JButton search_button = new JButton("�˻�");		
	
	public SearchInfoPanel() {		
		this.add(search_comboBox);
		this.add(search_textField);
		this.add(search_button);
	}
}
