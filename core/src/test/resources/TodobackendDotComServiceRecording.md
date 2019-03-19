## Interaction 0: GET /todos

### Request headers for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Cookie: Webstorm-83fc7c3a=328bd980-db39-4ff1-b428-4a2de37a062c; __utma=111872281.305267849.1471227400.1493602468.1505656390.3
Host: todo-backend-sinatra.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### Request body for playback (application/json):

```

```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 780
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:17 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (200: text/html;charset=utf-8):

```
[
   {
      "uid": "MOCK-GUID-1",
      "title": "blah",
      "order": 523,
      "completed": false,
      "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-1",
      "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-1"
   },
   {
      "uid": "MOCK-GUID-2",
      "title": "blah",
      "order": 10,
      "completed": false,
      "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-2",
      "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-2"
   },
   {
      "uid": "MOCK-GUID-3",
      "title": "blah",
      "order": 10,
      "completed": false,
      "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-3",
      "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-3"
   }
]
```

## Interaction 1: OPTIONS /todos

### Request headers for playback:

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

### Request body for playback ():

```

```

### Response headers for playback:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:16 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 2: GET /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```

```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 780
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:17 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (200: text/html;charset=utf-8):

```
[
   {
      "uid": "MOCK-GUID-1",
      "title": "blah",
      "order": 523,
      "completed": false,
      "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-1",
      "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-1"
   },
   {
      "uid": "MOCK-GUID-2",
      "title": "blah",
      "order": 10,
      "completed": false,
      "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-2",
      "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-2"
   },
   {
      "uid": "MOCK-GUID-3",
      "title": "blah",
      "order": 10,
      "completed": false,
      "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-3",
      "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-3"
   }
]
```

## Interaction 3: POST /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```
{
   "title": "a todo"
}
```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 219
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:17 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/8b7ad848-0100-402b-9b7f-a9b90b01d0a8
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (201: text/html;charset=utf-8):

```
{
   "title": "a todo",
   "uid": "MOCK-GUID-4",
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-4",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-4"
}
```

## Interaction 4: DELETE /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```

```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Tue, 19 Mar 2019 05:23:18 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Response body for playback (204: null - Base64 below):

```

```

## Interaction 5: DELETE /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```

```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Tue, 19 Mar 2019 05:23:18 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Response body for playback (204: null - Base64 below):

```

```

## Interaction 6: DELETE /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```

```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Tue, 19 Mar 2019 05:23:18 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Response body for playback (204: null - Base64 below):

```

```

## Interaction 7: POST /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```
{
   "title": "walk the dog"
}
```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 225
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:18 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/31cc78e5-a4ab-41a2-92dd-3e8b641914c1
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (201: text/html;charset=utf-8):

```
{
   "title": "walk the dog",
   "uid": "MOCK-GUID-5",
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-5",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-5"
}
```

## Interaction 8: GET /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```

```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 268
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:18 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (200: text/html;charset=utf-8):

```
[
   {
      "uid": "MOCK-GUID-5",
      "title": "walk the dog",
      "order": 0,
      "completed": false,
      "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-5",
      "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-5"
   }
]
```

## Interaction 9: DELETE /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```

```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Tue, 19 Mar 2019 05:23:18 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Response body for playback (204: null - Base64 below):

```

```

## Interaction 10: POST /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```
{
   "title": "blah"
}
```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 217
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:18 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/c862886f-c5d3-473f-9b4d-d45b76728cb5
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (201: text/html;charset=utf-8):

```
{
   "title": "blah",
   "uid": "MOCK-GUID-6",
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-6",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-6"
}
```

## Interaction 11: GET /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```

```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 260
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:19 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (200: text/html;charset=utf-8):

```
[
   {
      "uid": "MOCK-GUID-6",
      "title": "blah",
      "order": 0,
      "completed": false,
      "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-6",
      "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-6"
   }
]
```

## Interaction 12: DELETE /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```

