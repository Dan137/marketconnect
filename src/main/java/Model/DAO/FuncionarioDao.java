/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.entidade.Funcionario;
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
public class FuncionarioDao implements DaoGenerico<Funcionario> {

    private Session session;
    private SessionFactory sessionFactory;
    private List<Funcionario> consulta = new ArrayList<Funcionario>();
    private static DaoGenerico instance;

    public FuncionarioDao() {
    }

    public static DaoGenerico getInstance() {
        if (instance == null) {
            instance = new FuncionarioDao();
        }

        return instance;
    }

    @Override
    public void inserir(Funcionario t) {
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(t);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar o funcionario!");
        } finally {
            session.close();
        }
    }

    @Override
    public void alterar(Funcionario t) {
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.update(t);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("erro ao alterar o funcionario");
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public Funcionario recuperar(int codigo) {
        Funcionario funcionario = new Funcionario();
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            consulta = session.createQuery("from Funcionario where codigo=" + codigo).getResultList();
            funcionario = consulta.get(0);
        } catch (Exception e) {
            System.out.println("erro ao obter o funcionario");
            e.printStackTrace();
        } finally {
            session.close();
        }
        return funcionario;
    }

    @Override
    public void deletar(Funcionario t) {
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            consulta = session.createQuery("FROM Funcionario WHERE codigo = " + t.getCodigo()).getResultList();
            t = consulta.get(0);
            session.remove(t);

            transaction.commit();
        } catch (Exception e) {
            System.out.println("Erro ao deletar um produto");
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public List<Funcionario> recuperarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
