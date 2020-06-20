package workHome;

public class Calculator {
    private double metry;
    private double centymetry;
    private double milimetry;
    private double kilogramy;
    private double gramy;
    private double miligramy;

    public double getKilogramy() {
        return kilogramy;
    }

    public void setKilogramy(double kilogramy) {
        this.kilogramy = kilogramy;
    }

    public double getGramy() {
        return gramy;
    }

    public void setGramy(double gramy) {
        this.gramy = gramy;
    }

    public double getMiligramy() {
        return miligramy;
    }

    public void setMiligramy(double miligramy) {
        this.miligramy = miligramy;
    }

    public double getMetry() {
        return metry;
    }

    public void setMetry(double metry) {
        this.metry = metry;
    }

    public double getCentymetry() {
        return centymetry;
    }

    public void setCentymetry(double centymetry) {
        this.centymetry = centymetry;
    }

    public double getMilimetry() {
        return milimetry;
    }

    public void setMilimetry(double milimetry) {
        this.milimetry = milimetry;
    }

    public void calculateMeter(String metry, String centymetry, String milimetry) {
        try {
            if (metry.length() != 0) {
                setMetry(Double.parseDouble(metry));
                setCentymetry(Double.parseDouble(metry) * 100);
                setMilimetry(Double.parseDouble(metry) * 1000);
            }
            if (centymetry.length() != 0) {
                setMetry(Double.parseDouble(centymetry) / 100);
                setCentymetry(Double.parseDouble(centymetry));
                setMilimetry(Double.parseDouble(centymetry) * 10);
            }
            if (milimetry.length() != 0) {
                setMetry(Double.parseDouble(milimetry) / 1000);
                setCentymetry(Double.parseDouble(milimetry) / 10);
                setMilimetry(Double.parseDouble(milimetry));
            }
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException: " + nfe.getMessage());
        }
    }

    public void calculateWag(String kilogramy, String gramy, String miligramy) {
        try {
            if (kilogramy.length() != 0) {
                setKilogramy(Double.parseDouble(kilogramy));
                setGramy(Double.parseDouble(kilogramy) * 1000);
                setMiligramy(Double.parseDouble(kilogramy) * 100000);
            }
            if (gramy.length() != 0) {
                setKilogramy(Double.parseDouble(gramy) / 1000);
                setGramy(Double.parseDouble(gramy));
                setMiligramy(Double.parseDouble(gramy) * 1000);
            }
            if (miligramy.length() != 0) {
                setKilogramy(Double.parseDouble(miligramy) / 100000);
                setGramy(Double.parseDouble(miligramy) / 1000);
                setMiligramy(Double.parseDouble(miligramy));
            }
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException: " + nfe.getMessage());
        }
    }
}
