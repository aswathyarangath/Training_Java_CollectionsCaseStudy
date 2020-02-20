import java.time.*;
class  AgeCalculator{
	int calculateAge(LocalDate dob){
		LocalDate today = LocalDate.now();                     
		Period p = Period.between(dob, today);
		return(p.getYears());
	}
}
class Collection6{
	public static void main(String args[]){
		LocalDate birthday = LocalDate.of(1997, Month.JANUARY, 1);  
		AgeCalculator ob=new AgeCalculator();
		System.out.println(ob.calculateAge(birthday));
	}
}
