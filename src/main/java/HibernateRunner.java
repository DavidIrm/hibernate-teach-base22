import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class  HibernateRunner {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction=session.beginTransaction();

        Elev unelev=session.find(Elev.class,2);
        Elev altElev=session.find(Elev.class,4);
        System.out.println("============");
        System.out.println(unelev.toString());
        System.out.println("============");
        System.out.println(altElev.toString());


        Elev elevaNoua=session.find(Elev.class,3);

        Note notaMea=new Note();
        notaMea.notaCareApartineDeElev=elevaNoua;
        notaMea.valoareNota=6696;
        session.save(notaMea);
        System.out.println("!!!!!!!!!!!!!");
        System.out.println(notaMea.toString());


        Clasa clasaMEa=session.find(Clasa.class,2);

        Elev elevNou=new Elev();
        elevNou.clasaDeCareApartineElevul=clasaMEa;
        elevNou.numeElev="Ghita de la portita";

        System.out.println("============");
        System.out.println("inainte de save "+elevNou );
        session.save(elevNou);
        System.out.println("============");
        System.out.println("dupa save " + elevNou);
        //transaction.commit();
        System.out.println("============");


        Clasa oClasa=session.find(Clasa.class,2);
        System.out.println(oClasa.toString());


        Clasa clasaNoua=new Clasa();
        //clasaNoua.idClasa=6; -> daca e primary key, nu mai este nevoie!
        clasaNoua.numeClasa="11A";
        System.out.println("============");
        System.out.println("Inainte de save "+clasaNoua);
        session.save(clasaNoua);
        System.out.println("============");
        System.out.println("dupa save "+clasaNoua);
        transaction.commit();














//        Clasa clasanoua=new Clasa();
//        clasanoua.idClasa=4;
//        clasanoua.numeClasa="Clasa noua";
//
//        Elev elevboboc=new Elev();
//        elevboboc.idElev=3;
//        elevboboc.numeElev="Frone";
//
//        Note notanoua=new Note();
//        notanoua.valoareNota=5;
//        notanoua.elevulMeu1=elevutulMeu;
//
//
//
//
//        Elev elevnou=new Elev();
//        elevnou.clasaDeCareApartineElevul=clasaMEa;
//        elevnou.numeElev="Ghita de la portita";
//
//        System.out.println("Inainte de save: "+elevnou);
//        session.save(elevnou);
//        System.out.println("Dupa de save: "+elevnou);
//
//        session.save(clasanoua);
//        session.save(elevboboc);
//        session.save(notanoua);
//
//        System.out.println(clasa);
//        System.out.println(altaClasa);
//        System.out.println(clasanoua);
//        System.out.println(elevboboc);
//        System.out.println(notanoua);


//        Query query=session.createQuery("from Clasa");
//        List list=query.list();
//        System.out.println("AIci trebuia sa vad lista"+list);



//
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("userData");
//        EntityManager em=emf.createEntityManager();
//        em.getTransaction();
//        List<Object[]>results=em.createNamedQuery("Select c.numeClasa, e.numeElev FROM clasa c JOIN elevi e ON c.idClasa=e.idClasac )


        HibernateUtil.shutdown();
    }
}