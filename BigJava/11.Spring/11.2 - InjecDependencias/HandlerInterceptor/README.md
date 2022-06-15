Como configurar HandlerInterceptor em uma aplicação?
Você sabia que é possível configurar middlewares nas nossas aplicações Spring? Chegou a hora de aprender como configurar HandlerInterceptor em uma aplicação!

O Spring boot permite que nós criemos uma annotation personalizada para intermediarmos as requisições e obter/adicionar algumas informações nelas. Por exemplo, colocar uma marcação em uma response para sinalizar alguma permissão específica que aquele usuário tenha.

Chegou o momento de aprender os tipos de interceptors e como adicionar um interceptor do tipo preHandle que adiciona uma header de resposta.

- preHandle() Ação executada assim que a requisição chega a controller.

- postHandle() Adiciona algo a partir do momento em que o handle é terminado.

- afterCompletion() É chamado depois que toda a solicitação é concluída e a resposta é enviada à pessoa cliente.


Imagine que você precisa retornar no header para fins de logs quando uma pessoa usuária passa por um determinado endpoint:

Aqui vamos criar uma annotation que, quando passar por um endpoint que a contiver, vai adicionar um header na response da requisição se naquele endpoint tiver a annotation @RestritoPessoaAdministradora.

1. O primeiro passo é criarmos nosso tipo de verificação, que nesse caso é validar a pessoa administradora

2. Em seguida criamos a annotation

3. Agora vamos usar essa annotation na classe que será responsável pela configuração do que esse interceptor vai fazer ou não

4. Agora vamos adicionar esse interceptor para poder ser utilizado

5. Agora é só adicioná-lo no controller que desejamos