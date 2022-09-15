package io.cucumber.skeleton;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;

public class StepDefinitions {

    @Given("These are the following cards dealt to the player")
    public void these_are_the_following_cards_dealt_to_the_player() {
        
    }
    
    @Then("Player should expect {string} for cards {string}")
    public void the_player_ealer_gives_twp_cards_to_the_player(String expectedOutcome, String twoCards) {
        Blackjack b = new Blackjack();
        String outcome = b.outcome(twoCards);
        String str = "Expected: For two cards %s, expected outcome is %s.";
        System.out.println(String.format(str, twoCards, expectedOutcome));
        Assertions.assertEquals(outcome, expectedOutcome);
    }
    
}
