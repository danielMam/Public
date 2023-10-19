package bank;
import javax.swing.*;

public class konto {



    public class Konto {
        private String nrKonta = "01234567890123456789012345"; //nr konta ma 26 cyfr
        private double stanKonta = 0.0;
        private boolean debet = false;
        private double maxDebet =0.0;


        public String getNrKonta() {
            return nrKonta;
        }
        public Double getStanKonta() {
            return stanKonta;
        }


        public boolean isDebet() {
            return debet;
        }

        public double getMaxDebet() {
            return maxDebet;
        }




        public void setDebet(boolean debet) {
            this.debet = debet;
            if (debet) {
                maxDebet =5000.0;
                stanKonta = stanKonta + maxDebet;
            }
        }
    }
}
