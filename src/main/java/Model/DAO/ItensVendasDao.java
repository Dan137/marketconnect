/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;


import Model.entidade.ItensVendas;
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
public class ItensVendasDao implements DaoGenerico<ItensVendas> {

    private Session session;
    private SessionFactory sessionFactory;
    private List<ItensVendas> consulta;
    private static DaoGenerico instance;

    public static DaoGenerico getInstance() {
        if (instance == null) {
            instance = new ItensVendasDao();
        }
        return instance;
    }

    public ItensVendasDao() {
        this.consulta = new ArrayList();
    }

    @Override
    public void inserir(ItensVendas t) {
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(t);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Erro ao Inserir itensVendas!");
        } finally {
            session.close();
        }
    }

    @Override
    public void alterar(ItensVendas t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItensVendas recuperar(int codigo) {
        ItensVendas iv = new ItensVendas();
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            consulta = session.createQuery("from ItensVendas where id=" + codigo).getResultList();
            iv = consulta.get(0);
        } catch (Exception e) {
            System.out.println("erro ao alterar produto");
            e.printStackTrace();
        } finally {
            session.close();
        }
        return iv;
    }

    @Override
    public void deletar(ItensVendas t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ItensVendas> recuperarTodos() {
        return null;
    }

}
