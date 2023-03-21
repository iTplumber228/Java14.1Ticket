package ru.netology.javaqamvn.services.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqamvn.services.domain.Ticket;
import ru.netology.javaqamvn.services.domain.TicketRepository;

class TicketManagerTest {
 @Test
 public void testWhenFewProductsFound() {
  TicketRepository repo = new TicketRepository();
  TicketManager manager = new TicketManager(repo);
  Ticket ticket1 = new Ticket(1, "MSK", "LED", 200, 93);
  Ticket ticket2 = new Ticket(2, "MSK", "LED", 100, 98);
  Ticket ticket3 = new Ticket(3, "MSK", "UFA", 200, 186);
  Ticket ticket4 = new Ticket(4, "MSK", "LED", 400, 122);
  Ticket ticket5 = new Ticket(5, "MSK", "LED", 800, 222);
  Ticket ticket6 = new Ticket(6, "MSK", "LED", 200, 138);
  Ticket ticket7 = new Ticket(7, "NEW", "LA", 300, 243);
  Ticket ticket8 = new Ticket(8, "MSK", "LED", 500, 99);

  manager.add(ticket1);
  manager.add(ticket2);
  manager.add(ticket3);
  manager.add(ticket4);
  manager.add(ticket5);
  manager.add(ticket6);
  manager.add(ticket7);
  manager.add(ticket8);

  Ticket[] expected = {ticket2, ticket1, ticket6, ticket4, ticket8, ticket5};
  Ticket[] actual = manager.findAll("MSK", "LED");

  Assertions.assertArrayEquals(expected, actual);
 }
 @Test
 public void testWhenNoTicketsFound() {
  TicketRepository repo = new TicketRepository();
  TicketManager manager = new TicketManager(repo);
  Ticket ticket1 = new Ticket(1, "MSK", "LED", 200, 93);
  Ticket ticket2 = new Ticket(2, "MSK", "LED", 100, 98);
  Ticket ticket3 = new Ticket(3, "MSK", "UFA", 200, 186);
  Ticket ticket4 = new Ticket(4, "MSK", "LED", 400, 122);
  Ticket ticket5 = new Ticket(5, "MSK", "LED", 800, 222);
  Ticket ticket6 = new Ticket(6, "MSK", "LED", 200, 138);
  Ticket ticket7 = new Ticket(7, "NEW", "LA", 300, 243);
  Ticket ticket8 = new Ticket(8, "MSK", "LED", 500, 99);

  manager.add(ticket1);
  manager.add(ticket2);
  manager.add(ticket3);
  manager.add(ticket4);
  manager.add(ticket5);
  manager.add(ticket6);
  manager.add(ticket7);
  manager.add(ticket8);

  Ticket[] actual = manager.findAll("NYC", "SYD");
  Ticket[] expected = {};

  Assertions.assertArrayEquals(expected, actual);
 }
 @Test
 public void testWhenOneTicketFound() {
  TicketRepository repo = new TicketRepository();
  TicketManager manager = new TicketManager(repo);
  Ticket ticket1 = new Ticket(1, "MSK", "LED", 200, 93);
  Ticket ticket2 = new Ticket(2, "MSK", "LED", 100, 98);
  Ticket ticket3 = new Ticket(3, "MSK", "UFA", 200, 186);
  Ticket ticket4 = new Ticket(4, "MSK", "LED", 400, 122);
  Ticket ticket5 = new Ticket(5, "MSK", "LED", 800, 222);
  Ticket ticket6 = new Ticket(6, "MSK", "LED", 200, 138);
  Ticket ticket7 = new Ticket(7, "NEW", "LA", 300, 243);
  Ticket ticket8 = new Ticket(8, "MSK", "LED", 500, 99);

  manager.add(ticket1);
  manager.add(ticket2);
  manager.add(ticket3);
  manager.add(ticket4);
  manager.add(ticket5);
  manager.add(ticket6);
  manager.add(ticket7);
  manager.add(ticket8);

  Ticket[] actual = manager.findAll("MSK", "UFA");
  Ticket[] expected = {ticket3};

  Assertions.assertArrayEquals(expected, actual);
 }


}