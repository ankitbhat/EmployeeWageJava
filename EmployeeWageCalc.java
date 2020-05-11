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
		int monthlyWage = 0;
		int days=1,hours=0;
		while(days<21 && hours<100)
		{
			int empCheck = (int)Math.floor(Math.random() * 100) % 3;
			switch(empCheck)
			{
				case 1:
					System.out.println("Employee is Present and Full Time");
					dailyEmpWage =(fullTimeHours*wagePerHour);
					hours+=fullTimeHours;
					System.out.println("Daily Employee Wage is :" + dailyEmpWage);
					break;
				case 2:
					System.out.println("Employee is Present and Part Time");
					dailyEmpWage =(partTimeHours*wagePerHour);
					hours+=partTimeHours;
					System.out.println("Daily Employee Wage is :" + dailyEmpWage);
					break;
				case 0:
					System.out.println("Employee is Absent");
					dailyEmpWage = (0*wagePerHour);
					hours+=0;
					System.out.println("Daily Employee Wage is :" + dailyEmpWage);
					break;
			}
			monthlyWage+=dailyEmpWage;
			System.out.println("Total Hours :" + hours);
			System.out.println("Total Days :" + days);
			System.out.println("Monthly wage is :" + monthlyWage);
			days++;
		}
	}
}
