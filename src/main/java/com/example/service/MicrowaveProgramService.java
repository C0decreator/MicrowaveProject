import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MicrowaveProgramService {
    private final MicrowaveProgramRepository repository;

    @Autowired
    public MicrowaveProgramService(MicrowaveProgramRepository repository) {
        this.repository = repository;
    }

    public List<MicrowaveProgram> getAllPrograms() {
        return repository.findAll();
    }

    public MicrowaveProgram addProgram(MicrowaveProgram program) {
        program.setCustom(true); // Устанавливаем пользовательскую программу
        return repository.save(program);
    }

    public void deleteProgram(Long id) {
        repository.deleteById(id);
    }
}