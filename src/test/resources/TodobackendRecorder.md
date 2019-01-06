## SvHttp Interaction 0: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: */*
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
Pragma: no-cache
Access-Control-Request-Method: GET
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-us
Content-Length: 0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:58:54 GMT
Connection: close
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## SvHttp Interaction 1: GET /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Pragma: no-cache
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:58:55 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 836
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
[{"uid":"008ae667-4880-4226-9c08-65b0d7f36b1e","title":"blah","order":523,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/008ae667-4880-4226-9c08-65b0d7f36b1e","url":"http://todo-backend-sinatra.herokuapp.com/todos/008ae667-4880-4226-9c08-65b0d7f36b1e"},{"uid":"e320fd81-2443-4d94-9ca2-91ef12d1c59f","title":"blah","order":95,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/e320fd81-2443-4d94-9ca2-91ef12d1c59f","url":"http://todo-backend-sinatra.herokuapp.com/todos/e320fd81-2443-4d94-9ca2-91ef12d1c59f"},{"uid":"0128796a-47ef-477d-b536-087b7a604b0b","title":"blah","order":95,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/0128796a-47ef-477d-b536-087b7a604b0b","url":"http://todo-backend-sinatra.herokuapp.com/todos/0128796a-47ef-477d-b536-087b7a604b0b"}]
```

## SvHttp Interaction 2: POST /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Pragma: no-cache
Content-Length: 18
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"title":"a todo"}
```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:58:55 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/56653d81-3c84-4055-bae8-06b2065f491b
Content-Length: 268
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"a todo","uid":"56653d81-3c84-4055-bae8-06b2065f491b","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/56653d81-3c84-4055-bae8-06b2065f491b","url":"http://todo-backend-sinatra.herokuapp.com/todos/56653d81-3c84-4055-bae8-06b2065f491b"}
```

## SvHttp Interaction 3: DELETE /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Pragma: no-cache
Content-Length: 0
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:58:55 GMT
Content-Length: 0
Connection: keep-alive
Access-Control-Allow-Origin: *
X-Content-Type-Options: nosniff
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## SvHttp Interaction 4: DELETE /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Pragma: no-cache
Content-Length: 0
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:58:55 GMT
Content-Length: 0
Connection: keep-alive
Access-Control-Allow-Origin: *
X-Content-Type-Options: nosniff
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## SvHttp Interaction 5: GET /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Pragma: no-cache
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:58:56 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 2
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
[]
```

## SvHttp Interaction 6: DELETE /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Pragma: no-cache
Content-Length: 0
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:58:56 GMT
Content-Length: 0
Connection: keep-alive
Access-Control-Allow-Origin: *
X-Content-Type-Options: nosniff
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## SvHttp Interaction 7: POST /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Pragma: no-cache
Content-Length: 24
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"title":"walk the dog"}
```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:58:56 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/2b382aa3-caaf-4eaa-91df-a9bc49a59d10
Content-Length: 274
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"walk the dog","uid":"2b382aa3-caaf-4eaa-91df-a9bc49a59d10","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/2b382aa3-caaf-4eaa-91df-a9bc49a59d10","url":"http://todo-backend-sinatra.herokuapp.com/todos/2b382aa3-caaf-4eaa-91df-a9bc49a59d10"}
```

## SvHttp Interaction 8: GET /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Pragma: no-cache
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:58:56 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 286
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
[{"uid":"2b382aa3-caaf-4eaa-91df-a9bc49a59d10","title":"walk the dog","order":0,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/2b382aa3-caaf-4eaa-91df-a9bc49a59d10","url":"http://todo-backend-sinatra.herokuapp.com/todos/2b382aa3-caaf-4eaa-91df-a9bc49a59d10"}]
```

## SvHttp Interaction 9: DELETE /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Pragma: no-cache
Content-Length: 0
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:58:56 GMT
Content-Length: 0
Connection: keep-alive
Access-Control-Allow-Origin: *
X-Content-Type-Options: nosniff
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## SvHttp Interaction 10: POST /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Pragma: no-cache
Content-Length: 16
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"title":"blah"}
```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:58:56 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/d26bc5dd-51ce-4a2d-926d-53cb12680e81
Content-Length: 266
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"blah","uid":"d26bc5dd-51ce-4a2d-926d-53cb12680e81","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/d26bc5dd-51ce-4a2d-926d-53cb12680e81","url":"http://todo-backend-sinatra.herokuapp.com/todos/d26bc5dd-51ce-4a2d-926d-53cb12680e81"}
```

## SvHttp Interaction 11: GET /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Pragma: no-cache
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:58:56 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 278
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
[{"uid":"d26bc5dd-51ce-4a2d-926d-53cb12680e81","title":"blah","order":0,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/d26bc5dd-51ce-4a2d-926d-53cb12680e81","url":"http://todo-backend-sinatra.herokuapp.com/todos/d26bc5dd-51ce-4a2d-926d-53cb12680e81"}]
```

## SvHttp Interaction 12: DELETE /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Pragma: no-cache
Content-Length: 0
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:58:57 GMT
Content-Length: 0
Connection: keep-alive
Access-Control-Allow-Origin: *
X-Content-Type-Options: nosniff
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## SvHttp Interaction 13: POST /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Pragma: no-cache
Content-Length: 16
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"title":"blah"}
```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:58:57 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/dafb52a5-2752-4e5b-a8c9-157571271072
Content-Length: 266
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"blah","uid":"dafb52a5-2752-4e5b-a8c9-157571271072","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/dafb52a5-2752-4e5b-a8c9-157571271072","url":"http://todo-backend-sinatra.herokuapp.com/todos/dafb52a5-2752-4e5b-a8c9-157571271072"}
```

