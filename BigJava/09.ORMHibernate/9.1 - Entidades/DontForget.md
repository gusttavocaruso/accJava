## As chaves/identificadores primários são limitados pelas seguintes restrições:

### UNIQUE:
Os valores devem identificar exclusivamente cada linha.

### NOT NULL
Os valores não podem ser nulos. Para IDs compostos, nenhuma parte pode ser nula.

### IMUTÁVEL
Os valores, uma vez inseridos, nunca poderão ser alterados.

## As chaves/identificadores podem ser gerados automaticamente pelo @GeneratedValue, seguindo qualquer uma das seguintes estratégias:

### AUTO
Indica que o provedor de persistência deve escolher uma estratégia apropriada para o banco de dados específico.

### IDENTITY
Indica que o provedor de persistência deve atribuir chaves primárias para a entidade usando uma coluna de identidade do banco de dados.

### SEQUENCE
Indica que o provedor de persistência deve atribuir chaves primárias para a entidade usando uma sequência de banco de dados.

### TABLE
Indica que o provedor de persistência deve atribuir chaves primárias para a entidade usando uma tabela de banco de dados subjacente para garantir a exclusividade.