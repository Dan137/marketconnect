/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import java.util.ArrayList;
import Model.entidade.Produto;
import Model.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Maycon
 */
public class ProdutoDAO implements DaoGenerico<Produto> {

    private Session session;
    private SessionFactory sessionFactory;
    private List <Produto> consulta = new ArrayList<Produto>();
    private static DaoGenerico instance;

    public ProdutoDAO() {
    }

    public static DaoGenerico getInstance() {
        if (instance == null) {
            instance = new ProdutoDAO();
        }

        return instance;
    }

    @Override
    public void inserir(Produto t) {
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(t);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Erro ao Inserir produto!");
        } finally {
            session.close();
        }

    }


    @Override
    public void alterar(Produto t) {
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.update(t);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("erro ao alterar produto");
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public Produto recuperar(int codigo) {
        Produto produto = new Produto();
         sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            consulta = session.createQuery("from Produto where codigo="+codigo).getResultList();
            produto = consulta.get(0);
        } catch (Exception e) {
            System.out.println("erro ao alterar produto");
            e.printStackTrace();
        } finally {
            session.close();
        }
        return produto;
    }

    @Override
    public void deletar(Produto produto) {
        
        sessionFactory = HibernateUtil.getSessionFactory();
        session =  sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            consulta =  session.createQuery("FROM Produto WHERE codigo = "+produto.getCodigo()).getResultList();
            produto = consulta.get(0);
            session.remove(produto);
            
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Erro ao deletar um produto");
            e.printStackTrace();
        }
        finally{
            session.close();
        }
    }

    @Override
    public List<Produto> recuperarTodos() {
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            consulta = session.createQuery("FROM Produto").getResultList();
            transaction.commit();
            
        } catch (Exception e) {
            System.out.println("erro ao recuperar todos os produtos");
            e.printStackTrace();
        }
        finally{
            session.close();
            
        }
        return consulta;
    }

}
