import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

class ActionEventHandler implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();		
		
		if (btn.getText().equals("�ҷ� ����")) {  
			
		}else if (btn.getText().equals("��       ��")) { 
			Student newStudent = new Student(MainFrame.addPanel.getTextFields());
			MainFrame.stuInfoSave.addStudent(newStudent);
			
		}else if (btn.getText().equals("�˻�")) { 	
			
		}else if (btn.getText().equals("���� �л� ���� ����")) { 			
		
		}		
	}

}
