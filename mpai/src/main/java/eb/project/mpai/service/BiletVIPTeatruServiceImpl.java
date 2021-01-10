package eb.project.mpai.service;

import eb.project.mpai.domain.bilete.BiletNormalTeatru;
import eb.project.mpai.domain.bilete.BiletVIPTeatru;
import eb.project.mpai.repository.BiletNormalTeatruRepository;
import eb.project.mpai.repository.BiletVIPTeatruRepository;
import eb.project.mpai.service.interfaces.BiletNormalTeatruService;
import eb.project.mpai.service.interfaces.BiletVIPTeatruService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BiletVIPTeatruServiceImpl implements BiletVIPTeatruService {

    @Autowired
    private BiletVIPTeatruRepository biletVIPTeatruRepository;

    @Override
    public List<BiletVIPTeatru> findAll() {
        return biletVIPTeatruRepository.findAll();
    }

    @Override
    public void save(BiletVIPTeatru bilet){
        biletVIPTeatruRepository.save(bilet);
    }

    @Override
    public void delete(BiletVIPTeatru bilet){
        biletVIPTeatruRepository.delete(bilet);
    }

    @Override
    public Optional<BiletVIPTeatru> findById(Long id){ return biletVIPTeatruRepository.findById(id);}
}
