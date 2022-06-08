package pessoas_por_cargo_ordem_reversa;

import java.util.*;
import java.util.stream.Collectors;

public class ConsultaPessoas {
    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(
            List<Pessoa> todasPessoas) {
        return todasPessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo,() -> new TreeMap<>(Comparator.reverseOrder()), Collectors.toCollection(TreeSet::new)));
    }
}
