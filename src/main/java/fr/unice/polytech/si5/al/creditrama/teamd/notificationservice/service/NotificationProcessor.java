package fr.unice.polytech.si5.al.creditrama.teamd.notificationservice.service;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface NotificationProcessor {

    public final String EMAIL_TRANSACTION = "CreditRama.SendNotif.Email.Transaction";

    @Input(EMAIL_TRANSACTION)
    SubscribableChannel sendNotifInput();
}
