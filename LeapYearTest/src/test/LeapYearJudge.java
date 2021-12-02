package test;

import java.util.Scanner;

public class LeapYearJudge {
	//主程序
	public static void main(String[] args) {
		//输入须判定的年份
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份(公元前年份请在前方输入-号)：");
        int year = sc.nextInt();
        //输出判定结果
        String istrueinput = isTrueInput(year);
        if(istrueinput == "before1582") {      	
        	if(isLeapYearB(year)) {
        		System.out.println(year + "年" + "是闰年");
        	}
        	else {
        		System.out.println(year + "年"  + "不是闰年");
        	}
        }
        else if(istrueinput == "after1582"){    	
        	if(isLeapYearA(year)) {
        		System.out.println(year + "年" + "是闰年");
        	}
        	else {
        		System.out.println(year + "年"  + "不是闰年");
        	}
        }
                
        sc.close();
	}
	
	//判断输入年份与1582年关系
	public static String isTrueInput(int year) {
		String judgeInput = null;
		//1582年之前
		if (year < 1582) {
			judgeInput = "before1582";
		}
		//1582年以来
		else {
			judgeInput = "after1582";
		}
		
		return judgeInput;
	}
	
	//判断输入的1582年之后的年分是否是闰年
	public static boolean isLeapYearA(int year) {
		boolean isTrue = true;
		
		if(year%4==0&&year%100!=0 || year%400==0)
		{
			isTrue = true;
		}
		else 
		{
			isTrue = false;
		}
			
		return isTrue;
	}
	
	//判断输入的1582年之前的年份是否是闰年
	public static boolean isLeapYearB(int year) {
		boolean isTrue = true;
		
		if(year >= 0)
		{
			if(year%4 == 0) {
				isTrue = true;
			}
			else {
				isTrue = false;
			}
		}
		else 
		{
			year = 0 - year;
			if(year%4==1) {
				isTrue = true;
			}
			else{
				isTrue = false;
			}
		}
			
		return isTrue;
	}
}
