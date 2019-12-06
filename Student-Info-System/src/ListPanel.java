import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

class ListPanel extends JPanel{
	private JList<Student> searchList = new JList<>();
	private JScrollPane scroll = new JScrollPane(searchList, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	private JButton deleteButton = new JButton("���� �л� ���� ����");
	
	public ListPanel() {
		this.setBorder(new TitledBorder(LineBorder.createGrayLineBorder(), "�˻� ���"));
		this.add(scroll);
		this.add(deleteButton);
	}
	
	public void setList(Student stud) {
				
	}
}
