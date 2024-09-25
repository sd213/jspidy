package seasonfinder;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Finder {
	@Autowired
	private Calendar ct ;
	
	public void messageDay(String name) {
		String day;
		System.out.println(ct.DAY_OF_WEEK);
		switch(ct.DAY_OF_WEEK) {
		case 1:
				day = "Monday";
				break;
		case 2:
				day = "TuesDay";
				break;
				
		case 3 :
				day="Wednesday";
				break;
		case 4:
				day="Thursday";
				break;
		case 5:
				day="Friday";
				break;
		case 6:
				day = "Saturday";
				break;
		case 7:
				day="Sunday";
				break;
		default:
					day="Not known";
					
		}
		System.out.println("Hello "+ name+" , Today  is "+day);
	}
	
}
