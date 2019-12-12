import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


class ActionEventHandler implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();		
		
		if (btn.getText().equals("불러 오기")) {  
			JFileChooser chooser = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter("이미지 파일(*.jpg)", "jpg");
			chooser.setFileFilter(filter);
			int ret = chooser.showOpenDialog(null);
			if(ret != JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다.");
				return;
			}
			MainFrame.addPanel.setImageIcon(chooser.getSelectedFile().getPath());			
			
		}else if (btn.getText().equals("추       가")) { 
			Student newStudent = new Student(MainFrame.addPanel.getTextFields(), MainFrame.addPanel.getImageIcon());
			MainFrame.stuInfoSave.addStudent(newStudent);
			MainFrame.addPanel.setTextFieldsClear();
			/*데이터 입력된 파일을 생성할 것*/
			
		}else if (btn.getText().equals("검색")) { 	
			if(!MainFrame.stuInfoSave.isEmpty()) {
				DefaultListModel<Student> stud_model_object = new DefaultListModel<>();
				for(int i = 1; i <= MainFrame.stuInfoSave.getSize(); i++) {
					if(SearchInfoPanel.choosedComboIndex == 0) {//학번
						if(SearchInfoPanel.search_textField.getText().equals(MainFrame.stuInfoSave.getStudentInfo(i).getId())) {
							stud_model_object.addElement(MainFrame.stuInfoSave.getStudentInfo(i));
						}
						
					}else if(SearchInfoPanel.choosedComboIndex == 1) {//이름
						if(SearchInfoPanel.search_textField.getText().equals(MainFrame.stuInfoSave.getStudentInfo(i).getName())) {
							stud_model_object.addElement(MainFrame.stuInfoSave.getStudentInfo(i));
						}
						
					}else if(SearchInfoPanel.choosedComboIndex == 2) {//학과
						if(SearchInfoPanel.search_textField.getText().equals(MainFrame.stuInfoSave.getStudentInfo(i).getDepartment())) {
							stud_model_object.addElement(MainFrame.stuInfoSave.getStudentInfo(i));
						}
						
					}
				}
				ManagementPanel.listPanel.setList(stud_model_object);
			}			
			
		}else if (btn.getText().equals("선택 학생 정보 삭제")) { 			
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
