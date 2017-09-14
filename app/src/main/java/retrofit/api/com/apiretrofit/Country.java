package retrofit.api.com.apiretrofit;

import java.util.ArrayList;

/**
 * Created by bill on 14/09/17.
 */

public class Country {
    private ArrayList<Companies> Companies;
    private ArrayList<Failures> Failures;

    public ArrayList<Country.Companies> getCompanies() {
        return Companies;
    }

    public void setCompanies(ArrayList<Country.Companies> companies) {
        Companies = companies;
    }

    public ArrayList<Country.Failures> getFailures() {
        return Failures;
    }

    public void setFailures(ArrayList<Country.Failures> failures) {
        Failures = failures;
    }

    public class Companies{
        private int A;
        private String B;

        public int getA() {
            return A;
        }

        public void setA(int a) {
            A = a;
        }

        public String getB() {
            return B;
        }

        public void setB(String b) {
            B = b;
        }
    }

    public class Failures{
        private String A;
        private String B;
        private String C;
        private String D;

        public String getA() {
            return A;
        }

        public void setA(String a) {
            A = a;
        }

        public String getB() {
            return B;
        }

        public void setB(String b) {
            B = b;
        }

        public String getC() {
            return C;
        }

        public void setC(String c) {
            C = c;
        }

        public String getD() {
            return D;
        }

        public void setD(String d) {
            D = d;
        }
    }

}



