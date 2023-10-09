package dev.burndev.todolist.user;

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
  public void create(@RequestBody UserModel userModel) {
    System.out.println(userModel);
  }
}
