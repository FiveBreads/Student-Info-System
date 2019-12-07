import javax.swing.*;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.*;

class AddInfoPanel extends JPanel{
	private String[] labelTitle = {"��               ��", "��               ��", "��               ��", "��               ��"
			, "��  ��  ��  ��", "��      ��     ó", "��               ��", "��               ��"};
	
	private int textField_length = 7;
	
	private Image img;
	//private ImageIcon icon;
	
	java.net.URL imgURL = ActionEventHandler.class.getResource("images/�ð�ǥ.jpg");
	ImageIcon icon = new ImageIcon(imgURL);
	
	private JLabel[] labels = new JLabel[8];
	private JLabel imgLabel = new JLabel(icon);
	private JTextField[] textFields = new JTextField[textField_length];
	private JButton imageInsertBtn = new JButton("�ҷ� ����");
	private JButton addStudentBtn = new JButton("��       ��");
	
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
		/*�л� �߰� â�� �ؽ�Ʈ �ʵ� ���� �ԷµǾ� �ִ� ���� �����ϴ� �Լ�*/
		
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
