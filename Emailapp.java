package emailapp;

public class Emailapp {

	public static void main(String[] args) {
		Email em1=new Email("wren","martin");
		Email em2=new Email("john","snow");
		System.out.println(em1.showinfo());
		System.out.println(em2.showinfo());
	}
}
