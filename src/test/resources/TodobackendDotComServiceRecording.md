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
Date: Tue, 22 Jan 2019 09:45:08 GMT
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
Date: Tue, 22 Jan 2019 09:45:09 GMT
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
    "uid": "b15ed264-1e82-4dd2-abf3-6c8a37824c1e",
    "title": "blah",
    "order": 523,
    "completed": false,
    "href": "http://todo-backend-sinatra.herokuapp.com/todos/b15ed264-1e82-4dd2-abf3-6c8a37824c1e",
    "url": "http://todo-backend-sinatra.herokuapp.com/todos/b15ed264-1e82-4dd2-abf3-6c8a37824c1e"
  },
  {
    "uid": "7240dbcd-cfba-46c6-8f85-56f132a26b74",
    "title": "blah",
    "order": 95,
    "completed": false,
    "href": "http://todo-backend-sinatra.herokuapp.com/todos/7240dbcd-cfba-46c6-8f85-56f132a26b74",
    "url": "http://todo-backend-sinatra.herokuapp.com/todos/7240dbcd-cfba-46c6-8f85-56f132a26b74"
  },
  {
    "uid": "b87bf849-b2b3-4cc2-a5b9-8744fe53a3a3",
    "title": "blah",
    "order": 95,
    "completed": false,
    "href": "http://todo-backend-sinatra.herokuapp.com/todos/b87bf849-b2b3-4cc2-a5b9-8744fe53a3a3",
    "url": "http://todo-backend-sinatra.herokuapp.com/todos/b87bf849-b2b3-4cc2-a5b9-8744fe53a3a3"
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
Date: Tue, 22 Jan 2019 09:45:09 GMT
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
Date: Tue, 22 Jan 2019 09:45:10 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/71a71cad-0f90-43f8-b676-3af14681b730
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
  "uid": "71a71cad-0f90-43f8-b676-3af14681b730",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/71a71cad-0f90-43f8-b676-3af14681b730",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/71a71cad-0f90-43f8-b676-3af14681b730"
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
Date: Tue, 22 Jan 2019 09:45:10 GMT
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
Date: Tue, 22 Jan 2019 09:45:10 GMT
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
Date: Tue, 22 Jan 2019 09:45:11 GMT
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
Date: Tue, 22 Jan 2019 09:45:12 GMT
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
Date: Tue, 22 Jan 2019 09:45:12 GMT
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
Date: Tue, 22 Jan 2019 09:45:11 GMT
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
Date: Tue, 22 Jan 2019 09:45:12 GMT
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
Date: Tue, 22 Jan 2019 09:45:12 GMT
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
Date: Tue, 22 Jan 2019 09:45:12 GMT
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
Date: Tue, 22 Jan 2019 09:45:13 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/baab9603-f09a-4ab7-a269-4d8b794cd0f6
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
  "uid": "baab9603-f09a-4ab7-a269-4d8b794cd0f6",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/baab9603-f09a-4ab7-a269-4d8b794cd0f6",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/baab9603-f09a-4ab7-a269-4d8b794cd0f6"
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
Date: Tue, 22 Jan 2019 09:45:13 GMT
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
Date: Tue, 22 Jan 2019 09:45:13 GMT
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
    "uid": "baab9603-f09a-4ab7-a269-4d8b794cd0f6",
    "title": "walk the dog",
    "order": 0,
    "completed": false,
    "href": "http://todo-backend-sinatra.herokuapp.com/todos/baab9603-f09a-4ab7-a269-4d8b794cd0f6",
    "url": "http://todo-backend-sinatra.herokuapp.com/todos/baab9603-f09a-4ab7-a269-4d8b794cd0f6"
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
Date: Tue, 22 Jan 2019 09:45:13 GMT
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
Date: Tue, 22 Jan 2019 09:45:14 GMT
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
Date: Tue, 22 Jan 2019 09:45:14 GMT
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
Date: Tue, 22 Jan 2019 09:45:14 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/05ab5c18-fd7d-4c66-a69d-46bec4c7320a
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
  "uid": "05ab5c18-fd7d-4c66-a69d-46bec4c7320a",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/05ab5c18-fd7d-4c66-a69d-46bec4c7320a",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/05ab5c18-fd7d-4c66-a69d-46bec4c7320a"
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
Date: Tue, 22 Jan 2019 09:45:15 GMT
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
Date: Tue, 22 Jan 2019 09:45:14 GMT
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
    "uid": "05ab5c18-fd7d-4c66-a69d-46bec4c7320a",
    "title": "blah",
    "order": 0,
    "completed": false,
    "href": "http://todo-backend-sinatra.herokuapp.com/todos/05ab5c18-fd7d-4c66-a69d-46bec4c7320a",
    "url": "http://todo-backend-sinatra.herokuapp.com/todos/05ab5c18-fd7d-4c66-a69d-46bec4c7320a"
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
Date: Tue, 22 Jan 2019 09:45:15 GMT
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
Date: Tue, 22 Jan 2019 09:45:15 GMT
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
Date: Tue, 22 Jan 2019 09:45:15 GMT
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
Date: Tue, 22 Jan 2019 09:45:16 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/d3808825-fd94-4fbb-a5c0-69a8879f1957
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
  "uid": "d3808825-fd94-4fbb-a5c0-69a8879f1957",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/d3808825-fd94-4fbb-a5c0-69a8879f1957",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/d3808825-fd94-4fbb-a5c0-69a8879f1957"
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
Date: Tue, 22 Jan 2019 09:45:16 GMT
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
Date: Tue, 22 Jan 2019 09:45:16 GMT
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
    "uid": "d3808825-fd94-4fbb-a5c0-69a8879f1957",
    "title": "blah",
    "order": 0,
    "completed": false,
    "href": "http://todo-backend-sinatra.herokuapp.com/todos/d3808825-fd94-4fbb-a5c0-69a8879f1957",
    "url": "http://todo-backend-sinatra.herokuapp.com/todos/d3808825-fd94-4fbb-a5c0-69a8879f1957"
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
Date: Tue, 22 Jan 2019 09:45:17 GMT
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
Date: Tue, 22 Jan 2019 09:45:16 GMT
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
Date: Tue, 22 Jan 2019 09:45:17 GMT
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
Date: Tue, 22 Jan 2019 09:45:17 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/222612c3-18f8-4ac9-8643-e38da86528b2
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
  "uid": "222612c3-18f8-4ac9-8643-e38da86528b2",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/222612c3-18f8-4ac9-8643-e38da86528b2",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/222612c3-18f8-4ac9-8643-e38da86528b2"
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
Date: Tue, 22 Jan 2019 09:45:18 GMT
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
Date: Tue, 22 Jan 2019 09:45:19 GMT
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
Date: Tue, 22 Jan 2019 09:45:19 GMT
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
Date: Tue, 22 Jan 2019 09:45:19 GMT
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
Date: Tue, 22 Jan 2019 09:45:19 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/a26415e6-e295-4a31-9d07-77d0dd9204d7
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
  "uid": "a26415e6-e295-4a31-9d07-77d0dd9204d7",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/a26415e6-e295-4a31-9d07-77d0dd9204d7",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/a26415e6-e295-4a31-9d07-77d0dd9204d7"
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
Date: Tue, 22 Jan 2019 09:45:20 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/e6b1989c-4191-435d-a612-f1f41d0632da
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
  "uid": "e6b1989c-4191-435d-a612-f1f41d0632da",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/e6b1989c-4191-435d-a612-f1f41d0632da",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/e6b1989c-4191-435d-a612-f1f41d0632da"
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
Date: Tue, 22 Jan 2019 09:45:19 GMT
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
Date: Tue, 22 Jan 2019 09:45:20 GMT
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
    "uid": "a26415e6-e295-4a31-9d07-77d0dd9204d7",
    "title": "todo the first",
    "order": 0,
    "completed": false,
    "href": "http://todo-backend-sinatra.herokuapp.com/todos/a26415e6-e295-4a31-9d07-77d0dd9204d7",
    "url": "http://todo-backend-sinatra.herokuapp.com/todos/a26415e6-e295-4a31-9d07-77d0dd9204d7"
  },
  {
    "uid": "e6b1989c-4191-435d-a612-f1f41d0632da",
    "title": "todo the second",
    "order": 0,
    "completed": false,
    "href": "http://todo-backend-sinatra.herokuapp.com/todos/e6b1989c-4191-435d-a612-f1f41d0632da",
    "url": "http://todo-backend-sinatra.herokuapp.com/todos/e6b1989c-4191-435d-a612-f1f41d0632da"
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
Date: Tue, 22 Jan 2019 09:45:21 GMT
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
Date: Tue, 22 Jan 2019 09:45:20 GMT
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
Date: Tue, 22 Jan 2019 09:45:21 GMT
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
Date: Tue, 22 Jan 2019 09:45:21 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/d87e265e-3b74-404a-9a0a-f6759e82f397
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
  "uid": "d87e265e-3b74-404a-9a0a-f6759e82f397",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/d87e265e-3b74-404a-9a0a-f6759e82f397",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/d87e265e-3b74-404a-9a0a-f6759e82f397"
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
Date: Tue, 22 Jan 2019 09:45:21 GMT
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
Date: Tue, 22 Jan 2019 09:45:22 GMT
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
Date: Tue, 22 Jan 2019 09:45:22 GMT
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
Date: Tue, 22 Jan 2019 09:45:22 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/f475a1da-bbe2-4741-b1d2-79ed4a92f0d4
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
  "uid": "f475a1da-bbe2-4741-b1d2-79ed4a92f0d4",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/f475a1da-bbe2-4741-b1d2-79ed4a92f0d4",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/f475a1da-bbe2-4741-b1d2-79ed4a92f0d4"
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
Date: Tue, 22 Jan 2019 09:45:23 GMT
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
Date: Tue, 22 Jan 2019 09:45:24 GMT
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
Date: Tue, 22 Jan 2019 09:45:24 GMT
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
Date: Tue, 22 Jan 2019 09:45:24 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/34eb6eaf-e792-45d0-8044-e27201500587
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
  "uid": "34eb6eaf-e792-45d0-8044-e27201500587",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/34eb6eaf-e792-45d0-8044-e27201500587",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/34eb6eaf-e792-45d0-8044-e27201500587"
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
Date: Tue, 22 Jan 2019 09:45:25 GMT
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
Date: Tue, 22 Jan 2019 09:45:25 GMT
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
    "uid": "34eb6eaf-e792-45d0-8044-e27201500587",
    "title": "changed title",
    "order": 0,
    "completed": true,
    "href": "http://todo-backend-sinatra.herokuapp.com/todos/34eb6eaf-e792-45d0-8044-e27201500587",
    "url": "http://todo-backend-sinatra.herokuapp.com/todos/34eb6eaf-e792-45d0-8044-e27201500587"
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
Date: Tue, 22 Jan 2019 09:45:25 GMT
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
Date: Tue, 22 Jan 2019 09:45:26 GMT
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
Date: Tue, 22 Jan 2019 09:45:26 GMT
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
Date: Tue, 22 Jan 2019 09:45:27 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/4b661c7b-b17f-4651-a7dc-94f9895f119d
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
  "uid": "4b661c7b-b17f-4651-a7dc-94f9895f119d",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/4b661c7b-b17f-4651-a7dc-94f9895f119d",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/4b661c7b-b17f-4651-a7dc-94f9895f119d"
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
Date: Tue, 22 Jan 2019 09:45:27 GMT
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
Date: Tue, 22 Jan 2019 09:45:28 GMT
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
Date: Tue, 22 Jan 2019 09:45:28 GMT
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
Date: Tue, 22 Jan 2019 09:45:28 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/13fb2abe-43a2-4d3c-aaa7-84e118677bf6
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
  "uid": "13fb2abe-43a2-4d3c-aaa7-84e118677bf6",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/13fb2abe-43a2-4d3c-aaa7-84e118677bf6",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/13fb2abe-43a2-4d3c-aaa7-84e118677bf6"
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
Date: Tue, 22 Jan 2019 09:45:28 GMT
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
Date: Tue, 22 Jan 2019 09:45:28 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/86a62dda-5c14-4d7d-927f-38a211d005b8
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
  "uid": "86a62dda-5c14-4d7d-927f-38a211d005b8",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/86a62dda-5c14-4d7d-927f-38a211d005b8",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/86a62dda-5c14-4d7d-927f-38a211d005b8"
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
Date: Tue, 22 Jan 2019 09:45:29 GMT
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
Date: Tue, 22 Jan 2019 09:45:30 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/62dc03cf-a572-4b99-ac49-c26dc02ef6b7
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
  "uid": "62dc03cf-a572-4b99-ac49-c26dc02ef6b7",
  "completed": false,
  "href": "http://todo-backend-sinatra.herokuapp.com/todos/62dc03cf-a572-4b99-ac49-c26dc02ef6b7",
  "url": "http://todo-backend-sinatra.herokuapp.com/todos/62dc03cf-a572-4b99-ac49-c26dc02ef6b7"
}
```

