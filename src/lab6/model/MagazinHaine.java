package lab6.model;

import lab6.interfate.FunctieGeneralChirie;

public class MagazinHaine implements FunctieGeneralChirie {

    @Override
    public int chirie(int x) {
        return 3*x;
    }
}
