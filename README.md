# Feign Client

## Por que usar Feign Client?
Quando usamos evitamos duplicidaade de código e também conseguimos escalar mais facilmente as aplicações e suas chamadas REST de outras APIs. É algo extremamente útil, pricipalmente em grandes aplicações em que precisamos cruzar dados de APIs externas.
Por exemplo, este repositório contém uma aplicação que disponibiliza alguns endpoints. Em um desses endpoints, o usuário coloca seu CEP e é forncecido um JSON com informações sobre o COVID na sua área. Nesse exemplo específico, são usadas duas chamadas REST via Feign Client. Os dados são cruzados e é fornecida a informação.

### Package Feign
Nesse package está a classe onde é criada a interface com a anotação @FeignClient. Nela irão as configurações de conexão com a API externa.
https://github.com/fred1895/feign-example/tree/master/src/main/java/io/fred1895/github/feigncovid/feign

### Package Services
Nesse package estão as classes onde são aplicadas as regras de negócio, chamando as classes do package feign. 
https://github.com/fred1895/feign-example/tree/master/src/main/java/io/fred1895/github/feigncovid/services

### Package Controller
Aqui estão as clases que disponibilizam endpoints e chama as classes de serviço que aplicam a regra de negócio.
https://github.com/fred1895/feign-example/tree/master/src/main/java/io/fred1895/github/feigncovid/controller
