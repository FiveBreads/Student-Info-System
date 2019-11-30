
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
		if(cursor < studentInfo.length) {
			studentInfo[++cursor] = student;
		}else {
			/*학생총원 초과 메시지 박스 띄울것*/
		}
	}
	
	public boolean isEmpty() {
		if(cursor == 0) {
			return true;
		}else {
			return false;
		}
	}
}
