
//Controller class
package JoshA.Control;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RequestHeader; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import java.util.Map;
import java.util.HashMap;
import JoshA.DataBox.*;


@RestController
@RequestMapping(path = "/JoshFruit")
public class FruitController{
    
    private Map<Integer,Fruit> fruit;
    
    public FruitController(){
        this.fruit = new HashMap();
        Fruit fruitObj = new Fruit();
        
        Apple apple = new Apple();
        apple.setNumberOfApple(5);
        apple.setAmount(500);
        
        Lemon lemon = new Lemon();
        lemon.setNumberOfLemon(5);
        lemon.setAmount(250);
        
        Orange orange = new Orange();
        orange.setNumberOfOrange(5);
        orange.setAmount(150);
        
        fruitObj.setNumberOfFruit(5);
        fruitObj.setApple(apple);
        fruitObj.setLemon(lemon);
        fruitObj.setOrange(orange);
        
        this.fruit.put(1,fruitObj);
        
        Fruit fruitObj2 = new Fruit();
        
        Apple apple2 = new Apple();
        apple2.setNumberOfApple(10);
        apple2.setAmount(1000);
        
        Lemon lemon2 = new Lemon();
        lemon2.setNumberOfLemon(10);
        lemon2.setAmount(600);
        
        Orange orange2 = new Orange();
        orange2.setNumberOfOrange(10);
        orange2.setAmount(300);
        
        fruitObj2.setNumberOfFruit(10);
        fruitObj2.setApple(apple2);
        fruitObj2.setLemon(lemon2);
        fruitObj2.setOrange(orange2);
        
        this.fruit.put(2,fruitObj2);
    }
    
    @GetMapping(path = "/Fruit", produces = "application/json")
    public ResponseEntity<Object> getFruit(){
        //Get all fruit bean and send it to client
        return new ResponseEntity<>(this.fruit,HttpStatus.OK);
    }
    
    @RequestMapping(path = "/Exit")
    public ResponseEntity<Object> Exit(){
        //Exit app
        return new ResponseEntity<>("\nShutting down server...\n", HttpStatus.OK);
    }
}

//Sending GET request
//Shell: curl http://localhost:8080/JoshFruit/Fruit
//THE ABOVE IS FOR .getFruit()

//In order to exist this program:
//Shell: curl http://localhost:8080/JoshFruit/Exit