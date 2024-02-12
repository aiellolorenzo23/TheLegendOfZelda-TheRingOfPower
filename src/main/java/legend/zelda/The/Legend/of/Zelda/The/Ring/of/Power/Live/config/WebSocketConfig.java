package legend.zelda.The.Legend.of.Zelda.The.Ring.of.Power.Live.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.*;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic"); // Il topic per le risposte
        registry.setApplicationDestinationPrefixes("/app"); // Prefisso per i comandi inviati dal client
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws").withSockJS(); // Endpoint per connettere il client WebSocket
    }

}
