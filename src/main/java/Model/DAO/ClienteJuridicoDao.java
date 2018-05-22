/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.entidade.ClienteJuridico;
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
public class ClienteJuridicoDao implements DaoGenerico<ClienteJuridico>{
    private Session session;
    private SessionFactory sessionFactory;
    private List<ClienteJuridico> consulta;
    private static DaoGenerico instance;
    
     public ClienteJuridicoDao() {
        consulta = new ArrayList();
    }

    public static DaoGenerico getInstance() {
        if (instance == null) {
            instance = new ClienteJuridicoDao();
        }

        return instance;
    }

    @Override
    public void inserir(ClienteJuridico t) {
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            session.save(t);
            tx.commit();
        } catch (Exception e) {
            System.out.println("errooo!");
        }
        finally{
            session.close();
        }
    }

    @Override
    public void alterar(ClienteJuridico t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClienteJuridico recuperar(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(ClienteJuridico t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ClienteJuridico> recuperarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
