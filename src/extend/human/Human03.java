package extend.human;

public class Human03 {
	String name;
	int age;

	public void showPerson() {
		System.out.println("この人の名前は" + this.name + "で、年齢は" + this.age + "歳です");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}
}
