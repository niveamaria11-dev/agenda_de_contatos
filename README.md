# Agenda de Contatos — Evolução do Armazenamento de Dados

Este repositório documenta a evolução guiada do projeto **Agenda de Contatos**, utilizado como material de apoio na disciplina de **Programação Orientada a Objetos (POO)** do **IFCE - campus Maranguape**, sob a coordenação do **Dr. Róger Moura Sarmento**.

O objetivo central desta etapa é focar exclusivamente na **evolução das formas de armazenamento de dados** no ecossistema Java. Antes de avançar para a criação de classes customizadas, métodos isolados ou conceitos como encapsulamento, o estudante aprende a analisar o impacto de estruturas estáticas versus dinâmicas diretamente no escopo de execução.

---

## 🗺️ Mapa da Evolução de Armazenamento

Para facilitar a comparação direta (quase linha por linha do código), a arquitetura base do programa permanece intocada: tudo se desenvolve dentro de um único método `main()`, controlado por um laço `while`, um menu `switch-case` e entradas via `Scanner`.

| Versão | Tipo de Armazenamento | Conceitos Praticados | Limitação / Problema Gerado |
| :--- | :--- | :--- | :--- |
| **V.0.0.0** | Variáveis simples (`String`) | Variáveis, Scanner, Controle de fluxo linear | Armazena apenas 1 contato; novas inserções sobrescrevem o registro anterior. |
| **V.0.1.0** | Arrays Estáticos (`String[]`) | Vetores, índices, tamanhos fixos, loops com `for` | Capacidade rígida (ex: 5 contatos). Exige controle manual de índices e reposicionamento de elementos na exclusão. |
| **V.0.2.0** | Coleções Dinâmicas (`List` + `ArrayList`) | Interfaces de Coleções, métodos `.add()`, `.get()`, `.remove()`, `.size()` | Permite gerenciamento elástico e infinito de dados, eliminando contadores manuais. |

---

## 📑 Cronograma das Novas Etapas (Fases Pedagógicas)

O roteiro atual expande o aprendizado através de **17 novas etapas sequenciais**, divididas em duas fases fundamentais:

### Phase 1: A Era dos Arrays Estáticos (V.0.1.0)
* **Etapa 1:** Substituição das variáveis primitivas de texto por arrays (`String[]`).
* **Etapa 2:** Definição e compreensão de uma `capacidade = 5` fixa para a memória do sistema.
* **Etapa 3:** Introdução da variável `quantidade` para rastrear o índice da próxima inserção disponível.
* **Etapa 4:** Adaptação da entrada de dados para escrita coordenada por índices.
* **Etapa 5:** Varredura estruturada com `for` (usando `i < quantidade`) para exibição limpa dos registros ativos.
* **Etapa 6:** Mecanismo de busca linear comparando queries textuais em todas as posições preenchidas.
* **Etapa 7:** **O Desafio da Exclusão:** Gerenciamento de lacunas em arrays, forçando o deslocamento de elementos subsequentes para a esquerda para evitar "buracos" na memória.
* **Etapa 8:** Tratamento preventivo de transbordamento de pilha lançando alertas ao atingir o limite estático (`ArrayIndexOutOfBoundsException`).
* **Etapa 9:** Consolidação, revisão e fechamento da versão sob a Tag `V.0.1.0`.

### Phase 2: A Conveniência das Coleções (V.0.2.0)
* **Etapas 10 e 11:** Importação de pacotes e refatoração completa dos arrays para `List<String> = new ArrayList<>()`.
* **Etapa 12:** Simplificação do cadastro substituindo a indexação manual pelo método nativo `.add()`.
* **Etapa 13:** Exibição dinâmica parametrizada com métodos de conveniência `.size()` e `.get(i)`.
* **Etapa 14:** Busca textual simplificada em listas dinâmicas.
* **Etapa 15:** Eliminação completa da rotina complexa de deslocamento de memória na exclusão através do uso direto do `.remove(i)`.
* **Etapa 16:** Limpeza de código morto (exclusão de variáveis de controle manuais e checagem de armazenamento cheio).
* **Etapa 17:** Versionamento final e publicação da Tag `V.0.2.0`.

---

## 🧠 Aprendizado Prático Destacado

Ao concluir este ciclo de atividades, o estudante adquire a percepção empírica de engenharia de software de que **uma coleção dinâmica (Listas, Pilhas, Filas) resolve complexidades de infraestrutura de memória de baixo nível** que os arrays tradicionais impõem ao desenvolvedor.
