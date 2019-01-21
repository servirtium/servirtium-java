## Interaction 0: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: GET
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:03 GMT
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
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-US,en;q=0.5
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:03 GMT
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
[{"uid":"78f6df6b-5d5d-4f8d-bc3e-b9105a3da63d","title":"blah","order":523,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/78f6df6b-5d5d-4f8d-bc3e-b9105a3da63d","url":"http://todo-backend-sinatra.herokuapp.com/todos/78f6df6b-5d5d-4f8d-bc3e-b9105a3da63d"},{"uid":"ccff2f4a-afa8-4821-8982-a56f83b03c55","title":"blah","order":95,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/ccff2f4a-afa8-4821-8982-a56f83b03c55","url":"http://todo-backend-sinatra.herokuapp.com/todos/ccff2f4a-afa8-4821-8982-a56f83b03c55"},{"uid":"a529168d-35c1-440e-bc36-2e2af5d9badb","title":"blah","order":95,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/a529168d-35c1-440e-bc36-2e2af5d9badb","url":"http://todo-backend-sinatra.herokuapp.com/todos/a529168d-35c1-440e-bc36-2e2af5d9badb"}]
```

## Interaction 2: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: POST
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:03 GMT
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

## Interaction 3: POST /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Cache-Control: no-cache
Accept-Language: en-US,en;q=0.5
Content-Length: 18
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"title":"a todo"}
```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:03 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/f49b6650-150b-4e99-8f92-05faee5ec435
Content-Length: 268
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"a todo","uid":"f49b6650-150b-4e99-8f92-05faee5ec435","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/f49b6650-150b-4e99-8f92-05faee5ec435","url":"http://todo-backend-sinatra.herokuapp.com/todos/f49b6650-150b-4e99-8f92-05faee5ec435"}
```

## Interaction 4: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: DELETE
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:03 GMT
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

## Interaction 5: DELETE /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-US,en;q=0.5
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:03 GMT
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

## Interaction 6: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: DELETE
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:04 GMT
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

## Interaction 7: DELETE /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-US,en;q=0.5
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:04 GMT
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

## Interaction 8: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: GET
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:04 GMT
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

## Interaction 9: GET /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-US,en;q=0.5
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:05 GMT
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

## Interaction 10: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: DELETE
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:05 GMT
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

## Interaction 11: DELETE /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-US,en;q=0.5
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:05 GMT
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

## Interaction 12: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: POST
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:05 GMT
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

## Interaction 13: POST /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Cache-Control: no-cache
Accept-Language: en-US,en;q=0.5
Content-Length: 24
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"title":"walk the dog"}
```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:06 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/a7f74b11-be54-4ca8-a1a4-1ddaea89094c
Content-Length: 274
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"walk the dog","uid":"a7f74b11-be54-4ca8-a1a4-1ddaea89094c","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/a7f74b11-be54-4ca8-a1a4-1ddaea89094c","url":"http://todo-backend-sinatra.herokuapp.com/todos/a7f74b11-be54-4ca8-a1a4-1ddaea89094c"}
```

## Interaction 14: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: GET
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:06 GMT
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

## Interaction 15: GET /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-US,en;q=0.5
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:06 GMT
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
[{"uid":"a7f74b11-be54-4ca8-a1a4-1ddaea89094c","title":"walk the dog","order":0,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/a7f74b11-be54-4ca8-a1a4-1ddaea89094c","url":"http://todo-backend-sinatra.herokuapp.com/todos/a7f74b11-be54-4ca8-a1a4-1ddaea89094c"}]
```

## Interaction 16: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: DELETE
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:06 GMT
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

## Interaction 17: DELETE /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-US,en;q=0.5
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:07 GMT
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

## Interaction 18: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: POST
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:07 GMT
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

## Interaction 19: POST /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Cache-Control: no-cache
Accept-Language: en-US,en;q=0.5
Content-Length: 16
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"title":"blah"}
```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:06 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/a0054af3-5638-4e1e-9d42-aa3aa19f854c
Content-Length: 266
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"blah","uid":"a0054af3-5638-4e1e-9d42-aa3aa19f854c","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/a0054af3-5638-4e1e-9d42-aa3aa19f854c","url":"http://todo-backend-sinatra.herokuapp.com/todos/a0054af3-5638-4e1e-9d42-aa3aa19f854c"}
```

## Interaction 20: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: GET
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:06 GMT
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

