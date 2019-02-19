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
Date: Tue, 19 Feb 2019 10:17:33 GMT
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
Date: Tue, 19 Feb 2019 10:17:33 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 885
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
      "uid": "f89541ff-7226-4623-857a-3845a558d128",
      "title": "blah",
      "order": 523,
      "completed": false,
      "href": "http://localhost:8099/todos/f89541ff-7226-4623-857a-3845a558d128",
      "url": "http://localhost:8099/todos/f89541ff-7226-4623-857a-3845a558d128"
   },
   {
      "uid": "0f51b651-310f-409b-b025-ca790995b1c6",
      "title": "blah",
      "order": 95,
      "completed": false,
      "href": "http://localhost:8099/todos/0f51b651-310f-409b-b025-ca790995b1c6",
      "url": "http://localhost:8099/todos/0f51b651-310f-409b-b025-ca790995b1c6"
   },
   {
      "uid": "ad690393-91a4-4450-aafb-7824a37753bf",
      "title": "blah",
      "order": 95,
      "completed": false,
      "href": "http://localhost:8099/todos/ad690393-91a4-4450-aafb-7824a37753bf",
      "url": "http://localhost:8099/todos/ad690393-91a4-4450-aafb-7824a37753bf"
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
Date: Tue, 19 Feb 2019 10:17:33 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/426bb4e1-0b34-4037-8a01-4ba207da165c
Content-Length: 254
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
   "uid": "426bb4e1-0b34-4037-8a01-4ba207da165c",
   "completed": false,
   "href": "http://localhost:8099/todos/426bb4e1-0b34-4037-8a01-4ba207da165c",
   "url": "http://localhost:8099/todos/426bb4e1-0b34-4037-8a01-4ba207da165c"
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
Date: Tue, 19 Feb 2019 10:17:33 GMT
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
Date: Tue, 19 Feb 2019 10:17:33 GMT
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
Date: Tue, 19 Feb 2019 10:17:33 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 3
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
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
Date: Tue, 19 Feb 2019 10:17:34 GMT
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
Date: Tue, 19 Feb 2019 10:17:34 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/1aafc9ca-ec3e-4972-ac3f-e6f654cc9f07
Content-Length: 260
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
   "uid": "1aafc9ca-ec3e-4972-ac3f-e6f654cc9f07",
   "completed": false,
   "href": "http://localhost:8099/todos/1aafc9ca-ec3e-4972-ac3f-e6f654cc9f07",
   "url": "http://localhost:8099/todos/1aafc9ca-ec3e-4972-ac3f-e6f654cc9f07"
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
Date: Tue, 19 Feb 2019 10:17:34 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 303
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
      "uid": "1aafc9ca-ec3e-4972-ac3f-e6f654cc9f07",
      "title": "walk the dog",
      "order": 0,
      "completed": false,
      "href": "http://localhost:8099/todos/1aafc9ca-ec3e-4972-ac3f-e6f654cc9f07",
      "url": "http://localhost:8099/todos/1aafc9ca-ec3e-4972-ac3f-e6f654cc9f07"
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
Date: Tue, 19 Feb 2019 10:17:34 GMT
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
Date: Tue, 19 Feb 2019 10:17:34 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/f091ee63-3679-4930-97bb-51283f0beb25
Content-Length: 252
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
   "uid": "f091ee63-3679-4930-97bb-51283f0beb25",
   "completed": false,
   "href": "http://localhost:8099/todos/f091ee63-3679-4930-97bb-51283f0beb25",
   "url": "http://localhost:8099/todos/f091ee63-3679-4930-97bb-51283f0beb25"
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
Date: Tue, 19 Feb 2019 10:17:34 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 295
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
      "uid": "f091ee63-3679-4930-97bb-51283f0beb25",
      "title": "blah",
      "order": 0,
      "completed": false,
      "href": "http://localhost:8099/todos/f091ee63-3679-4930-97bb-51283f0beb25",
      "url": "http://localhost:8099/todos/f091ee63-3679-4930-97bb-51283f0beb25"
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
Date: Tue, 19 Feb 2019 10:17:34 GMT
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
Date: Tue, 19 Feb 2019 10:17:35 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/05492e43-059c-416a-a4a4-94c6251466b6
Content-Length: 252
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
   "uid": "05492e43-059c-416a-a4a4-94c6251466b6",
   "completed": false,
   "href": "http://localhost:8099/todos/05492e43-059c-416a-a4a4-94c6251466b6",
   "url": "http://localhost:8099/todos/05492e43-059c-416a-a4a4-94c6251466b6"
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
Date: Tue, 19 Feb 2019 10:17:35 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 295
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
      "uid": "05492e43-059c-416a-a4a4-94c6251466b6",
      "title": "blah",
      "order": 0,
      "completed": false,
      "href": "http://localhost:8099/todos/05492e43-059c-416a-a4a4-94c6251466b6",
      "url": "http://localhost:8099/todos/05492e43-059c-416a-a4a4-94c6251466b6"
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
Date: Tue, 19 Feb 2019 10:17:35 GMT
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
Date: Tue, 19 Feb 2019 10:17:35 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/9aba189a-b736-4189-89b3-46510d2f6f32
Content-Length: 255
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
   "uid": "9aba189a-b736-4189-89b3-46510d2f6f32",
   "completed": false,
   "href": "http://localhost:8099/todos/9aba189a-b736-4189-89b3-46510d2f6f32",
   "url": "http://localhost:8099/todos/9aba189a-b736-4189-89b3-46510d2f6f32"
}
```

## Interaction 17: OPTIONS /todos/9aba189a-b736-4189-89b3-46510d2f6f32

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
Date: Tue, 19 Feb 2019 10:17:35 GMT
Connection: close
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,PATCH,HEAD,DELETE,OPTIONS
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

## Interaction 18: GET /todos/9aba189a-b736-4189-89b3-46510d2f6f32

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
Date: Tue, 19 Feb 2019 10:17:36 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 270
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
{
   "uid": "9aba189a-b736-4189-89b3-46510d2f6f32",
   "title": "my todo",
   "order": 0,
   "completed": false,
   "href": "http://localhost:8099/todos/9aba189a-b736-4189-89b3-46510d2f6f32",
   "url": "http://localhost:8099/todos/9aba189a-b736-4189-89b3-46510d2f6f32"
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
Date: Tue, 19 Feb 2019 10:17:36 GMT
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
Date: Tue, 19 Feb 2019 10:17:36 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/ea759a56-5c51-4e95-bb79-8b322b938dab
Content-Length: 262
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
   "uid": "ea759a56-5c51-4e95-bb79-8b322b938dab",
   "completed": false,
   "href": "http://localhost:8099/todos/ea759a56-5c51-4e95-bb79-8b322b938dab",
   "url": "http://localhost:8099/todos/ea759a56-5c51-4e95-bb79-8b322b938dab"
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
Date: Tue, 19 Feb 2019 10:17:36 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/b75845d8-b9a9-41a1-9a09-6f346b042fcb
Content-Length: 263
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
   "uid": "b75845d8-b9a9-41a1-9a09-6f346b042fcb",
   "completed": false,
   "href": "http://localhost:8099/todos/b75845d8-b9a9-41a1-9a09-6f346b042fcb",
   "url": "http://localhost:8099/todos/b75845d8-b9a9-41a1-9a09-6f346b042fcb"
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
Date: Tue, 19 Feb 2019 10:17:36 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 609
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
      "uid": "ea759a56-5c51-4e95-bb79-8b322b938dab",
      "title": "todo the first",
      "order": 0,
      "completed": false,
      "href": "http://localhost:8099/todos/ea759a56-5c51-4e95-bb79-8b322b938dab",
      "url": "http://localhost:8099/todos/ea759a56-5c51-4e95-bb79-8b322b938dab"
   },
   {
      "uid": "b75845d8-b9a9-41a1-9a09-6f346b042fcb",
      "title": "todo the second",
      "order": 0,
      "completed": false,
      "href": "http://localhost:8099/todos/b75845d8-b9a9-41a1-9a09-6f346b042fcb",
      "url": "http://localhost:8099/todos/b75845d8-b9a9-41a1-9a09-6f346b042fcb"
   }
]
```

