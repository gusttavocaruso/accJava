A lista é provavelmente o tipo de dados mais usado em linguagens de programação por se adequar bem a grande parte dos problemas do mundo real. A interface List do Java define comportamento compatível com esse tipo de dados, o que deve ser respeitado por suas implementações.

Isso significa que um tipo que implemente a interface List deve ser uma lista ordenada de objetos e que permite a presença de elementos duplicados.

Ordenada?
O fato de uma lista ser ordenada faz com que os seus elementos estejam sempre ordenados comparativamente? Qualquer lista de números inteiros terá como primeiro item o menor deles?

**Quando você ouvir que a lista é um tipo ordenado, tenha em mente que isso se refere à propriedade que a lista tem de preservar a ordem dos elementos na leitura, mesmo que essa ordem não signifique nada comparativamente. Nesse nosso caso, a lista é lida na ordem de inserção, já que depois de ela ser populada não houve nenhum reposicionamento.**

Para ordenar uma lista de números utilize a função sort da classe utilitária Collections (não é a interface Collection):

```java
  public static void main(String[] args) {
    var numeros = new ArrayList<Integer>();
    numeros.add(7);
    numeros.add(2);
    numeros.add(1);
    numeros.add(9);

    System.out.println(numero); // [7, 2, 1, 9]
    Collections.sort(numeros);
    System.out.println(numeros); // [1, 2, 7, 9]
  }
```

List é uma interface, e isso impede que você a instancie diretamente. Uma das implementações que o Java fornece de forma nativa é o ArrayList

As diferentes implementações de List não interferem no resultado das operações, apenas na forma como os dados são armazenados e recuperados. Na prática, isso traz diferenças de desempenho se os dados armazenados crescerem muito. Para a maior parte dos cenários, tanto o uso de ArrayList quanto de LinkedList é adequado.
