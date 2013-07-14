import java.util.Date;

/**
 * User: haljik
 * Date: 2013/07/06
 * Time: 14:33
 */
public class DelegateObjectExample {
    DateFactory dateFactory = new DateFactory();
    Date date = new Date();

    public void doSomething() {
        this.date = dateFactory.newDate();
    }
}
