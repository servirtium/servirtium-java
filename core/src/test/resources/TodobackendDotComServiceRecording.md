## Note: GUIDs and their mock names:

```

```

## Interaction 0: OPTIONS /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: */*
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: GET
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback ():

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 27
Date: Sat, 30 Mar 2019 13:30:22 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 809aa493-4ed1-42d5-8e69-77ec8093bd56
```

### Response body recorded for playback (200: null - Base64 below):

```
R0VULFBPU1QsREVMRVRFLE9QVElPTlMsUFVU
```

## Interaction 1: GET /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 507
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:22 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 05f51e2d-ff1e-464d-a54a-fabfacef7287
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
[
   {
      "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9459",
      "title": "blah",
      "order": 523,
      "id": 9459,
      "completed": false
   },
   {
      "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9460",
      "title": "blah",
      "order": 95,
      "id": 9460,
      "completed": false
   },
   {
      "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9461",
      "title": "blah",
      "order": 95,
      "id": 9461,
      "completed": false
   }
]
```

## Interaction 2: POST /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 18
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```
{
   "title": "a todo"
}
```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 149
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:23 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: f14e8ef2-3d53-4b34-bdc0-efd056f84e8f
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
{
   "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9462",
   "title": "a todo",
   "order": null,
   "id": 9462,
   "completed": false
}
```

## Interaction 3: DELETE /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 3
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:23 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 14f255fc-af0c-4b0f-86ac-c040ac7dad3c
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
[
]
```

## Interaction 4: DELETE /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 3
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:23 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 106f2cbd-7bab-49bf-b8e0-decf968677ab
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
[
]
```

## Interaction 5: GET /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 3
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:23 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 8f8c85ca-f41d-4676-b5f4-eaad99738bab
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
[
]
```

## Interaction 6: DELETE /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 3
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:23 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: dde5bb21-322f-4544-a26d-c9dca766469f
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
[
]
```

## Interaction 7: POST /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 24
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```
{
   "title": "walk the dog"
}
```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 155
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:23 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: ecd47d62-655d-4f47-824b-c46903033b69
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
{
   "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9463",
   "title": "walk the dog",
   "order": null,
   "id": 9463,
   "completed": false
}
```

## Interaction 8: GET /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 180
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:23 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: dfcf77d6-633e-4a1a-9fba-fee50977e828
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
[
   {
      "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9463",
      "title": "walk the dog",
      "order": null,
      "id": 9463,
      "completed": false
   }
]
```

## Interaction 9: DELETE /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 3
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:24 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: abd12665-323e-4591-b41f-c7787036da3b
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
[
]
```

## Interaction 10: POST /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```
{
   "title": "blah"
}
```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 147
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:24 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 475edbd1-64ea-4121-b86a-f69a0ff2de94
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
{
   "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9464",
   "title": "blah",
   "order": null,
   "id": 9464,
   "completed": false
}
```

## Interaction 11: GET /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 172
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:24 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 8c8c2f32-49e1-404d-9556-4c6faf006160
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
[
   {
      "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9464",
      "title": "blah",
      "order": null,
      "id": 9464,
      "completed": false
   }
]
```

## Interaction 12: DELETE /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 3
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:24 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 40039ed8-377b-46b1-b364-ac5b5820dd6f
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
[
]
```

## Interaction 13: POST /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```
{
   "title": "blah"
}
```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 147
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:24 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 052ea8e8-6e6b-4557-b9a3-9644cfb135a3
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
{
   "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9465",
   "title": "blah",
   "order": null,
   "id": 9465,
   "completed": false
}
```

## Interaction 14: GET /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 172
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:24 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 44be4b10-d6d3-4df5-9508-47e1c83d817f
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
[
   {
      "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9465",
      "title": "blah",
      "order": null,
      "id": 9465,
      "completed": false
   }
]
```

## Interaction 15: DELETE /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 3
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:24 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: a1c03ee5-66e0-4f82-a57f-1c18ed68cb60
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
[
]
```

