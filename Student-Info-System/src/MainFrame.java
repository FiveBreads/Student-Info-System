import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame{	
	private int infoItemNum = 3;
	private int fileItemNum = 3;
	private String[] infoMenuItemTitle = {"�л� �߰�", "�л� ��ȸ", "���� ����"};	
	
	private AddInfoPanel addPanel = new AddInfoPanel();
	private ManagementPanel managementPanel = new ManagementPanel();
	
	public MainFrame() {
		/*  JTabbedPane, JMenuBar   */
		this.setTitle("�л� ���� �ý���");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		Container c = this.getContentPane();
		JTabbedPane pane = this.createTabbedPane();
		c.add(pane, BorderLayout.CENTER);
		this.createMenu();
		this.setSize(1500, 800);
		this.setVisible(true);
	}
	
	private JTabbedPane createTabbedPane() {
		JTabbedPane pane = new JTabbedPane();		
		pane.addTab("�л� ��ȸ", managementPanel);
		pane.addTab("�л� �߰�", addPanel);
		return pane;
	}
	
	private void createMenu() {			
		JMenuBar menubar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("����");
		JMenu infoMenu = new JMenu("���� ����");
				
		JMenuItem[] infoItem = new JMenuItem[infoItemNum];
		for(int i = 0; i < infoItemNum; i++) {
			infoItem[i] = new JMenuItem(infoMenuItemTitle[i]);
			infoItem[i].addActionListener(new OpenActionListener());
			infoMenu.add(infoItem[i]);
		}
		
		menubar.add(infoMenu);
		this.setJMenuBar(menubar);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainFrame();
	}

}
