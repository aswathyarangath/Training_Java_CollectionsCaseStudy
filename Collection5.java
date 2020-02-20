import java.time.*;
class DateGenerator{
	LocalDate getDate(){
		LocalDate y=LocalDate.now();
		return(y);
	}
}
class Collection5{
	public static void main(String args[]){
		
		DateGenerator ob=new DateGenerator();
		System.out.println(ob.getDate());
	}
}
	