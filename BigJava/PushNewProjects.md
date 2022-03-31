## Criando novos projetos Java no Eclipse e subindo no github

No eclipse:

- `botão direito barra lateral > New > Java Project > NomeProjeto > Next > desflega: 'Create module-info.java file' > Finish`

- `botão direito NomeProjeto/src > New > package > nome.package > Finish`

- `botão direito NomeProjeto/src/nome.package > New > Class > NomeClasse > flega: 'public static void main(String[] args)'(se for a classe principal) > Finish`

- `Cria regras de negócio nos arquivos NomeProjeto/src/nome.package/NomeClasse.java`

- `botão direito NomeProjeto > Team > Share Project > Seleciona direitório onde está o repositório do git iniciado/.git > Finish`

- `botão direito NomeProjeto > Team > Synchronize Workspace > Ok`

- `botão direito NomeProjeto/.settings > Ignore`

- `botão direito NomeProjeto/.classpath > Ignore`

- `botão direito NomeProjeto/.project > Ignore`

- `barra inferior Eclipse > Git Staging > Unstaged Chages > clica no simbolo ++ > Commit Message > Escreve mensagem de commit > Commit and Push > Ok`
