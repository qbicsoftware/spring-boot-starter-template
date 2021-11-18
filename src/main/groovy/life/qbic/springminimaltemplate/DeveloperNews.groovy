package life.qbic.springminimaltemplate

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
 * An example {@link NewsMedia} implementation for developer news.
 *
 * @since 0.1.0
 */
class DeveloperNews implements NewsMedia{

    private MessageService service

    @Autowired
    DeveloperNews(MessageService service) {
        this.service = service
    }

    @Override
    String getNews() {
        return service.collectMessage()
    }
}
