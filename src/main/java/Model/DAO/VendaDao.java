/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.entidade.Vendas;
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
public class VendaDao implements DaoGenerico<Vendas> {

    private Session session;
    private SessionFactory sessionFactory;
    private List<Vendas> consulta = new ArrayList<Vendas>();
    private static DaoGenerico instance;

    public static DaoGenerico getInstance() {
        if (instance == null) {
            instance = new VendaDao();
        }
        return instance;
    }

    @Override
    public void inserir(Vendas v) {
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(v);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Erro ao Inserir produto!");
        } finally {
            session.close();
        }

//        vendas.add(v);
//      Vendas.atualizaQuantidadeProdutos(vendas);
    }

    @Override
    public void alterar(Vendas t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vendas recuperar(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(Vendas t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vendas> recuperarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
