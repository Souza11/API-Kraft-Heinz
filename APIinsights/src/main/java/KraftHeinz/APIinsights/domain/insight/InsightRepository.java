package KraftHeinz.APIinsights.domain.insight;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsightRepository extends JpaRepository<Insight, Long> {
    Page<Insight>findAll(Pageable paginacao);
}
