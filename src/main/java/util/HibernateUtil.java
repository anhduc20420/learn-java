package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory factory;

    public static Session openSession(){
        if(factory == null || factory.isClosed()){
            factory = new Configuration()
                    .configure()
                    .buildSessionFactory();
        }
        return factory.openSession();
    }

    public static void closeFactory(){
        if (factory!= null){
            factory.close();
        }
    }
}
