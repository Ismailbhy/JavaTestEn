package javaPrograms;

public class SwitchStatement {

	public static void main(String[] args) {
		System.out.println(getDayName(40));
		

	}public static String getDayName(int dayNum) {
		String dayName="";
		switch(dayNum) {
		  case 0: dayName="Saturday";
		      break;
		  case 1: dayName="Sunday";
	          break;
		  case 2: dayName="Monday";
	          break;
		  case 3: dayName="Tuesday";
	          break;
		  case 4: dayName="wednesday";
	          break;
		  case 5: dayName="Thursday";
	          break;
		  case 6: dayName="Friday";
	          break;
	      default: dayName="Invalid day";
	          break;
		}
		
		
		return dayName;
		
	}

}
