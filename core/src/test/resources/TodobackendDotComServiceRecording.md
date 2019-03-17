## Interaction 0: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: */*
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: GET
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Date: Sun, 17 Mar 2019 15:44:52 GMT
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
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 1005
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:44:53 GMT
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
      "uid": "26d08ef6-f768-4a66-8ce8-d3825bfcfd93",
      "title": "blah",
      "order": 523,
      "completed": false,
      "href": "http://todo-backend-sinatra.herokuapp.com/todos/26d08ef6-f768-4a66-8ce8-d3825bfcfd93",
      "url": "http://todo-backend-sinatra.herokuapp.com/todos/26d08ef6-f768-4a66-8ce8-d3825bfcfd93"
   },
   {
      "uid": "8f70156f-79e1-49a4-b078-6293541ab4b4",
      "title": "blah",
      "order": 95,
      "completed": false,
      "href": "http://todo-backend-sinatra.herokuapp.com/todos/8f70156f-79e1-49a4-b078-6293541ab4b4",
      "url": "http://todo-backend-sinatra.herokuapp.com/todos/8f70156f-79e1-49a4-b078-6293541ab4b4"
   },
   {
      "uid": "ab293b9e-91a8-4810-ad3f-d7214b35df85",
      "title": "blah",
      "order": 95,
      "completed": false,
      "href": "http://todo-backend-sinatra.herokuapp.com/todos/ab293b9e-91a8-4810-ad3f-d7214b35df85",
      "url": "http://todo-backend-sinatra.herokuapp.com/todos/ab293b9e-91a8-4810-ad3f-d7214b35df85"
   }
]
```

## Interaction 2: POST /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 18
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Content-Length: 294
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:44:53 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/61336ae3-4d43-4c46-b791-c90d92c59272
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
   "uid": "61336ae3-4d43-4c46-b791-c90d92c59272",
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/61336ae3-4d43-4c46-b791-c90d92c59272",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/61336ae3-4d43-4c46-b791-c90d92c59272"
}
```

## Interaction 3: DELETE /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Sun, 17 Mar 2019 15:44:54 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## Interaction 4: DELETE /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Sun, 17 Mar 2019 15:44:54 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## Interaction 5: GET /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Date: Sun, 17 Mar 2019 15:44:54 GMT
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

## Interaction 6: DELETE /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Sun, 17 Mar 2019 15:44:54 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## Interaction 7: POST /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 24
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Content-Length: 300
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:44:54 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/040492e3-3831-4ed5-9fb0-e2f0e699e849
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
   "uid": "040492e3-3831-4ed5-9fb0-e2f0e699e849",
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/040492e3-3831-4ed5-9fb0-e2f0e699e849",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/040492e3-3831-4ed5-9fb0-e2f0e699e849"
}
```

## Interaction 8: GET /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 343
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:44:54 GMT
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
      "uid": "040492e3-3831-4ed5-9fb0-e2f0e699e849",
      "title": "walk the dog",
      "order": 0,
      "completed": false,
      "href": "http://todo-backend-sinatra.herokuapp.com/todos/040492e3-3831-4ed5-9fb0-e2f0e699e849",
      "url": "http://todo-backend-sinatra.herokuapp.com/todos/040492e3-3831-4ed5-9fb0-e2f0e699e849"
   }
]
```

## Interaction 9: DELETE /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Sun, 17 Mar 2019 15:44:54 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## Interaction 10: POST /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Content-Length: 292
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:44:55 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/722d51bd-f88e-407b-b6ac-c9a4505c9b51
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
   "uid": "722d51bd-f88e-407b-b6ac-c9a4505c9b51",
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/722d51bd-f88e-407b-b6ac-c9a4505c9b51",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/722d51bd-f88e-407b-b6ac-c9a4505c9b51"
}
```

## Interaction 11: GET /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 335
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:44:55 GMT
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
      "uid": "722d51bd-f88e-407b-b6ac-c9a4505c9b51",
      "title": "blah",
      "order": 0,
      "completed": false,
      "href": "http://todo-backend-sinatra.herokuapp.com/todos/722d51bd-f88e-407b-b6ac-c9a4505c9b51",
      "url": "http://todo-backend-sinatra.herokuapp.com/todos/722d51bd-f88e-407b-b6ac-c9a4505c9b51"
   }
]
```

