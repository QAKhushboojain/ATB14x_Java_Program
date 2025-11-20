package ex_0025_ENUM;


enum Env {
    DEV("https://dev.myapp.com/"),
    STAGING("https://staging.myapp.com/"),
    PROD("https://myapp.com/");
    private final String baseURL;

    Env(String baseURL) {
        this.baseURL = baseURL;
    }

    public String getBaseURL() {
        return baseURL;
    }
}
