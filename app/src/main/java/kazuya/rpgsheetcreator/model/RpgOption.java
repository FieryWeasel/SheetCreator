package kazuya.rpgsheetcreator.model;

/**
 * Created by Kazuya on 21/06/2015.
 */
public class RpgOption {
    private int mId;
    private String mName;
    private String mDescription;
    private Language mLanguage;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        this.mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        this.mDescription = description;
    }

    public Language getLanguage() {
        return mLanguage;
    }

    public void setLanguage(Language language) {
        this.mLanguage = language;
    }
}
