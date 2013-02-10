package com.github.GeorgeSergeev.CDInfoMVC.dao;
import java.util.List;

import com.github.GeorgeSergeev.CDInfoMVC.domain.CDEntity;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

public class CDDAOImpl implements CDinfoDAO  {
	@Autowired
    private SessionFactory sessionFactory;

    public void addCD(CDEntity newCD){
        sessionFactory.getCurrentSession().save(newCD);
    }

    @SuppressWarnings("unchecked")
    public List <CDEntity> listCD() {

        return sessionFactory.getCurrentSession().createQuery("from CD").list();
    }

   
}

