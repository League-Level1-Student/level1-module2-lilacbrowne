
public class Vault {
	private int code = 6;
	

	public static void main(String[] args) {
		Vault vault = new Vault();
vault.tryCode(6); 
}

	boolean tryCode(int x) {
		if (x == code) {
			return true;

		}
		return false;
	}
}