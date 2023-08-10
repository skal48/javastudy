package controller;

import java.util.List;
import java.util.Map;

import dto.ContactDto;
import service.ContactService;
import service.ContactServiceImpI;

public class ContactController {
  
  private ContactService contactService = new ContactServiceImpI();
  
  /**
   * 요청처리메소드<br>
   * @param choice choice 1,2,3,4,5 중 하나 
   * @param map 사용자가 입력한 값
   *            choice == 1 : name, tel. email, address
   *            choice == 2 : contact_no, name. tel. email. address  
   *            choice == 3 : contact_no,   
   *            choice == 4 : null    
   *            choice == 5 : contact_no
   * @return message 처리 결과 메세지                
   */
 
  
  public String request(String choice,Map<String, Object> map) {
  
    System.out.println("Controller::" + map);
    
    String message = "";
    
    switch(choice) {
    case "1":
      int insertCont = contactService.insert(map);
      message = insertCont + "개 연락처가 등록되었습니다.";
      break;
    case "2":
      int updateCont = contactService.update(map);
      message = updateCont + "개 연락처를 수정되었습니다.";
      break;
    case "3":
      int deleteCont = contactService.delete(map);
      message = deleteCont +"개 연락처가 삭제되었습니다.";
      break;
    case "4":
      List<ContactDto> list = contactService.selectList();
      for(ContactDto contacDto : list) {
        message += contacDto.toString() + "\n";
      }
      break;
    case "5":
      
      ContactDto contactDto = contactService.selectContactByNo(map);
      if(contactDto == null) {
        message = "조회결과 없습니다.";
      } else {
        message = "조회결과: " + contactDto.toString();
      }
      
      
      break;      
    }
    
    return message;
        
  }
}
