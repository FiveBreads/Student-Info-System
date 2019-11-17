import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

class SearchInfoPanel extends JPanel{
	private String[] searchPoint = {"학번", "이름", "학과"};
	
	private JComboBox<String> search_comboBox = new JComboBox<String>(searchPoint);
	private JTextField search_textField = new JTextField(15);
	private	JButton search_button = new JButton("검색");		
	
	public SearchInfoPanel() {		
		this.setBorder(new TitledBorder(LineBorder.createGrayLineBorder(), "학생 검색"));
		this.add(search_comboBox);
		this.add(search_textField);
		this.add(search_button);
	}
}
