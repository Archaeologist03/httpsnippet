//Import unirest library (http://unirest.io/java.html) 

HttpResponse<String> response = Unirest.post("http://mockbin.com/har")
  .header("cookie", "foo=bar; bar=baz")
  .asString();
