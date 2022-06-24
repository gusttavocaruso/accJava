DTO é uma sigla que signifca “Data Transfer Object”, sendo objetos que podem ser usados para trafegar dados de entrada e saída de APIs Rest, sem a necessidade de expor nossas entidades para os clientes da API


Uma vantagem que temos aqui é poder definir regras de negócio e utilizar o DTO para garanti-las. Imagine que apenas o preço do carro possa ser atualizado. Agora estamos garantindo que nenhum atributo será alterado, pois em nosso DTO definimos apenas o preço
