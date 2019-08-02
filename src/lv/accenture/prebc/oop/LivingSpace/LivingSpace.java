package lv.accenture.prebc.oop.LivingSpace;

public class LivingSpace implements Space{



    
    @Override
    public int spaceM2() {
        return 0;
    }

    @Override
    public int rooms() {
        return 0;
    }

    @Override
    public boolean rent(Space other) {
        return false;
    }
}
