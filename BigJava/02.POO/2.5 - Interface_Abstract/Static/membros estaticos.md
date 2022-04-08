### Definição

Membros estáticos são aqueles inerentes à classe e não ao objeto. Para definir um membro estático, basta usar a palavra static

```java
public static String mainSkill() { 
  return "Learn."; 
}
```


### Reuso

Os membros estáticos podem ser herdados. Caso seja seu interesse criar uma classe FirstYearStudent que herda a classe Student, uma opção é acessar o método estático a partir da primeira classe, conforme expõe o exemplo:

```java
FirstYearStudent.mainSkill();
```


  - Um membro estático é usado quando ele não varia de acordo com a instância da classe
  - Membros estáticos podem ser herdados
  - Membros estáticos podem ser usados em classes (abstratas e concretas) e interfaces
