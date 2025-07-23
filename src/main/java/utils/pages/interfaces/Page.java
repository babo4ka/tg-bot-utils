package utils.pages.interfaces;

import org.telegram.telegrambots.meta.api.methods.PartialBotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import utils.tuples.Pair;

import java.util.List;

public interface Page {

    default List<Pair<PartialBotApiMethod<Message>, Boolean>> execute(Update update) throws TelegramApiException {
        return null;
    }

    default List<Pair<PartialBotApiMethod<Message>, Boolean>> executeWithArgs(Update update, String...args){
        return null;
    }

    default List<Pair<PartialBotApiMethod<Message>, Boolean>> executeCallback(Update update) throws TelegramApiException {
        return null;
    }

    default List<Pair<PartialBotApiMethod<Message>, Boolean>> executeCallbackWithArgs(Update update, String...args){
        return null;
    }
}
