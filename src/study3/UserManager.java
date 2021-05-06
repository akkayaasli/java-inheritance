package study3;

public class UserManager {

	public void add(User student) {
		System.out.println(student.getUserNumber()+" numarali kullanici giris yapti.");
	}
	public void out(User student) {
		System.out.println(student.getUserNumber()+" numarali kullanici çikis yapti.Tekrar görüsürüz.");
	}

}
