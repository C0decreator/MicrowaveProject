import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programs")
public class MicrowaveProgramController {
    private final MicrowaveProgramService service;

    @Autowired
    public MicrowaveProgramController(MicrowaveProgramService service) {
        this.service = service;
    }

    @GetMapping
    public List<MicrowaveProgram> getAllPrograms() {
        return service.getAllPrograms();
    }

    @PostMapping
    public ResponseEntity<MicrowaveProgram> addProgram(@RequestBody MicrowaveProgram program) {
        return ResponseEntity.ok(service.addProgram(program));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProgram(@PathVariable Long id) {
        service.deleteProgram(id);
        return ResponseEntity.noContent().build();
    }
}