## Interaction 12: DELETE /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Sun, 17 Mar 2019 15:44:55 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## Interaction 13: POST /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Content-Length: 292
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:44:55 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/77bf4fdb-a93c-4826-9bc1-ad86b94dccc1
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
   "uid": "77bf4fdb-a93c-4826-9bc1-ad86b94dccc1",
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/77bf4fdb-a93c-4826-9bc1-ad86b94dccc1",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/77bf4fdb-a93c-4826-9bc1-ad86b94dccc1"
}
```

## Interaction 14: GET /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 335
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:44:55 GMT
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
      "uid": "77bf4fdb-a93c-4826-9bc1-ad86b94dccc1",
      "title": "blah",
      "order": 0,
      "completed": false,
      "href": "http://todo-backend-sinatra.herokuapp.com/todos/77bf4fdb-a93c-4826-9bc1-ad86b94dccc1",
      "url": "http://todo-backend-sinatra.herokuapp.com/todos/77bf4fdb-a93c-4826-9bc1-ad86b94dccc1"
   }
]
```

## Interaction 15: DELETE /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Sun, 17 Mar 2019 15:44:55 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## Interaction 16: POST /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 19
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Content-Length: 295
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:44:55 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/959aad41-523d-4bc7-84d7-a2c69e8d56eb
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
   "uid": "959aad41-523d-4bc7-84d7-a2c69e8d56eb",
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/959aad41-523d-4bc7-84d7-a2c69e8d56eb",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/959aad41-523d-4bc7-84d7-a2c69e8d56eb"
}
```

## Interaction 17: OPTIONS /todos/959aad41-523d-4bc7-84d7-a2c69e8d56eb

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: */*
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: GET
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Date: Sun, 17 Mar 2019 15:44:55 GMT
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

## Interaction 18: GET /todos/959aad41-523d-4bc7-84d7-a2c69e8d56eb

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 310
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:44:55 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
{
   "uid": "959aad41-523d-4bc7-84d7-a2c69e8d56eb",
   "title": "my todo",
   "order": 0,
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/959aad41-523d-4bc7-84d7-a2c69e8d56eb",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/959aad41-523d-4bc7-84d7-a2c69e8d56eb"
}
```

## Interaction 19: DELETE /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Sun, 17 Mar 2019 15:44:55 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## Interaction 20: POST /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 26
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Content-Length: 302
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:44:55 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/c989f51c-83f9-45e5-9ca0-c98e3784d2dc
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
   "uid": "c989f51c-83f9-45e5-9ca0-c98e3784d2dc",
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/c989f51c-83f9-45e5-9ca0-c98e3784d2dc",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/c989f51c-83f9-45e5-9ca0-c98e3784d2dc"
}
```

## Interaction 21: POST /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 27
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Content-Length: 303
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:44:56 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/6d7c623e-5cbc-42f9-9318-33ffc6c75f0c
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
   "uid": "6d7c623e-5cbc-42f9-9318-33ffc6c75f0c",
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/6d7c623e-5cbc-42f9-9318-33ffc6c75f0c",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/6d7c623e-5cbc-42f9-9318-33ffc6c75f0c"
}
```

## Interaction 22: GET /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 689
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:44:56 GMT
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
      "uid": "c989f51c-83f9-45e5-9ca0-c98e3784d2dc",
      "title": "todo the first",
      "order": 0,
      "completed": false,
      "href": "http://todo-backend-sinatra.herokuapp.com/todos/c989f51c-83f9-45e5-9ca0-c98e3784d2dc",
      "url": "http://todo-backend-sinatra.herokuapp.com/todos/c989f51c-83f9-45e5-9ca0-c98e3784d2dc"
   },
   {
      "uid": "6d7c623e-5cbc-42f9-9318-33ffc6c75f0c",
      "title": "todo the second",
      "order": 0,
      "completed": false,
      "href": "http://todo-backend-sinatra.herokuapp.com/todos/6d7c623e-5cbc-42f9-9318-33ffc6c75f0c",
      "url": "http://todo-backend-sinatra.herokuapp.com/todos/6d7c623e-5cbc-42f9-9318-33ffc6c75f0c"
   }
]
```

## Interaction 23: OPTIONS /todos/c989f51c-83f9-45e5-9ca0-c98e3784d2dc

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: */*
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: GET
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Date: Sun, 17 Mar 2019 15:44:56 GMT
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

## Interaction 24: GET /todos/c989f51c-83f9-45e5-9ca0-c98e3784d2dc

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 317
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:44:56 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
{
   "uid": "c989f51c-83f9-45e5-9ca0-c98e3784d2dc",
   "title": "todo the first",
   "order": 0,
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/c989f51c-83f9-45e5-9ca0-c98e3784d2dc",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/c989f51c-83f9-45e5-9ca0-c98e3784d2dc"
}
```

