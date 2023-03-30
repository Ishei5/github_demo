package com.demo;

import com.demo.model.Mail;
import com.demo.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailServiceApplication implements CommandLineRunner {

    @Autowired
    private MailService mailService;

    public static void main(String[] args) {
        SpringApplication.run(EmailServiceApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Mail mail = new Mail();
        mail.setMailFrom("pankovisheev5@gmail.com");
        mail.setMailTo(new String[]{"bogdan.parashchak@gmail.com", "pankovisheev5@gmail.com", "e.podzirey@gmail.com", "nastyabondarenko870@gmail.com"});
        mail.setMailSubject("Github actions demo");
        mail.setMailContent("Thank you for your attention!");
        mailService.sendEmail(mail);
    }

}
