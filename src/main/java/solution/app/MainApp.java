package solution.app;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import solution.config.AppConfig;
import solution.employee.Employee;
import solution.service.EmployeeService;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmployeeService employeeService = context.getBean(EmployeeService.class);
		employeeService.addEmployee(new Employee("Adam","G","AZ"));
		employeeService.addEmployee(new Employee("czcsa","a","sds"));
		
		List<Employee> employees = employeeService.listEmployee();
		
		for(Employee e:employees) {
			System.out.println(e);
		}
		
		context.close();
	}

}
