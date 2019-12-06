import javax.swing.ImageIcon;

class Student {
	private String name;
	private String id;
	private String department;
	private	String grade;
	private String year;
	private String month;
	private String day;
	private String phoneNumber;
	private String address;
	private ImageIcon icon;
	
	public Student(String[] data) {
		this.setName(data[0]);
		this.setId(data[1]);
		this.setDepartment(data[2]);
		this.setGrade(data[3]);
		this.setYear(data[4].substring(0, 4));
		this.setMonth(data[4].substring(4, 6));
		this.setDay(data[4].substring(6, 8));
		this.setPhoneNumber(data[5]);
		this.setAddress(data[6]);
		//this.setImage();
		//this.checkData();
	}
	
	private void checkData() {
		System.out.println(this.getName());
		System.out.println(this.getId());
		System.out.println(this.getYear());
		System.out.println(this.getMonth());
		System.out.println(this.getDay());
	}
	
	/*getter, setter*/
	public void setName(String value) {
		this.name = value;
	}
	public void setId(String value) {
		this.id = value;
	}
	public void setDepartment(String value) {
		this.department = value;
	}
	public void setGrade(String value) {
		this.grade = value;
	}
	public void setYear(String value) {
		this.year = value;
	}
	public void setMonth(String value) {
		this.month = value;
	}
	public void setDay(String value) {
		this.day = value;
	}
	public void setPhoneNumber(String value) {
		this.phoneNumber = value;
	}
	public void setAddress(String value) {
		this.address = value;
	}
	public void setImage(java.net.URL value) {
		/*bin/images/ㅇㅇㅇ.jpg 파일의 경로를 가져다가 이미지아이콘으로*/
		this.icon = new ImageIcon(value);
	}
	
	public String getName() {
		return this.name;
	}
	public String getId() {
		return this.id;
	}
	public String getDepartment() {
		return this.department;
	}
	public String getGrade() {
		return this.grade;
	}
	public String getYear() {
		return this.year;
	}
	public String getMonth() {
		return this.month;
	}
	public String getDay() {
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
