package bandeau;

import java.util.List;

public class ExerciceAvecThreadsAmeliore extends Thread {
    
    private Bandeau bandeau;
    private List<ScenarioElement> element;

    public ExerciceAvecThreadsAmeliore(Bandeau bandeau, List<ScenarioElement> element) {
        this.bandeau = bandeau;
        this.element = element;
    }

    @Override
    public void run() {
        for (ScenarioElement SE:element) {
            for(int i = 0; i <SE.repeats ; i++) {
                SE.effect.playOn(bandeau);
            }
        }
    }
}
