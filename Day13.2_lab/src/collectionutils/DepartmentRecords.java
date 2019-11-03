package collectionutils;

import java.util.HashMap;

import com.app.core.Department;
import static collectionutils.EmployeeRecords.*;

public class DepartmentRecords {

	private static HashMap<Integer, Department> departmentRecs = new HashMap<>();
	
	public static HashMap<Integer,Department> populateDepartment()
	{
		departmentRecs.put(10001,new Department(10001, "Sales", populateEmpRecords1()));
		departmentRecs.put(10002,new Department(10001, "Operations", populateEmpRecords2()));
		departmentRecs.put(10003,new Department(10003, "Research & Development", populateEmpRecords3()));
		
		return departmentRecs;
	}
}