## SvHttp Interaction 14: GET /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Pragma: no-cache
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:58:57 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 278
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
[{"uid":"dafb52a5-2752-4e5b-a8c9-157571271072","title":"blah","order":0,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/dafb52a5-2752-4e5b-a8c9-157571271072","url":"http://todo-backend-sinatra.herokuapp.com/todos/dafb52a5-2752-4e5b-a8c9-157571271072"}]
```

## SvHttp Interaction 15: DELETE /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Pragma: no-cache
Content-Length: 0
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:58:57 GMT
Content-Length: 0
Connection: keep-alive
Access-Control-Allow-Origin: *
X-Content-Type-Options: nosniff
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## SvHttp Interaction 16: POST /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Pragma: no-cache
Content-Length: 19
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"title":"my todo"}
```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:58:57 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/02c6ae01-1675-41f5-8ef6-6b99312fbd03
Content-Length: 269
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"my todo","uid":"02c6ae01-1675-41f5-8ef6-6b99312fbd03","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/02c6ae01-1675-41f5-8ef6-6b99312fbd03","url":"http://todo-backend-sinatra.herokuapp.com/todos/02c6ae01-1675-41f5-8ef6-6b99312fbd03"}
```

## SvHttp Interaction 17: DELETE /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Pragma: no-cache
Content-Length: 0
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:58:58 GMT
Content-Length: 0
Connection: keep-alive
Access-Control-Allow-Origin: *
X-Content-Type-Options: nosniff
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## SvHttp Interaction 18: POST /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Pragma: no-cache
Content-Length: 26
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"title":"todo the first"}
```

## SvHttp Interaction 18: POST /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Pragma: no-cache
Content-Length: 27
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"title":"todo the second"}
```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:58:58 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/4b18bac2-8ce3-4171-8261-d1e6e9d81a8d
Content-Length: 276
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"todo the first","uid":"4b18bac2-8ce3-4171-8261-d1e6e9d81a8d","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/4b18bac2-8ce3-4171-8261-d1e6e9d81a8d","url":"http://todo-backend-sinatra.herokuapp.com/todos/4b18bac2-8ce3-4171-8261-d1e6e9d81a8d"}
```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:58:58 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/40bed58b-a69e-46a3-8daa-396cb6077043
Content-Length: 277
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"todo the second","uid":"40bed58b-a69e-46a3-8daa-396cb6077043","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/40bed58b-a69e-46a3-8daa-396cb6077043","url":"http://todo-backend-sinatra.herokuapp.com/todos/40bed58b-a69e-46a3-8daa-396cb6077043"}
```

## SvHttp Interaction 20: GET /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Pragma: no-cache
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:58:58 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 576
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
[{"uid":"4b18bac2-8ce3-4171-8261-d1e6e9d81a8d","title":"todo the first","order":0,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/4b18bac2-8ce3-4171-8261-d1e6e9d81a8d","url":"http://todo-backend-sinatra.herokuapp.com/todos/4b18bac2-8ce3-4171-8261-d1e6e9d81a8d"},{"uid":"40bed58b-a69e-46a3-8daa-396cb6077043","title":"todo the second","order":0,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/40bed58b-a69e-46a3-8daa-396cb6077043","url":"http://todo-backend-sinatra.herokuapp.com/todos/40bed58b-a69e-46a3-8daa-396cb6077043"}]
```

## SvHttp Interaction 21: DELETE /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Pragma: no-cache
Content-Length: 0
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:58:59 GMT
Content-Length: 0
Connection: keep-alive
Access-Control-Allow-Origin: *
X-Content-Type-Options: nosniff
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## SvHttp Interaction 22: POST /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Pragma: no-cache
Content-Length: 25
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"title":"initial title"}
```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:58:59 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/33086d5d-08ef-4eb3-ba32-e2ce8f8bf05f
Content-Length: 275
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"initial title","uid":"33086d5d-08ef-4eb3-ba32-e2ce8f8bf05f","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/33086d5d-08ef-4eb3-ba32-e2ce8f8bf05f","url":"http://todo-backend-sinatra.herokuapp.com/todos/33086d5d-08ef-4eb3-ba32-e2ce8f8bf05f"}
```

