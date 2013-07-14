import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * User: haljik
 * Date: 2013/07/06
 * Time: 14:32
 */
public class DelegateObjectExampleTest {

    @Test
    public void doSomethingを実行するとdateに現在時刻が設定される() throws Exception {
        final Date current = new Date();
        DelegateObjectExample sut = new DelegateObjectExample();
        sut.dateFactory = new DateFactory() {
            @Override
            public Date newDate() {
                return current;
            }
        };
        sut.doSomething();
        assertThat(sut.date, is(sameInstance(current)));

    }
}
