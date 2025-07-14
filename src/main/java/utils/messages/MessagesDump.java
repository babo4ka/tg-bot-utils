package utils.messages;

import lombok.Getter;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

import java.util.ArrayList;
import java.util.List;

@Getter
public abstract class MessagesDump {

    private final List<DeleteMessage> messagesToDelete = new ArrayList<>();

    public void clearDump(){
        messagesToDelete.clear();
    }

    public abstract void addMessage(Message message);
}
