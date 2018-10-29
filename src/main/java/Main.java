import accountserver.AccountServer;
import accountserver.AccountServerController;
import accountserver.AccountServerControllerMBean;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class Main {
    public static void main(String[] args) {
        AccountServer accountServer = new AccountServer(10);

        AccountServerControllerMBean serverStatistic = new AccountServerController(accountServer);

        ServletContextHandler contextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);

    }
}
