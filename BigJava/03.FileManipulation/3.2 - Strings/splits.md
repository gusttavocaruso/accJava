O método split possui muitas formas diferentes de ser utilizado. Agora já sabemos que o primeiro parâmetro é obrigatório e uma expressão regular, e que o segundo parâmetro é opcional e tem um limite, que pode ser positivo, negativo ou zero.

  - No limite negativo, o padrão será aplicado quantas vezes for preciso, e o array pode ter qualquer tamanho.

  - No limite de zero, o padrão será aplicado quantas vezes for preciso, e o array também pode ter qualquer tamanho, mas, além disso, ele também retira valores vazios no final do array.


Dada a String “boo:and:foo”, por exemplo, veja os diferentes resultados para os parâmetros informados:

Regex	Limite	Resultado

:	2	{ "boo", "and:foo" }

:	5	{ "boo", "and", "foo" }

:	-2	{ "boo", "and", "foo" }

o	5	{ "b", "", ":and:f", "", "" }

o	-2	{ "b", "", ":and:f", "", "" }

o	0	{ "b", "", ":and:f" }