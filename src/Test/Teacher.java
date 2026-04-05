package Test;

public class Teacher {
    private String name;
    private String subject;
    private String hobby;


    public Teacher() {
    }

    public Teacher(String name, String subject, String hobby) {
        this.name = name;
        this.subject = subject;
        this.hobby = hobby;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * 设置
     * @param subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * 获取
     * @return hobby
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * 设置
     * @param hobby
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String toString() {
        return "Teacher{name = " + name + ", subject = " + subject + ", hobby = " + hobby + "}";
    }
}
