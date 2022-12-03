package br.com.caelum.clines.api.users;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UserFormMapperTest {

  private static final String NAME = "Luciano";
  private static final String EMAIL = "lacsousa@teste.com";
  private static final String PASSWORD = "1234567";
  
  private UserFormMapper mapper = new UserFormMapper();

  @Test
  void shouldConvertUserFormToUser() {
    
    var form = new UserForm(NAME , EMAIL, PASSWORD);
    
    var user = mapper.map(form);
    
    assertEquals(NAME, user.getName());
    assertEquals(EMAIL, user.getEmail());
    assertEquals(PASSWORD, user.getPassword());
    
  }

}
