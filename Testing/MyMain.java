package Testing; 

import Classes.CSEvent;

public class MyMain {
    public static void main(String[] args) {
        
        CSEvent event = new CSEvent("Conference", "Annual tech conference", 10, 5, 2025, 14, 30);

        System.out.println("Initial Event Details:");
        System.out.println(event);

        event.setName("Updated Conference");
        event.setDescription("Updated description of the event");

        event.getEventDateTime().setDay(15);
        event.getEventDateTime().setMonth(6);
        event.getEventDateTime().setYear(2025);
        event.getEventDateTime().setHours(16);
        event.getEventDateTime().setMinutes(45);

        System.out.println("\nUpdated Event Details:");
        System.out.println(event);
    }
}