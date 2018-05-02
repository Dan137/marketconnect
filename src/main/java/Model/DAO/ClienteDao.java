/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.entidade.Cliente;
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
public class ClienteDao implements DaoGenerico<Cliente> {

    private Session session;
    private SessionFactory sessionFactory;
    private List<Cliente> consulta = new ArrayList<Cliente>();
    private static DaoGenerico instance;

    public ClienteDao() {
    }

    public static DaoGenerico getInstance() {
        if (instance == null) {
            instance = new ClienteDao();
        }

        return instance;
    }

    @Override
    public void inserir(Cliente t) {
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(t);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Erro ao Inserir um Cliente!");
        } finally {
            session.close();
        }
    }

    @Override
    public void alterar(Cliente t) {
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
    public Cliente recuperar(int codigo) {
        Cliente cliente = new Cliente();
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            consulta = session.createQuery("from Cliente where codigo=" + codigo).getResultList();
            cliente = consulta.get(0);
        } catch (Exception e) {
            System.out.println("erro ao alterar cliente");
            e.printStackTrace();
        } finally {
            session.close();
        }
        return cliente;

    }

    @Override
    public void deletar(Cliente t) {
        sessionFactory = HibernateUtil.getSessionFactory();

        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            consulta = session.createQuery("FROM Cliente WHERE codigo = " + t.getCodigo()).getResultList();
            t = consulta.get(0);
            session.remove(t);

            transaction.commit();
        } catch (Exception e) {
            System.out.println("Erro ao deletar um cliente");
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public List<Cliente> recuperarTodos() {
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            consulta = session.createQuery("FROM Cliente").getResultList();
            transaction.commit();

        } catch (Exception e) {
            System.out.println("erro ao gerar relatório de clientes");
            e.printStackTrace();
        } finally {
            session.close();

        }
        return consulta;
    }

}
