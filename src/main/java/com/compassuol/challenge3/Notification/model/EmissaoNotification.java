package com.compassuol.challenge3.Notification.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@RequiredArgsConstructor
public class EmissaoNotification {

    @Id
    private String id;
    private String email;
    private String event;
    private String date;

    public EmissaoNotification(String email, String event, String date) {
        this.email = email;
        this.event = event;
        this.date = date;
    }
}
