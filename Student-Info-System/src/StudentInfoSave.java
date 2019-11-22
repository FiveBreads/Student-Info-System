
class StudentInfoSave {
	private static Student[] studentInfo = new Student[101];
	private static int cursor = 0;
	
	public int getSize() {
		return this.cursor;
	}
	
	public Student getStudentInfo(int idx) {
		return studentInfo[idx];
	}
	
	public void addStudent(Student student) {
		studentInfo[++cursor] = student;		
	}
	
	public boolean isEmpty() {
		if(cursor == 0) {
			return true;
		}else {
			return false;
		}
	}
}
