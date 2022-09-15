package io.cucumber.skeleton;

public class Blackjack {
    /*
    Information:
    - Card values:
        o 2-9 = amount of the card
        o 10, J, Q, K = 10
        o Ace = 1 or 11

    - Expected Outcome:
        o Blackjack = card total = 21
        o Split – Cards are the same
        o Hit – Card totals less than 21, and cards that can be split

    - Card suits are not used
     */

    //get the value of the card
    public Integer valueOf(String card) {
        Integer cardValue = 0;
        switch (card) {
            case "2", "3", "4", "5", "6", "7", "8", "9": cardValue = Integer.parseInt(card); break;
            case "A1": cardValue = 1; break;
            case "A11": cardValue = 11; break;
            case "J", "Q", "K", "10": cardValue = 10; break;
        }
        return cardValue;
    }

    //single case
    public String outcome(String twoCards) {
        String card1, card2;
        String outcomes = "None";
        String[] cards = twoCards.split("\\s*,\\s*");
        card1 = cards[0];
        card2 = cards[1];

        if (valueOf(card1) == valueOf(card2)) {
            outcomes = "Split,Hit";
        }
        else if (valueOf(card1) + valueOf(card2) == 21) {
            outcomes = "Blackjack";
        }
        else {
            outcomes = "Hit";
        }

        return outcomes;
    }
}