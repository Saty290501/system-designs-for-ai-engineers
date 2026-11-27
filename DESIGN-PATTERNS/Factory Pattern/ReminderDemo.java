interface Reminder {
    void send(String message);
}

class EmailReminder implements Reminder {
    @Override
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}

class WhatsAppReminder implements Reminder {
    @Override
    public void send(String message) {
        System.out.println("WhatsApp: " + message);
    }
}

class SlackReminder implements Reminder {
    @Override
    public void send(String message) {
        System.out.println("Slack: " + message);
    }
}

class ReminderFactory {
    public static Reminder create(String channel) {
        if ("email".equals(channel)) {
            return new EmailReminder();
        } else if ("whatsapp".equals(channel)) {
            return new WhatsAppReminder();
        } else if ("slack".equals(channel)) {
            return new SlackReminder();
        }
        throw new IllegalArgumentException("Unknown channel: " + channel);
    }
}

public class ReminderDemo {
    public static void main(String[] args) {
        String channel = "whatsapp";
        if (args.length > 0) {
            channel = args[0];
        }

        Reminder reminder = ReminderFactory.create(channel);
        reminder.send("Java class starts in 10 minutes.");
    }
}
