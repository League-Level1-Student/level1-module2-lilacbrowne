
public class Vault {
	private int code;
	public Vault (int code) {
		this.code = code; 
	}
	void setCode(int code) {
		this.code = code; 
	}
	void getCode(int code) {
		this.code= code; 
	}

	public Vault() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Vault vault = new Vault();
		JamesBond jamesbond = new JamesBond(); 
vault.tryCode(6); 
System.out.println(jamesbond.findCode(vault));

}

	boolean tryCode(int x) {
		if (x == code) {
			return true;

		} else 
		return false;
	}
}