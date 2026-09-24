# TDE 1 - Padrões de Projeto

Equipe: Julio Cesar, Gilberto Barros e Mateus Gabriel

## Atividade 1 - Princípio da Responsabilidade Única (SRP)

A classe `Usuario` tinha duas responsabilidades: guardar os dados do usuário e fazer a autenticação. Com isso ela tinha dois motivos para mudar, um se o cadastro mudasse e outro se a regra de login mudasse.

Para resolver, separamos em duas classes:

- `Usuario`: guarda nome, email e senha.
- `AutenticadorService`: faz a autenticação. Confere a senha e, se estiver correta, simula o sucesso com 90% de chance, como pede o enunciado.

O `getSenha()` ficou sem `public`, então só as classes do mesmo pacote conseguem acessar a senha.

A `Main` testa a autenticação cinco vezes com a senha correta, para mostrar os 90%, e uma vez com a senha errada.

## Atividade 2 - Sistema de notificações

O `ServicoNotificacao` original usava `if/else` para decidir entre e-mail e SMS e tinha a lógica de envio dentro dele. Para adicionar um canal novo seria preciso modificar a classe.

O que fizemos:

- SRP: o `ServicoNotificacao` agora só coordena o envio. Ele recebe um canal pelo construtor e repassa a mensagem.
- Interface e polimorfismo: criamos a interface `CanalNotificacao` com o método `enviar(String mensagem)`.
- OCP: cada canal é uma classe separada (`NotificacaoEmail`, `NotificacaoSMS`). Adicionamos a `NotificacaoTelegram` sem alterar o `ServicoNotificacao`.
- Encapsulamento: a classe abstrata `Notificacao` implementa a interface e valida a mensagem antes de enviar. Se ela estiver vazia ou nula, lança `IllegalArgumentException`. Os canais herdam dela e só implementam o próprio envio, assim a validação fica em um lugar só.

A `Main` envia uma mensagem por cada canal e depois testa o envio de mensagem vazia e nula.

## Como executar

Abrir a pasta `atividade1` ou `atividade2` no IntelliJ e rodar a classe `Main`.
