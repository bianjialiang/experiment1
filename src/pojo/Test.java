package pojo;

public class Test {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("卞家良");
		student.setGrade(3);
		System.out.println("好好学习，天天向上");
		student.setAge(27);
		student.setAddress("安徽省亳州市");
		System.out.println(student.getAddress());
	}

}
