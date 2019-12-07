import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

class StudentInfoPanel extends JPanel{
	public StudentInfoPanel() {
		this.setBorder(new TitledBorder(LineBorder.createGrayLineBorder(), "�л� ����"));
	}
	
	public void getSelectedStudentInfo(Student st) {
		System.out.println(st.getName());
		System.out.println(st.getId());		
	}	
}
