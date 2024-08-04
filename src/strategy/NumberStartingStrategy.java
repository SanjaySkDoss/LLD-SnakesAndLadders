package strategy;

import utils.AppConstant;

public class NumberStartingStrategy implements StartingStrategy{
    @Override
    public boolean start(int val) {
        return val== AppConstant.DICE_MIN ||val==AppConstant.DICE_MAX;
    }
}
