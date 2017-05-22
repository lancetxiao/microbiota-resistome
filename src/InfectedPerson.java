/**
 describes class of infected peaple
 */

public abstract class InfectedPerson extends Person {

    public InfectedPerson(double micResistance, boolean pathResistance, int incCountdown) {
        super(micResistance);
        this.pathResistance = pathResistance;
        this.incCountdown = incCountdown;
    }
    public int incCountdown;
    public boolean pathResistance; //TRUE - resistant pathogen, FALSE -non resistant pathogen
    public int getIncCountdown() {return this.incCountdown;}
    public void setIncCountdown (int incubCountdown) {this.incCountdown = incubCountdown;}
    public boolean changePathResistance(boolean pRes, double micRes,double coefficient) {
        if (pRes == false){
            double pChangePathRes = micRes*coefficient;
            pRes = ((boolean) bernoulli(pChangePathRes));
        }
        return pRes;
    }
    public abstract void tick(Simulation myComp, double p, double coef, double changePathResCoef);
}

