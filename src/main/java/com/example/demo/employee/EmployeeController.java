@RestController
@AllArgsConstructor
public class EmployeeController {

    @GetMapping(path = "/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") final String id) {
        return new ResponseEntity(Employee.builder().id(id).firstName("Raj").lastName("Gupta").build(), HttpStatus.OK);
    }

    @PostMapping(path = "/employee")
    public ResponseEntity<Employee> createEmployee(@RequestBody final Employee employee) {
        return new ResponseEntity(employee, HttpStatus.CREATED);
    }
}