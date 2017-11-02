package solution.app;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import solution.config.AppConfig;
import solution.entities.Employee;
import solution.entities.Equipment;
import solution.entities.EquipmentStatus;
import solution.entities.EquipmentType;
import solution.entities.Rent;
import solution.service.EmployeeService;
import solution.service.EquipmentService;
import solution.service.RentService;

public class TestApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeService employeeService = context.getBean(EmployeeService.class);
		
		System.out.println("creating new employee:");
		
		Employee employee = new Employee("TestEmployee","G","AZ",null);
		System.out.println(employee);
		employeeService.addEmployee(employee);
		System.out.println(employee);

		System.out.println("adding new type of equipment");
		EquipmentType jakchammerType = new EquipmentType("Jackhammer",2010);
		EquipmentService equipmentService = context.getBean(EquipmentService.class);
		System.out.println("adding new equipment");
		Equipment equipment = new Equipment(EquipmentStatus.active,jakchammerType);
		equipmentService.addEquipment(equipment);
		System.out.println(equipment);
		
		System.out.println("recording new rent");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date startDate = null;
		try {
			startDate = dateFormat.parse("2017-04-01");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Rent newRent = new Rent(startDate,null,employee,equipment);
		System.out.println(newRent);
		RentService rentService = context.getBean(RentService.class);
		rentService.addRent(newRent);
		
		System.out.println("get employees from database:");
		List<Employee> employees = employeeService.listEmployee();
		for(Employee e:employees) {
			System.out.println(e);
		}
		
		System.out.println("get rents for an employee");
		List<Rent> rentsForEmployee = employeeService.listRentsForEmployee(employee);
		System.out.println("rents for employee id="+employee.getId());
		for(Rent r:rentsForEmployee) {
			System.out.println(r);
		}

		context.close();
	}

}
