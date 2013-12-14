package br.edu.uniritter.liquid.democracy.session;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;
import br.edu.uniritter.liquid.democracy.model.User;

@Component
@SessionScoped
public class UserInfo {

    private User user;

    public void login(User user) {
        this.user = user;
    }

    public void logout() {
        user = null;
    }
    
    public boolean isLogged(){
    	return user != null;
    }

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
