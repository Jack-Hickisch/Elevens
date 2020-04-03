1)
Deck, 9 cards, Discard and thats about it

2)
You need to be able to shuffle the deck, then deal the appropriate amount of cards, figure out which ones the user wants to match and confirm if they can be, then remove them, then deal the cards again, and be able to detirmine when the game is over or when no match is possible.

3)
Pretty Much

4)
a)
at the end of the constructor
b)
anotherPlayIsPossible()
isLegal()
c)
0, 1, 3, 6, 7
d)
for (int i : cIndexes)
{
    System.out.println(board.cards[i].toString());
}
e)
anotherPlayIsPossible() because you cannot select a null card for isLegal() but anotherPlayIsPossible() needs to filter out the nulls before beginning.