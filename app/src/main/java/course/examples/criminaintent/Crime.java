package course.examples.criminaintent;

import java.util.Date;
import java.util.UUID;

/**
 * клас с параметрами и методами объекта, создает
 * объекты.
 * Class with paramethers and methods object. He creates object
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    private Date mDate; //переменная для даты преступления
    private boolean mSolved; //признак того было ли преступление раскрыто(да или нет хранится в этой переменной)
    public Crime() {
    // Генерирование уникального идентификатора
        mId = UUID.randomUUID();
        mDate = new Date();
    }
    @Override // change method for return not string, return mTitle value
    public String toString() {
        return mTitle;
    }

    public UUID getId() {
        return mId;
    }
    public String getTitle() {
        return mTitle;
    }
    public void setTitle(String title) {
        mTitle = title;
    }
    public Date getDate() {
        return mDate;
    }
    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
