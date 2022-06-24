Durante o processo de desenvolvimento de uma API, às vezes é necessário fazer algumas pré-validações antes da requisição de fato chegar até nossas classes na camada de controller. Atividades como:

- Verificar se a pessoa usuária tem acesso em uma determinada rota;

- Autenticar pessoa usuária;

- Adicionar os atributos da requisição em logs para melhorar o rastreio.

No Quarkus é possível fazer isso através da interface ContainerRequestFilter. Por meio dela, podemos interceptar requisições antes de elas chegarem em nossas classes para fazer os devidos tratamentos.
