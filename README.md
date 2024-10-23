# Projeto iPhone 2007

Este projeto simula as funcionalidades básicas de um iPhone 2007, implementando interfaces para um reprodutor musical, um aparelho telefônico e um navegador de internet.

## Funcionalidades

### Reprodutor Musical

- Tocar música
- Pausar música
- Selecionar música

### Aparelho Telefônico

- Ligar para um número
- Atender chamada
- Iniciar correio de voz

### Navegador de Internet

- Exibir página
- Adicionar nova aba
- Atualizar página

# Diagrama UML do Componente iPhone

Este diagrama representa as funcionalidades principais do iPhone, incluindo as interfaces para Reprodutor Musical, Aparelho Telefônico e Navegador de Internet.

```mermaid
classDiagram
    class iphone

    iphone --|> ReprodutorMusical
    iphone --|> AparelhoTelefonico
    iphone --|> NavegadorInternet

    class ReprodutorMusical {
      +tocar()
      +pausar()
      +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
      +ligar(String numero)
      +atender()
      +iniciarCorreioVoz()
    }

    class NavegadorInternet {
      +exibirPagina(String url)
      +adicionarNovaAba()
      +atualizarPagina()
    }


## Licença

Este projeto está licenciado sob a licença MIT.
```