## Interaction 16: POST /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 19
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```
{
   "title": "my todo"
}
```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 150
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:25 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: c646fc33-6fe5-4f82-8b2a-58f15dd848c8
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
{
   "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9466",
   "title": "my todo",
   "order": null,
   "id": 9466,
   "completed": false
}
```

## Interaction 17: OPTIONS /api/todos/9466

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: */*
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: GET
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback ():

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 27
Date: Sat, 30 Mar 2019 13:30:25 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 83c6c3da-9be0-480e-8553-412dceaa261d
```

### Response body recorded for playback (200: null - Base64 below):

```
R0VULFBPU1QsREVMRVRFLE9QVElPTlMsUFVU
```

## Interaction 18: GET /api/todos/9466

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 150
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:25 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: b74fb8fc-e8c7-4da9-a8b5-96d163ac971f
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
{
   "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9466",
   "title": "my todo",
   "order": null,
   "id": 9466,
   "completed": false
}
```

## Interaction 19: DELETE /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 3
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:25 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 2ecd3110-2b62-4d79-94b6-9f73cf513a57
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
[
]
```

## Interaction 20: POST /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 26
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```
{
   "title": "todo the first"
}
```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 157
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:25 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: c14d742c-a184-4d90-a38c-8b7581207a47
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
{
   "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9467",
   "title": "todo the first",
   "order": null,
   "id": 9467,
   "completed": false
}
```

## Interaction 21: POST /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 27
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```
{
   "title": "todo the second"
}
```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 158
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:25 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 6ba3779c-d402-49a3-8bdf-cc96b87cd096
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
{
   "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9468",
   "title": "todo the second",
   "order": null,
   "id": 9468,
   "completed": false
}
```

## Interaction 22: GET /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 363
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:25 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: ec163da7-6561-49e1-ad86-cb1f86391ee7
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
[
   {
      "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9467",
      "title": "todo the first",
      "order": null,
      "id": 9467,
      "completed": false
   },
   {
      "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9468",
      "title": "todo the second",
      "order": null,
      "id": 9468,
      "completed": false
   }
]
```

## Interaction 23: OPTIONS /api/todos/9467

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: */*
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: GET
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback ():

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 27
Date: Sat, 30 Mar 2019 13:30:26 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 0b613168-85d3-4fb3-a7f4-aaf1b4ddfd1f
```

### Response body recorded for playback (200: null - Base64 below):

```
R0VULFBPU1QsREVMRVRFLE9QVElPTlMsUFVU
```

## Interaction 24: GET /api/todos/9467

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 157
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:26 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 578348b3-a6d7-4e0c-ae00-d10461d7d238
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
{
   "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9467",
   "title": "todo the first",
   "order": null,
   "id": 9467,
   "completed": false
}
```

## Interaction 25: DELETE /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 3
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:26 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 46d5b6ab-52aa-4ad0-b5dd-18e004022311
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
[
]
```

## Interaction 26: POST /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 25
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```
{
   "title": "initial title"
}
```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 156
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:26 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 5037512b-4c8b-4358-acd8-c9bf03b7db8b
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
{
   "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9469",
   "title": "initial title",
   "order": null,
   "id": 9469,
   "completed": false
}
```

## Interaction 27: OPTIONS /api/todos/9469

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: */*
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: PATCH
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback ():

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 27
Date: Sat, 30 Mar 2019 13:30:26 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 410a624d-2afe-45ea-a83d-0457bcddf0d7
```

### Response body recorded for playback (200: null - Base64 below):

```
R0VULFBPU1QsREVMRVRFLE9QVElPTlMsUFVU
```

## Interaction 28: PATCH /api/todos/9469

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 25
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```
{
   "title": "bathe the cat"
}
```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 156
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:26 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: aedcb3ec-b803-4200-8df5-6b4be040fa52
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
{
   "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9469",
   "title": "bathe the cat",
   "order": null,
   "id": 9469,
   "completed": false
}
```

## Interaction 29: DELETE /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 3
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:26 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 2371a336-6559-4d25-b4b2-f8acac534513
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
[
]
```

