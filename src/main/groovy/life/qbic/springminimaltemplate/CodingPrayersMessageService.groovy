package life.qbic.springminimaltemplate

import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Paths

/**
 * Example implementation of a {@link MessageService}
 *
 * @since 0.1.0
 */
class CodingPrayersMessageService implements MessageService {

    private List<String> messages

    CodingPrayersMessageService() {
        this.messages = new ArrayList<>()
    }

    CodingPrayersMessageService(String filePath) {
        this.messages = readMessagesFromClassPath(filePath)
    }

    @Override
    String collect() {
        return messages.get(new Random().nextInt(messages.size()))
    }

    private List<String> readMessagesFromClassPath(String path) {
        URL url = getClass().getClassLoader().getResource(path)
        return url.readLines().each {it.trim()}.collect()
    }
}
