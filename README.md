# Microwave Heating Modes

Этот проект демонстрирует использование Spring Boot для управления режимами нагрева в микроволновой печи.

## Запуск проекта

1. Клонируйте репозиторий
2. Настройте базу данных в `application.properties`
3. Запустите приложение:

```bash
mvn spring-boot:run
```

4. Доступ к API можно получить через Swagger по адресу `http://localhost:8080/swagger-ui/`.

## API Endpoints

### Получить все режимы нагрева

```http
GET /api/heating/all
```

### Начать режим нагрева

```http
POST /api/heating/start?modeId={modeId}
```