package com.wynk;




	import java.time.Instant;
	import java.util.ArrayList;

	public class Division {
		
		int value1;
		int value2;
		public Division(int val1, int val2)
		{
			this.value1= val1;
			this.value2=val2;
		}
	  static ArrayList<Division> al= new ArrayList<Division>();
		public static void main(String[] args) {
			int div1=divisionOfTwoNum(8,4);
			int div2=divisionOfTwoNum(8,2);
			int div3=divisionOfTwoNum(8,2);
			System.out.println(div1);
			System.out.println(div2);
			System.out.println(div3);

		}
		
		
		public static int divisionOfTwoNum( int input1, int input2)
		{
			
			int div=0;
			
			boolean checkNum=isExist(input1, input2);
			
			if(!checkNum)
			{
				long startTime= Instant.now().toEpochMilli();
				for(int i=0;i<400000;i++)
				{
					div=input1/input2;
				}
				Division mult= new Division(input1, input2);
				long endTime= Instant.now().toEpochMilli();
				System.out.println("Execution time : " + (endTime- startTime) + " Start time is : "+startTime + "End Time is :" + endTime);
				return div;
			}
			
			else
			{
				long startTime= Instant.now().toEpochMilli();
				long endTime= Instant.now().toEpochMilli();
				System.out.println("Execution time : " + (endTime- startTime) + " Start time is : "+startTime + "End Time is :" + endTime);
				return input1/ input2;
			}
			
			
		}
		
		public static boolean isExist(int value1, int value2)
		{
			for(int i=0; i<al.size();i++)
			{
				if(al.get(i).value1==value1 && al.get(i).value2==value2)
				{
					return true;
				}
			}
			return false;
		}

	}



