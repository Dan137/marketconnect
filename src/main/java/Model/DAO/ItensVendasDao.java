/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;


import Model.entidade.ItemVenda;
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
public class ItensVendasDao implements DaoGenerico<ItemVenda> {

    private Session session;
    private SessionFactory sessionFactory;
    private List<ItemVenda> consulta;
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
    public void inserir(ItemVenda t) {
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
    public void alterar(ItemVenda t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItemVenda recuperar(int codigo) {
        ItemVenda iv = new ItemVenda();
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
    public void deletar(ItemVenda t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ItemVenda> recuperarTodos() {
        return null;
    }

}
