package br.com.floresdev.web_api_sample.repository;

import br.com.floresdev.web_api_sample.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * A @Repository define a classe como um componente do tipo repositório do Spring
 * */
@Repository
public class UserRepository {

    public void save(User User){
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(User);
    }
    public void update(User User){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(User);
    }
    public void remove(Integer id){
        System.out.printf("DELETE/id - Recebendo o id: %d para excluir um usuário%n", id);
        System.out.println(id);
    }
    public List<User> listAll(){
        List<User> Users = new ArrayList<>();
        Users.add(new User("gleyson","password"));
        Users.add(new User("frank","masterpass"));
        return Users;
    }
    public User finById(Integer id){
        System.out.printf("GET/id - Recebendo o id: %d para localizar um usuário%n", id);
        return new User("gleyson","password");
    }

}
