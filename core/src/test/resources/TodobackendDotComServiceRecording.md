## Note: GUIDs and their mock names:

```
5f6e6649-af24-471d-9168-7bae3814a8c8=5
d569f91c-8e26-4dd8-a870-07fe21dfd97c=7
9d54e3df-d699-4059-b1de-c892594e6404=13
266907b6-d23d-4faf-822f-8dbbbf1cfa35=6
80794b29-4962-4b98-9a96-8dbcb9e76c36=3
f987239e-1822-4825-a056-5d38de594ff3=15
e8dc6c9c-b210-46fe-bc0b-d38cff9b6f63=11
0789fa2a-fa67-4780-b78d-24b7e74ce75d=14
2b64ff0a-6222-4b68-9587-3d0a2c8729b3=17
ab7a4a17-04a4-4216-ae0f-def45b533e23=8
ba9fc540-5279-4d35-a06c-aef8c72246fb=1
0bcf3ace-0101-43d2-b3ba-7ec3c2feb5e5=4
502969d5-7ba1-4b58-9626-6d7f6eafcf60=10
3a4ffe29-1c25-4013-bd01-c40a3084b244=12
c5a2f094-082b-4cda-88b3-97cf92ef00f0=9
afab8e6e-8995-422a-aecc-bd324580252e=16
60934d73-5a90-4110-afd6-3f19e9ce4354=2
```

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
Date: Mon, 25 Mar 2019 10:54:09 GMT
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
      "order": 95,
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
Date: Mon, 25 Mar 2019 10:54:09 GMT
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
Date: Mon, 25 Mar 2019 10:54:09 GMT
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
      "order": 95,
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
Date: Mon, 25 Mar 2019 10:54:10 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/0bcf3ace-0101-43d2-b3ba-7ec3c2feb5e5
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
Date: Mon, 25 Mar 2019 10:54:10 GMT
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
Date: Mon, 25 Mar 2019 10:54:10 GMT
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
Date: Mon, 25 Mar 2019 10:54:10 GMT
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
Date: Mon, 25 Mar 2019 10:54:10 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/5f6e6649-af24-471d-9168-7bae3814a8c8
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
Date: Mon, 25 Mar 2019 10:54:10 GMT
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
Date: Mon, 25 Mar 2019 10:54:11 GMT
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
Date: Mon, 25 Mar 2019 10:54:11 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/266907b6-d23d-4faf-822f-8dbbbf1cfa35
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
Date: Mon, 25 Mar 2019 10:54:11 GMT
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
Date: Mon, 25 Mar 2019 10:54:11 GMT
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
Date: Mon, 25 Mar 2019 10:54:11 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/d569f91c-8e26-4dd8-a870-07fe21dfd97c
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
Date: Mon, 25 Mar 2019 10:54:11 GMT
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
Date: Mon, 25 Mar 2019 10:54:11 GMT
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
Date: Mon, 25 Mar 2019 10:54:12 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/ab7a4a17-04a4-4216-ae0f-def45b533e23
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

## Interaction 17: OPTIONS /todos/ab7a4a17-04a4-4216-ae0f-def45b533e23

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
Date: Mon, 25 Mar 2019 10:54:12 GMT
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

## Interaction 18: GET /todos/ab7a4a17-04a4-4216-ae0f-def45b533e23

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
Date: Mon, 25 Mar 2019 10:54:12 GMT
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
Date: Mon, 25 Mar 2019 10:54:12 GMT
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
Date: Mon, 25 Mar 2019 10:54:12 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/c5a2f094-082b-4cda-88b3-97cf92ef00f0
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
Date: Mon, 25 Mar 2019 10:54:13 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/502969d5-7ba1-4b58-9626-6d7f6eafcf60
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
Date: Mon, 25 Mar 2019 10:54:13 GMT
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

## Interaction 23: OPTIONS /todos/c5a2f094-082b-4cda-88b3-97cf92ef00f0

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
Date: Mon, 25 Mar 2019 10:54:13 GMT
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

## Interaction 24: GET /todos/c5a2f094-082b-4cda-88b3-97cf92ef00f0

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
Date: Mon, 25 Mar 2019 10:54:13 GMT
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
Date: Mon, 25 Mar 2019 10:54:14 GMT
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
Date: Mon, 25 Mar 2019 10:54:14 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/e8dc6c9c-b210-46fe-bc0b-d38cff9b6f63
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

## Interaction 27: OPTIONS /todos/ba9fc540-5279-4d35-a06c-aef8c72246fb1

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
Date: Mon, 25 Mar 2019 10:54:14 GMT
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

## Interaction 28: PATCH /todos/ba9fc540-5279-4d35-a06c-aef8c72246fb1

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
Date: Mon, 25 Mar 2019 10:54:14 GMT
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
Date: Mon, 25 Mar 2019 10:54:14 GMT
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
Date: Mon, 25 Mar 2019 10:54:14 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/3a4ffe29-1c25-4013-bd01-c40a3084b244
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

## Interaction 31: OPTIONS /todos/ba9fc540-5279-4d35-a06c-aef8c72246fb2

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
Date: Mon, 25 Mar 2019 10:54:14 GMT
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

