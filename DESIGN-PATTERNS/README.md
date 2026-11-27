# Design Patterns in Java

Low-level design lessons for Java beginners. We work through one pattern at a time, starting with a small program and changing it when a new requirement makes the original design harder to maintain.

## 1. Simple Factory

In a class reminder app that only sends email, `new EmailReminder()` is enough. When the app adds WhatsApp and several parts of the app start repeating the same `if/else` to choose a sender, a factory gives that choice one home.

```java
Reminder reminder = ReminderFactory.create("whatsapp");
reminder.send("Java class starts in 10 minutes.");
```

`ReminderFactory` chooses which sender to create. The caller uses the shared `Reminder` interface to send the message.

**Practice.** Add Slack. Which code needs to know about the new sender, and which calls can stay the same?
