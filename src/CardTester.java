/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card0 = new Card("8", "Diamonds", 8);
		Card card1 = new Card("Ace", "Clubs", 1);
		Card card2 = new Card("8", "Diamonds", 8);



		System.out.println(card0.suit());
		System.out.println(card0.rank());
		System.out.println(card0.pointValue());

		System.out.println(card1.suit());
		System.out.println(card1.rank());
		System.out.println(card1.pointValue());

		System.out.println(card2.suit());
		System.out.println(card2.rank());
		System.out.println(card2.pointValue());



		System.out.println(card0.matches(card1) + " --> false");
		System.out.println(card0.matches(card2) + " --> true");



		System.out.println(card0.toString());
		System.out.println(card1.toString());
		System.out.println(card2.toString());
	}
}
