public class Duck implements Polet {
    boolean isInjured;

    public void fly() throws FlyException {
        if (this.isInjured) {
            try {
                throw new FlyException() {
                };
            } catch (FlyException var2) {
                System.out.println("Утка ранена");
            }
        } else {
            System.out.println("Утка летит");
        }

    }

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }
}


