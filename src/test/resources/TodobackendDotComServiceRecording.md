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
Date: Tue, 08 Jan 2019 07:48:29 GMT
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
Date: Tue, 08 Jan 2019 07:48:29 GMT
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
[{"uid":"bda8de0c-2916-477c-8342-ee5d42a50a21","title":"blah","order":523,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/bda8de0c-2916-477c-8342-ee5d42a50a21","url":"http://todo-backend-sinatra.herokuapp.com/todos/bda8de0c-2916-477c-8342-ee5d42a50a21"},{"uid":"0791f7ed-2af8-4a97-9a49-6362faf2cba7","title":"blah","order":95,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/0791f7ed-2af8-4a97-9a49-6362faf2cba7","url":"http://todo-backend-sinatra.herokuapp.com/todos/0791f7ed-2af8-4a97-9a49-6362faf2cba7"},{"uid":"4c87de5a-86db-497b-8904-727fbd0e9ceb","title":"blah","order":95,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/4c87de5a-86db-497b-8904-727fbd0e9ceb","url":"http://todo-backend-sinatra.herokuapp.com/todos/4c87de5a-86db-497b-8904-727fbd0e9ceb"}]
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
Date: Tue, 08 Jan 2019 07:48:29 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/4e898c05-a9b6-422a-acb3-930d914b7b97
Content-Length: 268
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"a todo","uid":"4e898c05-a9b6-422a-acb3-930d914b7b97","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/4e898c05-a9b6-422a-acb3-930d914b7b97","url":"http://todo-backend-sinatra.herokuapp.com/todos/4e898c05-a9b6-422a-acb3-930d914b7b97"}
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
Date: Tue, 08 Jan 2019 07:48:29 GMT
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

## Interaction 4: DELETE /todos

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
Date: Tue, 08 Jan 2019 07:48:29 GMT
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

## Interaction 5: GET /todos

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
Date: Tue, 08 Jan 2019 07:48:30 GMT
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

## Interaction 6: DELETE /todos

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
Date: Tue, 08 Jan 2019 07:48:30 GMT
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

## Interaction 7: POST /todos

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
Date: Tue, 08 Jan 2019 07:48:30 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/489fb8a5-cebd-4f28-b7fa-db6d418e0a28
Content-Length: 274
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"walk the dog","uid":"489fb8a5-cebd-4f28-b7fa-db6d418e0a28","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/489fb8a5-cebd-4f28-b7fa-db6d418e0a28","url":"http://todo-backend-sinatra.herokuapp.com/todos/489fb8a5-cebd-4f28-b7fa-db6d418e0a28"}
```

## Interaction 8: GET /todos

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
Date: Tue, 08 Jan 2019 07:48:30 GMT
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
[{"uid":"489fb8a5-cebd-4f28-b7fa-db6d418e0a28","title":"walk the dog","order":0,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/489fb8a5-cebd-4f28-b7fa-db6d418e0a28","url":"http://todo-backend-sinatra.herokuapp.com/todos/489fb8a5-cebd-4f28-b7fa-db6d418e0a28"}]
```

## Interaction 9: DELETE /todos

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
Date: Tue, 08 Jan 2019 07:48:30 GMT
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

## Interaction 10: POST /todos

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
Date: Tue, 08 Jan 2019 07:48:30 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/f7b92630-bcef-43fe-8d85-e76e6378344d
Content-Length: 266
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"blah","uid":"f7b92630-bcef-43fe-8d85-e76e6378344d","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/f7b92630-bcef-43fe-8d85-e76e6378344d","url":"http://todo-backend-sinatra.herokuapp.com/todos/f7b92630-bcef-43fe-8d85-e76e6378344d"}
```

## Interaction 11: GET /todos

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
Date: Tue, 08 Jan 2019 07:48:31 GMT
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
[{"uid":"f7b92630-bcef-43fe-8d85-e76e6378344d","title":"blah","order":0,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/f7b92630-bcef-43fe-8d85-e76e6378344d","url":"http://todo-backend-sinatra.herokuapp.com/todos/f7b92630-bcef-43fe-8d85-e76e6378344d"}]
```

