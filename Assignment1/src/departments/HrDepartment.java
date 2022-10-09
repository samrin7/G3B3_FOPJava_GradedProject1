package departments;

public class HrDepartment extends SuperDepartment {
	public String departmentName() {
		String s1 = "HR Department";
		return s1;
	}

	public String getTodaysWork() {
		String s2 = "Fill today's timesheet and mark your attendance";
		return s2;
	}

	public String getWorkDeadline() {
		String s3 = "Complete by EOD";
		return s3;
	}

	public String doActivity() {
		String s4 = "team lunch";
		return s4;
	}
}
