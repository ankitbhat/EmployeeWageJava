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
		double dailyEmpWage = 0.0;
		double empCheck = Math.floor(Math.random() * 100) % 3;
		if(empCheck == FULLTIME)
		{
			System.out.println("Employee is Present and Full Time");
			dailyEmpWage =(fullTimeHours*wagePerHour);
			System.out.println("Daily Employee Wage is :" + dailyEmpWage);
		}
		else if(empCheck == PARTTIME)
		{
			System.out.println("Employee is Present and Part Time");
			dailyEmpWage =(partTimeHours*wagePerHour);
			System.out.println("Daily Employee Wage is :" + dailyEmpWage);
		}
		else
			System.out.println("Employee is Absent");
	}
}
