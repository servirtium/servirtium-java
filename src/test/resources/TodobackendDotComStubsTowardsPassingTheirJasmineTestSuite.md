## Interaction 0: GET /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Cookie: Webstorm-83fc7c3a=328bd980-db39-4ff1-b428-4a2de37a062c; __utma=111872281.305267849.1471227400.1493602468.1505656390.3
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.2 Safari/605.1.15
Connection: keep-alive
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

## Interaction 0: OPTIONS /todos

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
Date: Mon, 07 Jan 2019 11:09:15 GMT
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

## Interaction 1: GET /todos

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
Date: Mon, 07 Jan 2019 11:09:15 GMT
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
[{"uid":"855d9a23-d2cc-48d0-a5e1-dcbbbc11d64f","title":"blah","order":523,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/855d9a23-d2cc-48d0-a5e1-dcbbbc11d64f","url":"http://todo-backend-sinatra.herokuapp.com/todos/855d9a23-d2cc-48d0-a5e1-dcbbbc11d64f"},{"uid":"d4a68d0e-3940-4646-9384-c9b966b31200","title":"blah","order":95,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/d4a68d0e-3940-4646-9384-c9b966b31200","url":"http://todo-backend-sinatra.herokuapp.com/todos/d4a68d0e-3940-4646-9384-c9b966b31200"},{"uid":"d1bffec5-2ba5-4fe4-a8d1-9629711613d3","title":"blah","order":95,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/d1bffec5-2ba5-4fe4-a8d1-9629711613d3","url":"http://todo-backend-sinatra.herokuapp.com/todos/d1bffec5-2ba5-4fe4-a8d1-9629711613d3"}]
```

## Interaction 2: POST /todos

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
Date: Mon, 07 Jan 2019 11:09:15 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/0fe2698f-6f03-417c-992f-420b088de878
Content-Length: 268
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"a todo","uid":"0fe2698f-6f03-417c-992f-420b088de878","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/0fe2698f-6f03-417c-992f-420b088de878","url":"http://todo-backend-sinatra.herokuapp.com/todos/0fe2698f-6f03-417c-992f-420b088de878"}
```

## Interaction 3: DELETE /todos

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
Date: Mon, 07 Jan 2019 11:09:15 GMT
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
[{"uid":"855d9a23-d2cc-48d0-a5e1-dcbbbc11d64f","title":"blah","order":523,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/855d9a23-d2cc-48d0-a5e1-dcbbbc11d64f","url":"http://todo-backend-sinatra.herokuapp.com/todos/855d9a23-d2cc-48d0-a5e1-dcbbbc11d64f"},{"uid":"d4a68d0e-3940-4646-9384-c9b966b31200","title":"blah","order":95,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/d4a68d0e-3940-4646-9384-c9b966b31200","url":"http://todo-backend-sinatra.herokuapp.com/todos/d4a68d0e-3940-4646-9384-c9b966b31200"},{"uid":"d1bffec5-2ba5-4fe4-a8d1-9629711613d3","title":"blah","order":95,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/d1bffec5-2ba5-4fe4-a8d1-9629711613d3","url":"http://todo-backend-sinatra.herokuapp.com/todos/d1bffec5-2ba5-4fe4-a8d1-9629711613d3"}]
```

### Resulting headers back from the real server:

```
Date: Mon, 07 Jan 2019 11:09:15 GMT
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

## Interaction 5: DELETE /todos

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
Date: Mon, 07 Jan 2019 11:09:15 GMT
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

## Interaction 6: GET /todos

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
Date: Mon, 07 Jan 2019 11:09:16 GMT
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

## Interaction 7: DELETE /todos

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
Date: Mon, 07 Jan 2019 11:09:16 GMT
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

## Interaction 8: POST /todos

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
Date: Mon, 07 Jan 2019 11:09:16 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/b2f6fbc3-5187-4daa-a1d1-827d5802eb95
Content-Length: 274
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"walk the dog","uid":"b2f6fbc3-5187-4daa-a1d1-827d5802eb95","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/b2f6fbc3-5187-4daa-a1d1-827d5802eb95","url":"http://todo-backend-sinatra.herokuapp.com/todos/b2f6fbc3-5187-4daa-a1d1-827d5802eb95"}
```

## Interaction 9: GET /todos

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
Date: Mon, 07 Jan 2019 11:09:16 GMT
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
[{"uid":"b2f6fbc3-5187-4daa-a1d1-827d5802eb95","title":"walk the dog","order":0,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/b2f6fbc3-5187-4daa-a1d1-827d5802eb95","url":"http://todo-backend-sinatra.herokuapp.com/todos/b2f6fbc3-5187-4daa-a1d1-827d5802eb95"}]
```

## Interaction 10: DELETE /todos

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
Date: Mon, 07 Jan 2019 11:09:16 GMT
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

## Interaction 11: POST /todos

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
Date: Mon, 07 Jan 2019 11:09:17 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/03cc9fe5-2d07-4bde-b263-0f99e064b1ac
Content-Length: 266
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"blah","uid":"03cc9fe5-2d07-4bde-b263-0f99e064b1ac","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/03cc9fe5-2d07-4bde-b263-0f99e064b1ac","url":"http://todo-backend-sinatra.herokuapp.com/todos/03cc9fe5-2d07-4bde-b263-0f99e064b1ac"}
```

## Interaction 12: GET /todos

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
Date: Mon, 07 Jan 2019 11:09:17 GMT
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
[{"uid":"03cc9fe5-2d07-4bde-b263-0f99e064b1ac","title":"blah","order":0,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/03cc9fe5-2d07-4bde-b263-0f99e064b1ac","url":"http://todo-backend-sinatra.herokuapp.com/todos/03cc9fe5-2d07-4bde-b263-0f99e064b1ac"}]
```

## Interaction 13: DELETE /todos

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
Date: Mon, 07 Jan 2019 11:09:17 GMT
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

## Interaction 14: POST /todos

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
Date: Mon, 07 Jan 2019 11:09:17 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/39bfb409-eb0b-4a4e-af57-58eedc89fb80
Content-Length: 266
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"blah","uid":"39bfb409-eb0b-4a4e-af57-58eedc89fb80","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/39bfb409-eb0b-4a4e-af57-58eedc89fb80","url":"http://todo-backend-sinatra.herokuapp.com/todos/39bfb409-eb0b-4a4e-af57-58eedc89fb80"}
```

## Interaction 15: GET /todos

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
Date: Mon, 07 Jan 2019 11:09:18 GMT
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
[{"uid":"39bfb409-eb0b-4a4e-af57-58eedc89fb80","title":"blah","order":0,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/39bfb409-eb0b-4a4e-af57-58eedc89fb80","url":"http://todo-backend-sinatra.herokuapp.com/todos/39bfb409-eb0b-4a4e-af57-58eedc89fb80"}]
```

## Interaction 16: DELETE /todos

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
Date: Mon, 07 Jan 2019 11:09:18 GMT
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

## Interaction 17: POST /todos

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
Date: Mon, 07 Jan 2019 11:09:18 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/d633f6ed-a4aa-4204-b4b2-7086120b8976
Content-Length: 269
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"my todo","uid":"d633f6ed-a4aa-4204-b4b2-7086120b8976","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/d633f6ed-a4aa-4204-b4b2-7086120b8976","url":"http://todo-backend-sinatra.herokuapp.com/todos/d633f6ed-a4aa-4204-b4b2-7086120b8976"}
```

## Interaction 18: DELETE /todos

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
Date: Mon, 07 Jan 2019 11:09:19 GMT
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

## Interaction 19: POST /todos

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

## Interaction 19: POST /todos

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
Date: Mon, 07 Jan 2019 11:09:19 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/fada804c-4f19-4298-bd24-85a30a438736
Content-Length: 277
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"todo the second","uid":"fada804c-4f19-4298-bd24-85a30a438736","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/fada804c-4f19-4298-bd24-85a30a438736","url":"http://todo-backend-sinatra.herokuapp.com/todos/fada804c-4f19-4298-bd24-85a30a438736"}
```

