Set(cuja tradução é “conjunto”) é uma estrutura de dados bem semelhante a List, mas com duas diferenças muito importantes.

A primeira diferença é que no Set não existe nenhuma garantia de ordem dos elementos. As estruturas usadas para implementar a interface Set podem resultar até mesmo em ordenação instantânea (como acontece com o TreeSet), mas isso não está na especificação do Set. O HashSet, outra implementação que utiliza tabelas hash para armazenar os elementos, recupera os elementos numa ordem diferente tanto da sua ordem natural quanto da ordem de inserção.

Já a segunda é que um Set não admite elementos repetidos
