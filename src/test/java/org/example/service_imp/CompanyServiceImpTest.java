package org.example.service_imp;

import org.example.domain_models.Company;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import static org.junit.jupiter.api.Assertions.*;

class CompanyServiceImpTest {

//    private SessionFactory sessionFactory;


//    @BeforeEach
//    protected void setUp() throws Exception {
//        // A SessionFactory is set up once for an application!
//        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
//                .configure() // configures settings from hibernate.cfg.xml
//                .build();
//        try {
//            sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
//        }
//        catch (Exception e) {
//            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
//            // so destroy it manually.
//            StandardServiceRegistryBuilder.destroy( registry );
//        }
//    }
//
//    @AfterEach
//    protected void tearDown() throws Exception {
//        if ( sessionFactory != null ) {
//            sessionFactory.close();
//        }
//    }

    CompanyServiceImp companyServiceImp = new CompanyServiceImp();
    Company company = new Company();

    //Test done
    @Test
    void save() {
        company.setCompany_name("Google");
        company.setFound_date(parseDate("2013-09-29"));
        assertEquals(companyServiceImp.save(company), companyServiceImp.getById(1004L));
    }


    @Test
    void getAll() {
    }

    @Test
    void get() {
    }


    @Test
    void update() {
    }

    @Test
    void delete() {
    }



    private final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    private final SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private java.sql.Date parseDate(String date) {
        try {
            return new Date(DATE_FORMAT.parse(date).getTime());
        } catch (ParseException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private java.sql.Timestamp parseTimestamp(String timestamp) {
        try {
            return new Timestamp(DATE_TIME_FORMAT.parse(timestamp).getTime());
        } catch (ParseException e) {
            throw new IllegalArgumentException(e);
        }
    }
}