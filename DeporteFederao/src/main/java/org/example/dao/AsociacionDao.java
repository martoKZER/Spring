package org.example.dao;

import org.example.model.Asociacion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AsociacionDao {


    EntityManagerFactory entityManagerFactory;
    EntityManager entityManager;
    EntityTransaction transaction;

    public AsociacionDao() {
        entityManagerFactory = Persistence.createEntityManagerFactory("deporte");
        entityManager = entityManagerFactory.createEntityManager();
        transaction = entityManager.getTransaction();
    }

    public void guardaAsociacion(Asociacion asociacion) {
        try {
            transaction.begin();
            entityManager.persist(asociacion);
            transaction.commit();
        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
        }
    }

    public Asociacion buscaAsociacion(Asociacion asociacion) {
        return entityManager.find(Asociacion.class, asociacion.getId());
    }

    public void borraAsociacion(Asociacion asociacion) {
        try {
            transaction.begin();
            Asociacion asociacionTmp = entityManager.merge(asociacion);
            entityManager.remove(asociacion);
            transaction.commit();
        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
        }
    }
}
