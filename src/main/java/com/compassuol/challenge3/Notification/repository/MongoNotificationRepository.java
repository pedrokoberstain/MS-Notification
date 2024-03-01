package com.compassuol.challenge3.Notification.repository;

import com.compassuol.challenge3.Notification.model.EmissaoNotification;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoNotificationRepository extends MongoRepository<EmissaoNotification, String> {
}
