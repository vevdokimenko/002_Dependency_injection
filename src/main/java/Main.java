import impl.BankImpl;
import impl.Client;
import interfaces.Bank;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");

        Client client1 = ctx.getBean("client1", Client.class);
        Client client2 = ctx.getBean("client2", Client.class);
        Client client3 = ctx.getBean("client3", Client.class);
        Client client4 = ctx.getBean("client4", Client.class);

        Bank bank = ctx.getBean("monobank", BankImpl.class);

        bank.getCredit(client1, 50000);
        bank.getDeposit(client4);
    }
}
