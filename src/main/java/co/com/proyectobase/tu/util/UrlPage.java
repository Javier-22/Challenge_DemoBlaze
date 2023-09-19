package co.com.proyectobase.tu.util;

public enum UrlPage  {

    URLPAGE("https://www.demoblaze.com");

    private final String url;

    UrlPage(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}