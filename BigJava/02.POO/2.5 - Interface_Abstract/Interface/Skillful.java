public interface Skillful {

  String mainSkill();

}

// ==================================

public interface Skillful {

  String getLanguage(); 

  default String mainSkill() { 
    return "Learn " + getLanguage(); 
  }

} 

// utilizando default - Desta forma, uma classe que implementa a interface Skillful não precisa declarar o método mainSkill porque foi criado um método padrão.
