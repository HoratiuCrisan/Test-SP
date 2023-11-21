package springbootstarterweb.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.asm.TypeReference;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ReadMessage implements Element{
    @Override
    public void read(String url) throws Exception {
        try {
            URL current_url = new URL(url);
            ObjectMapper reader = new ObjectMapper();

            List<Message> messageList = new ObjectMapper().readValue(new URL(current_url)), new TypeReference<List<Message>>();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
