
import java.nio.file.Paths;
import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;


public class Example2 extends Application{
    public static void main(String[] args) {
        Kamehameha(5);
        playKamehameha();
    }
    
    public static void Kamehameha(int number){
        if(number == 0 || number > 5){
            System.out.println("Done.");
        
        }else if(number > 0){
            if(number == 1){
                System.out.print("Ha!!!!!!!!!!!");
            }
            if(number == 2){
                System.out.print("Me-");
            }
            if(number == 3){
                System.out.print("Ha-");
            }
            if(number == 4){
                System.out.print("me-");
            
            }
            if(number == 5){
                System.out.print("Ka-");
            
            }
            
            number--;
            Kamehameha(number);
           
        
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public static void playKamehameha(){
        String s = "C:\\Users\\Christopher Martin\\Documents\\NetBeansProjects\\Recursion (YouTube)\\src\\Kamehameha.mp3";
       
        Media m;
        m = new Media(Paths.get(s).toUri().toString());
        
        MediaPlayer mediaPlayer;
        mediaPlayer = new MediaPlayer(m);
        
        mediaPlayer.play();
    
    }

    @Override
    public void start(Stage primaryStage) throws Exception {}

}