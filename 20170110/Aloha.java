public class Aloha {
	public static void main (String[] args) {
		Alohaman am = new Alohaman();

		am.sayAloha(24);
	}
}

class Alohaman {
     private String msg;
     private String msg2;

     public Alohaman(){
	     this.msg = "ALOHA!";
	     this.msg2 = "ÉAÉçÉn";
     }
     public void sayAloha() {
	     System.out.println(this.msg);
     }
     public void sayAloha(int n) {
	     for (int i = 0; i < n; i++){
		     System.out.println(i + this.msg);
	     }
          }
     }
