## Note: GUIDs and their mock names:

```

```

## Interaction 0: OPTIONS /todos

### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:

```
Origin: http://www.todobackend.com
Access-Control-Request-Method: GET
Accept: */*
Access-Control-Request-Headers: content-type
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: localhost:8099
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Content-Length: 0
```

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
Host: todo-backend-rocket-rust.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-rocket-rust.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### DEBUG: Request body as received from client (), WITHOUT REDACTIONS, ETC:

```

```

### Request body for playback ():

```

```

### DEBUG: Response headers from real service, unchanged:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: PATCH, DELETE, HEAD, POST, OPTIONS, PUT, GET
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:19 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### Response headers for playback:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: PATCH, DELETE, HEAD, POST, OPTIONS, PUT, GET
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:19 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Headers for client, possibly changed after recording:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: PATCH, DELETE, HEAD, POST, OPTIONS, PUT, GET
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:19 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Response body from real service, unchanged (204: text/html; charset=utf-8):

```

```

### Response body for playback (204: text/html; charset=utf-8):

```

```

### DEBUG: Response body for client, possibly changed after recording (204: text/html; charset=utf-8):

```

```

## Interaction 1: GET /todos

### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: localhost:8099
Pragma: no-cache
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Content-Type: application/json
```

### Request headers for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-backend-rocket-rust.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-rocket-rust.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### DEBUG: Request body as received from client (application/json), WITHOUT REDACTIONS, ETC:

```

```

### Request body for playback (application/json):

```

```

### DEBUG: Response headers from real service, unchanged:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 565
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:19 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### Response headers for playback:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 565
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:19 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Headers for client, possibly changed after recording:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 565
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:19 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Response body from real service, unchanged (500: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>500 Internal Server Error</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>500: Internal Server Error</h1>
                    <p>The server encountered an internal error
                while processing this request.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### Response body for playback (500: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>500 Internal Server Error</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>500: Internal Server Error</h1>
                    <p>The server encountered an internal error
                while processing this request.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### DEBUG: Response body for client, possibly changed after recording (500: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>500 Internal Server Error</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>500: Internal Server Error</h1>
                    <p>The server encountered an internal error
                while processing this request.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

## Interaction 2: POST /todos

### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: localhost:8099
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Content-Length: 18
Content-Type: application/json
```

### Request headers for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 18
Content-Type: application/json
Host: todo-backend-rocket-rust.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-rocket-rust.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### DEBUG: Request body as received from client (application/json), WITHOUT REDACTIONS, ETC:

```
{
   "title": "a todo"
}
```

### Request body for playback (application/json):

```
{
   "title": "a todo"
}
```

### DEBUG: Response headers from real service, unchanged:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:19 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### Response headers for playback:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:19 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Headers for client, possibly changed after recording:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:19 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Response body from real service, unchanged (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### Response body for playback (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### DEBUG: Response body for client, possibly changed after recording (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

## Interaction 3: DELETE /todos

### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: localhost:8099
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Content-Length: 0
Content-Type: application/json
```

### Request headers for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todo-backend-rocket-rust.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-rocket-rust.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### DEBUG: Request body as received from client (application/json), WITHOUT REDACTIONS, ETC:

```

```

### Request body for playback (application/json):

```

```

### DEBUG: Response headers from real service, unchanged:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:20 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### Response headers for playback:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:20 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Headers for client, possibly changed after recording:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:20 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Response body from real service, unchanged (200: null - Base64 below):

```

```

### Response body for playback (200: null - Base64 below):

```

```

### DEBUG: Response body for client, possibly changed after recording (200: null - Base64 below):

```

```

## Interaction 4: DELETE /todos

### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: localhost:8099
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Content-Length: 0
Content-Type: application/json
```

### Request headers for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todo-backend-rocket-rust.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-rocket-rust.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### DEBUG: Request body as received from client (application/json), WITHOUT REDACTIONS, ETC:

```

```

### Request body for playback (application/json):

```

```

### DEBUG: Response headers from real service, unchanged:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:20 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### Response headers for playback:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:20 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Headers for client, possibly changed after recording:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:20 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Response body from real service, unchanged (200: null - Base64 below):

```

```

### Response body for playback (200: null - Base64 below):

```

```

### DEBUG: Response body for client, possibly changed after recording (200: null - Base64 below):

```

```

## Interaction 5: GET /todos

### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: localhost:8099
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Content-Type: application/json
```

### Request headers for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-backend-rocket-rust.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-rocket-rust.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### DEBUG: Request body as received from client (application/json), WITHOUT REDACTIONS, ETC:

```

```

### Request body for playback (application/json):

```

```

### DEBUG: Response headers from real service, unchanged:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 565
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:20 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### Response headers for playback:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 565
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:20 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Headers for client, possibly changed after recording:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 565
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:20 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Response body from real service, unchanged (500: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>500 Internal Server Error</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>500: Internal Server Error</h1>
                    <p>The server encountered an internal error
                while processing this request.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### Response body for playback (500: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>500 Internal Server Error</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>500: Internal Server Error</h1>
                    <p>The server encountered an internal error
                while processing this request.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### DEBUG: Response body for client, possibly changed after recording (500: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>500 Internal Server Error</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>500: Internal Server Error</h1>
                    <p>The server encountered an internal error
                while processing this request.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

## Interaction 6: DELETE /todos

### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: localhost:8099
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Content-Length: 0
Content-Type: application/json
```

### Request headers for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todo-backend-rocket-rust.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-rocket-rust.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### DEBUG: Request body as received from client (application/json), WITHOUT REDACTIONS, ETC:

```

```

### Request body for playback (application/json):

```

```

### DEBUG: Response headers from real service, unchanged:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:20 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### Response headers for playback:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:20 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Headers for client, possibly changed after recording:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:20 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Response body from real service, unchanged (200: null - Base64 below):

```

```

### Response body for playback (200: null - Base64 below):

```

```

### DEBUG: Response body for client, possibly changed after recording (200: null - Base64 below):

```

```

## Interaction 7: POST /todos

### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: localhost:8099
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Content-Length: 24
Content-Type: application/json
```

### Request headers for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 24
Content-Type: application/json
Host: todo-backend-rocket-rust.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-rocket-rust.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### DEBUG: Request body as received from client (application/json), WITHOUT REDACTIONS, ETC:

```
{
   "title": "walk the dog"
}
```

### Request body for playback (application/json):

```
{
   "title": "walk the dog"
}
```

### DEBUG: Response headers from real service, unchanged:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:20 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### Response headers for playback:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:20 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Headers for client, possibly changed after recording:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:20 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Response body from real service, unchanged (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### Response body for playback (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### DEBUG: Response body for client, possibly changed after recording (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

## Interaction 8: DELETE /todos

### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: localhost:8099
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Content-Length: 0
Content-Type: application/json
```

### Request headers for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todo-backend-rocket-rust.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-rocket-rust.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### DEBUG: Request body as received from client (application/json), WITHOUT REDACTIONS, ETC:

```

```

### Request body for playback (application/json):

```

```

### DEBUG: Response headers from real service, unchanged:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:20 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### Response headers for playback:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:20 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Headers for client, possibly changed after recording:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:20 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Response body from real service, unchanged (200: null - Base64 below):

```

```

### Response body for playback (200: null - Base64 below):

```

```

### DEBUG: Response body for client, possibly changed after recording (200: null - Base64 below):

```

```

## Interaction 9: POST /todos

### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: localhost:8099
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Content-Length: 16
Content-Type: application/json
```

### Request headers for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
Host: todo-backend-rocket-rust.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-rocket-rust.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### DEBUG: Request body as received from client (application/json), WITHOUT REDACTIONS, ETC:

```
{
   "title": "blah"
}
```

### Request body for playback (application/json):

```
{
   "title": "blah"
}
```

### DEBUG: Response headers from real service, unchanged:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:20 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### Response headers for playback:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:20 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Headers for client, possibly changed after recording:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:20 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Response body from real service, unchanged (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### Response body for playback (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### DEBUG: Response body for client, possibly changed after recording (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

## Interaction 10: DELETE /todos

### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: localhost:8099
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Content-Length: 0
Content-Type: application/json
```

### Request headers for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todo-backend-rocket-rust.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-rocket-rust.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### DEBUG: Request body as received from client (application/json), WITHOUT REDACTIONS, ETC:

```

```

### Request body for playback (application/json):

```

```

### DEBUG: Response headers from real service, unchanged:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:21 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### Response headers for playback:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:21 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Headers for client, possibly changed after recording:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:21 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Response body from real service, unchanged (200: null - Base64 below):

```

```

### Response body for playback (200: null - Base64 below):

```

```