## Interaction 21: GET /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-US,en;q=0.5
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:07 GMT
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
[{"uid":"a0054af3-5638-4e1e-9d42-aa3aa19f854c","title":"blah","order":0,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/a0054af3-5638-4e1e-9d42-aa3aa19f854c","url":"http://todo-backend-sinatra.herokuapp.com/todos/a0054af3-5638-4e1e-9d42-aa3aa19f854c"}]
```

## Interaction 22: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: DELETE
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:08 GMT
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
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-US,en;q=0.5
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:08 GMT
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

## Interaction 24: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: POST
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:08 GMT
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

## Interaction 25: POST /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Cache-Control: no-cache
Accept-Language: en-US,en;q=0.5
Content-Length: 16
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"title":"blah"}
```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:08 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/550adac4-5821-47ee-b63e-df755443f788
Content-Length: 266
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"blah","uid":"550adac4-5821-47ee-b63e-df755443f788","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/550adac4-5821-47ee-b63e-df755443f788","url":"http://todo-backend-sinatra.herokuapp.com/todos/550adac4-5821-47ee-b63e-df755443f788"}
```

## Interaction 26: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: GET
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:08 GMT
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

## Interaction 27: GET /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-US,en;q=0.5
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:09 GMT
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
[{"uid":"550adac4-5821-47ee-b63e-df755443f788","title":"blah","order":0,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/550adac4-5821-47ee-b63e-df755443f788","url":"http://todo-backend-sinatra.herokuapp.com/todos/550adac4-5821-47ee-b63e-df755443f788"}]
```

## Interaction 28: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: DELETE
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:09 GMT
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

## Interaction 29: DELETE /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-US,en;q=0.5
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:09 GMT
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

## Interaction 30: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: POST
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:09 GMT
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

## Interaction 31: POST /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Cache-Control: no-cache
Accept-Language: en-US,en;q=0.5
Content-Length: 19
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"title":"my todo"}
```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:10 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/e25d2076-779f-4637-b1d1-c923960500cf
Content-Length: 269
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"my todo","uid":"e25d2076-779f-4637-b1d1-c923960500cf","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/e25d2076-779f-4637-b1d1-c923960500cf","url":"http://todo-backend-sinatra.herokuapp.com/todos/e25d2076-779f-4637-b1d1-c923960500cf"}
```

## Interaction 32: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: DELETE
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:10 GMT
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

## Interaction 33: DELETE /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-US,en;q=0.5
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:10 GMT
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

## Interaction 34: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: POST
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:10 GMT
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

## Interaction 35: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: POST
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:10 GMT
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

## Interaction 36: POST /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Cache-Control: no-cache
Accept-Language: en-US,en;q=0.5
Content-Length: 26
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"title":"todo the first"}
```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:11 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/3741cc74-fe7b-4eb6-a54e-587805f063c7
Content-Length: 276
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"todo the first","uid":"3741cc74-fe7b-4eb6-a54e-587805f063c7","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/3741cc74-fe7b-4eb6-a54e-587805f063c7","url":"http://todo-backend-sinatra.herokuapp.com/todos/3741cc74-fe7b-4eb6-a54e-587805f063c7"}
```

## Interaction 37: POST /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Cache-Control: no-cache
Accept-Language: en-US,en;q=0.5
Content-Length: 27
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"title":"todo the second"}
```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:11 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/ffe58455-f2b7-44ce-b61a-6ed778781403
Content-Length: 277
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"todo the second","uid":"ffe58455-f2b7-44ce-b61a-6ed778781403","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/ffe58455-f2b7-44ce-b61a-6ed778781403","url":"http://todo-backend-sinatra.herokuapp.com/todos/ffe58455-f2b7-44ce-b61a-6ed778781403"}
```

## Interaction 38: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: GET
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:11 GMT
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

## Interaction 39: GET /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-US,en;q=0.5
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:11 GMT
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
[{"uid":"3741cc74-fe7b-4eb6-a54e-587805f063c7","title":"todo the first","order":0,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/3741cc74-fe7b-4eb6-a54e-587805f063c7","url":"http://todo-backend-sinatra.herokuapp.com/todos/3741cc74-fe7b-4eb6-a54e-587805f063c7"},{"uid":"ffe58455-f2b7-44ce-b61a-6ed778781403","title":"todo the second","order":0,"completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/ffe58455-f2b7-44ce-b61a-6ed778781403","url":"http://todo-backend-sinatra.herokuapp.com/todos/ffe58455-f2b7-44ce-b61a-6ed778781403"}]
```

## Interaction 40: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: DELETE
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:12 GMT
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

## Interaction 41: DELETE /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-US,en;q=0.5
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:11 GMT
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

## Interaction 42: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: POST
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:12 GMT
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

## Interaction 43: POST /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Cache-Control: no-cache
Accept-Language: en-US,en;q=0.5
Content-Length: 25
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"title":"initial title"}
```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:13 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/d37427cb-77fe-4783-b28c-ca5b774be842
Content-Length: 275
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"initial title","uid":"d37427cb-77fe-4783-b28c-ca5b774be842","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/d37427cb-77fe-4783-b28c-ca5b774be842","url":"http://todo-backend-sinatra.herokuapp.com/todos/d37427cb-77fe-4783-b28c-ca5b774be842"}
```

## Interaction 44: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: DELETE
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:13 GMT
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

## Interaction 45: DELETE /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-US,en;q=0.5
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:13 GMT
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

## Interaction 46: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: POST
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:14 GMT
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

## Interaction 47: POST /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Cache-Control: no-cache
Accept-Language: en-US,en;q=0.5
Content-Length: 16
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"title":"blah"}
```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:13 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/931561f9-77d5-411f-8f2c-0953affa0ab7
Content-Length: 266
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"blah","uid":"931561f9-77d5-411f-8f2c-0953affa0ab7","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/931561f9-77d5-411f-8f2c-0953affa0ab7","url":"http://todo-backend-sinatra.herokuapp.com/todos/931561f9-77d5-411f-8f2c-0953affa0ab7"}
```

## Interaction 48: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: DELETE
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:14 GMT
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

## Interaction 49: DELETE /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-US,en;q=0.5
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:14 GMT
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

## Interaction 50: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: POST
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:14 GMT
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

## Interaction 51: POST /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Cache-Control: no-cache
Accept-Language: en-US,en;q=0.5
Content-Length: 16
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"title":"blah"}
```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:15 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/475b176e-218a-445d-8221-591b198ad374
Content-Length: 266
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"blah","uid":"475b176e-218a-445d-8221-591b198ad374","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/475b176e-218a-445d-8221-591b198ad374","url":"http://todo-backend-sinatra.herokuapp.com/todos/475b176e-218a-445d-8221-591b198ad374"}
```

## Interaction 52: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: GET
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:15 GMT
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

## Interaction 53: GET /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-US,en;q=0.5
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:16 GMT
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
[{"uid":"475b176e-218a-445d-8221-591b198ad374","title":"changed title","order":0,"completed":true,"href":"http://todo-backend-sinatra.herokuapp.com/todos/475b176e-218a-445d-8221-591b198ad374","url":"http://todo-backend-sinatra.herokuapp.com/todos/475b176e-218a-445d-8221-591b198ad374"}]
```

