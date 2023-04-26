package mediator;

public class Person {

    public String praiseRestaurant(String message) {
        return Feedback.getInstance().getGoodFeedbackRestaurant(message);
    }

    public String rateRestaurant(Integer rating) {
        return Feedback.getInstance().getRatingRestaurant(rating);
    }

    public String suggest(String message) {
        return Feedback.getInstance().getSuggestionRestaurant(message);
    }
}
