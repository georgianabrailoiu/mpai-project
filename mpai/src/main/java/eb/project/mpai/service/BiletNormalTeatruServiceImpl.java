package eb.project.mpai.service;

import eb.project.mpai.domain.bilete.BiletNormalConcert;
import eb.project.mpai.domain.bilete.BiletNormalTeatru;
import eb.project.mpai.repository.BiletNormalConcertRepository;
import eb.project.mpai.repository.BiletNormalTeatruRepository;
import eb.project.mpai.service.interfaces.BiletNormalConcertService;
import eb.project.mpai.service.interfaces.BiletNormalTeatruService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BiletNormalTeatruServiceImpl implements BiletNormalTeatruService {

    @Autowired
    private BiletNormalTeatruRepository biletNormalTeatruRepository;

    @Override
    public List<BiletNormalTeatru> findAll() {
        return biletNormalTeatruRepository.findAll();
    }

    @Override
    public void save(BiletNormalTeatru bilet){
        biletNormalTeatruRepository.save(bilet);
    }

    @Override
    public void delete(BiletNormalTeatru bilet){
        biletNormalTeatruRepository.delete(bilet);
    }

    @Override
    public Optional<BiletNormalTeatru> findById(Long id){ return biletNormalTeatruRepository.findById(id);}
}
