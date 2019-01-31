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
Date: Wed, 30 Jan 2019 21:43:47 GMT
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
Date: Wed, 30 Jan 2019 21:43:47 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 963
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
[
  {
    "uid": "b934511a-ffd1-42ce-9db8-842c173407dc",
    "title": "blah",
    "order": 523,
    "completed": false,
    "href": "http://todo-backend-sinatra.herokuapp.com/todos/b934511a-ffd1-42ce-9db8-842c173407dc",
    "url": "http://todo-backend-sinatra.herokuapp.com/todos/b934511a-ffd1-42ce-9db8-842c173407dc"
  },
  {
    "uid": "8d3c741d-13e2-49d2-850d-52b3fc596803",
    "title": "blah",
    "order": 95,
    "completed": false,
    "href": "http://todo-backend-sinatra.herokuapp.com/todos/8d3c741d-13e2-49d2-850d-52b3fc596803",
    "url": "http://todo-backend-sinatra.herokuapp.com/todos/8d3c741d-13e2-49d2-850d-52b3fc596803"
  },
  {
    "uid": "1888cba3-3c07-4b26-98ef-7902a599cce3",
    "title": "blah",
    "order": 95,
    "completed": false,
    "href": "http://todo-backend-sinatra.herokuapp.com/todos/1888cba3-3c07-4b26-98ef-7902a599cce3",
    "url": "http://todo-backend-sinatra.herokuapp.com/todos/1888cba3-3c07-4b26-98ef-7902a599cce3"
  }
]
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
Date: Wed, 30 Jan 2019 21:43:48 GMT
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
{
  "title": "a todo"
}
```

### Resulting headers back from the real server:

```
Date: Wed, 30 Jan 2019 21:43:49 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/a4c4f5ef-e225-49d1-a6ae-36b14b1f400d
Content-Length: 289
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{
  "title": "a todo",
  "uid": "a4c4f5ef-e225-49d1-a6ae-36b14b1f400d",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/a4c4f5ef-e225-49d1-a6ae-36b14b1f400d",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/a4c4f5ef-e225-49d1-a6ae-36b14b1f400d"
}
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
Date: Wed, 30 Jan 2019 21:43:49 GMT
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
Date: Wed, 30 Jan 2019 21:43:49 GMT
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
Date: Wed, 30 Jan 2019 21:43:49 GMT
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
Date: Wed, 30 Jan 2019 21:43:50 GMT
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
Date: Wed, 30 Jan 2019 21:43:50 GMT
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
Date: Wed, 30 Jan 2019 21:43:49 GMT
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
Date: Wed, 30 Jan 2019 21:43:49 GMT
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
Date: Wed, 30 Jan 2019 21:43:50 GMT
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
Date: Wed, 30 Jan 2019 21:43:50 GMT
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
{
  "title": "walk the dog"
}
```

### Resulting headers back from the real server:

```
Date: Wed, 30 Jan 2019 21:43:51 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/484b7be3-8d1b-45e6-b5cd-9f485443af19
Content-Length: 295
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{
  "title": "walk the dog",
  "uid": "484b7be3-8d1b-45e6-b5cd-9f485443af19",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/484b7be3-8d1b-45e6-b5cd-9f485443af19",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/484b7be3-8d1b-45e6-b5cd-9f485443af19"
}
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
Date: Wed, 30 Jan 2019 21:43:51 GMT
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
Date: Wed, 30 Jan 2019 21:43:51 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 329
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
[
  {
    "uid": "484b7be3-8d1b-45e6-b5cd-9f485443af19",
    "title": "walk the dog",
    "order": 0,
    "completed": false,
    "href": "http://todo-backend-sinatra.herokuapp.com/todos/484b7be3-8d1b-45e6-b5cd-9f485443af19",
    "url": "http://todo-backend-sinatra.herokuapp.com/todos/484b7be3-8d1b-45e6-b5cd-9f485443af19"
  }
]
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
Date: Wed, 30 Jan 2019 21:43:51 GMT
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
Date: Wed, 30 Jan 2019 21:43:52 GMT
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
Date: Wed, 30 Jan 2019 21:43:52 GMT
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
{
  "title": "blah"
}
```

### Resulting headers back from the real server:

```
Date: Wed, 30 Jan 2019 21:43:51 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/b814e30d-d12d-4075-87ce-665926033da7
Content-Length: 287
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{
  "title": "blah",
  "uid": "b814e30d-d12d-4075-87ce-665926033da7",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/b814e30d-d12d-4075-87ce-665926033da7",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/b814e30d-d12d-4075-87ce-665926033da7"
}
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
Date: Wed, 30 Jan 2019 21:43:52 GMT
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
Date: Wed, 30 Jan 2019 21:43:52 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 321
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
[
  {
    "uid": "b814e30d-d12d-4075-87ce-665926033da7",
    "title": "blah",
    "order": 0,
    "completed": false,
    "href": "http://todo-backend-sinatra.herokuapp.com/todos/b814e30d-d12d-4075-87ce-665926033da7",
    "url": "http://todo-backend-sinatra.herokuapp.com/todos/b814e30d-d12d-4075-87ce-665926033da7"
  }
]
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
Date: Wed, 30 Jan 2019 21:43:52 GMT
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
Date: Wed, 30 Jan 2019 21:43:53 GMT
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
Date: Wed, 30 Jan 2019 21:43:53 GMT
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
{
  "title": "blah"
}
```

### Resulting headers back from the real server:

```
Date: Wed, 30 Jan 2019 21:43:53 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/90746b8a-734a-46ac-8b13-f39aa6c851bb
Content-Length: 287
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{
  "title": "blah",
  "uid": "90746b8a-734a-46ac-8b13-f39aa6c851bb",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/90746b8a-734a-46ac-8b13-f39aa6c851bb",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/90746b8a-734a-46ac-8b13-f39aa6c851bb"
}
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
Date: Wed, 30 Jan 2019 21:43:53 GMT
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
Date: Wed, 30 Jan 2019 21:43:53 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 321
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
[
  {
    "uid": "90746b8a-734a-46ac-8b13-f39aa6c851bb",
    "title": "blah",
    "order": 0,
    "completed": false,
    "href": "http://todo-backend-sinatra.herokuapp.com/todos/90746b8a-734a-46ac-8b13-f39aa6c851bb",
    "url": "http://todo-backend-sinatra.herokuapp.com/todos/90746b8a-734a-46ac-8b13-f39aa6c851bb"
  }
]
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
Date: Wed, 30 Jan 2019 21:43:53 GMT
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
Date: Wed, 30 Jan 2019 21:43:54 GMT
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
Date: Wed, 30 Jan 2019 21:43:54 GMT
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
{
  "title": "my todo"
}
```

### Resulting headers back from the real server:

```
Date: Wed, 30 Jan 2019 21:43:54 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/8b596718-ec43-48a8-8f5b-a9d9e19e269f
Content-Length: 290
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{
  "title": "my todo",
  "uid": "8b596718-ec43-48a8-8f5b-a9d9e19e269f",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/8b596718-ec43-48a8-8f5b-a9d9e19e269f",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/8b596718-ec43-48a8-8f5b-a9d9e19e269f"
}
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
Date: Wed, 30 Jan 2019 21:43:54 GMT
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
Date: Wed, 30 Jan 2019 21:43:55 GMT
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
Date: Wed, 30 Jan 2019 21:43:55 GMT
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
Date: Wed, 30 Jan 2019 21:43:55 GMT
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
{
  "title": "todo the first"
}
```

### Resulting headers back from the real server:

```
Date: Wed, 30 Jan 2019 21:43:55 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/12ac01b3-03ec-40b2-a837-a5ac8f3462d7
Content-Length: 297
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{
  "title": "todo the first",
  "uid": "12ac01b3-03ec-40b2-a837-a5ac8f3462d7",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/12ac01b3-03ec-40b2-a837-a5ac8f3462d7",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/12ac01b3-03ec-40b2-a837-a5ac8f3462d7"
}
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
{
  "title": "todo the second"
}
```

### Resulting headers back from the real server:

```
Date: Wed, 30 Jan 2019 21:43:56 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/af862bba-f87e-45be-b638-39dac06a8e44
Content-Length: 298
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{
  "title": "todo the second",
  "uid": "af862bba-f87e-45be-b638-39dac06a8e44",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/af862bba-f87e-45be-b638-39dac06a8e44",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/af862bba-f87e-45be-b638-39dac06a8e44"
}
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
Date: Wed, 30 Jan 2019 21:43:56 GMT
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
Date: Wed, 30 Jan 2019 21:43:56 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 661
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
[
  {
    "uid": "12ac01b3-03ec-40b2-a837-a5ac8f3462d7",
    "title": "todo the first",
    "order": 0,
    "completed": false,
    "href": "http://todo-backend-sinatra.herokuapp.com/todos/12ac01b3-03ec-40b2-a837-a5ac8f3462d7",
    "url": "http://todo-backend-sinatra.herokuapp.com/todos/12ac01b3-03ec-40b2-a837-a5ac8f3462d7"
  },
  {
    "uid": "af862bba-f87e-45be-b638-39dac06a8e44",
    "title": "todo the second",
    "order": 0,
    "completed": false,
    "href": "http://todo-backend-sinatra.herokuapp.com/todos/af862bba-f87e-45be-b638-39dac06a8e44",
    "url": "http://todo-backend-sinatra.herokuapp.com/todos/af862bba-f87e-45be-b638-39dac06a8e44"
  }
]
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
Date: Wed, 30 Jan 2019 21:43:57 GMT
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
Date: Wed, 30 Jan 2019 21:43:56 GMT
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
Date: Wed, 30 Jan 2019 21:43:57 GMT
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
{
  "title": "initial title"
}
```

### Resulting headers back from the real server:

```
Date: Wed, 30 Jan 2019 21:43:57 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/303528c8-2403-4c53-b30f-123c94f9965b
Content-Length: 296
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{
  "title": "initial title",
  "uid": "303528c8-2403-4c53-b30f-123c94f9965b",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/303528c8-2403-4c53-b30f-123c94f9965b",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/303528c8-2403-4c53-b30f-123c94f9965b"
}
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
Date: Wed, 30 Jan 2019 21:43:58 GMT
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
Date: Wed, 30 Jan 2019 21:43:58 GMT
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
Date: Wed, 30 Jan 2019 21:43:58 GMT
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
{
  "title": "blah"
}
```

### Resulting headers back from the real server:

```
Date: Wed, 30 Jan 2019 21:43:58 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/858a31f2-5b8d-4dba-b3fd-c6576ba0944d
Content-Length: 287
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{
  "title": "blah",
  "uid": "858a31f2-5b8d-4dba-b3fd-c6576ba0944d",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/858a31f2-5b8d-4dba-b3fd-c6576ba0944d",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/858a31f2-5b8d-4dba-b3fd-c6576ba0944d"
}
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
Date: Wed, 30 Jan 2019 21:43:59 GMT
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
Date: Wed, 30 Jan 2019 21:43:59 GMT
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
Date: Wed, 30 Jan 2019 21:43:59 GMT
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
{
  "title": "blah"
}
```

### Resulting headers back from the real server:

```
Date: Wed, 30 Jan 2019 21:44:00 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/f72cc780-c0ef-4482-9e01-5bb106d222a7
Content-Length: 287
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{
  "title": "blah",
  "uid": "f72cc780-c0ef-4482-9e01-5bb106d222a7",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/f72cc780-c0ef-4482-9e01-5bb106d222a7",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/f72cc780-c0ef-4482-9e01-5bb106d222a7"
}
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
Date: Wed, 30 Jan 2019 21:44:01 GMT
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
Date: Wed, 30 Jan 2019 21:44:00 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 329
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
[
  {
    "uid": "f72cc780-c0ef-4482-9e01-5bb106d222a7",
    "title": "changed title",
    "order": 0,
    "completed": true,
    "href": "http://todo-backend-sinatra.herokuapp.com/todos/f72cc780-c0ef-4482-9e01-5bb106d222a7",
    "url": "http://todo-backend-sinatra.herokuapp.com/todos/f72cc780-c0ef-4482-9e01-5bb106d222a7"
  }
]
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
Date: Wed, 30 Jan 2019 21:44:01 GMT
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
Date: Wed, 30 Jan 2019 21:44:00 GMT
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
Date: Wed, 30 Jan 2019 21:44:01 GMT
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
{
  "title": "blah"
}
```

### Resulting headers back from the real server:

```
Date: Wed, 30 Jan 2019 21:44:02 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/ad7b3a27-2c3f-490f-9b7a-3ad88d7e3eb4
Content-Length: 287
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{
  "title": "blah",
  "uid": "ad7b3a27-2c3f-490f-9b7a-3ad88d7e3eb4",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/ad7b3a27-2c3f-490f-9b7a-3ad88d7e3eb4",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/ad7b3a27-2c3f-490f-9b7a-3ad88d7e3eb4"
}
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
Date: Wed, 30 Jan 2019 21:44:02 GMT
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
Date: Wed, 30 Jan 2019 21:44:02 GMT
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
Date: Wed, 30 Jan 2019 21:44:02 GMT
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
{
  "title": "blah",
  "order": 523
}
```

### Resulting headers back from the real server:

```
Date: Wed, 30 Jan 2019 21:44:02 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/b38342ae-2d0e-43bd-ba90-f16a70dd68dc
Content-Length: 303
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{
  "title": "blah",
  "order": 523,
  "uid": "b38342ae-2d0e-43bd-ba90-f16a70dd68dc",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/b38342ae-2d0e-43bd-ba90-f16a70dd68dc",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/b38342ae-2d0e-43bd-ba90-f16a70dd68dc"
}
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
Date: Wed, 30 Jan 2019 21:44:02 GMT
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
{
  "order": 10,
  "title": "blah"
}
```

### Resulting headers back from the real server:

```
Date: Wed, 30 Jan 2019 21:44:03 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/28b48468-8adf-4eaa-8679-0fe3e8cb8066
Content-Length: 302
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{
  "order": 10,
  "title": "blah",
  "uid": "28b48468-8adf-4eaa-8679-0fe3e8cb8066",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/28b48468-8adf-4eaa-8679-0fe3e8cb8066",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/28b48468-8adf-4eaa-8679-0fe3e8cb8066"
}
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
Date: Wed, 30 Jan 2019 21:44:04 GMT
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
{
  "order": 10,
  "title": "blah"
}
```

### Resulting headers back from the real server:

```
Date: Wed, 30 Jan 2019 21:44:03 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/aee36f48-4d1a-4a7e-be37-4490f6bef821
Content-Length: 302
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{
  "order": 10,
  "title": "blah",
  "uid": "aee36f48-4d1a-4a7e-be37-4490f6bef821",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/aee36f48-4d1a-4a7e-be37-4490f6bef821",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/aee36f48-4d1a-4a7e-be37-4490f6bef821"
}
```