## Interaction 12: DELETE /todos

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
Date: Tue, 08 Jan 2019 07:48:31 GMT
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

## Interaction 13: POST /todos

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
Date: Tue, 08 Jan 2019 07:48:31 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/a144d616-a85f-4873-bc7f-b77a8e2f4f7f
Content-Length: 266
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"blah","uid":"a144d616-a85f-4873-bc7f-b77a8e2f4f7f","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/a144d616-a85f-4873-bc7f-b77a8e2f4f7f","url":"http://todo-backend-sinatra.herokuapp.com/todos/a144d616-a85f-4873-bc7f-b77a8e2f4f7f"}
```

## Interaction 14: GET /todos

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
Date: Tue, 08 Jan 2019 07:48:31 GMT
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
[{"uid":"a144d616-a85f-4873-bc7f-b77a8e2f4f7f","title":"blah","order":0,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/a144d616-a85f-4873-bc7f-b77a8e2f4f7f","url":"http://todo-backend-sinatra.herokuapp.com/todos/a144d616-a85f-4873-bc7f-b77a8e2f4f7f"}]
```

## Interaction 15: DELETE /todos

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
Date: Tue, 08 Jan 2019 07:48:31 GMT
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

## Interaction 16: POST /todos

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
Date: Tue, 08 Jan 2019 07:48:31 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/616081e8-bbeb-40af-9396-49356795cb92
Content-Length: 269
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"my todo","uid":"616081e8-bbeb-40af-9396-49356795cb92","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/616081e8-bbeb-40af-9396-49356795cb92","url":"http://todo-backend-sinatra.herokuapp.com/todos/616081e8-bbeb-40af-9396-49356795cb92"}
```

## Interaction 17: DELETE /todos

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
Date: Tue, 08 Jan 2019 07:48:32 GMT
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

## Interaction 18: POST /todos

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

### Resulting headers back from the real server:

```
Date: Tue, 08 Jan 2019 07:48:32 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/46d71412-3dbb-40a9-b643-f740572f924b
Content-Length: 276
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"todo the first","uid":"46d71412-3dbb-40a9-b643-f740572f924b","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/46d71412-3dbb-40a9-b643-f740572f924b","url":"http://todo-backend-sinatra.herokuapp.com/todos/46d71412-3dbb-40a9-b643-f740572f924b"}
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
Date: Tue, 08 Jan 2019 07:48:33 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/35c92f40-45af-4a86-9f9b-eaf0e6df3f1f
Content-Length: 277
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"todo the second","uid":"35c92f40-45af-4a86-9f9b-eaf0e6df3f1f","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/35c92f40-45af-4a86-9f9b-eaf0e6df3f1f","url":"http://todo-backend-sinatra.herokuapp.com/todos/35c92f40-45af-4a86-9f9b-eaf0e6df3f1f"}
```

## Interaction 20: GET /todos

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
Date: Tue, 08 Jan 2019 07:48:32 GMT
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
[{"uid":"46d71412-3dbb-40a9-b643-f740572f924b","title":"todo the first","order":0,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/46d71412-3dbb-40a9-b643-f740572f924b","url":"http://todo-backend-sinatra.herokuapp.com/todos/46d71412-3dbb-40a9-b643-f740572f924b"},{"uid":"35c92f40-45af-4a86-9f9b-eaf0e6df3f1f","title":"todo the second","order":0,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/35c92f40-45af-4a86-9f9b-eaf0e6df3f1f","url":"http://todo-backend-sinatra.herokuapp.com/todos/35c92f40-45af-4a86-9f9b-eaf0e6df3f1f"}]
```

## Interaction 21: DELETE /todos

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
Date: Tue, 08 Jan 2019 07:48:33 GMT
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

