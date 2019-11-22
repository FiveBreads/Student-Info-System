import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

class ActionEventHandler implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();		
		
		if (btn.getText().equals("불러 오기")) {  
			
		}else if (btn.getText().equals("추       가")) { 
			Student newStudent = new Student(MainFrame.addPanel.getTextFields());
			MainFrame.stuInfoSave.addStudent(newStudent);
			
		}else if (btn.getText().equals("검색")) { 	
			
		}else if (btn.getText().equals("선택 학생 정보 삭제")) { 			
		
		}		
	}

}
