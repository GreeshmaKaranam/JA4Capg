package assignment3;
import java.time.*;
public class duration {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.of(2000,05,01);
		LocalDate nld  = LocalDate.now();
		Period pd = Period.between(ld, nld);
		System.out.printf("The duration is %d years, %d months and %d days is: ", pd.getYears(), pd.getMonths(),pd.getDays());
	}

}
