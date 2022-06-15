## Fallback

Ao termos uma função anotada com @CircuitBreaker, temos a possibilidade de informar qual será seu método de retorno em casos de falhas: o fallbackMethod.

É importante lembrar que um método de fallback deve ser colocado na mesma classe e deve ter a mesma sequência de argumentos. Acrescentar um parâmetro de exceção é opcional.

Com isso, nossa classe de serviço teria uma composição semelhante à seguinte:

```java
@CircuitBreaker(name = "estudantes", fallbackMethod = "fallback")
public List<Estudante> listarEstudantes() {
  return estudanteRepository.findAll();
}

private List<Estudante> fallback(RuntimeException e) {
  return List.of();
}
```

Assim, a mesma operação passaria a retornar: `[]`
