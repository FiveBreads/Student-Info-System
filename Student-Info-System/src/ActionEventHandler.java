import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


class ActionEventHandler implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();		
		
		if (btn.getText().equals("�ҷ� ����")) {  
			JFileChooser chooser = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter("���� ���� ��ȭ����(*.jpg)", "jpg");
			chooser.setFileFilter(filter);
			int ret = chooser.showOpenDialog(null);
			if(ret != JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null, "������ �������� �ʾҽ��ϴ�.");
				return;
			}
			/*������ �̹����� �����ؼ� bin/images�� �ְ� �� ��θ��� �� imgUML�� �ְ�..*/
			
			java.net.URL imgURL = ActionEventHandler.class.getResource("images/�ð�ǥ.jpg");
			
			
		}else if (btn.getText().equals("��       ��")) { 
			Student newStudent = new Student(MainFrame.addPanel.getTextFields());
			MainFrame.stuInfoSave.addStudent(newStudent);
			/*������ �Էµ� ������ ������ ��*/
			
		}else if (btn.getText().equals("�˻�")) { 	
			if(MainFrame.stuInfoSave.getSize() != 0) {
				for(int i = 1; i <= MainFrame.stuInfoSave.getSize(); i++) {
					if(SearchInfoPanel.choosedComboIndex == 0) {//�й�
						if(SearchInfoPanel.search_textField.getText().equals(MainFrame.stuInfoSave.getStudentInfo(i).getId())) {
							ManagementPanel.listPanel.setList(MainFrame.stuInfoSave.getStudentInfo(i));
						}
						
					}else if(SearchInfoPanel.choosedComboIndex == 1) {//�̸�
						if(SearchInfoPanel.search_textField.getText().equals(MainFrame.stuInfoSave.getStudentInfo(i).getName())) {
							ManagementPanel.listPanel.setList(MainFrame.stuInfoSave.getStudentInfo(i));
						}
						
					}else if(SearchInfoPanel.choosedComboIndex == 2) {//�а�
						if(SearchInfoPanel.search_textField.getText().equals(MainFrame.stuInfoSave.getStudentInfo(i).getDepartment())) {
							ManagementPanel.listPanel.setList(MainFrame.stuInfoSave.getStudentInfo(i));
						}
						
					}
				}				
			}			
			
		}else if (btn.getText().equals("���� �л� ���� ����")) { 			
		
		}		
	}

}
