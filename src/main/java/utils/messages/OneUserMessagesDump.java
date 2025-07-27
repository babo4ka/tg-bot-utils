package utils.messages;

import lombok.Getter;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

import java.util.ArrayList;
import java.util.List;

@Getter
public class OneUserMessagesDump{

    private final List<DeleteMessage> messages = new ArrayList<>();

    public void clearDump() {
        messages.clear();
    }

    public void addMessage(Message message){
        messages.add(DeleteMessage.builder().messageId(message.getMessageId()).chatId(message.getChatId()).build());
    }
}
