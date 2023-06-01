package KraftHeinz.APIinsights.controller;

import KraftHeinz.APIinsights.domain.insight.DadosInsight;
import KraftHeinz.APIinsights.domain.insight.DadosPaginaInsight;
import KraftHeinz.APIinsights.domain.insight.Insight;
import KraftHeinz.APIinsights.domain.insight.InsightRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("Insights")
public class InsightController {

    @Autowired
    private InsightRepository repository;


    @PostMapping
    @Transactional
    public ResponseEntity receberInsight(@RequestBody DadosInsight dados, UriComponentsBuilder uriBuilder){
        var insight = new Insight(dados);
        repository.save(insight);

        var uri = uriBuilder.path("/insight/{id}").buildAndExpand(insight.getId()).toUri();

        return ResponseEntity.created(uri).body(new DadosPaginaInsight(insight));
    }

    @GetMapping
    public ResponseEntity<Page<DadosPaginaInsight>> listarInsight(@PageableDefault(size = 10) Pageable paginicao){
        var page = repository.findAll(paginicao).map(DadosPaginaInsight::new);
        return ResponseEntity.ok(page);
    }




}
