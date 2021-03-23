Приложение может запускаться через докер(бд и приложение находятся в разных контейнерах).


Для того, чтобы запустить приложение используя docker-compose, нам нужно перейти в папку ***src/main/docker/***  открыть консоль и написать : __docker-compose up__


После запуска проверить работоспособность можно отправив GET запрос по адресу: http://localhost:8090/api/
В ответе будет два объекта с полями
*id, owner, object, start, finish, coverageOptions*


Также можно отправить POST запрос по адресу: http://localhost:8090/api/


Пример тела запроса:
```json{
"owner":"second",
"start":"2021-03-19",
"finish":"2024-03-19",
"object": "house",
"coverageOptions": [
    { "option": "FULL"},
    { "option": "COLLISION"}
    ]
}
```
Прошу обратить внимание на coverageOptions там всегда минимум два объекта(проверка происходит в **PolicyServiceImpl**)  
Ещё одна проверка в **PolicyServiceImpl** касается полей *start* и *finish* .   
Дата *start* должна быть позднее, чем *finish* .  
Поля должны быть выбраны из списка: __COLLISION, COMPREHENSIVE, FULL, MINIMUM__