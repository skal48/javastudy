package dto;

public class ContactDto {
  //테이블에 있는 각 컬럼을 private 변수로 선언첫 글짜는 소문자로 
  private int contact_no;
  private String name;
  private String tel;
  private String email;
  private String address;
  private String created_at;
  
  // 생성자 생성
  public ContactDto() {
    // TODO Auto-generated constructor stub
  }
 // 모든 변수를 매개변수로 가지는 생성자 생성
  public ContactDto(int contact_no, String name, String tel, String email, String address, String created_at) {
    super();
    this.contact_no = contact_no;
    this.name = name;
    this.tel = tel;
    this.email = email;
    this.address = address;
    this.created_at = created_at;
  }
  // 접근자 메서드 (getter/setter 생성)
  public int getContact_no() {
    return contact_no;
  }

  public void setContact_no(int contact_no) {
    this.contact_no = contact_no;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCreated_at() {
    return created_at;
  }

  public void setCreated_at(String created_at) {
    this.created_at = created_at;
  }
  // toString 생성
  @Override
  public String toString() {
    return "ContactDto [contact_no=" + contact_no + ", name=" + name + ", tel=" + tel + ", email=" + email
        + ", address=" + address + ", created_at=" + created_at + "]";
  }
  
  // 나중에 테이블에 큰 자료(그림 동영상 등)이 있으면 Serializable 인터페이스 implements -> 객체 단위로 옮길수 있음
  // 컴퓨터가 나눠서 구축 되어 있는데 이게 없다면 객체단위로 데이터를 옮길 수 없다. 문자열 숫자열을 따로따로 넘길수 없음
  // DTO가 없가면 데이터 양이 많을 때 서로 다른 데이터 타입이 존재하면 전부 따로따로 옮겨야함
  // 위 Layer 들이 전부 분리되어 있으면 그때 DTO를 이용해서 데이터를 처리 
  // 이떄 Serializable 인터테이스가 있다면 서로다른 데이터 타입을 하나로 묶어서 보내는 것이 가능
  
}
