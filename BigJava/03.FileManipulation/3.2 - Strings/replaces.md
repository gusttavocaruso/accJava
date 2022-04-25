Para não esquecer mais, anote as diferenças entre os métodos replaceAll, replaceFirst e replace:

  - No replaceAll, devemos ter uma expressão regular como primeiro parâmetro, podendo assim substituir para nomes.replaceAll("\S+!", pessoa); e obter o mesmo resultado. Ao fazermos isso, qualquer texto que estiver antes da exclamação será substituído.

  - O replaceFirst serve para substituir apenas a primeira ocorrência da expressão regular.

  - O método replace serve para substituir caracteres ou textos de uma determinada String por outro caractere ou texto.
