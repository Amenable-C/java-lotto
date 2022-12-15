package lotto.domain;

import lotto.Lotto;

public class WinningLotto {
    private final Lotto lotto;
    private final int bonusNumber;

    public WinningLotto(Lotto lotto, int bonusNumber){
        this.lotto = lotto;
        this.bonusNumber = bonusNumber;
    }

    public Rank match(Lotto playerLotto) {
        int matchedNumberCount = playerLotto.countMatchedNumber(lotto);
        boolean isBonusNumberMatched = playerLotto.containNumber(bonusNumber);
        return Rank.valueOf(matchedNumberCount, isBonusNumberMatched);
    }
}
