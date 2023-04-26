package mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClientTest {

    @Test
    void shouldPraiseRestaurant() {
        Client client = new Client();
        assertEquals("Thanks for your feedkback.\n" +
                "Regarding your feedback, here is the restaurant answer: " +
                "We are truly happy to listen your feedback. " +
                "You said: We loved the experience!", client.praiseRestaurant("We loved the experience!"));
    }


    @Test
    void shouldRateAbove3() {
        Client client = new Client();
        assertEquals("Thanks for rating our establishment.\n" +
                "Regarding your rating, here is the restaurant comment: " +
                "We are really happy that you enjoyed the experience. " +
                "Thanks for rating =). Your rating was: 4", client.rateRestaurant(4));
    }


    @Test
    void shouldRateBelow3() {
        Client client = new Client();
        assertEquals("Thanks for rating our establishment.\n" +
                "Regarding your rating, here is the restaurant comment: " +
                "We are sorry that your experience wasn't the way you wanted. We would be really happy " +
                "if you make a suggestion that would help us improve.Your rating was: 2", client.rateRestaurant(2));
    }


    @Test
    void shouldSuggest() {
    Client client = new Client();
    assertEquals("Thanks for suggesting. \n" +
            "Regarding your suggestion, here is the restaurant comment. " +
            "We will be evaluating your statement: The restaurant should serve brazilian beer.",
            client.suggest("The restaurant should serve brazilian beer."));
    }
}