## Interaction 22: POST /todos

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
Date: Tue, 08 Jan 2019 07:48:33 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/f2bdfa25-c832-4c7a-80d5-2a6ba06043c6
Content-Length: 275
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"initial title","uid":"f2bdfa25-c832-4c7a-80d5-2a6ba06043c6","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/f2bdfa25-c832-4c7a-80d5-2a6ba06043c6","url":"http://todo-backend-sinatra.herokuapp.com/todos/f2bdfa25-c832-4c7a-80d5-2a6ba06043c6"}
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
Date: Tue, 08 Jan 2019 07:48:34 GMT
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
Content-Length: 16
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"title":"blah"}
```

### Resulting headers back from the real server:

```
Date: Tue, 08 Jan 2019 07:48:34 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/a32bc509-3311-41ff-9766-973411022a9c
Content-Length: 266
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"blah","uid":"a32bc509-3311-41ff-9766-973411022a9c","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/a32bc509-3311-41ff-9766-973411022a9c","url":"http://todo-backend-sinatra.herokuapp.com/todos/a32bc509-3311-41ff-9766-973411022a9c"}
```

## Interaction 25: OPTIONS /todos

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
Date: Tue, 08 Jan 2019 07:48:34 GMT
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

## Interaction 26: DELETE /todos

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
Date: Tue, 08 Jan 2019 07:48:35 GMT
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

## Interaction 27: POST /todos

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
Date: Tue, 08 Jan 2019 07:48:35 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/ba7cc1b4-de0b-41e4-bb03-afa23adf9add
Content-Length: 266
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"blah","uid":"ba7cc1b4-de0b-41e4-bb03-afa23adf9add","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/ba7cc1b4-de0b-41e4-bb03-afa23adf9add","url":"http://todo-backend-sinatra.herokuapp.com/todos/ba7cc1b4-de0b-41e4-bb03-afa23adf9add"}
```

## Interaction 28: GET /todos

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
Date: Tue, 08 Jan 2019 07:48:36 GMT
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
[{"uid":"ba7cc1b4-de0b-41e4-bb03-afa23adf9add","title":"changed title","order":0,"completed":true,"href":"http://todo-backend-sinatra.herokuapp.com/todos/ba7cc1b4-de0b-41e4-bb03-afa23adf9add","url":"http://todo-backend-sinatra.herokuapp.com/todos/ba7cc1b4-de0b-41e4-bb03-afa23adf9add"}]
```

## Interaction 29: DELETE /todos

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
Date: Tue, 08 Jan 2019 07:48:36 GMT
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

## Interaction 30: POST /todos

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
Date: Tue, 08 Jan 2019 07:48:36 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/89c353bc-2f9d-468a-9a1c-83295312338e
Content-Length: 266
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"blah","uid":"89c353bc-2f9d-468a-9a1c-83295312338e","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/89c353bc-2f9d-468a-9a1c-83295312338e","url":"http://todo-backend-sinatra.herokuapp.com/todos/89c353bc-2f9d-468a-9a1c-83295312338e"}
```

## Interaction 31: GET /todos

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
Date: Tue, 08 Jan 2019 07:48:37 GMT
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

## Interaction 32: POST /todos

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
Date: Tue, 08 Jan 2019 07:48:37 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/151ae701-8d76-4c32-92bd-601928233a5d
Content-Length: 278
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"blah","order":523,"uid":"151ae701-8d76-4c32-92bd-601928233a5d","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/151ae701-8d76-4c32-92bd-601928233a5d","url":"http://todo-backend-sinatra.herokuapp.com/todos/151ae701-8d76-4c32-92bd-601928233a5d"}
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
Content-Length: 27
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"order":10,"title":"blah"}
```

### Resulting headers back from the real server:

```
Date: Tue, 08 Jan 2019 07:48:37 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/b61c07c4-d556-4074-abbf-582f2818940c
Content-Length: 277
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"order":10,"title":"blah","uid":"b61c07c4-d556-4074-abbf-582f2818940c","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/b61c07c4-d556-4074-abbf-582f2818940c","url":"http://todo-backend-sinatra.herokuapp.com/todos/b61c07c4-d556-4074-abbf-582f2818940c"}
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
Date: Tue, 08 Jan 2019 07:48:37 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/fa889e53-854f-4c8c-910d-0c598881509b
Content-Length: 277
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"order":10,"title":"blah","uid":"fa889e53-854f-4c8c-910d-0c598881509b","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/fa889e53-854f-4c8c-910d-0c598881509b","url":"http://todo-backend-sinatra.herokuapp.com/todos/fa889e53-854f-4c8c-910d-0c598881509b"}
```