## Interaction 30: POST /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```
{
   "title": "blah"
}
```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 147
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:27 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: c5f39f71-ca9b-4953-903a-f47ae3ad9355
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
{
   "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9470",
   "title": "blah",
   "order": null,
   "id": 9470,
   "completed": false
}
```

## Interaction 31: OPTIONS /api/todos/9470

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: */*
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: PATCH
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback ():

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 27
Date: Sat, 30 Mar 2019 13:30:27 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: e15b9837-e051-4d6a-ad76-6253e378dcf9
```

### Response body recorded for playback (200: null - Base64 below):

```
R0VULFBPU1QsREVMRVRFLE9QVElPTlMsUFVU
```

## Interaction 32: PATCH /api/todos/9470

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 18
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```
{
   "completed": true
}
```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 146
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:27 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 0b8fda47-fe6a-4b51-8bbc-9c484cf3ee79
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
{
   "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9470",
   "title": "blah",
   "order": null,
   "id": 9470,
   "completed": true
}
```

## Interaction 33: DELETE /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 3
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:27 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 1d1fda4c-f928-44f0-9b37-408c7784058b
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
[
]
```

## Interaction 34: POST /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```
{
   "title": "blah"
}
```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 147
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:27 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 8491a9a4-3d0e-4403-8fd1-3d76b7884ca4
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
{
   "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9471",
   "title": "blah",
   "order": null,
   "id": 9471,
   "completed": false
}
```

## Interaction 35: OPTIONS /api/todos/9471

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: */*
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: PATCH
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback ():

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 27
Date: Sat, 30 Mar 2019 13:30:27 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 070ff2db-f4ab-4d10-b0bf-a13416689fea
```

### Response body recorded for playback (200: null - Base64 below):

```
R0VULFBPU1QsREVMRVRFLE9QVElPTlMsUFVU
```

## Interaction 36: PATCH /api/todos/9471

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 42
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```
{
   "title": "changed title",
   "completed": true
}
```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 155
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:27 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 0bc24d58-90f6-42b4-9824-d1231b246e5a
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
{
   "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9471",
   "title": "changed title",
   "order": null,
   "id": 9471,
   "completed": true
}
```

## Interaction 37: GET /api/todos/9471

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 155
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:27 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: a5ec2603-abee-4639-a6c3-6cd661756fc2
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
{
   "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9471",
   "title": "changed title",
   "order": null,
   "id": 9471,
   "completed": true
}
```

## Interaction 38: OPTIONS /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: */*
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: GET
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback ():

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 27
Date: Sat, 30 Mar 2019 13:30:27 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 2731384f-4420-4ad0-9f30-1aac17b595f8
```

### Response body recorded for playback (200: null - Base64 below):

```
R0VULFBPU1QsREVMRVRFLE9QVElPTlMsUFVU
```

## Interaction 39: GET /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 180
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:28 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 9e52da55-711f-401f-936b-c4222f1479a9
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
[
   {
      "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9471",
      "title": "changed title",
      "order": null,
      "id": 9471,
      "completed": true
   }
]
```

## Interaction 40: DELETE /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 3
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:28 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 539ddf6a-a139-489c-b0e8-5299e0b43b7e
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
[
]
```

## Interaction 41: POST /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```
{
   "title": "blah"
}
```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 147
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:28 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: b928ab11-cd60-4f7c-99d0-3a8184e60c0e
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
{
   "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9472",
   "title": "blah",
   "order": null,
   "id": 9472,
   "completed": false
}
```

