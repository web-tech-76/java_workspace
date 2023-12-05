package basics.streams.lambda.excersizes;

import java.util.List;
import java.util.Optional;

public class Problem2 {

    public static void main(String[] args) {

        List<Client> clientList = new ClientDao().getClientList();

        Optional<Client> clients = clientList
                .stream()
                .filter(client -> client.getEmail().isEmpty())
                .findAny();

        clients.ifPresentOrElse((client) ->{
            System.out.println(client);
        }, () ->{
            System.out.println(" no data");
        });
    }
}
