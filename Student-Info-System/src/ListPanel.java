import javax.swing.*;

class ListPanel extends JPanel{
	private JList<Object> searchList = new JList<>();
	private JScrollPane scroll = new JScrollPane(searchList);
	private JButton deleteButton = new JButton("���� �л� ���� ����");
	
	public ListPanel() {
		this.add(scroll);
		this.add(deleteButton);
	}
}
