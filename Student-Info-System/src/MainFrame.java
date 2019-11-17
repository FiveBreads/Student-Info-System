import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame{	
	private int infoItemNum = 3;
	private int fileItemNum = 3;
	private String[] infoMenuItemTitle = {"학생 추가", "학생 조회", "정보 수정"};	
	
	private AddInfoPanel addPanel = new AddInfoPanel();
	private ManagementPanel managementPanel = new ManagementPanel();
	
	public MainFrame() {
		/*  JTabbedPane, JMenuBar   */
		this.setTitle("학생 정보 시스템");
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
		pane.addTab("학생 조회", managementPanel);
		pane.addTab("학생 추가", addPanel);
		return pane;
	}
	
	private void createMenu() {			
		JMenuBar menubar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("파일");
		JMenu infoMenu = new JMenu("정보 관리");
				
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