## Interaction 32: PATCH /todos/ba9fc540-5279-4d35-a06c-aef8c72246fb2

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
Content-Length: 0
Content-Type: text/html;charset=utf-8
Date: Mon, 25 Mar 2019 10:54:14 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (404: text/html;charset=utf-8):

```

```

## Interaction 33: OPTIONS /todos

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
Date: Mon, 25 Mar 2019 10:54:14 GMT
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

## Interaction 34: DELETE /todos

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
Date: Mon, 25 Mar 2019 10:54:15 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Response body for playback (204: null - Base64 below):

```

```

## Interaction 35: POST /todos

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
Date: Mon, 25 Mar 2019 10:54:15 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/9d54e3df-d699-4059-b1de-c892594e6404
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

## Interaction 36: OPTIONS /todos/9d54e3df-d699-4059-b1de-c892594e6404

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
Date: Mon, 25 Mar 2019 10:54:15 GMT
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

## Interaction 37: PATCH /todos/9d54e3df-d699-4059-b1de-c892594e6404

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
Content-Length: 243
Content-Type: text/html;charset=utf-8
Date: Mon, 25 Mar 2019 10:54:15 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (200: text/html;charset=utf-8):

```
{
   "uid": "MOCK-GUID-13",
   "title": "changed title",
   "order": 0,
   "completed": true,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-13",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-13"
}
```

## Interaction 38: GET /todos/9d54e3df-d699-4059-b1de-c892594e6404

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
Content-Length: 243
Content-Type: text/html;charset=utf-8
Date: Mon, 25 Mar 2019 10:54:15 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (200: text/html;charset=utf-8):

```
{
   "uid": "MOCK-GUID-13",
   "title": "changed title",
   "order": 0,
   "completed": true,
   "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-13",
   "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-13"
}
```

## Interaction 39: GET /todos

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
Content-Length: 271
Content-Type: text/html;charset=utf-8
Date: Mon, 25 Mar 2019 10:54:16 GMT
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
      "uid": "MOCK-GUID-13",
      "title": "changed title",
      "order": 0,
      "completed": true,
      "href": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-13",
      "url": "http://todo-backend-sinatra.herokuapp.com/todos/MOCK-GUID-13"
   }
]
```

## Interaction 40: DELETE /todos

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
Date: Mon, 25 Mar 2019 10:54:16 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Response body for playback (204: null - Base64 below):

```

```

## Interaction 41: POST /todos

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
Date: Mon, 25 Mar 2019 10:54:16 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/0789fa2a-fa67-4780-b78d-24b7e74ce75d
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

## Interaction 42: OPTIONS /todos/0789fa2a-fa67-4780-b78d-24b7e74ce75d

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
Date: Mon, 25 Mar 2019 10:54:16 GMT
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

## Interaction 43: DELETE /todos/0789fa2a-fa67-4780-b78d-24b7e74ce75d

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
Date: Mon, 25 Mar 2019 10:54:16 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
```

### Response body for playback (204: null - Base64 below):

```

```

## Interaction 44: GET /todos

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
Content-Length: 3
Content-Type: text/html;charset=utf-8
Date: Mon, 25 Mar 2019 10:54:16 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (200: text/html;charset=utf-8):

```
[
]
```

## Interaction 45: POST /todos

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
Date: Mon, 25 Mar 2019 10:54:17 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/f987239e-1822-4825-a056-5d38de594ff3
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

## Interaction 46: POST /todos

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
Date: Mon, 25 Mar 2019 10:54:17 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/afab8e6e-8995-422a-aecc-bd324580252e
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

## Interaction 47: OPTIONS /todos/ba9fc540-5279-4d35-a06c-aef8c72246fb6

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
Date: Mon, 25 Mar 2019 10:54:17 GMT
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

## Interaction 48: PATCH /todos/ba9fc540-5279-4d35-a06c-aef8c72246fb6

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
Date: Mon, 25 Mar 2019 10:54:17 GMT
Server: thin 1.6.2 codename Doc Brown
Via: 1.1 vegur
X-Content-Type-Options: nosniff
X-Frame-Options: SAMEORIGIN
X-Xss-Protection: 1; mode=block
```

### Response body for playback (404: text/html;charset=utf-8):

```

```

## Interaction 49: POST /todos

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
Date: Mon, 25 Mar 2019 10:54:17 GMT
Location: http://todo-backend-sinatra.herokuapp.com/todos/2b64ff0a-6222-4b68-9587-3d0a2c8729b3
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

## Interaction 50: OPTIONS /todos/2b64ff0a-6222-4b68-9587-3d0a2c8729b3

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
Date: Mon, 25 Mar 2019 10:54:17 GMT
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

## Interaction 51: PATCH /todos/2b64ff0a-6222-4b68-9587-3d0a2c8729b3

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
Date: Mon, 25 Mar 2019 10:54:18 GMT
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

## Interaction 52: GET /todos/2b64ff0a-6222-4b68-9587-3d0a2c8729b3

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
Date: Mon, 25 Mar 2019 10:54:18 GMT
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

