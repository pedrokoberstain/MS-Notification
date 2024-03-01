package com.compassuol.challenge3.Notification.repository;

import com.compassuol.challenge3.Notification.model.EmissaoNotification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<EmissaoNotification, String> {

}
