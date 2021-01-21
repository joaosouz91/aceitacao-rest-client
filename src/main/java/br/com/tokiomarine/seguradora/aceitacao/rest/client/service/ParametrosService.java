package br.com.tokiomarine.seguradora.aceitacao.rest.client.service;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import br.com.tokiomarine.seguradora.aceitacao.crud.model.ParametrosAceitacao;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.repository.ParametrosSSVDAO;
import br.com.tokiomarine.seguradora.ssv.corporativa.model.ParametroSSV;
import br.com.tokiomarine.seguradora.ssv.corporativa.model.pk.ParametroSSVPK;

@Lazy
@Component
@Transactional
public class ParametrosService {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private ParametrosSSVDAO parametrosSSVDAO;

    public String buscaValorParametroSSV(String nomeGrupoParametro, String nomeParametro) throws Exception {

        try {
            Long codigoGrupoParametro = parametrosSSVDAO.buscarCodigoGrupoSSV("SSV.PROPERTIES." + nomeGrupoParametro);

            ParametroSSVPK parametroSSVPK = new ParametroSSVPK(codigoGrupoParametro, nomeParametro);
            ParametroSSV parametroSSV = (ParametroSSV) entityManager.find(ParametroSSV.class, parametroSSVPK);

            return parametroSSV.getVlParamSsv();

        } catch (Exception e) {
            throw new Exception("Erro ao buscar parametro SSV: Grupo " + nomeGrupoParametro + " parametro " + nomeParametro + " \n " + e.getStackTrace() + " \n " + e.getMessage(), e);
        }
    }

    public void cadastrarParametroAceitacao(String codigoParametro, String descricaoParametro, String valorParametro, String usuario) {

        ParametrosAceitacao parametroAceitacao = new ParametrosAceitacao();
        parametroAceitacao.setCdParam(codigoParametro);
        parametroAceitacao.setDsParam(descricaoParametro);
        parametroAceitacao.setVlParam(valorParametro);
        parametroAceitacao.setCdUsuroUltmaAlter(usuario);
        parametroAceitacao.setDtUltmaAlter(new Date());

        entityManager.merge(parametroAceitacao);
    }
    
    public String cadastrarUpdate(String codigoParametro, String descricaoParametro, String valorParametro, String usuario) {

        ParametrosAceitacao parametroAceitacao = new ParametrosAceitacao();
        parametroAceitacao.setCdParam(codigoParametro);
        parametroAceitacao.setDsParam(descricaoParametro);
        parametroAceitacao.setVlParam(valorParametro);
        parametroAceitacao.setCdUsuroUltmaAlter(usuario);
        parametroAceitacao.setDtUltmaAlter(new Date());

        entityManager.merge(parametroAceitacao);
        
    	return "{\"codigo\":\"0\",\"descricao\":\"Merge Parametro Sucesso\"}";
    }
    
    public String cadastrarInsert(String codigoParametro, String descricaoParametro, String valorParametro, String usuario) {

        ParametrosAceitacao parametroAceitacao = new ParametrosAceitacao();
        parametroAceitacao.setCdParam(codigoParametro);
        parametroAceitacao.setDsParam(descricaoParametro);
        parametroAceitacao.setVlParam(valorParametro);
        parametroAceitacao.setCdUsuroUltmaAlter(usuario);
        parametroAceitacao.setDtUltmaAlter(new Date());

        entityManager.persist(parametroAceitacao);
        
    	return "{\"codigo\":\"0\",\"descricao\":\"Cadastrado Parametro Sucesso\"}";
    }
    
    
    public List<ParametrosAceitacao> listaParametroAceitacao() {
    	Query query = entityManager.createQuery("select o from ParametrosAceitacao o");
    	List<ParametrosAceitacao> lista = query.getResultList();
    	return lista;
    }
    
    public String removeParametroAceitacao(String codigoParametro) {
    	
    	ParametrosAceitacao parametroAceitacao = entityManager.find(ParametrosAceitacao.class, codigoParametro);
    	entityManager.remove(parametroAceitacao);
        
    	return "{\"codigo\":\"0\",\"descricao\":\"Removido Parametro Sucesso\"}";
    }

    public String buscarParametroAceitacao(String codigoParametro) throws Exception {
    	
        final ParametrosAceitacao parametrosAceitacao = entityManager.find(ParametrosAceitacao.class, codigoParametro);

        if (null != parametrosAceitacao) {
            return parametrosAceitacao.getVlParam();

        } else {
            throw new Exception("Erro ao buscar parametro " + codigoParametro);
        }
    }
}