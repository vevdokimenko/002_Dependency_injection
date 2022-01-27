package interfaces;

import impl.Client;

public interface Bank {
    boolean getCredit(Client client);
    boolean getDeposit(Client client);
}
