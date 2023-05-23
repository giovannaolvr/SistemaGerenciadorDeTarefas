# Sistema Gerenciador De Tarefas

- Atividade Técnica de Recrutamento.

<h2> Em geral </h2>

- Projeto com o objetivo de realizar uma aplicação Java Web utilizando JavaServer Faces(JSF) e persistência em um banco de dados PostgreSQL.
- O 'Gerenciador de Tarefas' tem as funcionalidades de criar, ler, atualizar e excluir uma Tarefa, assim como também, concluí-la.
- A entidade 'Tarefa' é composta por: id (Primary Key), titulo, descricao, responsavel, prioridade ('alta', 'media' ou 'baixa'), deadline, situacao ('Em Andamento' ou 'Concluído').
  - Todas as variáveis foram devidamente tratadas para a validação e conversão dos dados.
  - Para melhor gerenciamento da entidade e dos dados, as variáveis 'prioridade' e 'situcacao' são Enums. Com isso, é possível definir um conjunto limitado de valores que as variáveis podem assumir, evitando erros e excessões ao lidar com o usuário.
- O usuário poderá buscar suas tarefas a partir do 'titulo' e, também, listá-las por 'situacao'.
- A interface (implantada com o framework PrimeFaces) atua para ajudar o usuário, logo, em uma única página o usuário consegue realizar todas as funcionalidades e também visualizá-las ocorrendo com facilidade através da listagem de tarefas.

<h2> Recrutamento - tópicos realizados: </h2>

- (a) - Criar uma aplicação Java Web utilizando JavaServer Faces (JSF). 
- (b) - Utilizar persistência em um banco de dados PostgreSQL.
- (c) - Utilizar JPA.
- (f) - Foi utilizado o PrimeFaces para criar intefaces de usuário;

<h2> Instruções para a execução da aplicação: </h2>

<h3> Requisitos: </h3>

1. Eclipse IDE instalado
2. Apache Tomcat 9 instalado
3. JDK (Java Development Kit) instalado

<h3> Passo 1: Importar o projeto no Eclipse </h3>

- Abra o Eclipse IDE.
- Selecione o menu "File" e escolha a opção "Import".
- Na janela de importação, expanda a pasta "Maven" e selecione "Existing Maven Projects".
- Clique em "Next".
- No campo "Root Directory", clique em "Browse" e localize o diretório do projeto.
- Selecione o projeto e clique em "Finish". O Eclipse irá importar o projeto.

<h3> Passo 2: Configurar o servidor Tomcat no Eclipse </h3>

- No Eclipse, clique com o botão direito na área "Servers" (ou "Servidores") na aba "Servers" (ou "Servidores") no canto inferior.
Selecione "New" -> "Server".
- Na lista de servidores, escolha "Apache" e selecione a versão "Tomcat v9".
- Clique em "Next".
- No campo "Tomcat installation directory" (ou "Diretório de instalação do Tomcat"), clique em "Browse" e localize o diretório de instalação do Apache Tomcat 9.
- Clique em "Finish". O Tomcat será configurado no Eclipse.

<h3> Passo 3: Configurar a execução do projeto no Tomcat </h3>

- No Eclipse, clique com o botão direito no projeto importado.
- Selecione "Properties" (ou "Propriedades").
- Na janela de propriedades, clique em "Project Facets" (ou "Facetas do Projeto").
- Marque a opção "JavaServer Faces" e clique em "Further configuration available..." (ou "Configuração adicional disponível...").
- Selecione a versão do JSF (por exemplo, JSF 2.3) e clique em "OK".
- Clique em "Apply and Close" (ou "Aplicar e Fechar") para fechar a janela de propriedades.

<h3> Passo 4: Executar o projeto no servidor Tomcat </h3>

- Certifique-se de que o servidor Tomcat está iniciado. Se não estiver, inicie-o no Eclipse clicando com o botão direito no servidor na aba "Servers" (ou "Servidores") e selecione "Start" (ou "Iniciar").
- Clique com o botão direito no projeto importado e selecione "Run As" -> "Run on Server" (ou "Executar Como" -> "Executar no Servidor").
- Na janela "Run on Server" (ou "Executar no Servidor"), escolha o servidor Tomcat e clique em "Next".
- Selecione o projeto na lista e clique em "Add" para adicioná-lo ao servidor.
- Clique em "Finish".
- O Eclipse irá iniciar o servidor Tomcat e implantar o projeto nele.
- Abra um navegador web e acesse a URL "http://localhost:8080/nome-do-projeto" (substitua "nome-do-projeto" pelo nome do seu projeto). A aplicação Java Web deverá ser carregada e estará pronta para uso.

