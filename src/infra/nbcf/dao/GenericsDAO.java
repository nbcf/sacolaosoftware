
package infra.nbcf.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;


 /**
* @author NILDO BUENO CORREIA FILHO 
 * CPF: 10333054725
 * EMAIL: nil_bueno@hotmail.com    
 * JAVA VERSION 8 - 14
 * NETBEANS    8.2 - 12
 * 
 * Created on 30/12/2021, 17:09:27
 */
public class GenericsDAO<N> {
    
    public  int quantRegistrosDAO  =   0;
    public  int quantRegistrosPesquisaDAO  =   0;
    public  int quantParaPaginar                =   0;


public boolean finalPagina = true;
    public EntityManager getEM() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("crudsimples?zeroDateTimeBehavior=convertToNullPU");
        return factory.createEntityManager();
    }

//    public N SalvarDAO(N n) throws Exception 
//    {
//        EntityManager em = getEM();
//        try {
//                 em.getTransaction().begin();
//                  if (em.contains(n)) {
//                 em.persist(n);
//                  System.out.println("Salvou");
//                  
//               }else{
//                   if (!em.contains(n)) {
//                  
//                        throw new Exception("Erro ao atualizar o registro");
//                    
//                }
//             }
//            em.getTransaction().commit();
//            System.out.println("Comitou");
//            } finally {
//                em.close();
//                System.out.println("Fechou");
//            }
//            return n;
//    }
//    
//    public N SalvarVerificadoDAO(N n, 
//              String namedQuery,
//              String parametroNome,
//              String nomePesquisado) throws Exception {
//              EntityManager em = getEM();
//             try {
//            em.getTransaction().begin();
//            Query query = em.createNamedQuery(namedQuery);
//            query.setParameter(parametroNome, nomePesquisado);
//            List<N> data = query.getResultList();
//               /// se for uma atualizacao 
//               /// se nao siga por esse caminho  mesmo
//               if(data.isEmpty()){
//                 if(em.contains(n))
//                {
//                    em.persist(n);
//                    System.out.println("Salvou");   
//                }else{   
//                if (!em.contains(n)) 
//                {    
//                  
//                        throw new Exception("Erro ao atualizar o evento!");
//                    
//                }
//                n = em.merge(n);
//                System.out.println("Atualizou");
//            }   
//            em.getTransaction().commit();
//            System.out.println("Comitou");
//
//        } 
//        else if(!data.isEmpty())
//        {
//        
//        int opcao;
//        Object[] botoes = {" SIM "," NÃO "};
//        opcao = JOptionPane.showOptionDialog(
//        null, 
//       "O Registro: "+"\n Já existe no Banco de Dados!    \n Ainda Deseja Prosseguir Com o Cadastro?   ",
//       "    PERGUNTA DO SISTEMA     ", 
//       JOptionPane.YES_NO_OPTION,
//       JOptionPane.WARNING_MESSAGE,
//       null,botoes,botoes[0]);
//        if (opcao ==  JOptionPane.YES_OPTION) 
//        {
//            em.persist(n);
//        }
//         em.getTransaction().commit();
//        }
//               
//        } finally {
//            em.close();
//            System.out.println("Fechou");
//        }
//        return n;
//    }
    
            
    public void SalvarVerificadoDAO(N n, String namedQuery, String parametroNome, String nomePesquisado) throws Exception {
              EntityManager em = getEM();
        try {
            em.getTransaction().begin();
            Query query = em.createNamedQuery(namedQuery);
            query.setParameter(parametroNome, nomePesquisado);
            List<N> data = query.getResultList();
               /// se for uma atualizacao 
               /// se nao siga por esse caminho  mesmo
               if(data.isEmpty()){
                  
                if (em.contains(n)) 
                {
                        em.persist(n);
                        System.out.println("Salvou");

               }
               else
               {
                if (!em.contains(n)) 
                {
                   
                   // if (em.find(n.getClass(), n.getId()) == null)
                  //  {
                        throw new Exception("Erro ao atualizar o evento!");
                  //  }
                }
                n = em.merge(n);
                System.out.println("Atualizou");
               
            }
            em.getTransaction().commit();
            System.out.println("Comitou");
        } else if(!data.isEmpty()){
        
        int opcao;
        Object[] botoes = {" SIM "," NÃO "};
        opcao = JOptionPane.showOptionDialog(
        null, 
       "O Registro: "+nomePesquisado+"\n Já existe no Banco de Dados!    \n Deseja prosseguir com o cadastro mesmo assim?   ",
       "    PERGUNTA DO SISTEMA     ", 
       JOptionPane.YES_NO_OPTION,
       JOptionPane.WARNING_MESSAGE,
       null,botoes,botoes[0]);
        if (opcao ==  JOptionPane.YES_OPTION) {
          //  if (n.getId() == null || Objects.equals(n.getId(), "")) 
          //  {
                em.persist(n);
                System.out.println("Salvou");
           // }
             //    em.getTransaction().commit();
            }
                em.getTransaction().commit();
                System.out.println("Comitou");
        }
        } finally {
            em.close();
            System.out.println("Fechou");
        }
       
    }
    
    
            
    public N AtualizarDAO(N n) throws Exception {
       EntityManager em = getEM();
        try {
                em.getTransaction().begin();
                 
               
                 em.merge(n);
                  System.out.println("Salvou");
                  
               
                   if (!em.contains(n)) {
                  
                        throw new Exception("Erro ao atualizar o registro");
                    
                }
             
            em.getTransaction().commit();
            System.out.println("Comitou");
            } finally {
                em.close();
                System.out.println("Fechou");
            }
            return n;
    }
  
