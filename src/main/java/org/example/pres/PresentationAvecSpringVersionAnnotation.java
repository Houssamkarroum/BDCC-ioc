package org.example.pres;

import org.example.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationAvecSpringVersionAnnotation {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("ext","metier","dao");
        IMetier metier =context.getBean(IMetier.class);
        System.out.println(metier.calculer());
    }
}
