import java.util.*;
public class EmployeeWageCalc
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Computation");
		int FULLTIME = 1;
		int PARTTIME = 2;
		int wagePerHour = 20;
		int fullTimeHours = 8;
		int partTimeHours = 4;
		int dailyEmpWage = 0;
		int empCheck = (int)Math.floor(Math.random() * 100) % 3;
		switch(empCheck)
		{
			case 1:
				System.out.println("Employee is Present and Full Time");
				dailyEmpWage =(fullTimeHours*wagePerHour);
				System.out.println("Daily Employee Wage is :" + dailyEmpWage);
				break;
			case 2:
				System.out.println("Employee is Present and Part Time");
				dailyEmpWage =(partTimeHours*wagePerHour);
				System.out.println("Daily Employee Wage is :" + dailyEmpWage);
				break;
			case 0:
				System.out.println("Employee is Absent");
				break;
		}
	}
}