## Interaction 23: OPTIONS /todos/ea759a56-5c51-4e95-bb79-8b322b938dab

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
Date: Tue, 19 Feb 2019 10:17:36 GMT
Connection: close
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,PATCH,HEAD,DELETE,OPTIONS
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

## Interaction 24: GET /todos/ea759a56-5c51-4e95-bb79-8b322b938dab

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
Date: Tue, 19 Feb 2019 10:17:37 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 277
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
{
   "uid": "ea759a56-5c51-4e95-bb79-8b322b938dab",
   "title": "todo the first",
   "order": 0,
   "completed": false,
   "href": "http://localhost:8099/todos/ea759a56-5c51-4e95-bb79-8b322b938dab",
   "url": "http://localhost:8099/todos/ea759a56-5c51-4e95-bb79-8b322b938dab"
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
Date: Tue, 19 Feb 2019 10:17:37 GMT
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
Date: Tue, 19 Feb 2019 10:17:37 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/6146768b-70b1-4548-a54c-07eacb58c9b9
Content-Length: 261
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
   "uid": "6146768b-70b1-4548-a54c-07eacb58c9b9",
   "completed": false,
   "href": "http://localhost:8099/todos/6146768b-70b1-4548-a54c-07eacb58c9b9",
   "url": "http://localhost:8099/todos/6146768b-70b1-4548-a54c-07eacb58c9b9"
}
```

## Interaction 27: OPTIONS /todos/6146768b-70b1-4548-a54c-07eacb58c9b9

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
Date: Tue, 19 Feb 2019 10:17:37 GMT
Connection: close
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,PATCH,HEAD,DELETE,OPTIONS
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

## Interaction 28: PATCH /todos/6146768b-70b1-4548-a54c-07eacb58c9b9

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
Date: Tue, 19 Feb 2019 10:17:37 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 276
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
{
   "uid": "6146768b-70b1-4548-a54c-07eacb58c9b9",
   "title": "bathe the cat",
   "order": 0,
   "completed": false,
   "href": "http://localhost:8099/todos/6146768b-70b1-4548-a54c-07eacb58c9b9",
   "url": "http://localhost:8099/todos/6146768b-70b1-4548-a54c-07eacb58c9b9"
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
Date: Tue, 19 Feb 2019 10:17:37 GMT
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
Date: Tue, 19 Feb 2019 10:17:37 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/8aff8097-af1e-499c-94cb-f241a937113b
Content-Length: 252
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
   "uid": "8aff8097-af1e-499c-94cb-f241a937113b",
   "completed": false,
   "href": "http://localhost:8099/todos/8aff8097-af1e-499c-94cb-f241a937113b",
   "url": "http://localhost:8099/todos/8aff8097-af1e-499c-94cb-f241a937113b"
}
```

