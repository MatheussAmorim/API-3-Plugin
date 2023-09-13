# API-3-PLUGIN
## **Descrição**

Projeto de um PLUGIN desenvolvido em Groovy on Grails, que fornece a utilidade de salvar os logs em tabela das requisições REST efetuadas.

# **Pré-requisitos**
Antes de executar a API, certifique-se de ter o seguinte instalado em sua máquina:

* **[Grails](https://grails.org/download.html)** (versão 5.3.2 ou superior)
* **[Java Development Kit (JDK)](https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html)** (versão 8 ou 11)

Set as variáveis de ambiente`GRAILS_HOME` apontando para o diretório de instalação do Grails.

Adicione `%GRAILS_HOME%\bin;%JAVA_HOME%\bin` ao final da variável PATH.
# Utilização

Dentro da pasta do projeto, execute o seguinte comando no terminal para publicar o plugin
localmente:

`./gradlew publishToMavenLocal`

Após isso adicione o plugin como dependência ao projeto, faça as seguintes alterações no
`build.gradle`:

```
// Adicionar o repositório local a lista de respositórios
repositories {
    mavenLocal() // <- Adicione essa linha
// ...
}
// ...
// Adicione a dependência do api3-plugin
dependencies {
    implementation "api3.plugin:api3-plugin:0.1"
// ...
}
```

Exemplo declaração:

```
//logService(LocalDate, String)
LogService logService

def respJsonString = resp.json.toString()
logService.salvarLog(LocalDate.now(), respJsonString )
```
