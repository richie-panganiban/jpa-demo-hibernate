package com.chichodes.jpademo.hibernate.component;

import com.chichodes.jpademo.hibernate.domain.Employee;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
public class DemoAppFacade {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void doThis() {
        Employee e = new Employee();
        em.persist(e);
    }

}
