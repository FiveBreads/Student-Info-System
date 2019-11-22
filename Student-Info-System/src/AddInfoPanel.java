import javax.swing.*;
import java.util.*;

class AddInfoPanel extends JPanel{
	private String[] labelTitle = {"이               름", "학               번", "학               과", "학               년"
			, "생  년  월  일", "연      락     처", "주               소", "사               진"};
	
	private int textField_length = 7;
	
	private JLabel[] labels = new JLabel[8];
	private JTextField[] textFields = new JTextField[textField_length];
	private JButton imageInsertBtn = new JButton("불러 오기");
	private JButton addStudentBtn = new JButton("추       가");
	
	public AddInfoPanel() {
		this.setLayout(null);
		this.makeJLabel();
		this.makeTextField();
		this.setLabels();		
		this.setTextFields();
		this.setButton();
	}
	
	public String[] getTextFields() {
		String[] data = new String[textField_length];
		for(int i = 0; i < textField_length; i++) {
			data[i] = this.textFields[i].getText().toString();
		}
		return data;
	}
			
	private void makeJLabel() {
		for(int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel(labelTitle[i]);
		}
	}
	
	private void makeTextField() {
		for(int i = 0; i < textField_length; i++) {
			textFields[i] = new JTextField(20);
		}
	}
	
	private void setLabels() {
		int x = 40;
		int y = 40;		
		for(int i = 0; i < labels.length; i++) {
			labels[i].setBounds(x, y, 100, 30);
			this.add(labels[i]);
			y += 40;
		}		
	}	
	
	private void setTextFields() {
		int x = 150;	
		int y = 40;
		for(int i = 0; i < textField_length; i++) {
			textFields[i].setBounds(x,  y, 100, 30);
			this.add(textFields[i]);
			y += 40;
		}
	}	

	private void setButton() {
		imageInsertBtn.setBounds(150, 320, 100, 30);
		imageInsertBtn.addActionListener(new ActionEventHandler());
		addStudentBtn.setBounds(80, 400, 100, 30);
		addStudentBtn.addActionListener(new ActionEventHandler());
		this.add(imageInsertBtn);
		this.add(addStudentBtn);
	}
}
