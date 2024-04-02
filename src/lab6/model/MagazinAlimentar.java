package lab6.model;

import lab6.interfate.FunctieGeneralChirie;

public class MagazinAlimentar implements FunctieGeneralChirie {

    @Override
    public int chirie(int x) {
        return x*2;
    }
}
