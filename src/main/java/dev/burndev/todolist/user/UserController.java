package dev.burndev.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificador
 * public
 * private
 * protected
 */
@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private IUserRepository userRepository;
  /**
   * String ( texto )
   * Integer (int) números inteiros
   * Double (double) números fracionados até 15 digitos decimais
   * Float (float) números fracionados até 7 digitos decimais
   * Character (char) apenas um caractere
   * Date (data)
   * void sem retorno
   */
  @PostMapping("/")
  public ResponseEntity create(@RequestBody UserModel userModel) {
    var user = this.userRepository.findByUsername(userModel.getUsername());

    if(user != null) {
      // Retorna:
      // 1 - Mensagem de erro
      // 2 - HTTP status code
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário já existe.");
    }

    var userCreated = this.userRepository.save(userModel);
    return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
  }
}
