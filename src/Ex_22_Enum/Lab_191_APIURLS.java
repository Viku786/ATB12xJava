package Ex_22_Enum;

public enum Lab_191_APIURLS {
    katalon("https://katalon.com"),
    google("https://google.com");

    private String url;

    Lab_191_APIURLS(String url){
        this.url=url;
    }

    String getUrl(){
        return this.url;
    }
}
