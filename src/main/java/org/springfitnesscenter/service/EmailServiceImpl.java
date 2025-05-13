package org.springfitnesscenter.service;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springfitnesscenter.domain.Promo;
import org.springfitnesscenter.service.impl.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.function.IntFunction;


@Repository
@Transactional
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmailServiceImpl implements EmailService {

    @PersistenceContext
    EntityManager em;

    final JavaMailSender sender;

    @Autowired
    public EmailServiceImpl(JavaMailSender sender) {
        this.sender = sender;
    }

    @Override
    public void sendEmail(Promo promo) {

        Query query = em.createQuery("SELECT c.email.email FROM Client c WHERE c.active = true");

        List<String> resultList = query.getResultList();
        IntFunction<String[]> function = size -> new String[size];
        String[] emails = resultList.stream().toArray(function);

        if (emails.length > 0) {
            SimpleMailMessage message = new SimpleMailMessage();

            message.setTo(emails);
            message.setSubject("Greetings");
            message.setText(" Name of program: " + promo.getName() +
                    "\n Name of Fitness: " + promo.getNameOfFitnessClub() +
                    "\n Price: " + promo.getPriceProgram());

            sender.send(message);
        }
    }
}
