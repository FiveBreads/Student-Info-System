import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

class SearchInfoPanel extends JPanel{
	private String[] searchPoint = {"학번", "이름", "학과"};
	
	private JComboBox<String> search_comboBox = new JComboBox<String>(searchPoint);
	private	JButton search_button = new JButton("검색");		
	
	public static JTextField search_textField = new JTextField(15);
	public static int choosedComboIndex;
	
	public SearchInfoPanel() {	
		this.setBorder(new TitledBorder(LineBorder.createGrayLineBorder(), "학생 검색"));
		this.createComboAction();
		search_button.addActionListener(new ActionEventHandler());
		this.add(search_comboBox);
		this.add(search_textField);
		this.add(search_button);
	}
	
	private void createComboAction() {
		search_comboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox jcb = (JComboBox)e.getSource();
				choosedComboIndex = jcb.getSelectedIndex();				
			}			
		});
	}
}
