# Projeto Spotifei


Projeto desenvolvido por Bruno Kenez Bergamasco Endo para a disciplina Arquitetura de Software e Programação orientada a objetos, inspirado no Spotify.

## Objetivo do projeto:

Criar uma aplicação Java desktop com interface gráfica (SWING) que simula funcionalidades básicas de uma plataforma de streaming de música, como o Spotify.


## Tecnologias utilizadas:

- Java 
- NetBeans
- Swing (GUI)
- PostgreSQL/PG ADMIN
- JDBC
- Git e GitHub


## Organização do Projeto:

O projeto segue a arquitetura MVC
-model
-view
-controller

Tudo é salvo e nenhum dado é perdido ao fechar o programa, pois está ligado a um banco de dados.

## Funções do Spotifei:

- Cadastro e login de usuário
- Busca de músicas por nome, artista ou gênero
- Curtir e descurtir músicas
- Histórico de buscas (últimas 10)
- Visualizar lista de músicas curtidas e descurtidas
- Criação de playlists
- Adição de músicas em playlists
- Visualização de músicas dentro da playlist
- Tela pricipal com acesso a todas funções

# Explicando função por função:

## Cadastro e login de usuário
Permite que novos usuários se registrem no sistema e autentiquem-se com nome de usuário e senha para acesso à plataforma.

## Busca de músicas por nome, artista ou gênero
O usuário pode buscar músicas usando filtros de nome, artista ou gênero. Os resultados aparecem em uma tabela.

## Curtir e descurtir músicas
Abaixo da lista das músicas na tela de busca, aparecem botões de curtida e descurtida.

## Histórico de buscas (últimas 10)
Esta localizada na aba histórico também, aparece ao lado do botão de curtidas e descurtidas, outro botão sobre as ultimas 10 buscas.

## Visualizar lista de músicas curtidas e descurtidas
Esta localizada na aba histórico, aparece um botão de curtidas e outro de descurtidas, após selecionado o botão aparece em uma lista.

## Criação de playlists
O usuário pode criar playlists personalizadas, colocando nome de sua escolha e armazenando diferentes músicas nelas.

## Adição de músicas em playlists
Abaixo da lista das músicas na tela de busca, esta a opção onde você seleciona a música e após selecionada, abre uma nova aba para selecionar a playlist em que deseja adicionar.

## Visualização de músicas dentro da playlist
Na tela de playlist são exibidas todas as playlists do usuário, e nessa tela também é possível selecionar qualquer música para remover de qualquer playlist.

## Tela pricipal com acesso a todas funções
O usuário chega aqui após o login, e aqui está o acesso a todas as telas do sistema, e um botão de voltar a tela de cadastro ou login.
## Navegação entre telas 
Todas as telas com um botão de voltar para a tela anterior, para um perfeito funcionamento do projeto.

# Considerações finais
O Spotifei foi todo documentado no github. Foram usados todos os conceitos aprendidos em aula, como uso e conexão com banco de dados relacional, arquitetura MVC e o desenvolvimento da interface gráfica de todas as telas (SWING).
