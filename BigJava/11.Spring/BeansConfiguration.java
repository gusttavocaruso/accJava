@Configuration
public class BeansConfiguration {

  @Bean
  public PessoaDesenvolvedoraService  pessoaDesenvolvedoraService(){
      return  new PessoaDesenvolvedoraService();
  }

  @Bean
  public PessoasFuncionariaService pessoasFuncionariaService(){
      return new PessoasFuncionariaService();
  }

}