### DEBUG: Response body for client, possibly changed after recording (200: null - Base64 below):

```

```

## Interaction 11: POST /todos

### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: localhost:8099
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Content-Length: 16
Content-Type: application/json
```

### Request headers for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
Host: todo-backend-rocket-rust.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-rocket-rust.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### DEBUG: Request body as received from client (application/json), WITHOUT REDACTIONS, ETC:

```
{
   "title": "blah"
}
```

### Request body for playback (application/json):

```
{
   "title": "blah"
}
```

### DEBUG: Response headers from real service, unchanged:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:21 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### Response headers for playback:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:21 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Headers for client, possibly changed after recording:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:21 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Response body from real service, unchanged (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### Response body for playback (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### DEBUG: Response body for client, possibly changed after recording (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

## Interaction 12: DELETE /todos

### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: localhost:8099
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Content-Length: 0
Content-Type: application/json
```

### Request headers for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todo-backend-rocket-rust.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-rocket-rust.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### DEBUG: Request body as received from client (application/json), WITHOUT REDACTIONS, ETC:

```

```

### Request body for playback (application/json):

```

```

### DEBUG: Response headers from real service, unchanged:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:21 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### Response headers for playback:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:21 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Headers for client, possibly changed after recording:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:21 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Response body from real service, unchanged (200: null - Base64 below):

```

```

### Response body for playback (200: null - Base64 below):

```

```

### DEBUG: Response body for client, possibly changed after recording (200: null - Base64 below):

```

```

## Interaction 13: POST /todos

### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: localhost:8099
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Content-Length: 19
Content-Type: application/json
```

### Request headers for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 19
Content-Type: application/json
Host: todo-backend-rocket-rust.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-rocket-rust.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### DEBUG: Request body as received from client (application/json), WITHOUT REDACTIONS, ETC:

```
{
   "title": "my todo"
}
```

### Request body for playback (application/json):

```
{
   "title": "my todo"
}
```

### DEBUG: Response headers from real service, unchanged:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:21 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### Response headers for playback:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:21 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Headers for client, possibly changed after recording:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:21 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Response body from real service, unchanged (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### Response body for playback (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### DEBUG: Response body for client, possibly changed after recording (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

## Interaction 14: DELETE /todos

### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: localhost:8099
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Content-Length: 0
Content-Type: application/json
```

### Request headers for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todo-backend-rocket-rust.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-rocket-rust.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### DEBUG: Request body as received from client (application/json), WITHOUT REDACTIONS, ETC:

```

```

### Request body for playback (application/json):

```

```

### DEBUG: Response headers from real service, unchanged:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:21 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### Response headers for playback:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:21 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Headers for client, possibly changed after recording:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:21 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Response body from real service, unchanged (200: null - Base64 below):

```

```

### Response body for playback (200: null - Base64 below):

```

```

### DEBUG: Response body for client, possibly changed after recording (200: null - Base64 below):

```

```

## Interaction 15: POST /todos

### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: localhost:8099
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Content-Length: 26
Content-Type: application/json
```

### Request headers for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 26
Content-Type: application/json
Host: todo-backend-rocket-rust.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-rocket-rust.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### DEBUG: Request body as received from client (application/json), WITHOUT REDACTIONS, ETC:

```
{
   "title": "todo the first"
}
```

### Request body for playback (application/json):

```
{
   "title": "todo the first"
}
```

### DEBUG: Response headers from real service, unchanged:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:21 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### Response headers for playback:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:21 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Headers for client, possibly changed after recording:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:21 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Response body from real service, unchanged (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### Response body for playback (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### DEBUG: Response body for client, possibly changed after recording (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

## Interaction 16: POST /todos

### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: localhost:8099
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Content-Length: 27
Content-Type: application/json
```

### Request headers for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 27
Content-Type: application/json
Host: todo-backend-rocket-rust.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-rocket-rust.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### DEBUG: Request body as received from client (application/json), WITHOUT REDACTIONS, ETC:

```
{
   "title": "todo the second"
}
```

### Request body for playback (application/json):

```
{
   "title": "todo the second"
}
```

### DEBUG: Response headers from real service, unchanged:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:21 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### Response headers for playback:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:21 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Headers for client, possibly changed after recording:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:21 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Response body from real service, unchanged (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### Response body for playback (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### DEBUG: Response body for client, possibly changed after recording (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

## Interaction 17: DELETE /todos

### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: localhost:8099
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Content-Length: 0
Content-Type: application/json
```

### Request headers for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todo-backend-rocket-rust.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-rocket-rust.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### DEBUG: Request body as received from client (application/json), WITHOUT REDACTIONS, ETC:

```

```

### Request body for playback (application/json):

```

```

### DEBUG: Response headers from real service, unchanged:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:21 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### Response headers for playback:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:21 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Headers for client, possibly changed after recording:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:21 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Response body from real service, unchanged (200: null - Base64 below):

```

```

### Response body for playback (200: null - Base64 below):

```

```

### DEBUG: Response body for client, possibly changed after recording (200: null - Base64 below):

```

```

## Interaction 18: POST /todos

### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: localhost:8099
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Content-Length: 25
Content-Type: application/json
```

### Request headers for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 25
Content-Type: application/json
Host: todo-backend-rocket-rust.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-rocket-rust.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### DEBUG: Request body as received from client (application/json), WITHOUT REDACTIONS, ETC:

```
{
   "title": "initial title"
}
```

### Request body for playback (application/json):

```
{
   "title": "initial title"
}
```

### DEBUG: Response headers from real service, unchanged:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:21 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### Response headers for playback:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:21 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Headers for client, possibly changed after recording:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:21 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Response body from real service, unchanged (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### Response body for playback (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### DEBUG: Response body for client, possibly changed after recording (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

## Interaction 19: DELETE /todos

### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: localhost:8099
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Content-Length: 0
Content-Type: application/json
```

### Request headers for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todo-backend-rocket-rust.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-rocket-rust.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### DEBUG: Request body as received from client (application/json), WITHOUT REDACTIONS, ETC:

```

```

### Request body for playback (application/json):

```

```

### DEBUG: Response headers from real service, unchanged:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:22 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### Response headers for playback:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:22 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Headers for client, possibly changed after recording:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:22 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Response body from real service, unchanged (200: null - Base64 below):

```

```

### Response body for playback (200: null - Base64 below):

```

```

### DEBUG: Response body for client, possibly changed after recording (200: null - Base64 below):

```

```

## Interaction 20: POST /todos

### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: localhost:8099
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Content-Length: 16
Content-Type: application/json
```

### Request headers for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
Host: todo-backend-rocket-rust.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-rocket-rust.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### DEBUG: Request body as received from client (application/json), WITHOUT REDACTIONS, ETC:

```
{
   "title": "blah"
}
```

### Request body for playback (application/json):

```
{
   "title": "blah"
}
```

### DEBUG: Response headers from real service, unchanged:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:22 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### Response headers for playback:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:22 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Headers for client, possibly changed after recording:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:22 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Response body from real service, unchanged (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### Response body for playback (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### DEBUG: Response body for client, possibly changed after recording (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

## Interaction 21: DELETE /todos

### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: localhost:8099
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Content-Length: 0
Content-Type: application/json
```

### Request headers for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todo-backend-rocket-rust.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-rocket-rust.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### DEBUG: Request body as received from client (application/json), WITHOUT REDACTIONS, ETC:

```

```

### Request body for playback (application/json):

```

```

### DEBUG: Response headers from real service, unchanged:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:22 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### Response headers for playback:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:22 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Headers for client, possibly changed after recording:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:22 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Response body from real service, unchanged (200: null - Base64 below):

```

```

### Response body for playback (200: null - Base64 below):

```

```

### DEBUG: Response body for client, possibly changed after recording (200: null - Base64 below):

```

```

## Interaction 22: POST /todos

### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: localhost:8099
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Content-Length: 16
Content-Type: application/json
```

### Request headers for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
Host: todo-backend-rocket-rust.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-rocket-rust.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### DEBUG: Request body as received from client (application/json), WITHOUT REDACTIONS, ETC:

```
{
   "title": "blah"
}
```

### Request body for playback (application/json):

```
{
   "title": "blah"
}
```

### DEBUG: Response headers from real service, unchanged:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:22 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### Response headers for playback:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:22 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Headers for client, possibly changed after recording:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:22 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Response body from real service, unchanged (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### Response body for playback (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### DEBUG: Response body for client, possibly changed after recording (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

## Interaction 23: DELETE /todos

### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: localhost:8099
Accept-Language: en-us
Accept-Encoding: gzip, deflate
Content-Length: 0
Content-Type: application/json
```

### Request headers for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 0
Content-Type: application/json
Host: todo-backend-rocket-rust.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-rocket-rust.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### DEBUG: Request body as received from client (application/json), WITHOUT REDACTIONS, ETC:

```

