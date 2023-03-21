package ru.netology.javaqamvn.services.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqamvn.services.domain.NotFoundException;
import ru.netology.javaqamvn.services.domain.Ticket;
import ru.netology.javaqamvn.services.domain.TicketRepository;

public class TicketRepositoryTest {
    @Test
    public void testRemoveWhenProductNotExist() {
        TicketRepository repo = new TicketRepository();
        Ticket ticket1 = new Ticket(1, "MSK", "LED", 200, 93);
        Ticket ticket2 = new Ticket(2, "MSK", "LED", 100, 98);
        Ticket ticket3 = new Ticket(3, "MSK", "UFA", 200, 186);
        Ticket ticket4 = new Ticket(4, "MSK", "LED", 400, 122);
        Ticket ticket5 = new Ticket(5, "MSK", "LED", 800, 222);
        Ticket ticket6 = new Ticket(6, "MSK", "LED", 200, 138);
        Ticket ticket7 = new Ticket(7, "NEW", "LA", 300, 243);
        Ticket ticket8 = new Ticket(8, "MSK", "LED", 500, 99);

        repo.add(ticket1);
        repo.add(ticket2);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket5);
        repo.add(ticket6);
        repo.add(ticket7);
        repo.add(ticket8);


        Assertions.assertThrows(NotFoundException.class,
                ()-> repo.removeById(10)
        );

    }



}
