package eb.project.mpai.service;

import eb.project.mpai.domain.bilete.BiletNormalConcert;
import eb.project.mpai.domain.bilete.BiletVIPConcert;
import eb.project.mpai.repository.BiletNormalConcertRepository;
import eb.project.mpai.repository.BiletVIPConcertRepository;
import eb.project.mpai.service.interfaces.BiletNormalConcertService;
import eb.project.mpai.service.interfaces.BiletVIPConcertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BiletVIPConcertServiceImpl implements BiletVIPConcertService {

    @Autowired
    private BiletVIPConcertRepository biletVIPConcertRepository;

    @Override
    public List<BiletVIPConcert> findAll() {
        return biletVIPConcertRepository.findAll();
    }

    @Override
    public void save(BiletVIPConcert bilet){
        biletVIPConcertRepository.save(bilet);
    }

    @Override
    public void delete(BiletVIPConcert bilet){
        biletVIPConcertRepository.delete(bilet);
    }

    @Override
    public Optional<BiletVIPConcert> findById(Long id){ return biletVIPConcertRepository.findById(id);}
}
