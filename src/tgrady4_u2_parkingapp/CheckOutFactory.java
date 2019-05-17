package tgrady4_u2_parkingapp;

/**
 *
 * @author Teddy
 */
public interface CheckOutFactory {

    /**
     *
     * This function accepts a string and if it matches one of the predefined types it will return a CheckOut strategy class.
     * @param strategyType the requested strategy class.
     * @return returns a new checkout strategy of your choosing!
     */
    CheckOutStrategy getStrategy(String strategyType);
}