## Interaction 25: DELETE /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Sun, 17 Mar 2019 15:44:57 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## Interaction 26: POST /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 25
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Content-Length: 301
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:44:57 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/1c6354ee-fdac-4664-bd01-0b93b5c09f8a
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
   "uid": "1c6354ee-fdac-4664-bd01-0b93b5c09f8a",
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/1c6354ee-fdac-4664-bd01-0b93b5c09f8a",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/1c6354ee-fdac-4664-bd01-0b93b5c09f8a"
}
```

## Interaction 27: OPTIONS /todos/1c6354ee-fdac-4664-bd01-0b93b5c09f8a

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: */*
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: PATCH
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Date: Sun, 17 Mar 2019 15:44:57 GMT
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

## Interaction 28: PATCH /todos/1c6354ee-fdac-4664-bd01-0b93b5c09f8a

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 25
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Content-Length: 316
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:44:57 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
{
   "uid": "1c6354ee-fdac-4664-bd01-0b93b5c09f8a",
   "title": "bathe the cat",
   "order": 0,
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/1c6354ee-fdac-4664-bd01-0b93b5c09f8a",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/1c6354ee-fdac-4664-bd01-0b93b5c09f8a"
}
```

## Interaction 29: DELETE /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Sun, 17 Mar 2019 15:44:57 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## Interaction 30: POST /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Content-Length: 292
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:44:58 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/52a019a0-daae-41e6-8f1f-3190d6aa9157
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
   "uid": "52a019a0-daae-41e6-8f1f-3190d6aa9157",
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/52a019a0-daae-41e6-8f1f-3190d6aa9157",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/52a019a0-daae-41e6-8f1f-3190d6aa9157"
}
```

## Interaction 31: OPTIONS /todos/52a019a0-daae-41e6-8f1f-3190d6aa9157

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: */*
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: PATCH
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Date: Sun, 17 Mar 2019 15:44:58 GMT
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

## Interaction 32: PATCH /todos/52a019a0-daae-41e6-8f1f-3190d6aa9157

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 18
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Content-Length: 306
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:44:58 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
{
   "uid": "52a019a0-daae-41e6-8f1f-3190d6aa9157",
   "title": "blah",
   "order": 0,
   "completed": true,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/52a019a0-daae-41e6-8f1f-3190d6aa9157",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/52a019a0-daae-41e6-8f1f-3190d6aa9157"
}
```

## Interaction 33: DELETE /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Sun, 17 Mar 2019 15:44:58 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## Interaction 34: POST /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Content-Length: 292
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:44:58 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/52d4ac81-f913-4f69-9139-34da8fc20eb0
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
   "uid": "52d4ac81-f913-4f69-9139-34da8fc20eb0",
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/52d4ac81-f913-4f69-9139-34da8fc20eb0",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/52d4ac81-f913-4f69-9139-34da8fc20eb0"
}
```

## Interaction 35: OPTIONS /todos/52d4ac81-f913-4f69-9139-34da8fc20eb0

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: */*
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: PATCH
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Date: Sun, 17 Mar 2019 15:44:58 GMT
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

## Interaction 36: PATCH /todos/52d4ac81-f913-4f69-9139-34da8fc20eb0

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 42
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Content-Length: 315
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:44:58 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
{
   "uid": "52d4ac81-f913-4f69-9139-34da8fc20eb0",
   "title": "changed title",
   "order": 0,
   "completed": true,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/52d4ac81-f913-4f69-9139-34da8fc20eb0",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/52d4ac81-f913-4f69-9139-34da8fc20eb0"
}
```

## Interaction 37: GET /todos/52d4ac81-f913-4f69-9139-34da8fc20eb0

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 315
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:44:59 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
{
   "uid": "52d4ac81-f913-4f69-9139-34da8fc20eb0",
   "title": "changed title",
   "order": 0,
   "completed": true,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/52d4ac81-f913-4f69-9139-34da8fc20eb0",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/52d4ac81-f913-4f69-9139-34da8fc20eb0"
}
```

## Interaction 38: OPTIONS /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: */*
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: GET
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Date: Sun, 17 Mar 2019 15:44:58 GMT
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

## Interaction 39: GET /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 343
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:44:59 GMT
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
      "uid": "52d4ac81-f913-4f69-9139-34da8fc20eb0",
      "title": "changed title",
      "order": 0,
      "completed": true,
      "href": "http://todo-backend-sinatra.herokuapp.com/todos/52d4ac81-f913-4f69-9139-34da8fc20eb0",
      "url": "http://todo-backend-sinatra.herokuapp.com/todos/52d4ac81-f913-4f69-9139-34da8fc20eb0"
   }
]
```

