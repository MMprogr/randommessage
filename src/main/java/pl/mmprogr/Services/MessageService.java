package pl.mmprogr.Services;

import org.springframework.stereotype.Service;
import pl.mmprogr.Models.Message;

import java.util.List;

/**
 * Created by ggere on 16.03.2017.
 */
@Service
public interface MessageService {
    public Message create(Message m);

    public Message delete(int id);

    public List<Message> findAllByDate();

    public Message findById(int id);
}
