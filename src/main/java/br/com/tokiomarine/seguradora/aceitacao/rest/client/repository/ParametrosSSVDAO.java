package br.com.tokiomarine.seguradora.aceitacao.rest.client.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import br.com.tokiomarine.seguradora.ssv.corporativa.model.GrupoParametroSSV;
import br.com.tokiomarine.seguradora.ssv.corporativa.model.ParametroSSV;

@Lazy
@Repository
public class ParametrosSSVDAO {

    /**
     * Usado para armazenar EntityManager.
     */
    @PersistenceContext
    private EntityManager entityManager;

    public ParametrosSSVDAO() {
        // TODO Auto-generated constructor stub
    }

    public Long buscarCodigoGrupoSSV(String nomeGrupoParametro) {

        try {
            StringBuffer sql = new StringBuffer();

            sql.append(" SELECT g");
            sql.append(" FROM GrupoParametroSSV g");
            sql.append(" WHERE g.dsGrpParamSsv =:nomeGrupoParametro");

            Query query = entityManager.createQuery(sql.toString());
            query.setParameter("nomeGrupoParametro", nomeGrupoParametro);

            GrupoParametroSSV grupoParametroSSV = (GrupoParametroSSV) query.getSingleResult();

            if (null != grupoParametroSSV) {
                return grupoParametroSSV.getCdGrpParamSsv();
            } else {
                return null;
            }

        } catch (NoResultException nre) {
            return null;

        } catch (RuntimeException e) {
            throw e;
        }
    }
    
    public ParametroSSV getParametro(String cdParamSsv) {
    	try {
            StringBuffer sql = new StringBuffer();
            sql.append("SELECT p FROM ParametroSSV p ");
            sql.append("WHERE p.cdParamSsv = :cdParamSsv ");
            
            Query query = entityManager.createQuery(sql.toString());
            query.setParameter("cdParamSsv", cdParamSsv);
            
            return (ParametroSSV) query.getSingleResult();
    	} catch (NoResultException ex){
    		return null;
    	} catch (Exception ex) {
    		throw new RuntimeException(ex);
    	}
    }
    
    public List<ParametroSSV> buscarParametroSSVporCdGrp(Long cdGrpParamSsv) {
    	try {
    		StringBuffer sql = new StringBuffer();
    		sql.append("SELECT p FROM ParametroSSV p ");
    		sql.append("WHERE p.cdGrpParamSsv = :cdGrpParamSsv ");
    		
    		Query query = entityManager.createQuery(sql.toString());
    		query.setParameter("cdGrpParamSsv", cdGrpParamSsv);
    		List<ParametroSSV> parametrosSSV =  query.getResultList();
    		
    		return parametrosSSV;
    	} catch (NoResultException ex){
    		return null;
    	} catch (Exception ex) {
    		throw new RuntimeException(ex);
    	}
    }
    
    
}
