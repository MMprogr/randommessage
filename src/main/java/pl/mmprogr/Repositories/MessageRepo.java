package pl.mmprogr.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.mmprogr.Models.Message;

import java.util.List;

/**
 * Created by ggere on 16.03.2017.
 */
@Repository
public interface MessageRepo extends CrudRepository<Message, Integer> {
    List<Message> findAllByOrderByCreateDateAsc();
}
