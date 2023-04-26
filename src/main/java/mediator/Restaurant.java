package mediator;

public class Restaurant implements Establishment{

    private static Restaurant instance = new Restaurant();

    private Restaurant() {}

    public static Restaurant getInstance() {
        return instance;
    }

    public String getGoodFeedback(String message) {
        return "We are truly happy to listen your feedback. You said: " + message;
    }

    public String getRating(int rating) {
        if(rating >=3) {
            return "We are really happy that you enjoyed the experience. Thanks for rating =). Your rating was: " + rating;
        }else {
            return "We are sorry that your experience wasn't the way you wanted. We would be really happy " +
                    "if you make a suggestion that would help us improve.Your rating was: " + rating;
        }
    }

    public String getSuggestion(String mensage) {
        return "We will be evaluating your statement: " + mensage;
    }

}
