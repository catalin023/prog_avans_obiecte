package lab11;

import java.sql.Timestamp;

public class StoredObject {
    private String myInfo;
    private boolean expired;
    private Timestamp expirationTime;



    public StoredObject(String myInfo) {
        this.myInfo = myInfo;
        this.expirationTime = new Timestamp(System.currentTimeMillis() + 40);
    }

    public String getMyInfo() {
        return myInfo;
    }

    public void setMyInfo(String myInfo) {
        this.myInfo = myInfo;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public Timestamp getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Timestamp expirationTime) {
        this.expirationTime = expirationTime;
    }

    @Override
    public String toString() {
        return "StoredObject{" +
                "myInfo='" + myInfo + '\'' +
                ", expired=" + expired +
                ", expirationTime=" + expirationTime +
                '}';
    }
}
