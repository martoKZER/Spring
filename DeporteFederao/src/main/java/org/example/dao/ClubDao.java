package org.example.dao;

import org.example.model.Club;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ClubDao {

    EntityManagerFactory entityManagerFactory;
    EntityManager entityManager;
    EntityTransaction transaction;

    public ClubDao() {
        entityManagerFactory = Persistence.createEntityManagerFactory("deporte");
        entityManager = entityManagerFactory.createEntityManager();
        transaction = entityManager.getTransaction();
    }

    public void guardaClub(Club club) {
        try {
            transaction.begin();
            entityManager.persist(club);
            transaction.commit();
        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
        }
    }

    public Club buscaClub(Club club) {
        return entityManager.find(Club.class, club.getId());
    }

    public void borraClub(Club club) {
        try {
            transaction.begin();
            Club clubTmp = entityManager.merge(club);
            entityManager.remove(club);
            transaction.commit();
        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
        }
    }
}
