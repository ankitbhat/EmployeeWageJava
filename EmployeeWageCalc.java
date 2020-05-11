import java.util.*;
public class EmployeeWageCalc
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Computation");
		int FULLTIME = 1;
		int wagePerHour = 20;
		int fullTimeHours = 8;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if(empCheck == FULLTIME)
		{
			System.out.println("Employee is Present");
			double dailyEmpWage =(fullTimeHours*wagePerHour);
			System.out.println("Daily Employee Wage is :" + dailyEmpWage);
		}
		else
			System.out.println("Employee is Absent");
	}
}
