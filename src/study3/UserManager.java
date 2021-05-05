package study3;

public class UserManager {

	public void add(User student) {
		System.out.println(student.getUserNumber()+" numaralı kullanıcı giriş yaptı.");
	}
	public void out(User student) {
		System.out.println(student.getUserNumber()+" numaralı kullanıcı çıkış yaptı.Tekrar görüşürüz.");
	}

}
