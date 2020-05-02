/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranksA = {"jack", "queen", "king"};
		String[] suitsA = {"blue", "red"};
		int[] pointValuesA = {11, 12, 13};
		Deck a = new Deck(ranksA, suitsA, pointValuesA);
		String[] ranksB = {"A", "B", "C"};
		String[] suitsB = {"blue", "red"};
		int[] pointValuesB = {11, 12, 13};
		Deck b = new Deck(ranksB, suitsB, pointValuesB);
		String[] ranksC = {"1", "2", "3"};
		String[] suitsC = {"blue", "red"};
		int[] pointValuesC = {11, 12, 13};
		Deck c = new Deck(ranksC, suitsC, pointValuesC);

		System.out.println(a.isEmpty() + "\n" + a.size() + "\n" + a.deal() + "\n" + a.size());
		System.out.println(b.isEmpty() + "\n" + b.size() + "\n" + b.deal() + "\n" + b.size());
		System.out.println(c.isEmpty() + "\n" + c.size() + "\n" + c.deal() + "\n" + c.size());
	}
}
