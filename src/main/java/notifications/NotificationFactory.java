package notifications;

/**
 * It could be nice to create a factory to manage different type of notifications
 * <p>!!! By my little experience eager loading is a better way in this case or strange bugs could occures</p>
 * @author leo
 */
public class NotificationFactory {
    
    private NotificationFactory() {}
    
    public NotificationFactory getInstance() {
        //TODO: implememnt by eager loading
        return null;
    }
    
    public MyNotificationBuilder getMyNotificationBuilder() {
        //TODO: implememnt by eager loading
        return null;
    }
}
