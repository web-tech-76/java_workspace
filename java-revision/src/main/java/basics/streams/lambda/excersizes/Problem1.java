package basics.streams.lambda.excersizes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import static java.util.stream.Collectors.filtering;
import static java.util.stream.Collectors.toSet;

public class Problem1 {

    private static void getTicketsByDestination(String destination) {
        List<Tickets> ticketsList = new TicketsDao().getTicketsList();

//        Set<Tickets> ticketsSet =
//                ticketsList.stream()
//                        .filter(dest -> dest.getDestination().equalsIgnoreCase(destination))
//                        .collect(toSet());
//
//        System.out.println(ticketsSet);

        Set<Tickets> ticketsSet =
                ticketsList.stream()
                        .collect(filtering(dest ->
                                dest.getDestination().equalsIgnoreCase(destination) ||
                                        dest.getDepartureFrom().equalsIgnoreCase(destination), toSet()));
        System.out.println(ticketsSet);
    }


    private static void getTicketsByTravelDate(LocalDateTime travelDate) {

        //System.out.println(travelDate);

        List<Tickets> ticketsList = new TicketsDao().getTicketsList();

//        Set<Tickets> ticketsSet =
//                ticketsList.stream()
//                        .filter(date -> date.getTravelDate().equals(travelDate))
//                        .collect(Collectors.toSet());
//
//        ticketsSet.stream()
//                .forEach(System.out::println);

        Set<Tickets> ticketsSet1 =
                ticketsList.stream()
                        .collect(filtering(tickets ->
                                tickets.getTravelDate().equals(travelDate), toSet()));
        ticketsSet1.stream()
                .forEach(System.out::println);


    }


    private static void getTicketsByClientName(String name) {

        List<Tickets> ticketsList = new TicketsDao().getTicketsList();

        Optional<Client> clients = ticketsList
                .stream()
                .flatMap(tickets -> tickets.getClients().stream())
                .filter(client -> client.getName().equalsIgnoreCase(name))
                .findAny();

        System.out.println(" client " + name + " has following tickets");
        clients.stream()
                .forEach(client -> {
                    ticketsList.stream()
                            .filter(tickets -> tickets.getClients().contains(client))
                            .forEach(tickets -> {
                                System.out.println(tickets);
                            });
                });

    }

    public static void main(String[] args) {

        getTicketsByDestination("AMS");

        getTicketsByDestination("MUM");
        getTicketsByDestination("DTE");
        getTicketsByDestination("CHI");


        //2021-09-15T12:13:36
        //2020-05-20T04:51:20

        LocalDate localDate1 = LocalDate.of(2020, 5, 20);
        LocalTime localTime1 = LocalTime.of(4, 51, 20);

        LocalDate localDate2 = LocalDate.of(2021, 9, 15);
        LocalTime localTime2 = LocalTime.of(12, 13, 36);

        LocalDateTime localDateTime1 = LocalDateTime.of(localDate1, localTime1);
        LocalDateTime localDateTime2 = LocalDateTime.of(localDate2, localTime2);


        System.out.println(" search by dates ....");
        getTicketsByTravelDate(localDateTime1);
        getTicketsByTravelDate(localDateTime2);

        getTicketsByClientName("smith");
        getTicketsByClientName("bob");

    }
}
