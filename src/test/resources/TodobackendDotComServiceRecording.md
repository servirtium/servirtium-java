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
Date: Sun, 27 Jan 2019 15:33:55 GMT
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
Date: Sun, 27 Jan 2019 15:33:55 GMT
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
    "uid": "9392777b-f9a9-463d-a8a3-926840526334",
    "title": "blah",
    "order": 523,
    "completed": false,
    "href": "http://todo-backend-sinatra.herokuapp.com/todos/9392777b-f9a9-463d-a8a3-926840526334",
    "url": "http://todo-backend-sinatra.herokuapp.com/todos/9392777b-f9a9-463d-a8a3-926840526334"
  },
  {
    "uid": "443da5d6-24c1-46c6-ba00-c066cca3ed44",
    "title": "blah",
    "order": 95,
    "completed": false,
    "href": "http://todo-backend-sinatra.herokuapp.com/todos/443da5d6-24c1-46c6-ba00-c066cca3ed44",
    "url": "http://todo-backend-sinatra.herokuapp.com/todos/443da5d6-24c1-46c6-ba00-c066cca3ed44"
  },
  {
    "uid": "c3f0bac9-a1e9-417f-8bbf-342b4c445bb6",
    "title": "blah",
    "order": 95,
    "completed": false,
    "href": "http://todo-backend-sinatra.herokuapp.com/todos/c3f0bac9-a1e9-417f-8bbf-342b4c445bb6",
    "url": "http://todo-backend-sinatra.herokuapp.com/todos/c3f0bac9-a1e9-417f-8bbf-342b4c445bb6"
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
Date: Sun, 27 Jan 2019 15:33:55 GMT
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
Date: Sun, 27 Jan 2019 15:33:56 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/564dfee7-fd22-4bf6-9211-0be3d7d1078d
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
  "uid": "564dfee7-fd22-4bf6-9211-0be3d7d1078d",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/564dfee7-fd22-4bf6-9211-0be3d7d1078d",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/564dfee7-fd22-4bf6-9211-0be3d7d1078d"
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
Date: Sun, 27 Jan 2019 15:33:56 GMT
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
Date: Sun, 27 Jan 2019 15:33:56 GMT
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
Date: Sun, 27 Jan 2019 15:33:56 GMT
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
Date: Sun, 27 Jan 2019 15:33:57 GMT
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
Date: Sun, 27 Jan 2019 15:33:57 GMT
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
Date: Sun, 27 Jan 2019 15:33:57 GMT
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
Date: Sun, 27 Jan 2019 15:33:57 GMT
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
Date: Sun, 27 Jan 2019 15:33:57 GMT
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
Date: Sun, 27 Jan 2019 15:33:57 GMT
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
Date: Sun, 27 Jan 2019 15:33:58 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/74ee5620-be32-49c7-aaf4-20396099f8ac
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
  "uid": "74ee5620-be32-49c7-aaf4-20396099f8ac",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/74ee5620-be32-49c7-aaf4-20396099f8ac",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/74ee5620-be32-49c7-aaf4-20396099f8ac"
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
Date: Sun, 27 Jan 2019 15:33:58 GMT
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
Date: Sun, 27 Jan 2019 15:33:58 GMT
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
    "uid": "74ee5620-be32-49c7-aaf4-20396099f8ac",
    "title": "walk the dog",
    "order": 0,
    "completed": false,
    "href": "http://todo-backend-sinatra.herokuapp.com/todos/74ee5620-be32-49c7-aaf4-20396099f8ac",
    "url": "http://todo-backend-sinatra.herokuapp.com/todos/74ee5620-be32-49c7-aaf4-20396099f8ac"
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
Date: Sun, 27 Jan 2019 15:33:58 GMT
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
Date: Sun, 27 Jan 2019 15:33:59 GMT
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
Date: Sun, 27 Jan 2019 15:33:59 GMT
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
Date: Sun, 27 Jan 2019 15:33:59 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/7daaa985-c7a2-4631-a751-333848d505ce
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
  "uid": "7daaa985-c7a2-4631-a751-333848d505ce",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/7daaa985-c7a2-4631-a751-333848d505ce",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/7daaa985-c7a2-4631-a751-333848d505ce"
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
Date: Sun, 27 Jan 2019 15:33:59 GMT
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
Date: Sun, 27 Jan 2019 15:33:59 GMT
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
    "uid": "7daaa985-c7a2-4631-a751-333848d505ce",
    "title": "blah",
    "order": 0,
    "completed": false,
    "href": "http://todo-backend-sinatra.herokuapp.com/todos/7daaa985-c7a2-4631-a751-333848d505ce",
    "url": "http://todo-backend-sinatra.herokuapp.com/todos/7daaa985-c7a2-4631-a751-333848d505ce"
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
Date: Sun, 27 Jan 2019 15:34:00 GMT
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
Date: Sun, 27 Jan 2019 15:34:00 GMT
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
Date: Sun, 27 Jan 2019 15:34:00 GMT
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
Date: Sun, 27 Jan 2019 15:34:00 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/ca520ca2-bf17-4d76-ad8e-d2ae35ee0be2
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
  "uid": "ca520ca2-bf17-4d76-ad8e-d2ae35ee0be2",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/ca520ca2-bf17-4d76-ad8e-d2ae35ee0be2",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/ca520ca2-bf17-4d76-ad8e-d2ae35ee0be2"
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
Date: Sun, 27 Jan 2019 15:34:01 GMT
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
Date: Sun, 27 Jan 2019 15:34:00 GMT
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
    "uid": "ca520ca2-bf17-4d76-ad8e-d2ae35ee0be2",
    "title": "blah",
    "order": 0,
    "completed": false,
    "href": "http://todo-backend-sinatra.herokuapp.com/todos/ca520ca2-bf17-4d76-ad8e-d2ae35ee0be2",
    "url": "http://todo-backend-sinatra.herokuapp.com/todos/ca520ca2-bf17-4d76-ad8e-d2ae35ee0be2"
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
Date: Sun, 27 Jan 2019 15:34:01 GMT
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
Date: Sun, 27 Jan 2019 15:34:01 GMT
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
Date: Sun, 27 Jan 2019 15:34:02 GMT
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
Date: Sun, 27 Jan 2019 15:34:01 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/4f72ded7-279c-4121-94c0-5318e22eb9cd
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
  "uid": "4f72ded7-279c-4121-94c0-5318e22eb9cd",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/4f72ded7-279c-4121-94c0-5318e22eb9cd",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/4f72ded7-279c-4121-94c0-5318e22eb9cd"
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
Date: Sun, 27 Jan 2019 15:34:02 GMT
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
Date: Sun, 27 Jan 2019 15:34:02 GMT
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
Date: Sun, 27 Jan 2019 15:34:02 GMT
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
Date: Sun, 27 Jan 2019 15:34:03 GMT
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
Date: Sun, 27 Jan 2019 15:34:03 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/2ea4e159-dcbb-4560-9c6d-fa4c58cc5106
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
  "uid": "2ea4e159-dcbb-4560-9c6d-fa4c58cc5106",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/2ea4e159-dcbb-4560-9c6d-fa4c58cc5106",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/2ea4e159-dcbb-4560-9c6d-fa4c58cc5106"
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
Date: Sun, 27 Jan 2019 15:34:03 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/5ed74d05-0a01-4aae-bc68-e07744ea5230
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
  "uid": "5ed74d05-0a01-4aae-bc68-e07744ea5230",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/5ed74d05-0a01-4aae-bc68-e07744ea5230",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/5ed74d05-0a01-4aae-bc68-e07744ea5230"
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
Date: Sun, 27 Jan 2019 15:34:03 GMT
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
Date: Sun, 27 Jan 2019 15:34:03 GMT
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
    "uid": "2ea4e159-dcbb-4560-9c6d-fa4c58cc5106",
    "title": "todo the first",
    "order": 0,
    "completed": false,
    "href": "http://todo-backend-sinatra.herokuapp.com/todos/2ea4e159-dcbb-4560-9c6d-fa4c58cc5106",
    "url": "http://todo-backend-sinatra.herokuapp.com/todos/2ea4e159-dcbb-4560-9c6d-fa4c58cc5106"
  },
  {
    "uid": "5ed74d05-0a01-4aae-bc68-e07744ea5230",
    "title": "todo the second",
    "order": 0,
    "completed": false,
    "href": "http://todo-backend-sinatra.herokuapp.com/todos/5ed74d05-0a01-4aae-bc68-e07744ea5230",
    "url": "http://todo-backend-sinatra.herokuapp.com/todos/5ed74d05-0a01-4aae-bc68-e07744ea5230"
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
Date: Sun, 27 Jan 2019 15:34:04 GMT
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
Date: Sun, 27 Jan 2019 15:34:04 GMT
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
Date: Sun, 27 Jan 2019 15:34:04 GMT
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
Date: Sun, 27 Jan 2019 15:34:04 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/910162a8-afc8-4a3e-a0be-35500bf96dd7
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
  "uid": "910162a8-afc8-4a3e-a0be-35500bf96dd7",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/910162a8-afc8-4a3e-a0be-35500bf96dd7",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/910162a8-afc8-4a3e-a0be-35500bf96dd7"
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
Date: Sun, 27 Jan 2019 15:34:05 GMT
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
Date: Sun, 27 Jan 2019 15:34:05 GMT
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
Date: Sun, 27 Jan 2019 15:34:05 GMT
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
Date: Sun, 27 Jan 2019 15:34:06 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/a3090a9a-ec95-4493-ab10-7aa3d22f288e
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
  "uid": "a3090a9a-ec95-4493-ab10-7aa3d22f288e",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/a3090a9a-ec95-4493-ab10-7aa3d22f288e",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/a3090a9a-ec95-4493-ab10-7aa3d22f288e"
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
Date: Sun, 27 Jan 2019 15:34:06 GMT
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
Date: Sun, 27 Jan 2019 15:34:07 GMT
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
Date: Sun, 27 Jan 2019 15:34:07 GMT
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
Date: Sun, 27 Jan 2019 15:34:07 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/6971284f-06ea-48d4-963d-d0da1a1376a2
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
  "uid": "6971284f-06ea-48d4-963d-d0da1a1376a2",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/6971284f-06ea-48d4-963d-d0da1a1376a2",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/6971284f-06ea-48d4-963d-d0da1a1376a2"
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
Date: Sun, 27 Jan 2019 15:34:07 GMT
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
Date: Sun, 27 Jan 2019 15:34:08 GMT
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
    "uid": "6971284f-06ea-48d4-963d-d0da1a1376a2",
    "title": "changed title",
    "order": 0,
    "completed": true,
    "href": "http://todo-backend-sinatra.herokuapp.com/todos/6971284f-06ea-48d4-963d-d0da1a1376a2",
    "url": "http://todo-backend-sinatra.herokuapp.com/todos/6971284f-06ea-48d4-963d-d0da1a1376a2"
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
Date: Sun, 27 Jan 2019 15:34:08 GMT
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
Date: Sun, 27 Jan 2019 15:34:08 GMT
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
Date: Sun, 27 Jan 2019 15:34:09 GMT
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
Date: Sun, 27 Jan 2019 15:34:09 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/cdae0069-7dc3-4320-a605-dd3f99af818b
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
  "uid": "cdae0069-7dc3-4320-a605-dd3f99af818b",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/cdae0069-7dc3-4320-a605-dd3f99af818b",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/cdae0069-7dc3-4320-a605-dd3f99af818b"
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
Date: Sun, 27 Jan 2019 15:34:10 GMT
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
Date: Sun, 27 Jan 2019 15:34:10 GMT
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
Date: Sun, 27 Jan 2019 15:34:10 GMT
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
Date: Sun, 27 Jan 2019 15:34:10 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/c98998bc-7bb8-4e46-a77a-a221e8d906a3
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
  "uid": "c98998bc-7bb8-4e46-a77a-a221e8d906a3",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/c98998bc-7bb8-4e46-a77a-a221e8d906a3",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/c98998bc-7bb8-4e46-a77a-a221e8d906a3"
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
Date: Sun, 27 Jan 2019 15:34:10 GMT
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
Date: Sun, 27 Jan 2019 15:34:10 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/f70abf01-7d00-4097-82eb-65973741b7f8
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
  "uid": "f70abf01-7d00-4097-82eb-65973741b7f8",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/f70abf01-7d00-4097-82eb-65973741b7f8",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/f70abf01-7d00-4097-82eb-65973741b7f8"
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
Date: Sun, 27 Jan 2019 15:34:11 GMT
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
Date: Sun, 27 Jan 2019 15:34:11 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/77bc58a5-4b58-470f-af53-be1628334414
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
  "uid": "77bc58a5-4b58-470f-af53-be1628334414",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/77bc58a5-4b58-470f-af53-be1628334414",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/77bc58a5-4b58-470f-af53-be1628334414"
}
```

