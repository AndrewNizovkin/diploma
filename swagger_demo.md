## Приложение C. Swagger.
Swagger – это инструмент, который помогает разработчикам создавать, документировать и проверять API. API – это набор правил и протоколов, которые позволяют различным системам обмениваться информацией между собой.

Запустим приложение и выполним в браузере запрос:

```html
localhost:8080/swagger-ui/index.html
```

Результат запроса:

![swagger-1](./images/swagger-1.png)
![swagger-2](./images/swagger-2.png)

Графический интерфейс Swagger предоставляет возможность не только в интерактивном режиме изучать спецификацию Rest Full Api, но и отправлять запросы.

![swagger-3](./images/swagger-3.png)

Изучаем схему:

![swagger-4](./images/swagger-4.png)

Выполним POST-запрос на добавление нового пункта:

![swagger-5](./images/swagger-5.png)

Выполним GET-запрос на получение пункта с несуществующим ID:

![swagger-6](./images/swagger-6.png)


Для получение JSON-спецификации выполним в браузере запрос:

```html
http://localhost:8080/v3/api-docs
```

Результат запроса:

![swagger-7](./images/swagger-7.png)

Полную спецификацию можно просмотреть, перейдя по [ссылке](https://github.com/AndrewNizovkin/diploma/blob/main/open_api.md)
