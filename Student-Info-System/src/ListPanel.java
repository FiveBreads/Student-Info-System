import java.util.*;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class ListPanel extends JPanel{
	public static JList<Student> searchList = new JList<>();
	
	private JScrollPane scroll = new JScrollPane(searchList, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	private JButton deleteButton = new JButton("선택 학생 정보 수정");
	private DefaultListModel<Student> studentModel;
	private DefaultListModel listModel;
	
	private boolean hasList = false;
	
	public ListPanel() {
		this.setBorder(new TitledBorder(LineBorder.createGrayLineBorder(), "검색 목록"));
		deleteButton.addActionListener(new ActionEventHandler());
		this.listSelect();
		this.add(scroll);
		this.add(deleteButton);
	}	
	
	public void listSelect() {
		searchList.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				if(!e.getValueIsAdjusting()) {
					ManagementPanel.studentInfoPanel.getSelectedStudentInfo((Student) studentModel.get(searchList.getSelectedIndex()));
					//ManagementPanel.studentInfoPanel.getSelectedStudentInfo();
				}				
			}			
		});
	}
	
	public void reList() {
		searchList.setModel(listModel);
	}
	
	public DefaultListModel getListModel() {
		return listModel;
	}
	
	public void setList(DefaultListModel stud) {
		listModel = new DefaultListModel();
		studentModel = new DefaultListModel<>();
		Student st;
		StringBuilder sb;
		for(int i = 0; i < stud.getSize(); i++) {			
			st = (Student) stud.get(i);
			studentModel.addElement(st);
			
			sb = new StringBuilder();
			sb.append(st.getName() + " ");
			sb.append(st.getId() + " ");
			sb.append(st.getDepartment());
			listModel.addElement(sb.toString());			
		}		
		searchList.setModel(listModel);
	}
}
