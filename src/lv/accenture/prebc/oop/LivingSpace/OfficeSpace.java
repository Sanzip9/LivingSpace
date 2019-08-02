package lv.accenture.prebc.oop.LivingSpace;

public class OfficeSpace implements Space{

        private int spaceM2;
        private int rooms;


    @Override
    public int spaceM2() {
        return (int)(spaceM2);
    }

    @Override
    public int rooms() {
        return (int)(rooms);
    }

    @Override
    public boolean rent(Space other) {
        return true;
    }
}
