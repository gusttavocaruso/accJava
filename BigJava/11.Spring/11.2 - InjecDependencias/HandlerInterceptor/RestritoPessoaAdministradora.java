@Target( ElementType.METHOD )
@Retention( RetentionPolicy.RUNTIME)
public @interface RestritoPessoaAdministradora {

  Verificacao verifica() default Verificacao.ADMINISTRADORA;

}
