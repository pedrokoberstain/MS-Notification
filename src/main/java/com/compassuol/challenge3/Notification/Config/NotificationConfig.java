package com.compassuol.challenge3.Notification.Config;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationConfig {

    @RabbitListener(queues = "${mq.queues.emissao-notification}")
    public void recieveMessage(String payload) {
        System.out.println("Received <" + payload + ">");
    }
}
