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
			
		}else if (btn.getText().equals("���� �л� ���� ����")) { 			
		
		}		
	}

}
