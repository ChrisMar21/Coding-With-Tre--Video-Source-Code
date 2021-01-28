public class AnimeCharacter{
    private String name;
    private String animeShow;
    private String specialPower;
    
    public AnimeCharacter(String name){
        this.name = name;
    }
    
    public AnimeCharacter(String name, String animeShow,String specialPower){
        this.name = name;
        this.animeShow = animeShow;
        this.specialPower = specialPower;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
     public void setAnimeShow(String animeShow) {
        this.animeShow = animeShow;
    }
   
    public String getAnimeShow() {
        return animeShow;
    }
    
   public void setSpecialPower(String specialPower) {
        this.specialPower = specialPower;
    }
   
    public String getSpecialPower() {
        return specialPower;
    }
   
}