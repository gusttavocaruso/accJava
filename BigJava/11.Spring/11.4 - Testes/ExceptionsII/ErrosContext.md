## Erros contextualizados

Outra característica existente com o uso de ControllerAdvice é que podemos modificar o payload retornado em casos de erro. Isto significa que um mesmo endpoint pode retornar as opções listadas abaixo!

Em caso de sucesso:
```java
{
  "matricula": "1",
  "nome": "Formiga"
}
```

Em caso de falha:
```java
{
  "timestamp": "2022-01-18T09:42:12.287+00:00",
  "status": 404,
  "error": "Not Found",
  "message": "Estudante não encontrado"
}
```