## SvHttp Interaction 23: DELETE /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Pragma: no-cache
Content-Length: 0
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:58:59 GMT
Content-Length: 0
Connection: keep-alive
Access-Control-Allow-Origin: *
X-Content-Type-Options: nosniff
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## SvHttp Interaction 24: POST /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Pragma: no-cache
Content-Length: 16
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"title":"blah"}
```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:59:00 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/d57e4b76-80e0-4d9d-9f93-9009de769426
Content-Length: 266
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"blah","uid":"d57e4b76-80e0-4d9d-9f93-9009de769426","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/d57e4b76-80e0-4d9d-9f93-9009de769426","url":"http://todo-backend-sinatra.herokuapp.com/todos/d57e4b76-80e0-4d9d-9f93-9009de769426"}
```

## SvHttp Interaction 25: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: */*
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
Pragma: no-cache
Access-Control-Request-Method: DELETE
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-us
Content-Length: 0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:59:00 GMT
Connection: close
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## SvHttp Interaction 26: DELETE /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Pragma: no-cache
Content-Length: 0
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:59:00 GMT
Content-Length: 0
Connection: keep-alive
Access-Control-Allow-Origin: *
X-Content-Type-Options: nosniff
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## SvHttp Interaction 27: POST /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Pragma: no-cache
Content-Length: 16
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"title":"blah"}
```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:59:00 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/d4aba8f1-d08e-4457-b8fd-834def4896d4
Content-Length: 266
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"blah","uid":"d4aba8f1-d08e-4457-b8fd-834def4896d4","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/d4aba8f1-d08e-4457-b8fd-834def4896d4","url":"http://todo-backend-sinatra.herokuapp.com/todos/d4aba8f1-d08e-4457-b8fd-834def4896d4"}
```

## SvHttp Interaction 28: GET /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Pragma: no-cache
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:59:01 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 286
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
[{"uid":"d4aba8f1-d08e-4457-b8fd-834def4896d4","title":"changed title","order":0,"completed":true,"href":"http://todo-backend-sinatra.herokuapp.com/todos/d4aba8f1-d08e-4457-b8fd-834def4896d4","url":"http://todo-backend-sinatra.herokuapp.com/todos/d4aba8f1-d08e-4457-b8fd-834def4896d4"}]
```

## SvHttp Interaction 29: DELETE /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Pragma: no-cache
Content-Length: 0
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:59:01 GMT
Content-Length: 0
Connection: keep-alive
Access-Control-Allow-Origin: *
X-Content-Type-Options: nosniff
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## SvHttp Interaction 30: POST /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Pragma: no-cache
Content-Length: 16
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"title":"blah"}
```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:59:01 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/934482ab-d618-4205-801a-ae460a24eb15
Content-Length: 266
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"blah","uid":"934482ab-d618-4205-801a-ae460a24eb15","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/934482ab-d618-4205-801a-ae460a24eb15","url":"http://todo-backend-sinatra.herokuapp.com/todos/934482ab-d618-4205-801a-ae460a24eb15"}
```

## SvHttp Interaction 31: GET /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Pragma: no-cache
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:59:02 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 2
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
[]
```

## SvHttp Interaction 32: POST /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Pragma: no-cache
Content-Length: 28
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"title":"blah","order":523}
```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:59:02 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/d8182e46-fecc-45e9-b295-865c8465b7c1
Content-Length: 278
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"blah","order":523,"uid":"d8182e46-fecc-45e9-b295-865c8465b7c1","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/d8182e46-fecc-45e9-b295-865c8465b7c1","url":"http://todo-backend-sinatra.herokuapp.com/todos/d8182e46-fecc-45e9-b295-865c8465b7c1"}
```

## SvHttp Interaction 33: POST /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Pragma: no-cache
Content-Length: 27
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"order":10,"title":"blah"}
```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:59:02 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/ba3d4699-2639-4ac7-883c-84f18445ad8f
Content-Length: 277
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"order":10,"title":"blah","uid":"ba3d4699-2639-4ac7-883c-84f18445ad8f","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/ba3d4699-2639-4ac7-883c-84f18445ad8f","url":"http://todo-backend-sinatra.herokuapp.com/todos/ba3d4699-2639-4ac7-883c-84f18445ad8f"}
```

## SvHttp Interaction 34: POST /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Pragma: no-cache
Content-Length: 27
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"order":10,"title":"blah"}
```

### Resulting headers back from the real server:

```
Date: Sun, 06 Jan 2019 08:59:02 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/39c9b9bc-ba7a-4bc0-9be5-695ac76e431f
Content-Length: 277
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"order":10,"title":"blah","uid":"39c9b9bc-ba7a-4bc0-9be5-695ac76e431f","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/39c9b9bc-ba7a-4bc0-9be5-695ac76e431f","url":"http://todo-backend-sinatra.herokuapp.com/todos/39c9b9bc-ba7a-4bc0-9be5-695ac76e431f"}
```

