## Interaction 0: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: GET
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:04 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 1: GET /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 885
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:04 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
[
   {
      "uid": "11f52acd-0d73-4a01-84ea-7701e07b0c7f",
      "title": "blah",
      "order": 523,
      "completed": false,
      "href": "http://localhost:8099/todos/11f52acd-0d73-4a01-84ea-7701e07b0c7f",
      "url": "http://localhost:8099/todos/11f52acd-0d73-4a01-84ea-7701e07b0c7f"
   },
   {
      "uid": "2801305b-a131-4491-8ad4-0963d638f2a3",
      "title": "blah",
      "order": 95,
      "completed": false,
      "href": "http://localhost:8099/todos/2801305b-a131-4491-8ad4-0963d638f2a3",
      "url": "http://localhost:8099/todos/2801305b-a131-4491-8ad4-0963d638f2a3"
   },
   {
      "uid": "cd47f523-85a3-481f-9c34-44e408892f62",
      "title": "blah",
      "order": 95,
      "completed": false,
      "href": "http://localhost:8099/todos/cd47f523-85a3-481f-9c34-44e408892f62",
      "url": "http://localhost:8099/todos/cd47f523-85a3-481f-9c34-44e408892f62"
   }
]
```

## Interaction 2: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: POST
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:04 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 3: POST /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 18
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```
{
   "title": "a todo"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 254
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:04 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/975a9825-3964-41a8-8f3c-a20b57097875
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{
   "title": "a todo",
   "uid": "975a9825-3964-41a8-8f3c-a20b57097875",
   "completed": false,
   "href": "http://localhost:8099/todos/975a9825-3964-41a8-8f3c-a20b57097875",
   "url": "http://localhost:8099/todos/975a9825-3964-41a8-8f3c-a20b57097875"
}
```

## Interaction 4: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: DELETE
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:04 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 5: DELETE /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Tue, 26 Feb 2019 07:27:04 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## Interaction 6: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: DELETE
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:04 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 7: DELETE /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Tue, 26 Feb 2019 07:27:04 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## Interaction 8: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: GET
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:05 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 9: GET /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 3
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:05 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
[
]
```

## Interaction 10: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: DELETE
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:05 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 11: DELETE /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Tue, 26 Feb 2019 07:27:06 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## Interaction 12: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: POST
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:06 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 13: POST /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 24
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```
{
   "title": "walk the dog"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 260
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:06 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/8c089f24-a8d6-428e-9874-803269b86ecd
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{
   "title": "walk the dog",
   "uid": "8c089f24-a8d6-428e-9874-803269b86ecd",
   "completed": false,
   "href": "http://localhost:8099/todos/8c089f24-a8d6-428e-9874-803269b86ecd",
   "url": "http://localhost:8099/todos/8c089f24-a8d6-428e-9874-803269b86ecd"
}
```

## Interaction 14: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: GET
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:06 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 15: GET /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 303
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:06 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
[
   {
      "uid": "8c089f24-a8d6-428e-9874-803269b86ecd",
      "title": "walk the dog",
      "order": 0,
      "completed": false,
      "href": "http://localhost:8099/todos/8c089f24-a8d6-428e-9874-803269b86ecd",
      "url": "http://localhost:8099/todos/8c089f24-a8d6-428e-9874-803269b86ecd"
   }
]
```

## Interaction 16: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: DELETE
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:06 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 17: DELETE /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Tue, 26 Feb 2019 07:27:07 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## Interaction 18: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: POST
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:07 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 19: POST /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```
{
   "title": "blah"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 252
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:07 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/45993214-df5c-4f60-b884-90ae78abe1e4
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{
   "title": "blah",
   "uid": "45993214-df5c-4f60-b884-90ae78abe1e4",
   "completed": false,
   "href": "http://localhost:8099/todos/45993214-df5c-4f60-b884-90ae78abe1e4",
   "url": "http://localhost:8099/todos/45993214-df5c-4f60-b884-90ae78abe1e4"
}
```

## Interaction 20: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: GET
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:07 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 21: GET /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 295
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:07 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
[
   {
      "uid": "45993214-df5c-4f60-b884-90ae78abe1e4",
      "title": "blah",
      "order": 0,
      "completed": false,
      "href": "http://localhost:8099/todos/45993214-df5c-4f60-b884-90ae78abe1e4",
      "url": "http://localhost:8099/todos/45993214-df5c-4f60-b884-90ae78abe1e4"
   }
]
```

## Interaction 22: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: DELETE
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:07 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 23: DELETE /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Tue, 26 Feb 2019 07:27:08 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## Interaction 24: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: POST
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:08 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 25: POST /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```
{
   "title": "blah"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 252
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:08 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/c14c05e3-716a-4bd6-a789-e1b333a9247c
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{
   "title": "blah",
   "uid": "c14c05e3-716a-4bd6-a789-e1b333a9247c",
   "completed": false,
   "href": "http://localhost:8099/todos/c14c05e3-716a-4bd6-a789-e1b333a9247c",
   "url": "http://localhost:8099/todos/c14c05e3-716a-4bd6-a789-e1b333a9247c"
}
```

## Interaction 26: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: GET
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:08 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 27: GET /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 295
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:09 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
[
   {
      "uid": "c14c05e3-716a-4bd6-a789-e1b333a9247c",
      "title": "blah",
      "order": 0,
      "completed": false,
      "href": "http://localhost:8099/todos/c14c05e3-716a-4bd6-a789-e1b333a9247c",
      "url": "http://localhost:8099/todos/c14c05e3-716a-4bd6-a789-e1b333a9247c"
   }
]
```

## Interaction 28: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: DELETE
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:09 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 29: DELETE /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Tue, 26 Feb 2019 07:27:08 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## Interaction 30: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: POST
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:08 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 31: POST /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 19
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```
{
   "title": "my todo"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 255
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:09 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/69826e6d-b183-4082-9e54-b46092661955
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{
   "title": "my todo",
   "uid": "69826e6d-b183-4082-9e54-b46092661955",
   "completed": false,
   "href": "http://localhost:8099/todos/69826e6d-b183-4082-9e54-b46092661955",
   "url": "http://localhost:8099/todos/69826e6d-b183-4082-9e54-b46092661955"
}
```

## Interaction 32: OPTIONS /todos/69826e6d-b183-4082-9e54-b46092661955

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: GET
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,PATCH,HEAD,DELETE,OPTIONS
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:09 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 33: GET /todos/69826e6d-b183-4082-9e54-b46092661955

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 270
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:09 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
{
   "uid": "69826e6d-b183-4082-9e54-b46092661955",
   "title": "my todo",
   "order": 0,
   "completed": false,
   "href": "http://localhost:8099/todos/69826e6d-b183-4082-9e54-b46092661955",
   "url": "http://localhost:8099/todos/69826e6d-b183-4082-9e54-b46092661955"
}
```

## Interaction 34: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: DELETE
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:09 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 35: DELETE /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Tue, 26 Feb 2019 07:27:09 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## Interaction 36: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: POST
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:09 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 37: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: POST
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:09 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 38: POST /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 26
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```
{
   "title": "todo the first"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 262
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:10 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/cc136a6f-3a21-4fbb-85ec-2d7c590277bd
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{
   "title": "todo the first",
   "uid": "cc136a6f-3a21-4fbb-85ec-2d7c590277bd",
   "completed": false,
   "href": "http://localhost:8099/todos/cc136a6f-3a21-4fbb-85ec-2d7c590277bd",
   "url": "http://localhost:8099/todos/cc136a6f-3a21-4fbb-85ec-2d7c590277bd"
}
```

## Interaction 39: POST /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 27
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```
{
   "title": "todo the second"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 263
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:10 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/86e7bd1c-9e0e-4c37-a861-b7e35ca09a27
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{
   "title": "todo the second",
   "uid": "86e7bd1c-9e0e-4c37-a861-b7e35ca09a27",
   "completed": false,
   "href": "http://localhost:8099/todos/86e7bd1c-9e0e-4c37-a861-b7e35ca09a27",
   "url": "http://localhost:8099/todos/86e7bd1c-9e0e-4c37-a861-b7e35ca09a27"
}
```

## Interaction 40: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: GET
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:10 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 41: GET /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 609
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:11 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
[
   {
      "uid": "cc136a6f-3a21-4fbb-85ec-2d7c590277bd",
      "title": "todo the first",
      "order": 0,
      "completed": false,
      "href": "http://localhost:8099/todos/cc136a6f-3a21-4fbb-85ec-2d7c590277bd",
      "url": "http://localhost:8099/todos/cc136a6f-3a21-4fbb-85ec-2d7c590277bd"
   },
   {
      "uid": "86e7bd1c-9e0e-4c37-a861-b7e35ca09a27",
      "title": "todo the second",
      "order": 0,
      "completed": false,
      "href": "http://localhost:8099/todos/86e7bd1c-9e0e-4c37-a861-b7e35ca09a27",
      "url": "http://localhost:8099/todos/86e7bd1c-9e0e-4c37-a861-b7e35ca09a27"
   }
]
```

## Interaction 42: OPTIONS /todos/cc136a6f-3a21-4fbb-85ec-2d7c590277bd

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: GET
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,PATCH,HEAD,DELETE,OPTIONS
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:11 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 43: GET /todos/cc136a6f-3a21-4fbb-85ec-2d7c590277bd

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 277
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:10 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
{
   "uid": "cc136a6f-3a21-4fbb-85ec-2d7c590277bd",
   "title": "todo the first",
   "order": 0,
   "completed": false,
   "href": "http://localhost:8099/todos/cc136a6f-3a21-4fbb-85ec-2d7c590277bd",
   "url": "http://localhost:8099/todos/cc136a6f-3a21-4fbb-85ec-2d7c590277bd"
}
```

## Interaction 44: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: DELETE
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:11 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 45: DELETE /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Tue, 26 Feb 2019 07:27:11 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## Interaction 46: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: POST
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:11 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 47: POST /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 25
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```
{
   "title": "initial title"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 261
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:11 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/6ad68605-24c5-4417-b62a-c7a033a95c8e
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{
   "title": "initial title",
   "uid": "6ad68605-24c5-4417-b62a-c7a033a95c8e",
   "completed": false,
   "href": "http://localhost:8099/todos/6ad68605-24c5-4417-b62a-c7a033a95c8e",
   "url": "http://localhost:8099/todos/6ad68605-24c5-4417-b62a-c7a033a95c8e"
}
```

## Interaction 48: OPTIONS /todos/6ad68605-24c5-4417-b62a-c7a033a95c8e

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: PATCH
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,PATCH,HEAD,DELETE,OPTIONS
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:11 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 49: PATCH /todos/6ad68605-24c5-4417-b62a-c7a033a95c8e

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 25
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```
{
   "title": "bathe the cat"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 276
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:12 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
{
   "uid": "6ad68605-24c5-4417-b62a-c7a033a95c8e",
   "title": "bathe the cat",
   "order": 0,
   "completed": false,
   "href": "http://localhost:8099/todos/6ad68605-24c5-4417-b62a-c7a033a95c8e",
   "url": "http://localhost:8099/todos/6ad68605-24c5-4417-b62a-c7a033a95c8e"
}
```

## Interaction 50: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: DELETE
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:12 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 51: DELETE /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Tue, 26 Feb 2019 07:27:11 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## Interaction 52: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: POST
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:12 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 53: POST /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```
{
   "title": "blah"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 252
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:12 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/045d8aee-b209-4793-beb6-f5f1256970b7
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{
   "title": "blah",
   "uid": "045d8aee-b209-4793-beb6-f5f1256970b7",
   "completed": false,
   "href": "http://localhost:8099/todos/045d8aee-b209-4793-beb6-f5f1256970b7",
   "url": "http://localhost:8099/todos/045d8aee-b209-4793-beb6-f5f1256970b7"
}
```

## Interaction 54: OPTIONS /todos/045d8aee-b209-4793-beb6-f5f1256970b7

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: PATCH
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,PATCH,HEAD,DELETE,OPTIONS
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:12 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 55: PATCH /todos/045d8aee-b209-4793-beb6-f5f1256970b7

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 18
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```
{
   "completed": true
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 266
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:12 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
{
   "uid": "045d8aee-b209-4793-beb6-f5f1256970b7",
   "title": "blah",
   "order": 0,
   "completed": true,
   "href": "http://localhost:8099/todos/045d8aee-b209-4793-beb6-f5f1256970b7",
   "url": "http://localhost:8099/todos/045d8aee-b209-4793-beb6-f5f1256970b7"
}
```

## Interaction 56: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: DELETE
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:12 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 57: DELETE /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Tue, 26 Feb 2019 07:27:13 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## Interaction 58: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: POST
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:13 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 59: POST /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```
{
   "title": "blah"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 252
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:13 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/e864307f-378e-44e9-b791-27fe513f52ec
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{
   "title": "blah",
   "uid": "e864307f-378e-44e9-b791-27fe513f52ec",
   "completed": false,
   "href": "http://localhost:8099/todos/e864307f-378e-44e9-b791-27fe513f52ec",
   "url": "http://localhost:8099/todos/e864307f-378e-44e9-b791-27fe513f52ec"
}
```

## Interaction 60: OPTIONS /todos/e864307f-378e-44e9-b791-27fe513f52ec

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: PATCH
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,PATCH,HEAD,DELETE,OPTIONS
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:13 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 61: PATCH /todos/e864307f-378e-44e9-b791-27fe513f52ec

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 42
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```
{
   "title": "changed title",
   "completed": true
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 275
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:13 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
{
   "uid": "e864307f-378e-44e9-b791-27fe513f52ec",
   "title": "changed title",
   "order": 0,
   "completed": true,
   "href": "http://localhost:8099/todos/e864307f-378e-44e9-b791-27fe513f52ec",
   "url": "http://localhost:8099/todos/e864307f-378e-44e9-b791-27fe513f52ec"
}
```

## Interaction 62: OPTIONS /todos/e864307f-378e-44e9-b791-27fe513f52ec

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: GET
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,PATCH,HEAD,DELETE,OPTIONS
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:13 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 63: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: GET
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:14 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 64: GET /todos/e864307f-378e-44e9-b791-27fe513f52ec

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 275
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:14 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
{
   "uid": "e864307f-378e-44e9-b791-27fe513f52ec",
   "title": "changed title",
   "order": 0,
   "completed": true,
   "href": "http://localhost:8099/todos/e864307f-378e-44e9-b791-27fe513f52ec",
   "url": "http://localhost:8099/todos/e864307f-378e-44e9-b791-27fe513f52ec"
}
```

## Interaction 65: GET /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 303
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:14 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
[
   {
      "uid": "e864307f-378e-44e9-b791-27fe513f52ec",
      "title": "changed title",
      "order": 0,
      "completed": true,
      "href": "http://localhost:8099/todos/e864307f-378e-44e9-b791-27fe513f52ec",
      "url": "http://localhost:8099/todos/e864307f-378e-44e9-b791-27fe513f52ec"
   }
]
```

## Interaction 66: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: DELETE
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:14 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 67: DELETE /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Tue, 26 Feb 2019 07:27:14 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## Interaction 68: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: POST
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:15 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 69: POST /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```
{
   "title": "blah"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 252
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:14 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/51a5c78f-3bed-408b-9f5f-54134672bdff
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{
   "title": "blah",
   "uid": "51a5c78f-3bed-408b-9f5f-54134672bdff",
   "completed": false,
   "href": "http://localhost:8099/todos/51a5c78f-3bed-408b-9f5f-54134672bdff",
   "url": "http://localhost:8099/todos/51a5c78f-3bed-408b-9f5f-54134672bdff"
}
```

## Interaction 70: OPTIONS /todos/51a5c78f-3bed-408b-9f5f-54134672bdff

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: DELETE
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,PATCH,HEAD,DELETE,OPTIONS
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:15 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 71: DELETE /todos/51a5c78f-3bed-408b-9f5f-54134672bdff

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Tue, 26 Feb 2019 07:27:15 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## Interaction 72: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: GET
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:15 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 73: GET /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 3
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:15 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
[
]
```

## Interaction 74: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: POST
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:15 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 75: POST /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 28
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
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
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 269
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:16 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/ce78a108-be80-4248-8ab0-5e03670a65ca
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{
   "title": "blah",
   "order": 523,
   "uid": "ce78a108-be80-4248-8ab0-5e03670a65ca",
   "completed": false,
   "href": "http://localhost:8099/todos/ce78a108-be80-4248-8ab0-5e03670a65ca",
   "url": "http://localhost:8099/todos/ce78a108-be80-4248-8ab0-5e03670a65ca"
}
```

## Interaction 76: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: POST
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:16 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 77: POST /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 27
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
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
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 268
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:17 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/fa95c8c9-b2c2-4574-a11d-1370ec45a599
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{
   "order": 10,
   "title": "blah",
   "uid": "fa95c8c9-b2c2-4574-a11d-1370ec45a599",
   "completed": false,
   "href": "http://localhost:8099/todos/fa95c8c9-b2c2-4574-a11d-1370ec45a599",
   "url": "http://localhost:8099/todos/fa95c8c9-b2c2-4574-a11d-1370ec45a599"
}
```

## Interaction 78: OPTIONS /todos/fa95c8c9-b2c2-4574-a11d-1370ec45a599

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: PATCH
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,PATCH,HEAD,DELETE,OPTIONS
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:17 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 79: PATCH /todos/fa95c8c9-b2c2-4574-a11d-1370ec45a599

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 12
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```
{
   "order": 95
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 268
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:16 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
{
   "uid": "fa95c8c9-b2c2-4574-a11d-1370ec45a599",
   "title": "blah",
   "order": 95,
   "completed": false,
   "href": "http://localhost:8099/todos/fa95c8c9-b2c2-4574-a11d-1370ec45a599",
   "url": "http://localhost:8099/todos/fa95c8c9-b2c2-4574-a11d-1370ec45a599"
}
```

## Interaction 80: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: POST
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:17 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 81: POST /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 27
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
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
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 268
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:16 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/d2d44b84-ea3c-4964-8ab7-2fb17a118d61
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (201: text/html;charset=utf-8):

```
{
   "order": 10,
   "title": "blah",
   "uid": "d2d44b84-ea3c-4964-8ab7-2fb17a118d61",
   "completed": false,
   "href": "http://localhost:8099/todos/d2d44b84-ea3c-4964-8ab7-2fb17a118d61",
   "url": "http://localhost:8099/todos/d2d44b84-ea3c-4964-8ab7-2fb17a118d61"
}
```

## Interaction 82: OPTIONS /todos/d2d44b84-ea3c-4964-8ab7-2fb17a118d61

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: PATCH
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,PATCH,HEAD,DELETE,OPTIONS
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:17 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 83: PATCH /todos/d2d44b84-ea3c-4964-8ab7-2fb17a118d61

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 12
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```
{
   "order": 95
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 268
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:17 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
{
   "uid": "d2d44b84-ea3c-4964-8ab7-2fb17a118d61",
   "title": "blah",
   "order": 95,
   "completed": false,
   "href": "http://localhost:8099/todos/d2d44b84-ea3c-4964-8ab7-2fb17a118d61",
   "url": "http://localhost:8099/todos/d2d44b84-ea3c-4964-8ab7-2fb17a118d61"
}
```

## Interaction 84: OPTIONS /todos/d2d44b84-ea3c-4964-8ab7-2fb17a118d61

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: GET
Cache-Control: no-cache
Connection: keep-alive
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,PATCH,HEAD,DELETE,OPTIONS
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:17 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 85: GET /todos/d2d44b84-ea3c-4964-8ab7-2fb17a118d61

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.5
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
DNT: 1
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:65.0) Gecko/20100101 Firefox/65.0
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 268
Content-Type: text/html;charset=utf-8
Date: Tue, 26 Feb 2019 07:27:18 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
{
   "uid": "d2d44b84-ea3c-4964-8ab7-2fb17a118d61",
   "title": "blah",
   "order": 95,
   "completed": false,
   "href": "http://localhost:8099/todos/d2d44b84-ea3c-4964-8ab7-2fb17a118d61",
   "url": "http://localhost:8099/todos/d2d44b84-ea3c-4964-8ab7-2fb17a118d61"
}
```

