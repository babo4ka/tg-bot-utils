package utils.pages;

import org.telegram.telegrambots.meta.api.methods.PartialBotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import utils.pages.interfaces.Page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class PageManager {

    private final Map<String, Page> pages = new HashMap<>();

    protected abstract void setupPages();

    protected void addPage(String pageName, Page page){
        this.pages.put(pageName, page);
    }

    public abstract List<PartialBotApiMethod<Message>> execute(Update update, String pageName) throws TelegramApiException;

    public abstract List<PartialBotApiMethod<Message>> executeWithArgs(Update update, String pageName, String...args) throws TelegramApiException;

    public abstract List<PartialBotApiMethod<Message>> executeCallback(Update update, String pageName) throws TelegramApiException;

    public abstract List<PartialBotApiMethod<Message>> executeCallbackWithArgs(Update update, String pageName, String...args) throws TelegramApiException;
}
