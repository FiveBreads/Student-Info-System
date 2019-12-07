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
			MainFrame.addPanel.setTextFieldsClear();
			/*������ �Էµ� ������ ������ ��*/
			
		}else if (btn.getText().equals("�˻�")) { 	
			if(!MainFrame.stuInfoSave.isEmpty()) {
				DefaultListModel<Student> stud_model_object = new DefaultListModel<>();
				for(int i = 1; i <= MainFrame.stuInfoSave.getSize(); i++) {
					if(SearchInfoPanel.choosedComboIndex == 0) {//�й�
						if(SearchInfoPanel.search_textField.getText().equals(MainFrame.stuInfoSave.getStudentInfo(i).getId())) {
							stud_model_object.addElement(MainFrame.stuInfoSave.getStudentInfo(i));
						}
						
					}else if(SearchInfoPanel.choosedComboIndex == 1) {//�̸�
						if(SearchInfoPanel.search_textField.getText().equals(MainFrame.stuInfoSave.getStudentInfo(i).getName())) {
							stud_model_object.addElement(MainFrame.stuInfoSave.getStudentInfo(i));
						}
						
					}else if(SearchInfoPanel.choosedComboIndex == 2) {//�а�
						if(SearchInfoPanel.search_textField.getText().equals(MainFrame.stuInfoSave.getStudentInfo(i).getDepartment())) {
							stud_model_object.addElement(MainFrame.stuInfoSave.getStudentInfo(i));
						}
						
					}
				}
				ManagementPanel.listPanel.setList(stud_model_object);
			}			
			
		}else if (btn.getText().equals("���� �л� ���� ����")) { 			
			Student selectedStudent = ManagementPanel.listPanel.searchList.getSelectedValue();
			int idx = ManagementPanel.listPanel.searchList.getSelectedIndex();
			for(int i = 0; i < MainFrame.stuInfoSave.getSize(); i++) {
				if(selectedStudent.getId().equals(MainFrame.stuInfoSave.getStudentInfo(i).getId())) {
					MainFrame.stuInfoSave.removeStudent(idx);
					ManagementPanel.listPanel.getListModel().remove(idx);					
					ManagementPanel.listPanel.reList();
					break;
				}
			}
		}		
	}

}
