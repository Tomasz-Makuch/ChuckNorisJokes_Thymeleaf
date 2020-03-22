package pl.makuch.ChuckNorisJokes_Thymeleaf;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesService {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    private int displayNum = 0;

    public int getDisplayNum() {
        return displayNum;
    }

    public void setDisplayNum(int displayNum) {
        this.displayNum = displayNum;
    }

    public JokesService() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String getJoke(){
        displayNum++;
        return chuckNorrisQuotes.getRandomQuote();
    }
}
