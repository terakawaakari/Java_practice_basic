package practice;

public class TextBook2 extends TextBooks {
	public void showBook() {
		super.showBook();
		System.out.println("この本の教科は" + super.getSubject() + "です" );
	}
}
