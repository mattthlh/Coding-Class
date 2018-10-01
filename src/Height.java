public class Height {
    private int inches;
    private int feet;

    public Height(int inches, int feet){
        this.feet = feet;
        this.inches = inches;
        simplify();
    }

    public Height(int inches){
        this.inches = inches;
        simplify();
    }

    public void add(int inches){
        this.inches += inches;
        simplify();
    }

    public void add(Height ht){
        inches += ht.inches;
        feet += ht.feet;
        simplify();
    }

    public int getFeet() {
        return this.feet;
    }

    public int getInches() {
        return this.inches;
    }

    public void setFeet(int feet) {
        this.feet = this.feet;
    }

    public void setInches(int inches) {
        this.inches = this.inches;
        simplify();
    }

    public void simplify() {
        if(this.inches >= 12) {
            while (this.inches >= 12) {
                this.inches = this.inches - 12;
                this.feet += 1;
            }
        }
    }
}
