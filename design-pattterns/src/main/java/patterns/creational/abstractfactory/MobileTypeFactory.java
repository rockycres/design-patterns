package patterns.creational.abstractfactory;

public class MobileTypeFactory implements AbstractFactory<Mobile> {

    public static final String ANDROID = "android";
    public static final String APPLE = "apple";

    public Mobile create(String mobileType) {

            if (mobileType == null || mobileType.isEmpty()) {
                return null;
            } else {
                switch (mobileType) {
                    case ANDROID:
                        return new AndroidMobile();
                    case APPLE:
                        return new AppleMobile();
                    default:
                        throw new IllegalArgumentException("Unknown Notification Type received");
                }
            }
    }

}
