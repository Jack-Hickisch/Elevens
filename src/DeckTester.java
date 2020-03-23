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

		String[] ranks0 = {"jack", "queen", "king"};
 		String[] suits0 = {"blue", "red"};
		int[] pointValues0 = {11, 12, 13};
		Deck deck0 = new Deck(ranks0, suits0, pointValues0);

		String[] ranks1 = {"CO", "VID", "19"};
		String[] suits1 = {"green", "yellow", "red", "black"};
		int[] pointValues1 = {1, 20, 20};
		Deck deck1 = new Deck(ranks1, suits1, pointValues1);

		String[] ranks2 = {"dog", "cat", "fish", "lizard"};
		String[] suits2 = {"orange", "purple"};
		int[] pointValues2 = {1, 2, 3, 140986845};
		Deck deck2 = new Deck(ranks2, suits2, pointValues2);



		System.out.println(deck0.isEmpty());
		System.out.println(deck1.isEmpty());
		System.out.println(deck2.isEmpty());



		System.out.println(deck0.size());
		System.out.println(deck1.size());
		System.out.println(deck2.size());
		

		
		System.out.println(deck0.deal());
		System.out.println(deck0.deal());
		System.out.println(deck0.deal());
		System.out.println(deck0.deal());

		System.out.println(deck1.deal());
		System.out.println(deck2.deal());
	}
}
