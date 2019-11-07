import javax.swing.*;
import java.util.*;
class AddInfoPanel extends JPanel{
	private HashMap<Integer, String> addPanelTitle = new HashMap<>();
	private String[] labelTitle = {"이 름", "학 번", "학 과", "학 번", "생년월일", "휴 대 폰", "주 소", "사 진"};
	
	private JLabel[] labels = new JLabel[8];
	private JTextField[] textFields = new JTextField[8];
	
	public AddInfoPanel() {
		this.setLayout(null);
		this.makeJLabel();
		this.makeMap();
		this.makeTextField();
		
		int x = 40;
		int y = 40;		
		for(int i = 0; i < labels.length; i++) {
			labels[i].setLocation(x, y);
			this.add(labels[i]);
			y += 30;
		}
		
		x = 80;	
		y = 40;
		for(int i = 0; i < labels.length; i++) {
			textFields[i].setLocation(x,  y);
			this.add(textFields[i]);
			y += 30;
		}		
	}
	
	private void setAddComponent() {
		
	}
	
	private void makeMap() {
		for(int i = 0; i < labels.length; i++) {
			addPanelTitle.put(i, labelTitle[i]);
		}
	}
	
	private void makeJLabel() {
		for(int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel(labelTitle[i]);
		}
	}
	
	private void makeTextField() {
		for(int i = 0; i < labels.length; i++) {
			textFields[i] = new JTextField(20);
		}
	}	
}
