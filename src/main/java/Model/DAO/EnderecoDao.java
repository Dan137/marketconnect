/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.entidade.Endereco;
import Model.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Daniel
 */
public class EnderecoDao implements DaoGenerico<Endereco> {

    private Session session;
    private SessionFactory sessionFactory;
    private List<Endereco> consulta;
    private static DaoGenerico instance;

    public EnderecoDao() {
        consulta = new ArrayList();
    }

    public static DaoGenerico getInstance() {
        if (instance == null) {
            instance = new EnderecoDao();
        }

        return instance;
    }

    @Override
    public void inserir(Endereco t) {
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(t);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Erro ao Inserir o endereco!");
        } finally {
            session.close();
        }
    }

    @Override
    public void alterar(Endereco t) {
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.update(t);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("erro ao alterar cliente");
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public Endereco recuperar(int numero) {
        Endereco endereco = new Endereco();
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            consulta = session.createQuery("from Endereco where numero=" + numero).getResultList();
            endereco = consulta.get(0);
        } catch (Exception e) {
            System.out.println("erro ao obter o endereco");
            e.printStackTrace();
        } finally {
            session.close();
        }
        return endereco;
    }

    @Override
    public void deletar(Endereco t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Endereco> recuperarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