## Interaction 31: OPTIONS /todos/8aff8097-af1e-499c-94cb-f241a937113b

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
Date: Tue, 19 Feb 2019 10:17:37 GMT
Connection: close
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,PATCH,HEAD,DELETE,OPTIONS
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

## Interaction 32: PATCH /todos/8aff8097-af1e-499c-94cb-f241a937113b

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
Date: Tue, 19 Feb 2019 10:17:38 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 266
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
{
   "uid": "8aff8097-af1e-499c-94cb-f241a937113b",
   "title": "blah",
   "order": 0,
   "completed": true,
   "href": "http://localhost:8099/todos/8aff8097-af1e-499c-94cb-f241a937113b",
   "url": "http://localhost:8099/todos/8aff8097-af1e-499c-94cb-f241a937113b"
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
Date: Tue, 19 Feb 2019 10:17:38 GMT
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
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: */*
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: POST
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
Date: Tue, 19 Feb 2019 10:17:38 GMT
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

## Interaction 35: POST /todos

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
Date: Tue, 19 Feb 2019 10:17:39 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/dea27b1c-1fc0-46eb-88b8-e31b80760959
Content-Length: 252
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
   "uid": "dea27b1c-1fc0-46eb-88b8-e31b80760959",
   "completed": false,
   "href": "http://localhost:8099/todos/dea27b1c-1fc0-46eb-88b8-e31b80760959",
   "url": "http://localhost:8099/todos/dea27b1c-1fc0-46eb-88b8-e31b80760959"
}
```

## Interaction 36: OPTIONS /todos/dea27b1c-1fc0-46eb-88b8-e31b80760959

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
Date: Tue, 19 Feb 2019 10:17:39 GMT
Connection: close
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,PATCH,HEAD,DELETE,OPTIONS
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

## Interaction 37: PATCH /todos/dea27b1c-1fc0-46eb-88b8-e31b80760959

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
Date: Tue, 19 Feb 2019 10:17:39 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 275
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
{
   "uid": "dea27b1c-1fc0-46eb-88b8-e31b80760959",
   "title": "changed title",
   "order": 0,
   "completed": true,
   "href": "http://localhost:8099/todos/dea27b1c-1fc0-46eb-88b8-e31b80760959",
   "url": "http://localhost:8099/todos/dea27b1c-1fc0-46eb-88b8-e31b80760959"
}
```

## Interaction 38: GET /todos/dea27b1c-1fc0-46eb-88b8-e31b80760959

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
Date: Tue, 19 Feb 2019 10:17:39 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 275
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
{
   "uid": "dea27b1c-1fc0-46eb-88b8-e31b80760959",
   "title": "changed title",
   "order": 0,
   "completed": true,
   "href": "http://localhost:8099/todos/dea27b1c-1fc0-46eb-88b8-e31b80760959",
   "url": "http://localhost:8099/todos/dea27b1c-1fc0-46eb-88b8-e31b80760959"
}
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
Date: Tue, 19 Feb 2019 10:17:39 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 303
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
      "uid": "dea27b1c-1fc0-46eb-88b8-e31b80760959",
      "title": "changed title",
      "order": 0,
      "completed": true,
      "href": "http://localhost:8099/todos/dea27b1c-1fc0-46eb-88b8-e31b80760959",
      "url": "http://localhost:8099/todos/dea27b1c-1fc0-46eb-88b8-e31b80760959"
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
Date: Tue, 19 Feb 2019 10:17:39 GMT
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
Date: Tue, 19 Feb 2019 10:17:39 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/358223b5-4ea6-4473-ba0e-c258afefdb68
Content-Length: 252
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
   "uid": "358223b5-4ea6-4473-ba0e-c258afefdb68",
   "completed": false,
   "href": "http://localhost:8099/todos/358223b5-4ea6-4473-ba0e-c258afefdb68",
   "url": "http://localhost:8099/todos/358223b5-4ea6-4473-ba0e-c258afefdb68"
}
```

## Interaction 42: OPTIONS /todos/358223b5-4ea6-4473-ba0e-c258afefdb68

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
Date: Tue, 19 Feb 2019 10:17:39 GMT
Connection: close
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,PATCH,HEAD,DELETE,OPTIONS
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

## Interaction 43: DELETE /todos/358223b5-4ea6-4473-ba0e-c258afefdb68

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
Date: Tue, 19 Feb 2019 10:17:39 GMT
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
Date: Tue, 19 Feb 2019 10:17:40 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 3
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
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
Date: Tue, 19 Feb 2019 10:17:40 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/3ca11410-2e8c-490b-aa61-eadf0105ab51
Content-Length: 269
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
   "uid": "3ca11410-2e8c-490b-aa61-eadf0105ab51",
   "completed": false,
   "href": "http://localhost:8099/todos/3ca11410-2e8c-490b-aa61-eadf0105ab51",
   "url": "http://localhost:8099/todos/3ca11410-2e8c-490b-aa61-eadf0105ab51"
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
Date: Tue, 19 Feb 2019 10:17:40 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/42095086-d204-4467-9da8-f3468e3a37d8
Content-Length: 268
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
   "uid": "42095086-d204-4467-9da8-f3468e3a37d8",
   "completed": false,
   "href": "http://localhost:8099/todos/42095086-d204-4467-9da8-f3468e3a37d8",
   "url": "http://localhost:8099/todos/42095086-d204-4467-9da8-f3468e3a37d8"
}
```

## Interaction 47: OPTIONS /todos/42095086-d204-4467-9da8-f3468e3a37d8

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
Date: Tue, 19 Feb 2019 10:17:40 GMT
Connection: close
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,PATCH,HEAD,DELETE,OPTIONS
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

## Interaction 48: PATCH /todos/42095086-d204-4467-9da8-f3468e3a37d8

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
Date: Tue, 19 Feb 2019 10:17:41 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 268
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
{
   "uid": "42095086-d204-4467-9da8-f3468e3a37d8",
   "title": "blah",
   "order": 95,
   "completed": false,
   "href": "http://localhost:8099/todos/42095086-d204-4467-9da8-f3468e3a37d8",
   "url": "http://localhost:8099/todos/42095086-d204-4467-9da8-f3468e3a37d8"
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
Date: Tue, 19 Feb 2019 10:17:41 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Location: http://todo-backend-sinatra.herokuapp.com/todos/092d0567-07a0-4625-9817-f80447d42592
Content-Length: 268
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
   "uid": "092d0567-07a0-4625-9817-f80447d42592",
   "completed": false,
   "href": "http://localhost:8099/todos/092d0567-07a0-4625-9817-f80447d42592",
   "url": "http://localhost:8099/todos/092d0567-07a0-4625-9817-f80447d42592"
}
```

## Interaction 50: OPTIONS /todos/092d0567-07a0-4625-9817-f80447d42592

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
Date: Tue, 19 Feb 2019 10:17:41 GMT
Connection: close
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,PATCH,HEAD,DELETE,OPTIONS
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

## Interaction 51: PATCH /todos/092d0567-07a0-4625-9817-f80447d42592

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
Date: Tue, 19 Feb 2019 10:17:41 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 268
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
{
   "uid": "092d0567-07a0-4625-9817-f80447d42592",
   "title": "blah",
   "order": 95,
   "completed": false,
   "href": "http://localhost:8099/todos/092d0567-07a0-4625-9817-f80447d42592",
   "url": "http://localhost:8099/todos/092d0567-07a0-4625-9817-f80447d42592"
}
```

## Interaction 52: GET /todos/092d0567-07a0-4625-9817-f80447d42592

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
Date: Tue, 19 Feb 2019 10:17:41 GMT
Connection: keep-alive
Content-Type: text/html;charset=utf-8
Access-Control-Allow-Origin: *
Content-Length: 268
X-Xss-Protection: 1; mode=block
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/html;charset=utf-8):

```
{
   "uid": "092d0567-07a0-4625-9817-f80447d42592",
   "title": "blah",
   "order": 95,
   "completed": false,
   "href": "http://localhost:8099/todos/092d0567-07a0-4625-9817-f80447d42592",
   "url": "http://localhost:8099/todos/092d0567-07a0-4625-9817-f80447d42592"
}
```

