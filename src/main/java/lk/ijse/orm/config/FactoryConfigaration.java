package lk.ijse.orm.config;

import lk.ijse.orm.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfigaration {
    private static FactoryConfigaration factoryConfigaration;
    private SessionFactory sessionFactory;

    private FactoryConfigaration() {
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class);
        sessionFactory = configuration.buildSessionFactory();



    }

    public static FactoryConfigaration getInstance() {
        return (factoryConfigaration == null)  ?factoryConfigaration =
                new FactoryConfigaration():factoryConfigaration;
    }

    public Session getSession (){

        return sessionFactory.openSession();
    }
}
