# Feign Client

## Por que usar Feign Client?
Quando usamos evitamos duplicidaade de código e também conseguimos escalar mais facilmente as aplicações e suas chamadas REST de outras APIs. É algo extremamente útil, pricipalmente em grandes aplicações em que precisamos cruzar dados de APIs externas.
Por exemplo, este repositório contém uma aplicação que disponibiliza alguns endpoints. Em um desses endpoints, o usuário coloca seu CEP e é forncecido um JSON com informações sobre o COVID na sua área. Nesse exemplo específico, são usadas duas chamadas REST via Feign Client. Os dados são cruzados e é fornecida a informação.

