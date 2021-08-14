package dev.patika.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtils {

    public static EntityManager getEntityManager(String persistenceUnitName){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnitName);
        return emf.createEntityManager();
    }

    public static void closeEntityManager(EntityManager em){
    em.clear();
        em.close();
    }
}