//      public N SalvarVerificadoDAO(N n, 
//              String namedQuery,
//              String parametroNome,
//              String nomePesquisado) throws Exception {
//              EntityManager em = getEM();
//              
//        try {
//            em.getTransaction().begin();
//            Query query = em.createNamedQuery(namedQuery);
//            query.setParameter(parametroNome, nomePesquisado);
//            List<N> data = query.getResultList();
//               /// se for uma atualizacao 
//               /// se nao siga por esse caminho  mesmo
//               if(data.isEmpty()){
//                 if(em.contains(n))
//                {
//                    em.persist(n);
//                    System.out.println("Salvou");   
//                }else{   
//                if (!em.contains(n)) 
//                {    
//                  
//                        throw new Exception("Erro ao atualizar o evento!");
//                    
//                }
//                n = em.merge(n);
//                System.out.println("Atualizou");
//            }   
//            em.getTransaction().commit();
//            System.out.println("Comitou");
//
//        } 
//        else if(!data.isEmpty())
//        {
//        
//        int opcao;
//        Object[] botoes = {" SIM "," NÃO "};
//        opcao = JOptionPane.showOptionDialog(
//        null, 
//       "O Registro: "+"\n Já existe no Banco de Dados!    \n Ainda Deseja Prosseguir Com o Cadastro?   ",
//       "    PERGUNTA DO SISTEMA     ", 
//       JOptionPane.YES_NO_OPTION,
//       JOptionPane.WARNING_MESSAGE,
//       null,botoes,botoes[0]);
//        if (opcao ==  JOptionPane.YES_OPTION) 
//        {
//            em.persist(n);
//        }
//         em.getTransaction().commit();
//        }
//               
//        } finally {
//            em.close();
//            System.out.println("Fechou");
//        }
//        return n;
//    }
    
    
    
     public N SalvarVerificadoEmLote(N n,
           String namedQuery,
           String parametroNome,
           String nomePesquisado)throws Exception{
           EntityManager em = getEM();
           try {
               
           em.getTransaction().begin();
           Query query = em.createNamedQuery(namedQuery);
           query.setParameter(parametroNome, nomePesquisado);
           List<N> data = query.getResultList();
            if(data.size() > 0)
            {
             
            }
            else if(data.isEmpty())
            {
                em.persist(n);
            } else{
                  if(!em.contains(n)){   
                     throw new Exception("Erro ao atualizar o evento!"); 
                  }
                  n = em.merge(n);     
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        return n;
    }
   
     public List<N> ContasRegistrosDAO(String namedQuery){
             EntityManager em = getEM();
             Query query = em.createNamedQuery(namedQuery);
             quantRegistrosDAO = query.getResultList().size();
             return query.getResultList();
	}
     
//     public N salvarLoteMultEmpresa(N n,
//                                    String namedQuery,
//                                    String parametroNome,
//                                    String nomePesquisado,
//                                    String idParametro,
//                                    String idEmpresa) 
//                                    throws Exception {
//        EntityManager em = getEM();
//        List<N> modelo;
//        try {
//           em.getTransaction().begin();
//           Query query = em.createNamedQuery(namedQuery);
//           query.setParameter(parametroNome, nomePesquisado);
//           query.setParameter(idParametro, idEmpresa);
//           modelo = query.getResultList();
//           List<N> data = query.getResultList();
//         
//         if(data.size() > 0){
//         }else if(data.isEmpty()){
//             if (n.getId() == null){
//                em.persist(n);
//            } else {
//                if (!em.contains(n)) {
//                    if (em.find(n.getClass(), n.getId()) == null){
//                       throw new Exception("Erro ao atualizar o evento!");
//                    }
//                }
//                n = em.merge(n);
//            }
//         }
//            em.getTransaction().commit();
//        } finally {
//            em.close();
//        }
//        return n;
//    }
    
    public void ExcluirDAO(Class<N> clazz, Integer id) {
        EntityManager em = getEM();
        N n = em.find(clazz, id);
        try {
            em.getTransaction().begin();
            
            em.remove(n);
            em.getTransaction().commit();
        } 
        finally {
            em.close();
        }
        
    }

    
     public void RemoverEmMassa(Class<N> clazz, Integer id) {
        EntityManager em = getEM();
        N n = em.find(clazz, id);
        try {
            em.getTransaction().begin();
            em.remove(n);
            em.getTransaction().commit();
        } 

        finally {
            em.close();
        }
    }
        

    public N consultarPorId(Class<N> clazz, Integer id) {
        EntityManager em = getEM();
        N n = null;
        try {
            n = em.find(clazz, id);
        } finally {
            em.close();
        }
        return n;
    }
    
       public List<N> consultarPorIdPorIdEmpresa( 
               String nomeNamedQuery,
               Integer idModel,
               Integer idModelParametro,
               String idEmpresa,
               String paramentroIdEmpresa) {
	 EntityManager em = getEM();
         List<N> idIdEmpresa;
         try{
        
         Query query = em.createNamedQuery(nomeNamedQuery);
         query.setParameter(idModel, idModelParametro);
         query.setParameter(idEmpresa, paramentroIdEmpresa);
         idIdEmpresa = query.getResultList();
         }catch(Exception e){
         idIdEmpresa = new ArrayList();
         } finally{
           em.close();
         }
		return idIdEmpresa;
	}  
  
	
         
         public List<N> ContarRegPesquisaDAO(String namedQuery) {
             EntityManager em = getEM();
             Query query = em.createNamedQuery(namedQuery);
             quantRegistrosPesquisaDAO = query.getResultList().size();  
             return query.getResultList();
	}
         
         
/*
         public List<N> PesquisaPaginada(int qtde, int deslocamento, String namedQuery) {
	 EntityManager em = getEM();
        List<N> modeloPesquisaPaginada;
            try{
                em.getTransaction().begin();
                Query query = em.createNamedQuery(namedQuery);
		query.setMaxResults(qtde);
		query.setFirstResult(deslocamento);
                
	//	quantidadeRegistrosEncontrados = query.getResultList().size();
                modeloPesquisaPaginada = query.getResultList();
                }catch(Exception e){
          modeloPesquisaPaginada = new ArrayList();
         } finally{
           em.close();
         }
		return modeloPesquisaPaginada;
	}  
        
         
         */
      public List<N> PesquisarComecaDAO(int qtde, int deslocamento, String namedQuery,String parametroNome,String nomePesquisado) {
      EntityManager em = getEM();
        List<N> modelo;
        try {
           em.getTransaction().begin();
           Query query = em.createNamedQuery(namedQuery);
           query.setParameter(parametroNome+"$", nomePesquisado+"%");
           quantRegistrosPesquisaDAO = query.getResultList().size();
           query.setMaxResults(qtde);
           query.setFirstResult(deslocamento);
          
           modelo = query.getResultList();
         }catch(Exception e){
         modelo = new ArrayList();
         } finally{
           em.close();
         }
		return modelo;
	}
    
      public List<N> PesquisarContemDAO(int qtde, int deslocamento, String namedQuery,String parametroNome,String nomePesquisado)  {
      EntityManager em = getEM();
        List<N> modelo;
        try {
           em.getTransaction().begin();
           Query query = em.createNamedQuery(namedQuery);
           query.setParameter("$"+parametroNome+"$", "%"+nomePesquisado+"%");
           quantRegistrosPesquisaDAO = query.getResultList().size();
           query.setMaxResults(qtde);
           query.setFirstResult(deslocamento);
         
          modelo = query.getResultList();
         }catch(Exception e){
         modelo = new ArrayList();
         } finally{
           em.close();
         }
		return modelo;
	}
      
      public List<N> PesquisarTerminaDAO(int qtde, int deslocamento, String namedQuery,String parametroNome,String nomePesquisado) {
      EntityManager em = getEM();
        List<N> modelo;
        try {
           em.getTransaction().begin();
           Query query = em.createNamedQuery(namedQuery);
           query.setParameter("$"+parametroNome, "%"+nomePesquisado);
           quantRegistrosPesquisaDAO = query.getResultList().size();
           query.setMaxResults(qtde);
           query.setFirstResult(deslocamento);
  
          modelo = query.getResultList();
         }catch(Exception e){
         modelo = new ArrayList();
         } finally{
           em.close();
         }
		return modelo;
	}
//         
// public N baixaEstoque(N n, 
//         Integer emp_id,
//         String namedQuery,
//         Integer parametroEmpresaId,
//         Integer produto_id,
//         String cod_produto,
//         Integer cod_mov,
//         Integer cod_mov_det,
//         Double quantRetirada) throws Exception {
//     
//        EntityManager em = getEM();
//        try {
//            em.getTransaction().begin();
//         Query query = em.createNamedQuery(namedQuery);
//         query.setParameter("", "");
//         query.setParameter("", "");
//         query.setParameter("", "");
//         query.setParameter("", "");
//         
//         
//            
//            if (n.getId() == null || Objects.equals(n.getId(), "")) {
//                em.persist(n);
//                System.out.println("Salvou");
//            } else {
//                if (!em.contains(n)) {
//                    if (em.find(n.getClass(), n.getId()) == null){
//                        throw new Exception("Erro ao atualizar o evento!");
//                    }
//                }
//                n = em.merge(n);
//                System.out.println("Atualizou");
//            }
//            em.getTransaction().commit();
//            System.out.println("Comitou");
//        } finally {
//            em.close();
//            System.out.println("Fechou");
//        }
//        return n;
//    }

 
  public List<N> consultarPorNamedQuery(String jpql) {
	 EntityManager em = getEM();
         List<N> modelo;
         try{
        
         TypedQuery query = (TypedQuery) em.createNamedQuery(jpql);
         modelo = query.getResultList();
         }catch(Exception e){
         modelo = new ArrayList();
         } finally{
           em.close();
         }
		return modelo;
	}

	public List<N> PesquisaPaginada(int qtde, int deslocamento, String namedQuery) {
	 EntityManager em = getEM();
        List<N> modeloPesquisaPaginada;
            try{
                em.getTransaction().begin();
                Query query = em.createNamedQuery(namedQuery);
		query.setMaxResults(qtde);
		query.setFirstResult(deslocamento);
                
	//	quantidadeRegistrosEncontrados = query.getResultList().size();
                modeloPesquisaPaginada = query.getResultList();
                }catch(Exception e){
          modeloPesquisaPaginada = new ArrayList();
         } finally{
           em.close();
         }
		return modeloPesquisaPaginada;
	}  
        
	/// carregamento padrao
        public List<N> ListaTudoDAO( String namedQuery) {
	 EntityManager em = getEM();
        List<N> modelo;
            try{
		 em.getTransaction().begin();
               Query query = em.createNamedQuery(namedQuery);
//         
//		query.setMaxResults(30);
//		query.setFirstResult(0);
		 quantRegistrosDAO = query.getResultList().size();
                modelo = query.getResultList();
                
                }catch(Exception e){
          modelo = new ArrayList();
         } finally{
           em.close();
         }
		return modelo;
	}  
        
        
}



