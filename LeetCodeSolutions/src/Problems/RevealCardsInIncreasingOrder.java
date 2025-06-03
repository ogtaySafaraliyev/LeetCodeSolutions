package Problems;
import java.util.*;

public class RevealCardsInIncreasingOrder {
    public int[] deckRevealedIncreasing(int[] deck) {
        Deque<Integer> deque =  new ArrayDeque();

        Arrays.sort(deck);
        int deckLength = deck.length;

        for(int i = deckLength-1;  i>=0;  i--) {
            if(!deque.isEmpty()) {
                deque.offerFirst(deque.pollLast());
            }

            deque.offerFirst(deck[i]);
        }

        int[] ansArr = new int[deckLength];

        for(int i = deckLength-1;  i>=0;  i--) {
            ansArr[i] = deque.pollLast();
        }

        return ansArr;
    }
}
