/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.entidade.Venda;
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
public class VendaDao implements DaoGenerico<Venda> {

    private Session session;
    private SessionFactory sessionFactory;
    private List<Venda> consulta = new ArrayList<Venda>();
    private static DaoGenerico instance;

    public static DaoGenerico getInstance() {
        if (instance == null) {
            instance = new VendaDao();
        }
        return instance;
    }

    @Override
    public void inserir(Venda v) {
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
//      Venda.atualizaQuantidadeProdutos(vendas);
    }

    @Override
    public void alterar(Venda t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Venda recuperar(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(Venda t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Venda> recuperarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
