package pro1.Task3;

import org.junit.jupiter.api.Assertions;

public class Test
{
    @org.junit.Test
    public void test01() throws Exception {
        var store = new SecretStore("Secret3496455686443",new Object());

        // TODO: zavolat metodu store.sendTo s parametrem "not_good@gmail.com"

        var m = SecretStore.class.getDeclaredMethod("sendTo", String.class);
        m.setAccessible(true);
        var result = m.invoke(store, "not_good@gmail.com");

         Assertions.assertEquals(
                 "SENDING SECRET TO not_good@gmail.com",
                 result
        );
    }
}
