package practice;

public class TextBooks extends Books3 {
	private String subject;

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
		System.out.println("この本の教科を" + subject + "にしました");
	}

}