### Resulting headers back from the real server:

```
Date: Mon, 07 Jan 2019 11:09:19 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/5690da73-ac5c-4e0f-bd2e-d63c02399273
Content-Length: 276
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"todo the first","uid":"5690da73-ac5c-4e0f-bd2e-d63c02399273","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/5690da73-ac5c-4e0f-bd2e-d63c02399273","url":"http://todo-backend-sinatra.herokuapp.com/todos/5690da73-ac5c-4e0f-bd2e-d63c02399273"}
```

## Interaction 21: GET /todos

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
Date: Mon, 07 Jan 2019 11:09:19 GMT
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
[{"uid":"5690da73-ac5c-4e0f-bd2e-d63c02399273","title":"todo the first","order":0,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/5690da73-ac5c-4e0f-bd2e-d63c02399273","url":"http://todo-backend-sinatra.herokuapp.com/todos/5690da73-ac5c-4e0f-bd2e-d63c02399273"},{"uid":"fada804c-4f19-4298-bd24-85a30a438736","title":"todo the second","order":0,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/fada804c-4f19-4298-bd24-85a30a438736","url":"http://todo-backend-sinatra.herokuapp.com/todos/fada804c-4f19-4298-bd24-85a30a438736"}]
```

## Interaction 22: OPTIONS /todos

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
Date: Mon, 07 Jan 2019 11:09:20 GMT
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

## Interaction 23: DELETE /todos

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
Date: Mon, 07 Jan 2019 11:09:20 GMT
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

## Interaction 24: POST /todos

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
Date: Mon, 07 Jan 2019 11:09:20 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/66b6fe62-6247-4942-906e-528bb03062f8
Content-Length: 275
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"initial title","uid":"66b6fe62-6247-4942-906e-528bb03062f8","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/66b6fe62-6247-4942-906e-528bb03062f8","url":"http://todo-backend-sinatra.herokuapp.com/todos/66b6fe62-6247-4942-906e-528bb03062f8"}
```

## Interaction 25: DELETE /todos

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
Date: Mon, 07 Jan 2019 11:09:21 GMT
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

## Interaction 26: POST /todos

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
Date: Mon, 07 Jan 2019 11:09:21 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/b03ed406-a3fc-4d1d-a7aa-b8b14abb05f0
Content-Length: 266
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"blah","uid":"b03ed406-a3fc-4d1d-a7aa-b8b14abb05f0","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/b03ed406-a3fc-4d1d-a7aa-b8b14abb05f0","url":"http://todo-backend-sinatra.herokuapp.com/todos/b03ed406-a3fc-4d1d-a7aa-b8b14abb05f0"}
```

## Interaction 27: DELETE /todos

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
Date: Mon, 07 Jan 2019 11:09:21 GMT
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

## Interaction 28: POST /todos

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
Date: Mon, 07 Jan 2019 11:09:21 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/a9d15325-da0f-4b0e-b37a-d531e8f2f4a0
Content-Length: 266
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"blah","uid":"a9d15325-da0f-4b0e-b37a-d531e8f2f4a0","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/a9d15325-da0f-4b0e-b37a-d531e8f2f4a0","url":"http://todo-backend-sinatra.herokuapp.com/todos/a9d15325-da0f-4b0e-b37a-d531e8f2f4a0"}
```

## Interaction 29: GET /todos

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
Date: Mon, 07 Jan 2019 11:09:22 GMT
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
[{"uid":"a9d15325-da0f-4b0e-b37a-d531e8f2f4a0","title":"changed title","order":0,"completed":true,"href":"http://todo-backend-sinatra.herokuapp.com/todos/a9d15325-da0f-4b0e-b37a-d531e8f2f4a0","url":"http://todo-backend-sinatra.herokuapp.com/todos/a9d15325-da0f-4b0e-b37a-d531e8f2f4a0"}]
```

## Interaction 30: DELETE /todos

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
Date: Mon, 07 Jan 2019 11:09:22 GMT
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

## Interaction 31: POST /todos

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
Date: Mon, 07 Jan 2019 11:09:22 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/7cf7cd67-45e1-4010-82c5-a5f0b41141b3
Content-Length: 266
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"blah","uid":"7cf7cd67-45e1-4010-82c5-a5f0b41141b3","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/7cf7cd67-45e1-4010-82c5-a5f0b41141b3","url":"http://todo-backend-sinatra.herokuapp.com/todos/7cf7cd67-45e1-4010-82c5-a5f0b41141b3"}
```

## Interaction 32: GET /todos

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
Date: Mon, 07 Jan 2019 11:09:23 GMT
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

## Interaction 33: POST /todos

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
Date: Mon, 07 Jan 2019 11:09:23 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/38473f29-42e3-4150-8e0d-dc6703a5cac6
Content-Length: 278
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"blah","order":523,"uid":"38473f29-42e3-4150-8e0d-dc6703a5cac6","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/38473f29-42e3-4150-8e0d-dc6703a5cac6","url":"http://todo-backend-sinatra.herokuapp.com/todos/38473f29-42e3-4150-8e0d-dc6703a5cac6"}
```

## Interaction 34: POST /todos

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
Date: Mon, 07 Jan 2019 11:09:23 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/4c1326a2-521a-4c21-bfeb-076e00e9c63f
Content-Length: 277
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"order":10,"title":"blah","uid":"4c1326a2-521a-4c21-bfeb-076e00e9c63f","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/4c1326a2-521a-4c21-bfeb-076e00e9c63f","url":"http://todo-backend-sinatra.herokuapp.com/todos/4c1326a2-521a-4c21-bfeb-076e00e9c63f"}
```

## Interaction 35: POST /todos

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
Date: Mon, 07 Jan 2019 11:09:24 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/fba651cc-54f0-4f98-976f-3516f0263a90
Content-Length: 277
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"order":10,"title":"blah","uid":"fba651cc-54f0-4f98-976f-3516f0263a90","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/fba651cc-54f0-4f98-976f-3516f0263a90","url":"http://todo-backend-sinatra.herokuapp.com/todos/fba651cc-54f0-4f98-976f-3516f0263a90"}
```

