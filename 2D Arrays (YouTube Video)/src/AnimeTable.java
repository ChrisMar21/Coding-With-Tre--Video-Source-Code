public class AnimeTable{
   String[][]animeCharacters = new String[3][3];;
   AnimeCharacter animeCharacter1;
   AnimeCharacter animeCharacter2;
   AnimeCharacter animeCharacter3;
    public AnimeTable(){    
      //Anime Characters that will be put into Anime Table
      animeCharacter1 = new AnimeCharacter("Goku","Dragonball Z","Spirit Bomb");
      animeCharacter2 = new AnimeCharacter("Naruto","Naruto",
                                           "Shadow Clone Jutsu");
      animeCharacter3 = new AnimeCharacter("Luffy","One Piece","Jet Bazooka");
      
    }
    
    public void fillTable(){
       animeCharacters[0][0] = animeCharacter1.getName();
       animeCharacters[0][1] = animeCharacter1.getAnimeShow();
       animeCharacters[0][2] = animeCharacter1.getSpecialPower();
       
       animeCharacters[1][0] = animeCharacter2.getName();
       animeCharacters[1][1] = animeCharacter2.getAnimeShow();
       animeCharacters[1][2] = animeCharacter2.getSpecialPower();
       
       animeCharacters[2][0] = animeCharacter3.getName();
       animeCharacters[2][1] = animeCharacter3.getAnimeShow();
       animeCharacters[2][2] = animeCharacter3.getSpecialPower();
    }
    public void printTable(){
          fillTable();
          for(int i = 0;i < animeCharacters.length;i++){
              for(int j = 0;j < animeCharacters[i].length;j++){
                  System.out.print(animeCharacters[i][j] + "  \t");
              }
              System.out.println();
          }
    }
    public static void main(String[] args) {
       AnimeTable table = new AnimeTable();
       table.printTable();
     
       
  }
}