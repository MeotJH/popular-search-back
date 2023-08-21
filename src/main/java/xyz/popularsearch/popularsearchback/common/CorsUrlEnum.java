package xyz.popularsearch.popularsearchback.common;

public enum CorsUrlEnum {

    LOCAL("local","http://localhost:3000"),
    PROD("prod","http://popular-search.xyz");


    private final String profile;
    private final String url;

    CorsUrlEnum(String profile,String url) {
        this.profile = profile;
        this.url = url;
    }

    public static String getUrl(String profile) {

        //이넘 profile 변수에 맞는 url을 가져다 준다.
        for (CorsUrlEnum each: CorsUrlEnum.values()) {
            if(each.equals(profile)){
                return each.url;
            }
        }

        return CorsUrlEnum.LOCAL.url;
    }
}
