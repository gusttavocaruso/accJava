Classes não herdam interfaces, elas implementam interfaces. Por isso os atributos de uma interface não podem ser acessados pela classe que a implementa. Você pode declarar atributos em uma interface (com uma restrição que veremos mais adiante), no entanto esses atributos não serão acessíveis às classes.

Uma interface em Java é uma classe abstrata cujos atributos não são acessados pelas classes que a implementam, somente seus métodos.

É justamente essa característica que permite que classes implementem mais de uma interface.



Para implementar várias interfaces em uma classe, basta separá-las por vírgula. Exemplo:

```java
class UmaClasse implements InterfaceA, InterfaceB, InterfaceC
```

### Herança

Como interfaces não possuem atributos, não faz sentido que elas herdem classes — afinal, classes podem possuir atributos. Interfaces, portanto, só podem herdar outras interfaces.

Isto é feito da mesma maneira que nas classes, ou seja, usando a palavra extends.


" a dependência entre as classes é menor (o acoplamento é mais fraco) ao usar interfaces. Na prática, a qualidade de um projeto aumenta quando se prioriza o uso de interfaces. "