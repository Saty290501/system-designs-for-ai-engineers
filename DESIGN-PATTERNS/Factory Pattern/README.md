# Factory Pattern

## Start with one sender

The class reminder app starts with email. If email is the only choice, this is enough.

```java
EmailReminder reminder = new EmailReminder();
reminder.send("Java class starts in 10 minutes.");
```

Later, the app supports WhatsApp and Slack. The class schedule and reschedule screens both need to send reminders. If both screens have their own `if/else` to choose a sender, adding a new channel means editing both screens.

## Let the factory choose

```java
Reminder reminder = ReminderFactory.create("whatsapp");
reminder.send("Java class starts in 10 minutes.");
```

1. `ReminderFactory.create("whatsapp")` looks at the channel and creates a `WhatsAppReminder`.
2. The variable is declared as `Reminder`. All three senders implement that interface, so Java lets the caller use `send(...)`.
3. The actual object is a `WhatsAppReminder`, so Java runs its version of `send(...)`.

The selection rule now lives in one place. To support Slack, we added a `SlackReminder` class and a branch in the factory. The code that calls `send(...)` stayed the same. This setup is called **Simple Factory**.

## Run the example

From this folder, run [ReminderDemo.java](ReminderDemo.java) with Java 11 or newer.

```bash
java ReminderDemo.java email
java ReminderDemo.java whatsapp
java ReminderDemo.java slack
```

For WhatsApp, the output is:

```text
WhatsApp: Java class starts in 10 minutes.
```

**Rule to remember.** If you already know which class you need and setup is simple, use its constructor. If several parts of the app share a rule for choosing a class, put that rule in a factory.
