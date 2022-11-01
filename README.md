# Apache Batik SSRF to RCE Jar Exploit

## Component link

https://github.com/apache/xmlgraphics-batik

## Blog

https://www.zerodayinitiative.com/blog/2022/10/28/vulnerabilities-in-apache-batik-default-security-controls-ssrf-and-rce-through-remote-class-loading

## Usage 

- Modify the line 11 in src/main/java/com.poc.Poc.java to change the command.
- Run `mvn clean package`
- Exploit can be found in target/

Then you need to navigate to the [Poc/](Poc) to use this exploit jar.

### Poc contains:

- SSRF
- RCE via jar
- RCE via ecmascript