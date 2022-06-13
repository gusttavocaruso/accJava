
@Component
public class Interceptor implements HandlerInterceptor {

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

    final RestritoPessoaAdministradora restritoPessoaAdministradora = (
        (HandlerMethod)handler)
            .getMethod()
            .getAnnotation((RestritoPessoaAdministradora.class));

    if(restritoPessoaAdministradora != null) {
        response.addHeader("InterceptorTrybe", "Pessoa administradora validada pelo interceptor da trybe");
        return true;
    } else {
      return false;
    }

  }

}
