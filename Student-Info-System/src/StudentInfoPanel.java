import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


class StudentInfoPanel extends JPanel{
	private JLabel[] infoLabel = new JLabel[8];
	private JLabel[] viewInfo = new JLabel[8];
	
	public StudentInfoPanel() {
		this.setLayout(null);
		this.setBorder(new TitledBorder(LineBorder.createGrayLineBorder(), "학생 정보"));
		this.createViewLabels();
		this.setViewLabels();
	}
	
	private void createViewLabels() {
		String[] labTitle = MainFrame.addPanel.getLabelTitle();
		for(int i = 0; i < infoLabel.length; i++) {
			infoLabel[i] = new JLabel(labTitle[i] + " :");
			viewInfo[i] = new JLabel();
		}
	}
	
	private void setViewLabels() {
		int x = 40;
		int y = 40;
		for(int i = 0; i < infoLabel.length; i++) {
			infoLabel[i].setBounds(x, y, 100, 50);
			viewInfo[i].setBounds(x + 100, y, 150, 50);
			this.add(infoLabel[i]);
			this.add(viewInfo[i]);
			y += 70;
		}
		infoLabel[7].setBounds(x + 300, 40, 100, 50);
		viewInfo[7].setBounds(x + 300, 100, 160, 220);
	}
	
	public void getSelectedStudentInfo(Student st) {
		viewInfo[0].setText(st.getName());
		viewInfo[1].setText(st.getId());
		viewInfo[2].setText(st.getDepartment());
		viewInfo[3].setText(st.getGrade());
		viewInfo[4].setText(st.getYear() + "년 " + st.getMonth() + "월 " + st.getDay() + "일");
		viewInfo[5].setText(st.getPhoneNumber());
		viewInfo[6].setText(st.getAddress());
		viewInfo[7].setIcon(st.getImage());
	}	
}
