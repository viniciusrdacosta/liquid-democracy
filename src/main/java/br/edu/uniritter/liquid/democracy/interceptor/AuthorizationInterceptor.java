package br.edu.uniritter.liquid.democracy.interceptor;

import br.com.caelum.vraptor.InterceptionException;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.com.caelum.vraptor.resource.ResourceMethod;
import br.edu.uniritter.liquid.democracy.annotation.Public;
import br.edu.uniritter.liquid.democracy.controller.SecurityController;
import br.edu.uniritter.liquid.democracy.session.UserInfo;

@Intercepts
public class AuthorizationInterceptor implements Interceptor {

	private final UserInfo info;
	private final Result result;

	public AuthorizationInterceptor(UserInfo info, Result result) {
		this.info = info;
		this.result = result;
	}

	public boolean accepts(ResourceMethod method) {
		return !method.containsAnnotation(Public.class);
	}

	public void intercept(InterceptorStack stack, ResourceMethod method,
			Object resourceInstance) throws InterceptionException {

		if (info.isLogged()) {
			stack.next(method, resourceInstance);
		} else {
			result.redirectTo(SecurityController.class).login();
		}
	}

}
