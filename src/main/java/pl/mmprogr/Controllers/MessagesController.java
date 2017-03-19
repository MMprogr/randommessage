package pl.mmprogr.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import pl.mmprogr.Models.Message;
import pl.mmprogr.Services.MessageService;

import java.util.List;
import java.util.Random;

/**
 * Created by ggere on 16.03.2017.
 */
@Controller
public class MessagesController {

    @Autowired
    private MessageService messageService;

    @RequestMapping("/home")
    public ModelAndView index() {
        return new ModelAndView("home", "message", "Poniżej bedzie losowana wiadomosc po przez ajax");
    }

    @RequestMapping(value = "/randomMessage", method = RequestMethod.GET)
    public
    @ResponseBody
    String getRandomMessage() {

        Random rand = new Random();
        List<Message> messages = messageService.findAllByDate();
        return messages.get(rand.nextInt(((messages.size() - 1)) + 1)).getText();
    }
}
