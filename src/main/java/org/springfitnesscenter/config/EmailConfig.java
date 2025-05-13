package org.springfitnesscenter.config;

import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
@PropertySource("classpath:email.properties")
public class EmailConfig implements EnvironmentAware {
    private Environment env;

    @Bean
    public JavaMailSender mailSender() {
        JavaMailSenderImpl sender = new JavaMailSenderImpl();

        String login_email = env.getProperty("login_email");
        String password_email = env.getProperty("password_email");

        Properties properties = sender.getJavaMailProperties();

        sender.setPort(587);
        sender.setHost("smtp.gmail.com");
        sender.setUsername(login_email);
        sender.setPassword(password_email);

        properties.put("mail.transport.protocol", "smtp");
        properties.put("mail.smtp.auth", "true");
        //  properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
        properties.put("mail.smtp.starttls.enable", "true");
        return sender;
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.env = environment;
    }
}
