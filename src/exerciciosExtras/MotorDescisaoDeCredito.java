package ExerciciosExtras;

public class MotorDescisaoDeCredito {
    public static void main(String[] args) {

        double income = 12000;
        double requestedAmount = 2000;
        int paymentDeadline = 6;
        int timeInCurrentJob = 29;
        int scoreInSerasa = 950;
        boolean activeRestriction = false;
        int customerType = 1; // 1 = Regular Customer, 2 = VIP Customer, 3 = Bank Employee

        String state = "";
        
        if (activeRestriction == true || scoreInSerasa < 300) {
            state = "Reproved";
        } else if ( customerType != 3 && timeInCurrentJob < 6) {
            state = "Reproved";
        }

        if (state != "Reproved" && requestedAmount <= 50000 && ((customerType == 3) || (customerType == 2 && scoreInSerasa >= 650 && timeInCurrentJob >= 24) || (scoreInSerasa >= 750 && income >= 8000))) {
            state = "Approved";
        }

        if (state != "Reproved" && state != "Approved") {
            state = "inReview";
        }

        double baseRate = 0;
        double monthlyRate = 0;
        double monthlyInstallment = 0;
        String character = "";

        if (state == "Approved") {

            if (scoreInSerasa >= 800) {
                baseRate = 0.115;
                character = "A";
            } else if (scoreInSerasa >= 700) {
                baseRate = 0.14;
                character = "B";
            } else if (scoreInSerasa < 700) {
                baseRate = 0.185;
                character = "C";
            }

            if (customerType == 3) {
                baseRate = 0.08;
            } else if (customerType == 2) {
                baseRate -= 2;
            }
        }

        if (state == "Approved") {
            monthlyRate = baseRate / 12;
            monthlyInstallment = (requestedAmount * monthlyRate * Math.pow(1 + monthlyRate, paymentDeadline)) / (Math.pow(1 + monthlyRate, paymentDeadline) - 1);
            if (monthlyInstallment / income > 0.4) {
                state = "Reproved";
            }
        }

        String result = "";
        if (state == "Reproved") {
            result = "Sinto muito, sua solicitação de crédito foi Recusada. Entre em contato com a nossa equipe para mais informações. Banco Master.";
        } else if (state == "Approved") {
            result = "Sua solicitação de crédito de BRL "+requestedAmount+" foi aprovada automaticamente. Seu perfil de risco é: Perfil "+character+". A taxa correspodente a esse perfil é de "+baseRate+" A.A. Diante deste cenario sua parcela mensal será BRL "+monthlyInstallment+". Obrigado pela preferencia nos serviços do Banco Master, nossa equipe agradece.";
        } else if (state == "inReview") {
            result = "Nossa equipe está analisando manualmente a sua solicitação de crédito, o prazo para a divulgação do resultados é de 2 dias uteis. Saiba mais em nosso site. Equipe Banco Master";
        } else {
            result = "Houve um erro inesperado em nosso sistema. Tente novamente, se o erro persistir entre em contato com a equipe tecnica.";
        }

        System.out.println(result);
    }
}