```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Tue, 19 Mar 2019 05:23:19 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Response body for playback (204: null - Base64 below):

```

```

## Interaction 13: POST /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```
{
   "title": "blah"
}
```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 217
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:19 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/70d696d8-44f6-4ec9-94d1-ae650d8920ab
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (201: text/html;charset=utf-8):

```
{
   "title": "blah",
   "uid": "MOCK-GUID-7",
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-7",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-7"
}
```

## Interaction 14: GET /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```

```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 260
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:19 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (200: text/html;charset=utf-8):

```
[
   {
      "uid": "MOCK-GUID-7",
      "title": "blah",
      "order": 0,
      "completed": false,
      "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-7",
      "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-7"
   }
]
```

## Interaction 15: DELETE /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```

```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Tue, 19 Mar 2019 05:23:19 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Response body for playback (204: null - Base64 below):

```

```

## Interaction 16: POST /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```
{
   "title": "my todo"
}
```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 220
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:19 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/d9587449-a23f-4b1f-b964-3ee051980387
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (201: text/html;charset=utf-8):

```
{
   "title": "my todo",
   "uid": "MOCK-GUID-8",
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-8",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-8"
}
```

## Interaction 17: OPTIONS /todos/d9587449-a23f-4b1f-b964-3ee051980387

### Request headers for playback:

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

### Request body for playback ():

```

```

### Response headers for playback:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,PATCH,HEAD,DELETE,OPTIONS
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:19 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 18: GET /todos/d9587449-a23f-4b1f-b964-3ee051980387

### Request headers for playback:

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

### Request body for playback (application/json):

```

```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 235
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:19 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (200: text/html;charset=utf-8):

```
{
   "uid": "MOCK-GUID-8",
   "title": "my todo",
   "order": 0,
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-8",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-8"
}
```

## Interaction 19: DELETE /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```

```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Tue, 19 Mar 2019 05:23:19 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Response body for playback (204: null - Base64 below):

```

```

## Interaction 20: POST /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```
{
   "title": "todo the first"
}
```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 227
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:19 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/aa224ec2-4cd4-498e-8795-f1204d745bd2
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (201: text/html;charset=utf-8):

```
{
   "title": "todo the first",
   "uid": "MOCK-GUID-9",
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-9",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-9"
}
```

## Interaction 21: POST /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```
{
   "title": "todo the second"
}
```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 231
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:19 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/e1298305-d57e-4ddc-8cab-33db17f7a084
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (201: text/html;charset=utf-8):

```
{
   "title": "todo the second",
   "uid": "MOCK-GUID-10",
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-10",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-10"
}
```

## Interaction 22: GET /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```

```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 542
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:19 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (200: text/html;charset=utf-8):

```
[
   {
      "uid": "MOCK-GUID-9",
      "title": "todo the first",
      "order": 0,
      "completed": false,
      "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-9",
      "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-9"
   },
   {
      "uid": "MOCK-GUID-10",
      "title": "todo the second",
      "order": 0,
      "completed": false,
      "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-10",
      "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-10"
   }
]
```

## Interaction 23: OPTIONS /todos/aa224ec2-4cd4-498e-8795-f1204d745bd2

### Request headers for playback:

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

### Request body for playback ():

```

```

### Response headers for playback:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,PATCH,HEAD,DELETE,OPTIONS
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:19 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 24: GET /todos/aa224ec2-4cd4-498e-8795-f1204d745bd2

### Request headers for playback:

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

### Request body for playback (application/json):

```

```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 242
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:20 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (200: text/html;charset=utf-8):

```
{
   "uid": "MOCK-GUID-9",
   "title": "todo the first",
   "order": 0,
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-9",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-9"
}
```

## Interaction 25: DELETE /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```

```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Tue, 19 Mar 2019 05:23:20 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Response body for playback (204: null - Base64 below):

```

