package com.compassuol.challenge3.Notification.infra.mqueue;

import com.compassuol.challenge3.Notification.model.EmissaoNotification;
import com.compassuol.challenge3.Notification.repository.MongoNotificationRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class receberAlteracaoSubscriber {

    private final MongoNotificationRepository notificationRepository;

    @Transactional
    @RabbitListener(queues = "${mq.queues.notification}")
    public void receberAlteracao(@Payload String json) throws JsonProcessingException {
        try {
            EmissaoNotification emissaoNotification = convertIntoEmissaoNotification(json);
            notificationRepository.save(emissaoNotification);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    private EmissaoNotification convertIntoEmissaoNotification(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, EmissaoNotification.class);
    }
}
