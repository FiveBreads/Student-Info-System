import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

class StudentInfoPanel extends JPanel{
	public StudentInfoPanel() {
		this.setBorder(new TitledBorder(LineBorder.createGrayLineBorder(), "학생 정보"));
	}
}
