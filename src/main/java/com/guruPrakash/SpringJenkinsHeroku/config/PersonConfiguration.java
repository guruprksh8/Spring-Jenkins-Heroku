package com.guruPrakash.SpringJenkinsHeroku.config;

import com.guruPrakash.SpringJenkinsHeroku.classes.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfiguration {

    @Bean
    public Person createPerson(){
        return new Person("Guru Prakash", "Bokaro", 10);
    }
}
