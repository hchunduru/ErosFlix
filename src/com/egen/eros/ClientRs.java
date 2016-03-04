
package com.egen.eros;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.web.client.RestTemplate;

public class ClientRs {

	public List<User> getUsers(){
		RestTemplate restTemplate = new RestTemplate();
        URI uri = null;
        try {
			uri = new URI("http://localhost:8080/Spring-pratice-44-mvc-rest/users");
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
        @SuppressWarnings("unchecked")
		List<User> users = (List<User>) restTemplate.getForObject(uri, User.class);
	 return users;
	}
	
	  public User UserbyId(String id){
		  RestTemplate restTemplate = new RestTemplate();
	        String url = "http://localhost:8080/Spring-pratice-44-mvc-rest/{"+id+"}";
	        URI uri = null;
	        try {
				uri = new URI(url);
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
	        User user = restTemplate.getForObject(uri, User.class);
		 return user;
	  }
	 public void deletebyId(String id){
		 RestTemplate restTemplate = new RestTemplate();
	        String url = "http://localhost:8080/Spring-pratice-44-mvc-rest/{"+id+"}";
	        @SuppressWarnings("unused")
			URI uri = null;
	        try {
				uri = new URI(url);
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
	        restTemplate.delete(url);
		}
	
	
}
