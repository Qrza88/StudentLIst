package ArletaKurkiewicz.StudentLIst.apis;

import ArletaKurkiewicz.StudentLIst.objects.Car;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/car/")
public class CarApi {
    private List<Car> carList;
    public CarApi() {
        this.carList = new ArrayList<>();
    }
    @PostMapping("/addCar")
    public boolean addCar (@RequestBody Car car){
        return carList.add(car);

    }
    @GetMapping("/getList")
    public List<Car> getCarList (){return carList;}

}