## Interaction 54: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: DELETE
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:16 GMT
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

## Interaction 55: DELETE /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-US,en;q=0.5
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:16 GMT
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

## Interaction 56: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: POST
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:16 GMT
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

## Interaction 57: POST /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Cache-Control: no-cache
Accept-Language: en-US,en;q=0.5
Content-Length: 16
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"title":"blah"}
```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:16 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/f93dd615-334e-4bcd-b6d4-f699342cb586
Content-Length: 266
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"blah","uid":"f93dd615-334e-4bcd-b6d4-f699342cb586","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/f93dd615-334e-4bcd-b6d4-f699342cb586","url":"http://todo-backend-sinatra.herokuapp.com/todos/f93dd615-334e-4bcd-b6d4-f699342cb586"}
```

## Interaction 58: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: GET
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:17 GMT
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

## Interaction 59: GET /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Language: en-US,en;q=0.5
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Content-Type: application/json
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:17 GMT
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

## Interaction 60: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: POST
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:17 GMT
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

## Interaction 61: POST /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Cache-Control: no-cache
Accept-Language: en-US,en;q=0.5
Content-Length: 28
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"title":"blah","order":523}
```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:18 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/a8116312-0fbb-4461-9427-7a4dcd4478a5
Content-Length: 278
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"title":"blah","order":523,"uid":"a8116312-0fbb-4461-9427-7a4dcd4478a5","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/a8116312-0fbb-4461-9427-7a4dcd4478a5","url":"http://todo-backend-sinatra.herokuapp.com/todos/a8116312-0fbb-4461-9427-7a4dcd4478a5"}
```

## Interaction 62: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: POST
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:18 GMT
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

## Interaction 63: POST /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Cache-Control: no-cache
Accept-Language: en-US,en;q=0.5
Content-Length: 27
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"order":10,"title":"blah"}
```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:18 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/2aadfda1-d84e-40f6-a619-78f2b8bfe56e
Content-Length: 277
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"order":10,"title":"blah","uid":"2aadfda1-d84e-40f6-a619-78f2b8bfe56e","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/2aadfda1-d84e-40f6-a619-78f2b8bfe56e","url":"http://todo-backend-sinatra.herokuapp.com/todos/2aadfda1-d84e-40f6-a619-78f2b8bfe56e"}
```

## Interaction 64: OPTIONS /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Access-Control-Request-Method: POST
Cache-Control: no-cache
Access-Control-Request-Headers: content-type
Accept-Language: en-US,en;q=0.5
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:19 GMT
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

## Interaction 65: POST /todos

### Request headers sent to the real server:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
Connection: keep-alive
Host: todo-backend-sinatra.herokuapp.com
Accept-Encoding: gzip, deflate
DNT: 1
Pragma: no-cache
Cache-Control: no-cache
Accept-Language: en-US,en;q=0.5
Content-Length: 27
Content-Type: application/json
```

### Body sent to the real server (application/json):

```
{"order":10,"title":"blah"}
```

### Resulting headers back from the real server:

```
Date: Mon, 21 Jan 2019 08:03:18 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/43efa439-a13b-4341-ad2a-e49b0db6be88
Content-Length: 277
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{"order":10,"title":"blah","uid":"43efa439-a13b-4341-ad2a-e49b0db6be88","completed":false,"href":"http://todo-backend-sinatra.herokuapp.com/todos/43efa439-a13b-4341-ad2a-e49b0db6be88","url":"http://todo-backend-sinatra.herokuapp.com/todos/43efa439-a13b-4341-ad2a-e49b0db6be88"}
```

