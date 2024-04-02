package lab6.model;

import lab6.interfate.FunctieGeneralChirie;

public class MagazinChimicale implements FunctieGeneralChirie {
    @Override
    public int chirie(int x) {
        return 4*x;
    }
}
