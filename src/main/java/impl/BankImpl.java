package impl;

import interfaces.Bank;
import lombok.Data;

import java.util.List;
import java.util.logging.Logger;

@Data
public class BankImpl implements Bank {
    private List<Client> clientList;
    private Logger LOG;
    private String name;

    @Override
    public boolean getCredit(Client client, int amount) {
        boolean result = (client.getSalary() * 12) > amount + amount * 0.1;
        LOG.info("Credit for %s %s".formatted(client.getName(), result));
        return result;
    }

    @Override
    public boolean getDeposit(Client client) {
        boolean result = client.getCash() > 1000;
        LOG.info("Deposit for %s %s".formatted(client.getName(), result));
        return result;
    }
}
