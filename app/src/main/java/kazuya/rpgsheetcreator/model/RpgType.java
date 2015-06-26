package kazuya.rpgsheetcreator.model;

/**
 * Created by Kazuya on 21/06/2015.
 */
public class RpgType {

    private int mId;
    private String mName;
    private Language mLanguage;

    public int getId() {
        return mId;
    }

    public void setId(int mId) {
        this.mId = mId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public Language getLanguage() {
        return mLanguage;
    }

    public void setLanguage(Language language) {
        this.mLanguage = language;
    }
}
