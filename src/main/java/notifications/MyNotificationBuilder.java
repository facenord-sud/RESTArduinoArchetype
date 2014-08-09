package notifications;

import diuf.unifr.ch.first.xwot.rxtx.notifications.NotificationBuilder;
import org.apache.http.entity.StringEntity;

/**
 * Used to determine when to send a specific notification and how to encode it
 * <br/><br/>For example, you can have a class which send only notification when
 * a door is open. The class is responsible to say, "yes, door is open. Send
 * notification to all registred client"
 *
 * @author leo
 */
public class MyNotificationBuilder extends NotificationBuilder {

    /**
     * Encode jaxb class(es) to the desired format by the client.
     * <br/>The returned value is then send to the client
     * @param client
     * @return StringEntity
     */
    @Override
    public StringEntity jaxbToStringEntity(Object client) {
        //TODO: implement
        return null;
    }

    /**
     * Determine if we need to send notification to all registred clients
     *
     * @return <code>true</code> if we need to send notification
     */
    @Override
    public boolean hasNotification() {
        //TODO: implement
        return false;
    }

}
