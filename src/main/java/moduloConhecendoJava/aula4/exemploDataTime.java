import java.time.*;

public class exemploDataTime {
    //usando Java 8
    public static void main(String[] args) {

        LocalDate dataAtual = LocalDate.now();
        System.out.println(dataAtual);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        Duration duration = Duration.ofHours(5); // IDEAL PARA MEDIR INTERVALOS DE TEMPO EM SEGUNDOS E NANOSSEGUNDOS
        System.out.println(duration);
        System.out.println(zonedDateTime.plus(duration));


        LocalDate dataNascimento = LocalDate.of(1993, 12, 14);
        Period period = Period.between(dataNascimento, dataAtual); //IDEAL PARA MEDIR INTERVALOS EM ANOS, MESES E DIAS
        System.out.println("Idade: " + period.getYears() + " anos, " + period.getMonths() + " meses, "
                + period.getDays() + " dias.");



        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime futuro = agora.plusDays(10);

        Duration duracao = Duration.between(agora, futuro);
        System.out.println("Diferença em dias: " + duracao.toDays());

        LocalDate dataHoje = LocalDate.now();
        LocalDate dataFimAno = LocalDate.of(2025, 12, 31);
        Period periodo = Period.between(dataHoje, dataFimAno);
        System.out.println("Faltam " + periodo.getMonths() + " meses e " + periodo.getDays() +
                " dias para o final do ano.");

        /* TEMPO COMPUTACIONAL:
        INSTANT: representa um ponto específico na linha do tempo (timestamp) com precisão de nanossegundos.
        DURATION: para medir a diferença entre dois instantes de tempo
         */

        // Captura o momento exato (timestamp) do início da medição
        Instant inicio = Instant.now();

        try {
            // Pausa a execução da thread por 2 segundos
            // O objetivo aqui é simular uma operação demorada (ex: consulta ao banco, processamento, etc.)
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // Caso a pausa seja interrompida antes do tempo, a exceção é tratada
            e.printStackTrace();
        }

        // Captura o momento exato após a operação simulada
        Instant fim = Instant.now();

        // Calcula a duração entre o início e o fim
        Duration duracaoComputacional = Duration.between(inicio, fim);

        // Exibe o tempo total transcorrido em milissegundos
        System.out.println("Tempo computacional decorrido: " + duracaoComputacional.toMillis() + " milissegundos.");

    }

}
