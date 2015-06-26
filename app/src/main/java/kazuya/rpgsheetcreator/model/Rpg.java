package kazuya.rpgsheetcreator.model;

import java.util.List;

/**
 * Created by Kazuya on 21/06/2015.
 */
public class Rpg {

    private int mId;
    private String mName;
    private String mDescritpion;
    private Language mLanguage;
    private String mBackgroundColor;
    private String mFont;
    private String mTitleColor;
    private List<RpgType> mTypes;
    private List<RpgOption> mOptions;
}
