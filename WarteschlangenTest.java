

public class WarteschlangenTest {
    final int N = 3;
    
    public void testeAnmelden(){
        PatientenWarteschlange wartezimmer = new PatientenWarteschlange(N);
        
        for(int i = 0; i < N + 3; i++){
            wartezimmer.anmelden(new Patient("Patient" + i));
        }
        System.out.println(wartezimmer);
    }
}
