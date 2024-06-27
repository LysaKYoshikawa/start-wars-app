
<h1 style="color:gold;padding:30px;"> Api Start Wars - Testes Automatizados :star2: </h1>

<h2 style="color:#31d4dd;"> Objetivo</h2>

Este projeto visa aplicar testes automatizados em uma api com tema Star Wars para usar como estudo e praticas de teste unitario, integrado e subcutâneos


<h3 style="color:#31d4dd;">:loudspeaker: Features </h3>

- [x] Criação do projeto 
- [x] Adicionando banco de dados H2
- [ ] Notas sobre testes automatizados
- [ ] Teste unidade
- [ ] Teste de Integração
- [ ] Teste Subcutâneo


<h3 style="color:#31d4dd;"> :pushpin: Tecnologias Ultilizadas </h3>

- java 17
- springboot
- H2
- teste unitario




<h2 style="color:orange;padding:10px;">
Testes Automatizados
</h2>


Existem varios tipos de testes que podemos aplicar no JAVA e em outras linguagens tambem.

<h3 style="color:#31d4dd;"> Teste Unitario : </h3>
Ele é mais simples, o primeiro a ser desenvolvido pela sua simplicidade e objetividade, focado em métodos e classes. Os testes unitários podem ser divididos em Solitários e Sociáveis.

Solitário é quando eu testo uma funcionalidade que não depende de banco de dados, ou quando não depende de algo externo para ser testado.

Sociáveis é quando a gente começa a “conversar” com uma parte do código. Quando o teste precisa de outra funcionalidade para executar, seja ela banco de dados ou pedaço de código.
![image](https://github.com/LysaKYoshikawa/start-wars-app/assets/64383080/cb13f0cd-ab77-4e72-a36a-c9651d8ec90e)
<p>

Dubles de teste: Usados pelos testes solitários para simular o comportamento das suas dependências.
Tipos de dubles:

- Dummy é apenas para compilar, não é invocado. As vezes usados em cenarios com tdd.

- Fake é uma implementação funcional, mas não usada em produção (ex: banco em memoria)
    
- Stud é a ideia de responder com ideias pré estabelecidas: quando chamado com determinados parametros então retornar valor fixo(verificação de estado)

- Spy é parecido com o stud porem alem de retornar o valores pré estabelecidos ele retorna estado e compotamento dos valores. Um exemplo informado foi de um teste realizado em que era adicionado elementos nessa lista e alem de retornar se realmente foi adicionado ele retorou a quantidade de vezes que foi chamado.

- Mock a ideia do mock é a interação exata com os objetos que o usam, verificar se o fluxo desejado foi invocado (verificação de comportamento)


</p>

<h3 style="color:#31d4dd;"> Teste de Integração : </h3>
É quando eu expando meus testes unitarios eu integro com banco de dados, eu utilizo uma camada web.

Amplos são testes que cruzam mais outras camadas.

Dublês de teste : quando eu uso um substituto para meu teste por exemplo supondo que meu banco de dados é o oracle eu uso o h2 para teste, crio um duble para o banco e assim executar teste.

![image](https://github.com/LysaKYoshikawa/start-wars-app/assets/64383080/e5e11808-a5cf-4808-807d-44963d8ebc25)

<h3 style="color:#31d4dd;"> Teste de componente : </h3>
Esse teste tambem é conhecido como teste subcutaneo, ele cruza varios componentes

![image](https://github.com/LysaKYoshikawa/start-wars-app/assets/64383080/a2fa5c98-c1d5-4322-9896-0d4fa13f5336)

<h3 style="color:#31d4dd;"> Teste E2E : </h3>
Esse teste sobre tudo e simula uma jornada de usuario. Ele costuma ser mais lento, as vezes pode quebrar mais facil por ser talvez mais instavel. Porem ele é mais confiavel por imitar uma jornada real de usuario.

![image](https://github.com/LysaKYoshikawa/start-wars-app/assets/64383080/df42e2d0-d44d-4c63-b67f-dff80432b045)

<h3 style="color:#31d4dd;"> Boas Praticas dos testes: </h3>

<p>
    Sempre é interessante desenhar ou registrar os tipos de teste que deseja fazer antes de escreve-los.
Outra boa pratica para facilitar na nomeação é separar o nome por operacao_estado_returnoesperado
ex vai ser com a operação de criar_com estado de dados validos_e o retorno sera os planetas

</p>

~~~ Java
// operacao_estado_returnoesperado
public void createPlanet_WithValidData_ReturnsPlanet(){

    }
~~~

#### :pushpin: Author
Monalysa Klauck Yoshikawa
[Linkedin] : <https://www.linkedin.com/in/monalysa-yoshikawa/>