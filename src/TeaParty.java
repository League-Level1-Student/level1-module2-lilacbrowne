public class TeaParty {
	private boolean isKnighted;
	private String name;
	private boolean isWoman;

	public String Welcome(String name, boolean isWoman, boolean isKnighted) {

		if (isKnighted == true) {
			if (isWoman == false) {
				return "Hello Sir " + name;

			} else if (isWoman == true) {
				return "Hello Lady " + name;
			}

		}
		if (isKnighted == false) {
			if (isWoman == true) {
				return "Hello Ms. " + name;
			}
			if (isWoman == false) {
				return "Hello Mr. " + name;
			}
		}
		return "invalid name";

	}

}