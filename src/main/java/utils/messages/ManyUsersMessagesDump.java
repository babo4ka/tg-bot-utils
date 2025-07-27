package utils.messages;

import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManyUsersMessagesDump{

    private final Map<Long, List<DeleteMessage>> messages = new HashMap<>();

    public void clearDump(long chatId) {
        if(messages.containsKey(chatId))
            messages.get(chatId).clear();
    }

    public void addMessage(Message message, long chatId){
        if(messages.containsKey(chatId))
            messages.get(chatId).add(DeleteMessage.builder().messageId(message.getMessageId()).chatId(message.getChatId()).build());
        else{
            List<DeleteMessage> newList = new ArrayList<>();
            newList.add(DeleteMessage.builder().messageId(message.getMessageId()).chatId(message.getChatId()).build());
            messages.put(chatId, newList);
        }
    }
}
