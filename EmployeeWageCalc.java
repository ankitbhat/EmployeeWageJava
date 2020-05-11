import java.util.*;
public class EmployeeWageCalc
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Computation");
		int FULLTIME = 1;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if(empCheck == FULLTIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
}
