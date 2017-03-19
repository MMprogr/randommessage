package pl.mmprogr.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mmprogr.Models.Message;
import pl.mmprogr.Repositories.MessageRepo;

import java.util.List;

/**
 * Created by ggere on 16.03.2017.
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRepo messageRepo;

    @Override
    public Message create(Message m) {
        return messageRepo.save(m);
    }

    @Override
    public Message delete(int id) {
        Message deletedMessage = messageRepo.findOne(id);

        messageRepo.delete(deletedMessage);

        return deletedMessage;
    }

    @Override
    public List<Message> findAllByDate() {
        return (List<Message>) messageRepo.findAllByOrderByCreateDateAsc();
    }

    @Override
    public Message findById(int id) {
        return null;
    }
}
