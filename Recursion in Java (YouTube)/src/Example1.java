
import java.nio.file.Paths;
import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;


public class Example1 extends Application{
      public static void main(String[] args) {
          fusion(3);
          playFusion();
          
          
      }
      
    public static void fusion(int number){
       if(number == 0 || number > 3){
           System.out.println("Done.");
       }
       else if(number > 0){
       if(number == 1){
           System.out.print("Ha!!!! ");
       }
       if(number == 2){
           System.out.print("sion-");
       }
       if(number == 3){
           System.out.print("Fu-");
       }
          
           fusion(number-1);
       }
       
    }
    
    
    
    
    
    
    
    
    
    
    
    public static void playFusion(){
        String s = "C:\\Users\\Christopher Martin\\Documents\\NetBeansProjects\\Recursion (YouTube)\\src\\Fusion.mp3";
       
        Media m;
        m = new Media(Paths.get(s).toUri().toString());
        
        MediaPlayer mediaPlayer;
        mediaPlayer = new MediaPlayer(m);
        
        mediaPlayer.play();
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {}
}