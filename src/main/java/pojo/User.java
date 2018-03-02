package pojo;

/**
 * @Author：dongtailei
 * @Description：
 * @Date：2018/3/2 14:01
 */
public class User {
    private Integer UId;
    private String UName;
    private String UPassword;
    private String URealName;
    private String Usex;
    private String UPhone;
    private String UEmail;
    private String Uqq;
    private String UBirth;
    private String URole;
    private String UIDCard;
    private String UPhoto;

    public Integer getUId() {
        return UId;
    }

    public void setUId(Integer UId) {
        this.UId = UId;
    }

    public String getUName() {
        return UName;
    }

    public void setUName(String UName) {
        this.UName = UName;
    }

    public String getUPassword() {
        return UPassword;
    }

    public void setUPassword(String UPassword) {
        this.UPassword = UPassword;
    }

    public String getURealName() {
        return URealName;
    }

    public void setURealName(String URealName) {
        this.URealName = URealName;
    }

    public String getUsex() {
        return Usex;
    }

    public void setUsex(String usex) {
        Usex = usex;
    }

    public String getUPhone() {
        return UPhone;
    }

    public void setUPhone(String UPhone) {
        this.UPhone = UPhone;
    }

    public String getUEmail() {
        return UEmail;
    }

    public void setUEmail(String UEmail) {
        this.UEmail = UEmail;
    }

    public String getUqq() {
        return Uqq;
    }

    public void setUqq(String uqq) {
        Uqq = uqq;
    }

    public String getUBirth() {
        return UBirth;
    }

    public void setUBirth(String UBirth) {
        this.UBirth = UBirth;
    }

    public String getURole() {
        return URole;
    }

    public void setURole(String URole) {
        this.URole = URole;
    }

    public String getUIDCard() {
        return UIDCard;
    }

    public void setUIDCard(String UIDCard) {
        this.UIDCard = UIDCard;
    }

    public String getUPhoto() {
        return UPhoto;
    }

    public void setUPhoto(String UPhoto) {
        this.UPhoto = UPhoto;
    }

    @Override
    public String toString() {
        return "User{" +
                "UId=" + UId +
                ", UName='" + UName + '\'' +
                ", UPassword='" + UPassword + '\'' +
                ", URealName='" + URealName + '\'' +
                ", Usex='" + Usex + '\'' +
                ", UPhone='" + UPhone + '\'' +
                ", UEmail='" + UEmail + '\'' +
                ", Uqq='" + Uqq + '\'' +
                ", UBirth='" + UBirth + '\'' +
                ", URole='" + URole + '\'' +
                ", UIDCard='" + UIDCard + '\'' +
                ", UPhoto='" + UPhoto + '\'' +
                '}';
    }
}
