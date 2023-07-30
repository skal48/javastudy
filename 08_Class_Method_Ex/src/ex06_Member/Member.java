package ex06_Member;

public class Member {
  
  private String name;
  private Contact contact;
  
  //setter 
  public void setName(String name) {
    this.name = name;
  }
  public void setContact(Contact contact) {
    this.contact = contact;
  }
  
  
  // getter
  public String getName() {
    return name;
  }
  public Contact getContact() {
    return contact;
  }
}
