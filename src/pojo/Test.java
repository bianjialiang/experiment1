package pojo;

public class Test {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("�����");
		student.setGrade(3);
		System.out.println("�ú�ѧϰ����������");
		student.setAge(27);
		student.setAddress("����ʡ������");
		System.out.println(student.getAddress());
		System.out.println("����������Ī˹�Ƶ���ҹ");

		System.out.println("������һ����Ϊɶ��ô��");
	}

}
