import javax.swing.*;

class ListPanel extends JPanel{
	private JList<Object> searchList = new JList<>();
	private JScrollPane scroll = new JScrollPane(searchList);
	private JButton deleteButton = new JButton("선택 학생 정보 삭제");
	
	public ListPanel() {
		this.add(scroll);
		this.add(deleteButton);
	}
}
