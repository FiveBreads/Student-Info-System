import javax.swing.*;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.*;

class AddInfoPanel extends JPanel{
	private String[] labelTitle = {"이               름", "학               번", "학               과", "학               년"
			, "생  년  월  일", "연      락     처", "주               소", "사               진"};
	
	private int textField_length = 7;
	
	private Image img;
	//private ImageIcon icon;
	
	java.net.URL imgURL = ActionEventHandler.class.getResource("images/시간표.jpg");
	ImageIcon icon = new ImageIcon(imgURL);
	
	private JLabel[] labels = new JLabel[8];
	private JLabel imgLabel = new JLabel(icon);
	private JTextField[] textFields = new JTextField[textField_length];
	private JButton imageInsertBtn = new JButton("불러 오기");
	private JButton addStudentBtn = new JButton("추       가");
	
	public AddInfoPanel() {
		this.setLayout(null);
		this.makeJLabel();
		this.makeTextField();
		this.setLabels();	
		this.setImageLabel();
		this.setTextFields();
		this.setButton();
	}
	
	public void getImage(File image) {
		
	}
	
	public String[] getTextFields() {
		/*학생 추가 창의 텍스트 필드 값이 입력되어 있는 값을 리턴하는 함수*/
		
		String[] data = new String[textField_length];
		for(int i = 0; i < textField_length; i++) {
			data[i] = this.textFields[i].getText().toString();
		}
		return data;
	}
	
	public void setTextFieldsClear() {
		for(int i = 0; i < textField_length; i++) {
			this.textFields[i].setText("");
		}
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
	
	private void setImageLabel() {		
		imgLabel.setBounds(40, 370, 160, 200);
		this.add(imgLabel);
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
		addStudentBtn.setBounds(80, 600, 100, 30);
		addStudentBtn.addActionListener(new ActionEventHandler());
		this.add(imageInsertBtn);
		this.add(addStudentBtn);
	}
}
