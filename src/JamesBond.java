
public class JamesBond {
	private int code;
	

	int findCode(Vault vault) {
		for (int i = 0; i < 1000000; i++) {

			if (vault.tryCode(i)) {
				code = i; 
				return code;
			}
		}
				return -1;
		
	}
}