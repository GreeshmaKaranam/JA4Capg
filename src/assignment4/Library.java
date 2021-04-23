package assignment4;
abstract class items {
	private int identification_num;
	private String title;
	private int copies_num;
	public void show() {
		System.out.println("Identification num"+identification_num+"\nTitle of book: "+title+"\nNo. of copies present: "+copies_num);
	}
	public void disp(int count) {
		if(count<5) {
			System.out.println("Need additional copies of this book");
		}
	}
}

abstract class WrittenItems extends items {
	private String Author = "Charlie";
	public void display() {
		System.out.println("The author name is: "+Author);
	}
}
class Book extends WrittenItems {
	public void show() {
		System.out.println("This book is so interesting...!");
	}
	
}
class journalpaper extends WrittenItems {
	private int  published_year=1997;
	public void show() {
		System.out.println("Published year: "+published_year);
	}
	public void disp(int cnt) {
		System.out.println("The count of this books: "+cnt);
	}
}
abstract class MediaItem extends items{
	private int runtime = 19;
	public void details() {
		System.out.println("Runtime:"+runtime);
	}
	
}
class video extends MediaItem {
	private String director = "Anudeep";
	private int year = 2016;
	private String genre = "Horror";
	public void details() {
		System.out.println("Director: "+director+ " year:"+year+" genre:"+genre);
	}
	
}
class CDs extends MediaItem{
	private String artist = "Anirudh";
	private String genre = "Melody";
	public void details() {
		System.out.println("Artist: "+artist+" genre:"+genre);
	}
	
}
public class Library {
	public static void main(String[] args) {
		Book bk = new Book();
		journalpaper jp = new journalpaper();
		video vd = new video();
		CDs cd = new CDs();
		bk.show();
		jp.show();
		jp.disp(20);
		vd.details();
		cd.details();
	}
	
	

}