## Interaction 40: DELETE /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Sun, 17 Mar 2019 15:44:59 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## Interaction 41: POST /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Content-Length: 292
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:44:59 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/278635d2-2d6a-4f5d-af6d-a3c30708466d
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
   "uid": "278635d2-2d6a-4f5d-af6d-a3c30708466d",
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/278635d2-2d6a-4f5d-af6d-a3c30708466d",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/278635d2-2d6a-4f5d-af6d-a3c30708466d"
}
```

## Interaction 42: OPTIONS /todos/278635d2-2d6a-4f5d-af6d-a3c30708466d

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: */*
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: DELETE
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Date: Sun, 17 Mar 2019 15:44:59 GMT
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

## Interaction 43: DELETE /todos/278635d2-2d6a-4f5d-af6d-a3c30708466d

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Sun, 17 Mar 2019 15:44:59 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Resulting body back from the real server (204: null - Base64 below):

```

```

## Interaction 44: GET /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Date: Sun, 17 Mar 2019 15:44:59 GMT
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

## Interaction 45: POST /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 28
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Content-Length: 309
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:44:59 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/fbce1789-9db6-49c4-ade7-8b0a967bb2ef
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
   "uid": "fbce1789-9db6-49c4-ade7-8b0a967bb2ef",
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/fbce1789-9db6-49c4-ade7-8b0a967bb2ef",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/fbce1789-9db6-49c4-ade7-8b0a967bb2ef"
}
```

## Interaction 46: POST /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 27
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Content-Length: 308
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:45:00 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/5621b93e-c752-4b39-aacd-24ffc9373648
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
   "uid": "5621b93e-c752-4b39-aacd-24ffc9373648",
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/5621b93e-c752-4b39-aacd-24ffc9373648",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/5621b93e-c752-4b39-aacd-24ffc9373648"
}
```

## Interaction 47: OPTIONS /todos/5621b93e-c752-4b39-aacd-24ffc9373648

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: */*
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: PATCH
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Date: Sun, 17 Mar 2019 15:45:00 GMT
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

## Interaction 48: PATCH /todos/5621b93e-c752-4b39-aacd-24ffc9373648

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 12
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Content-Length: 308
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:45:00 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
{
   "uid": "5621b93e-c752-4b39-aacd-24ffc9373648",
   "title": "blah",
   "order": 95,
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/5621b93e-c752-4b39-aacd-24ffc9373648",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/5621b93e-c752-4b39-aacd-24ffc9373648"
}
```

## Interaction 49: POST /todos

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 27
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Content-Length: 308
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:45:00 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/bdc2911b-2bd5-478c-bca7-47405cdc7f29
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
   "uid": "bdc2911b-2bd5-478c-bca7-47405cdc7f29",
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/bdc2911b-2bd5-478c-bca7-47405cdc7f29",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/bdc2911b-2bd5-478c-bca7-47405cdc7f29"
}
```

## Interaction 50: OPTIONS /todos/bdc2911b-2bd5-478c-bca7-47405cdc7f29

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: */*
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: PATCH
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Date: Sun, 17 Mar 2019 15:45:00 GMT
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

## Interaction 51: PATCH /todos/bdc2911b-2bd5-478c-bca7-47405cdc7f29

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 12
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
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
Content-Length: 308
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:45:00 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
{
   "uid": "bdc2911b-2bd5-478c-bca7-47405cdc7f29",
   "title": "blah",
   "order": 95,
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/bdc2911b-2bd5-478c-bca7-47405cdc7f29",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/bdc2911b-2bd5-478c-bca7-47405cdc7f29"
}
```

## Interaction 52: GET /todos/bdc2911b-2bd5-478c-bca7-47405cdc7f29

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 308
Content-Type: text/html;charset=utf-8
Date: Sun, 17 Mar 2019 15:45:00 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
{
   "uid": "bdc2911b-2bd5-478c-bca7-47405cdc7f29",
   "title": "blah",
   "order": 95,
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/bdc2911b-2bd5-478c-bca7-47405cdc7f29",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/bdc2911b-2bd5-478c-bca7-47405cdc7f29"
}
```