```

## Interaction 26: POST /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```
{
   "title": "initial title"
}
```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 229
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:20 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/eb8c3914-d9ff-4ea7-b1de-be9cd628158e
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (201: text/html;charset=utf-8):

```
{
   "title": "initial title",
   "uid": "MOCK-GUID-11",
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-11",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-11"
}
```

## Interaction 27: OPTIONS /todos/fb9a2008-fcdb-4406-90aa-bd7e6cbdadad1

### Request headers for playback:

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

### Request body for playback ():

```

```

### Response headers for playback:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,PATCH,HEAD,DELETE,OPTIONS
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:20 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 28: PATCH /todos/fb9a2008-fcdb-4406-90aa-bd7e6cbdadad1

### Request headers for playback:

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

### Request body for playback (application/json):

```
{
   "title": "bathe the cat"
}
```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:21 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (404: text/html;charset=utf-8):

```

```

## Interaction 29: DELETE /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```

```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Tue, 19 Mar 2019 05:23:21 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Response body for playback (204: null - Base64 below):

```

```

## Interaction 30: POST /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```
{
   "title": "blah"
}
```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 220
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:21 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/19c47533-440e-4a05-8315-8c23e9918c95
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (201: text/html;charset=utf-8):

```
{
   "title": "blah",
   "uid": "MOCK-GUID-12",
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-12",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-12"
}
```

## Interaction 31: OPTIONS /todos/19c47533-440e-4a05-8315-8c23e9918c95

### Request headers for playback:

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

### Request body for playback ():

```

```

### Response headers for playback:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,PATCH,HEAD,DELETE,OPTIONS
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:21 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 32: PATCH /todos/19c47533-440e-4a05-8315-8c23e9918c95

### Request headers for playback:

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

### Request body for playback (application/json):

```
{
   "completed": true
}
```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 234
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:21 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (200: text/html;charset=utf-8):

```
{
   "uid": "MOCK-GUID-12",
   "title": "blah",
   "order": 0,
   "completed": true,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-12",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-12"
}
```

## Interaction 33: DELETE /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```

```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Tue, 19 Mar 2019 05:23:21 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Response body for playback (204: null - Base64 below):

```

```

## Interaction 34: POST /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```
{
   "title": "blah"
}
```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 220
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:21 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/2dc1a69f-c488-4caa-aaf0-24995188fc3f
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (201: text/html;charset=utf-8):

```
{
   "title": "blah",
   "uid": "MOCK-GUID-13",
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-13",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-13"
}
```

## Interaction 35: OPTIONS /todos/fb9a2008-fcdb-4406-90aa-bd7e6cbdadad3

### Request headers for playback:

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

### Request body for playback ():

```

```

### Response headers for playback:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,PATCH,HEAD,DELETE,OPTIONS
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:22 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 36: PATCH /todos/fb9a2008-fcdb-4406-90aa-bd7e6cbdadad3

### Request headers for playback:

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

### Request body for playback (application/json):

```
{
   "title": "changed title",
   "completed": true
}
```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:22 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (404: text/html;charset=utf-8):

```

```

## Interaction 37: OPTIONS /todos

### Request headers for playback:

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

### Request body for playback ():

```

```

### Response headers for playback:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,HEAD,POST,DELETE,OPTIONS,PUT
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:22 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 38: DELETE /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```

```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Tue, 19 Mar 2019 05:23:22 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Response body for playback (204: null - Base64 below):

```

```

## Interaction 39: POST /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```
{
   "title": "blah"
}
```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 220
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:22 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/ee4b6c4d-6f26-43dd-81b1-855f039fd176
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (201: text/html;charset=utf-8):

```
{
   "title": "blah",
   "uid": "MOCK-GUID-14",
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-14",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-14"
}
```

## Interaction 40: OPTIONS /todos/fb9a2008-fcdb-4406-90aa-bd7e6cbdadad4

### Request headers for playback:

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

### Request body for playback ():

```

