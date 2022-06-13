
@Component
public class InterceptorConfig implements WebMvcConfigurer {

    private Interceptor interceptor;

    public InterceptorConfig(Interceptor interceptor) {
      this.interceptor = interceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
      registry.addInterceptor(interceptor);
    }

}

