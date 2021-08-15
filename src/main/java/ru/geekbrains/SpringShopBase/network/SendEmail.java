package ru.geekbrains.SpringShopBase.network;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.MessagingException;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.Properties;

@Configuration
public class SendEmail {

    public void sendEmail(String text) throws Exception {

        final Properties properties = new Properties();
        properties.load(SendEmail.class.getClassLoader().getResourceAsStream("mail.properties"));

        Session mailSession = Session.getDefaultInstance(properties);
        MimeMessage message = new MimeMessage(mailSession);
        message.setFrom(new InternetAddress("kosenkoa434@gmail.com"));
        message.addRecipients(Message.RecipientType.TO, String.valueOf(new InternetAddress("angelinakosenko68@gmail.com")));
        message.setSubject("Order");
        message.setText(text);

        Transport transport = mailSession.getTransport();
        transport.connect("kosenkoa434@gmail.com", "IJ7SiN08");
        transport.sendMessage(message, message.getAllRecipients());

    }
}