## Interaction 42: OPTIONS /api/todos/9472

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: */*
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: DELETE
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback ():

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 27
Date: Sat, 30 Mar 2019 13:30:28 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 72721b3c-0749-43c3-9f56-1a69a54db88b
```

### Response body recorded for playback (200: null - Base64 below):

```
R0VULFBPU1QsREVMRVRFLE9QVElPTlMsUFVU
```

## Interaction 43: DELETE /api/todos/9472

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 147
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:28 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 24566934-c50d-47bb-bd5f-8113599e4282
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
{
   "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9472",
   "title": "blah",
   "order": null,
   "id": 9472,
   "completed": false
}
```

## Interaction 44: GET /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 3
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:28 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 506c8e69-d6e3-4894-a294-e2d589f5b589
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
[
]
```

## Interaction 45: POST /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 28
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```
{
   "title": "blah",
   "order": 523
}
```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 146
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:28 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: a0b1ef25-c67c-4121-82a8-e44e6d653d97
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
{
   "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9473",
   "title": "blah",
   "order": 523,
   "id": 9473,
   "completed": false
}
```

## Interaction 46: POST /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 27
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```
{
   "order": 10,
   "title": "blah"
}
```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 145
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:29 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: bb208f22-7979-44ba-8650-70ad387248cd
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
{
   "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9474",
   "title": "blah",
   "order": 10,
   "id": 9474,
   "completed": false
}
```

## Interaction 47: OPTIONS /api/todos/9474

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: */*
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: PATCH
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback ():

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 27
Date: Sat, 30 Mar 2019 13:30:29 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 13cb638f-e3d1-4fdc-b467-6646d4bc36b8
```

### Response body recorded for playback (200: null - Base64 below):

```
R0VULFBPU1QsREVMRVRFLE9QVElPTlMsUFVU
```

## Interaction 48: PATCH /api/todos/9474

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 12
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```
{
   "order": 95
}
```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 145
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:29 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: cbdaaf48-b7d1-4fe0-9606-b8668e6ba130
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
{
   "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9474",
   "title": "blah",
   "order": 95,
   "id": 9474,
   "completed": false
}
```

## Interaction 49: POST /api/todos

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 27
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```
{
   "order": 10,
   "title": "blah"
}
```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 145
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:29 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 67e7e5d8-115b-46ba-834a-34fad15ec9ba
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
{
   "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9475",
   "title": "blah",
   "order": 10,
   "id": 9475,
   "completed": false
}
```

## Interaction 50: OPTIONS /api/todos/9475

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: */*
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: PATCH
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback ():

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 27
Date: Sat, 30 Mar 2019 13:30:29 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: d389a101-9f61-4493-9f88-ab22c7ea4293
```

### Response body recorded for playback (200: null - Base64 below):

```
R0VULFBPU1QsREVMRVRFLE9QVElPTlMsUFVU
```

## Interaction 51: PATCH /api/todos/9475

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 12
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```
{
   "order": 95
}
```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 145
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:29 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 507902b7-7cda-4e90-b3d0-ec0e08eb8a3a
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
{
   "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9475",
   "title": "blah",
   "order": 95,
   "id": 9475,
   "completed": false
}
```

## Interaction 52: GET /api/todos/9475

### Request headers recorded for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todobackend-phoenix.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todobackend-phoenix.herokuapp.com/api/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15
```

### Request body recorded for playback (application/json):

```

```

### Response headers recorded for playback:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Methods: GET,PUT,PATCH,OPTIONS,DELETE,POST
Access-Control-Allow-Origin: *
Cache-Control: max-age=0, private, must-revalidate
Connection: keep-alive
Content-Length: 145
Content-Type: application/json; charset=utf-8
Date: Sat, 30 Mar 2019 13:30:29 GMT
Server: Cowboy
Via: 1.1 vegur
X-Request-Id: 5dccb587-12a1-4734-a4ee-e874ebbe238a
```

### Response body recorded for playback (200: application/json; charset=utf-8):

```
{
   "url": "http://todobackend-phoenix.herokuapp.com/api/todos/9475",
   "title": "blah",
   "order": 95,
   "id": 9475,
   "completed": false
}
```

