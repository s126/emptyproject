package test.schema;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.EnumSet;

public class SchemaTest {

    SessionFactory sessionFactory;
    Session session;

    @Before
    public void doBefore() {
        System.out.println("-- now --");
        Configuration cfg = new Configuration().configure();
        sessionFactory = cfg.buildSessionFactory();
        session = sessionFactory.openSession();
        session.beginTransaction();
    }

    @After
    public void doAfter() {
        System.out.println("-- over --");
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }

    @Test
    public void testSchema() {
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
        Metadata metadata = new MetadataSources(serviceRegistry).buildMetadata();
        new SchemaExport().create(EnumSet.of(TargetType.STDOUT), metadata);
    }

}
