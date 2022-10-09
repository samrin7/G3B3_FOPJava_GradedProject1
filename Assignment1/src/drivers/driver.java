package drivers;
import departments.AdminDepartment;
import departments.HrDepartment;
import departments.TechDepartment;
public class driver {
	public static void main(String[] args) {

		AdminDepartment obj = new AdminDepartment();
		System.out.println("Welcome to" + " " + obj.departmentName());
		System.out.println(obj.getTodaysWork());
		System.out.println(obj.getWorkDeadline());
		System.out.println(obj.isTodayAHoliday());
		System.out.println();

		HrDepartment obj1 = new HrDepartment();
		System.out.println("Welcome to" + " " + obj1.departmentName());
		System.out.println(obj1.doActivity());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());
		System.out.println();

		TechDepartment obj2 = new TechDepartment();
		System.out.println("Welcome to" + " " + obj2.departmentName());
		System.out.println(obj2.getTodaysWork());
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj2.doTechStackinformation());
		System.out.println(obj2.isTodayAHoliday());

	}
}
