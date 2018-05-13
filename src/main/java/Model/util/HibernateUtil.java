/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.util;

import Model.entidade.Cliente;
import Model.entidade.ClienteJuridico;
import Model.entidade.Endereco;
import Model.entidade.Funcionario;
import Model.entidade.ItemVenda;
import Model.entidade.Produto;
import Model.entidade.Venda;
import org.hibernate.HibernateException;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Maycon
 */
public class HibernateUtil {

    static SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            Configuration config = new Configuration();
            config.configure();
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
            builder.applySettings(config.getProperties());
            MetadataSources metadataSources = new MetadataSources();
            metadataSources.addAnnotatedClass(Produto.class);
            metadataSources.addAnnotatedClass(Cliente.class);
            metadataSources.addAnnotatedClass(ClienteJuridico.class);
            metadataSources.addAnnotatedClass(Funcionario.class);
            metadataSources.addAnnotatedClass(Endereco.class);
            metadataSources.addAnnotatedClass(Venda.class);
            metadataSources.addAnnotatedClass(ItemVenda.class);
            
            Metadata metadata = metadataSources.buildMetadata(builder.build());
            sessionFactory = metadata.buildSessionFactory();    
        } catch (HibernateException ex) {
                System.out.println("aconteceu um erro!!\n");
                throw  new ExceptionInInitializerError(ex);
            
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    /**
     *
     * @return
     * @throws ErroSistema
     */
   
}
