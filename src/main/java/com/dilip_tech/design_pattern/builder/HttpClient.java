package com.dilip_tech.design_pattern.builder;

public class HttpClient {
    private String method;

    private String url;
    private String userName;
    private String password;
    private String headers;
    private String body;

    public HttpClient(String method, String url, String userName, String password, String headers, String body) {
        super();
        this.method = method;
        this.url = url;
        this.userName = userName;
        this.password = password;
        this.headers = headers;
        this.body = body;
    }

public HttpClient (HttpClientBuiler httpClientBuiler){
        this.method=httpClientBuiler.method;
        this.body=httpClientBuiler.body;
        this.headers=httpClientBuiler.headers;
        this.url=httpClientBuiler.url;
        this.password=httpClientBuiler.password;
        this.userName=httpClientBuiler.userName;
}

    @Override
    public String toString() {
        return "HttpClient{" +
                "method='" + method + '\'' +
                ", url='" + url + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", headers='" + headers + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public static class HttpClientBuiler{
        private String method;
        private String url;
        private String userName;
        private String password;
        private String headers;
        private String body;

        public HttpClientBuiler method(String method){
            this.method=method;
            return this;
        }
        public HttpClientBuiler url(String url){
            this.url=url;
            return this;
        }
        public HttpClientBuiler sercure(String userName,String password){
            this.userName=userName;
            this.password=password;
            return this;
         }
        public HttpClientBuiler headers(String headers){
            this.headers=headers;
            return this;
        }
        public HttpClientBuiler body(String body){
            this.body=body;
            return this;
        }
        public HttpClient build(){
            return new HttpClient(this);
        }

    }


}
