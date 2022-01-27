package interfaces;

import impl.Client;

public interface Bank {
    boolean getCredit(Client client, int amount);
    boolean getDeposit(Client client);
}
