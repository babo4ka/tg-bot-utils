package utils.messages;

import org.telegram.telegrambots.meta.api.objects.Message;

public abstract class MessagesDump {

    public abstract void clearDump();

    public abstract void addMessage(Message message);
}
