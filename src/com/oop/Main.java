package com.oop;

public class Main {
    public static void main(String[] args) {

        Accounting salary = new Accounting();
        System.out.println(salary.pay(3, 45));

        Employee employee1 = new Employee("Karina", "Zaporozhets");
        System.out.println("The first employee: " + employee1.name + " " + employee1.surname + " " + employee1.ID);

        Employee employee2 = new Employee();
        employee2.setName("Ganna");
        employee2.setSurname("Chycherina");
        System.out.println(employee2.name + " " + employee2.surname + " " + employee2.ID);

        Deck deck = new Deck();
        for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
            for (int rank = Card.ACE; rank <= Card.KING; rank++) {
                Card card = deck.getCard(suit, rank);
                System.out.println(card.rankToString(card.getRank()) + " " +card.suitToString(card.getSuit()));
            }
        }
    }
    }