```

### Response headers for playback:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,PATCH,HEAD,DELETE,OPTIONS
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:22 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 41: DELETE /todos/fb9a2008-fcdb-4406-90aa-bd7e6cbdadad4

### Request headers for playback:

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

### Request body for playback (application/json):

```

```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Date: Tue, 19 Mar 2019 05:23:22 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Response body for playback (204: null - Base64 below):

```

```

## Interaction 42: GET /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```

```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 263
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:23 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (200: text/html;charset=utf-8):

```
[
   {
      "uid": "MOCK-GUID-14",
      "title": "blah",
      "order": 0,
      "completed": false,
      "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-14",
      "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-14"
   }
]
```

## Interaction 43: POST /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```
{
   "title": "blah",
   "order": 523
}
```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 237
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:23 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/9c0aef61-644a-4e4b-832c-55f3da95ee36
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (201: text/html;charset=utf-8):

```
{
   "title": "blah",
   "order": 523,
   "uid": "MOCK-GUID-15",
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-15",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-15"
}
```

## Interaction 44: POST /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```
{
   "order": 10,
   "title": "blah"
}
```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 236
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:23 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/8b4b91f0-b6f4-4c0f-af9b-9d38c38d4ddd
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (201: text/html;charset=utf-8):

```
{
   "order": 10,
   "title": "blah",
   "uid": "MOCK-GUID-16",
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-16",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-16"
}
```

## Interaction 45: OPTIONS /todos/fb9a2008-fcdb-4406-90aa-bd7e6cbdadad6

### Request headers for playback:

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

### Request body for playback ():

```

```

### Response headers for playback:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,PATCH,HEAD,DELETE,OPTIONS
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:23 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 46: PATCH /todos/fb9a2008-fcdb-4406-90aa-bd7e6cbdadad6

### Request headers for playback:

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

### Request body for playback (application/json):

```
{
   "order": 95
}
```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 0
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:24 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (404: text/html;charset=utf-8):

```

```

## Interaction 47: POST /todos

### Request headers for playback:

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

### Request body for playback (application/json):

```
{
   "order": 10,
   "title": "blah"
}
```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 236
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:24 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/13c1be92-5fd5-448e-b308-a591f4797cf5
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (201: text/html;charset=utf-8):

```
{
   "order": 10,
   "title": "blah",
   "uid": "MOCK-GUID-17",
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-17",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-17"
}
```

## Interaction 48: OPTIONS /todos/13c1be92-5fd5-448e-b308-a591f4797cf5

### Request headers for playback:

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

### Request body for playback ():

```

```

### Response headers for playback:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET,PATCH,HEAD,DELETE,OPTIONS
Access-Control-Allow-Origin: *
Connection: close
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:24 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (200: text/html;charset=utf-8):

```
Content-Typeaccess-control-allow-originaccess-control-allow-headersaccess-control-allow-methodsX-XSS-ProtectionX-Content-Type-OptionsX-Frame-Options
```

## Interaction 49: PATCH /todos/13c1be92-5fd5-448e-b308-a591f4797cf5

### Request headers for playback:

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

### Request body for playback (application/json):

```
{
   "order": 95
}
```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 236
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:24 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (200: text/html;charset=utf-8):

```
{
   "uid": "MOCK-GUID-17",
   "title": "blah",
   "order": 95,
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-17",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-17"
}
```

## Interaction 50: GET /todos/13c1be92-5fd5-448e-b308-a591f4797cf5

### Request headers for playback:

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

### Request body for playback (application/json):

```

```

### Response headers for playback:

```
Access-Control-Allow-Origin: *
Connection: keep-alive
Content-Length: 236
Content-Type: text/html;charset=utf-8
Date: Tue, 19 Mar 2019 05:23:24 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (200: text/html;charset=utf-8):

```
{
   "uid": "MOCK-GUID-17",
   "title": "blah",
   "order": 95,
   "completed": false,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-17",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-17"
}
```