```

### Request body for playback (application/json):

```

```

### DEBUG: Response headers from real service, unchanged:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:22 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### Response headers for playback:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:22 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Headers for client, possibly changed after recording:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Date: Wed, 27 Mar 2019 05:59:22 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Response body from real service, unchanged (200: null - Base64 below):

```

```

### Response body for playback (200: null - Base64 below):

```

```

### DEBUG: Response body for client, possibly changed after recording (200: null - Base64 below):

```

```

## Interaction 24: POST /todos

### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: localhost:8099
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Content-Length: 16
Content-Type: application/json
```

### Request headers for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
Host: todo-backend-rocket-rust.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-rocket-rust.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### DEBUG: Request body as received from client (application/json), WITHOUT REDACTIONS, ETC:

```
{
   "title": "blah"
}
```

### Request body for playback (application/json):

```
{
   "title": "blah"
}
```

### DEBUG: Response headers from real service, unchanged:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:22 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### Response headers for playback:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:22 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Headers for client, possibly changed after recording:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:22 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Response body from real service, unchanged (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### Response body for playback (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### DEBUG: Response body for client, possibly changed after recording (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

## Interaction 25: POST /todos

### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: localhost:8099
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Content-Length: 28
Content-Type: application/json
```

### Request headers for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 28
Content-Type: application/json
Host: todo-backend-rocket-rust.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-rocket-rust.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### DEBUG: Request body as received from client (application/json), WITHOUT REDACTIONS, ETC:

```
{
   "title": "blah",
   "order": 523
}
```

### Request body for playback (application/json):

```
{
   "title": "blah",
   "order": 523
}
```

### DEBUG: Response headers from real service, unchanged:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:22 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### Response headers for playback:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:22 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Headers for client, possibly changed after recording:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:22 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Response body from real service, unchanged (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### Response body for playback (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### DEBUG: Response body for client, possibly changed after recording (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

## Interaction 26: POST /todos

### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: localhost:8099
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Content-Length: 27
Content-Type: application/json
```

### Request headers for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 27
Content-Type: application/json
Host: todo-backend-rocket-rust.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-rocket-rust.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### DEBUG: Request body as received from client (application/json), WITHOUT REDACTIONS, ETC:

```
{
   "order": 10,
   "title": "blah"
}
```

### Request body for playback (application/json):

```
{
   "order": 10,
   "title": "blah"
}
```

### DEBUG: Response headers from real service, unchanged:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:23 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### Response headers for playback:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:23 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Headers for client, possibly changed after recording:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:23 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Response body from real service, unchanged (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### Response body for playback (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### DEBUG: Response body for client, possibly changed after recording (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

## Interaction 27: POST /todos

### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:

```
Origin: http://www.todobackend.com
Accept: text/plain, */*; q=0.01
Connection: keep-alive
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
Referer: http://www.todobackend.com/specs/index.html?http://localhost:8099/todos
Host: localhost:8099
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Content-Length: 27
Content-Type: application/json
```

### Request headers for playback:

```
Accept-Encoding: gzip, deflate
Accept-Language: en-us
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 27
Content-Type: application/json
Host: todo-backend-rocket-rust.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-backend-rocket-rust.herokuapp.com/todos
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
```

### DEBUG: Request body as received from client (application/json), WITHOUT REDACTIONS, ETC:

```
{
   "order": 10,
   "title": "blah"
}
```

### Request body for playback (application/json):

```
{
   "order": 10,
   "title": "blah"
}
```

### DEBUG: Response headers from real service, unchanged:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:23 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### Response headers for playback:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:23 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Headers for client, possibly changed after recording:

```
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 496
Content-Type: text/html; charset=utf-8
Date: Wed, 27 Mar 2019 05:59:23 GMT
Server: Rocket
Vary: Origin
Via: 1.1 vegur
```

### DEBUG: Response body from real service, unchanged (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### Response body for playback (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

### DEBUG: Response body for client, possibly changed after recording (404: text/html; charset=utf-8):

```

            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>404 Not Found</title>
            </head>
            <body align="center">
                <div align="center">
                    <h1>404: Not Found</h1>
                    <p>The requested resource could not be found.</p>
                    <hr />
                    <small>Rocket</small>
                </div>
            </body>
            </html>
        
```

