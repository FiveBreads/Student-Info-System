import javax.swing.ImageIcon;

class Student {
	private String name;
	private int id;
	private String department;
	private	int grade;
	private int year;
	private int month;
	private int day;
	private String phoneNumber;
	private String address;
	private ImageIcon icon;
	
	/*getter, setter*/
	public void setName(String value) {
		this.name = value;
	}
	public void setId(int value) {
		this.id = value;
	}
	public void setDepartment(String value) {
		this.department = value;
	}
	public void setGrade(int value) {
		this.grade = value;
	}
	public void setYear(int value) {
		this.year = value;
	}
	public void setMonth(int value) {
		this.month = value;
	}
	public void setDay(int value) {
		this.day = value;
	}
	public void setPhoneNumber(String value) {
		this.phoneNumber = value;
	}
	public void setAddress(String value) {
		this.address = value;
	}
	public void setImage(ImageIcon value) {
		this.icon = value;
	}
	
	public String getName() {
		return this.name;
	}
	public int getId() {
		return this.id;
	}
	public String getDepartment() {
		return this.department;
	}
	public int getGrade() {
		return this.grade;
	}
	public int getYear() {
		return this.year;
	}
	public int getMonth() {
		return this.month;
	}
	public int getDay() {
		return this.day;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public String getAddress() {
		return this.address;
	}
	public ImageIcon getImage() {
		return this.icon;
	}
	
		
}
