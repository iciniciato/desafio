<h1><b>desafio-aluno</b></h1>   
Neste readme irei dividir as informações relevantes em tópicos. O desafio passado foi:
<br><br>
Criar um projeto qualquer usando Design Patterns e o padrão Strategy.

<h3><b>Informações sobre o projeto:</b></h3>
No meu desafio considerei uma Microempresa com atividade de Serviços, com regime tributário Simples Nacional, que reside em Bauru no estado de São Paulo e tem uma receita bruta anual de R$ 180.000,01 a R$ 360.000,00. Impostos considerados para emissão de NFS: COFINS 1.42%, INSS 4% E ISSQN 2%.
<h3><b>Como executar o projeto:</b></h3>

   <LI><b>Via IDE</b><br>
    Para executar o projeto via IDE basta entrar no projeto e executar a classe <b>ApiStarter.java</b>.
    <br>
    
</UL>
    
<h3><b>Tecnologias utilizadas:</b></h3>
<UL>
  <LI><b>SpringFramework(Web e DataJpa) v2.3.3:</b> Ferramenta facilitadora de configuração de projetos.</LI>
  <LI><b>Gradle v4.2:</b> Ferramenta de gerenciamento de dependências e automatização de builds, utiliza o ANT e o Maven.</LI>
  <LI><b>Postman v7.33.1:</b> Ferramenta para teste de API's que utilizam o padrão REST.</LI>
  <LI><b>Intellij v2020.2.2:</b> IDE de desenvolvimento.</LI>
</UL>

<h3><b>Urls relevantes:</b></h3>
  <UL>

  <LI><b><a href='http://localhost:8080/cofins/{valor}'>GET http://localhost:8080/cofins/{valor}</a></b><br>
      Url destinada a retornar somente o valor do cálculo do imposto COFINS.
      <LI><b><a href='http://localhost:8080inss/{valor}'>GET http://localhost:8080/inss/{valor}</a></b><br>
            Url destinada a retornar somente o valor do cálculo do imposto INSS.
            <LI><b><a href='http://localhost:8080/issqn/{valor}'>GET http://localhost:8080/issqn/{valor}</a></b><br>
                  Url destinada a retornar somente o valor do cálculo do imposto ISSQN.
  </UL>

<h3><b>Considerações finais:</b></h3>
 Nunca havia lido sobre o padrão Strategy, foi muito legal estudar sobre, e desenvolver um pequeno projeto utilizando esse padrão.
