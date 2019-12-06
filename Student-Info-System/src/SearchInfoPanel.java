import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

class SearchInfoPanel extends JPanel{
	private String[] searchPoint = {"�й�", "�̸�", "�а�"};
	
	private JComboBox<String> search_comboBox = new JComboBox<String>(searchPoint);
	private	JButton search_button = new JButton("�˻�");		
	
	public static JTextField search_textField = new JTextField(15);
	public static int choosedComboIndex;
	
	public SearchInfoPanel() {	
		this.setBorder(new TitledBorder(LineBorder.createGrayLineBorder(), "�л� �˻�"));
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
