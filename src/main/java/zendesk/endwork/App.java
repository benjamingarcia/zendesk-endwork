/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package zendesk.endwork;


import org.zendesk.client.v2.Zendesk;
import org.zendesk.client.v2.model.Ticket;

public class App {


    public static void main(String[] args) {
        Zendesk zd = new Zendesk.Builder("https://z3n-pierre-stage.zendesk.com")
                .setUsername("...")
                .setPassword("...")
                .build();

    }
}
