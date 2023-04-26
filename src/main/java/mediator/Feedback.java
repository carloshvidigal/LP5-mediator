package mediator;

public class Feedback {

    private static Feedback instance = new Feedback();

    private Feedback() {}

    public static Feedback getInstance() {
        return instance;
    }

    public String getGoodFeedbackRestaurant(String mensage) {
        return "Thanks for your feedkback.\n" +
                "Regarding your feedback, here is the restaurant answer: " +
                 Restaurant.getInstance().getGoodFeedback(mensage);
    }

    public String getRatingRestaurant(Integer rating) {
        return "Thanks for rating our establishment.\n" +
                "Regarding your rating, here is the restaurant comment: " +
                Restaurant.getInstance().getRating(rating);
    }

    public String getSuggestionRestaurant(String mensage){
        return "Thanks for suggesting. \n" +
                "Regarding your suggestion, here is the restaurant comment. " +
                Restaurant.getInstance().getSuggestion(mensage);
    }








}
