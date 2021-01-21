
package br.com.tokiomarine.seguradora.aceitacao.rest.client.util;

import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.Map;

import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

/**
 * 
 * @author ?
 *
 * @param <T>
 */
public class RestClientFactory <T>{
	
	private String jndi;
	
	private String method;
	
	private String url;	
	
	private String json;
	
	public RestClientFactory(String url, String jndi, String method) {
		
		this.jndi = jndi;
		this.method = method;
		this.url = url;
	}

	public void send (RestClientParameter request) throws RestClientException {
		
		ClientResponse response = null;
		
		try {
		 	ClientConfig clientConfig = new DefaultClientConfig(); 
	        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE); 
	        Client client = Client.create(clientConfig); 
	        WebResource webResource = client.resource(url + "/ejb/execute");

	        JSONObject requestParam = new JSONObject();

	        requestParam.put("jndi",jndi);
	        requestParam.put("method",method);

	        JSONArray parametersArray = new JSONArray(); 

	        Gson gson = new Gson();
	        
	        LinkedList<Object> parameters = request.getParameters();
	        if(request != null && parameters != null && parameters.size() > 0){
	        	for(Object obj : parameters){
	        		if(obj != null && ModelRequest.class.isAssignableFrom(obj.getClass())){
	        			parametersArray.put(gson.toJson(obj));
	        		} else {
	        			parametersArray.put(obj);
	        		}
	        	}
	        }

	        requestParam.put("parameters",parametersArray);

	        response = webResource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).post(ClientResponse.class, requestParam.toString());

	        containsError(response);

	        json = response.getEntity(String.class);
	        
		} catch (Exception ex) {
			
			throw new RestClientException(ex);
			
		} finally {
			
			if(response != null) {
				response.close();
			}
			
		}
	}
	
	private void containsError(ClientResponse response) throws RestClientException{
        if(response.getStatus() != 200) {
        	String msg = null;
        	Map<?,?> map = response.getHeaders();
        		if(map.containsKey("MensagemErro")){
        			msg = String.valueOf(map.get("MensagemErro"));
        		} 	        	
        	throw new RestClientException(msg);
        }
	}
	
	public String getJson() {
		return json;
	}
	
	
	public T getFromJson(Class<T> clazz) {
		Gson gson = new Gson();
        return (T) gson.fromJson(json, clazz);
	}
	
	public T getFromJson(Type clazz) {
		Gson gson = new Gson();
        return gson.fromJson(json, clazz);
	}
}