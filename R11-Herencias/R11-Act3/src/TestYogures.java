public class TestYogures {
        public static void main(String[] args) {
            
            Yogur yogur = new Yogur();  
            YogurDesnatado yogurDesnatado = new YogurDesnatado();  
    
            
            System.out.println("Calorías del Yogur: " + yogur.consulCal() + " kcal");
            System.out.println("Calorías del Yogur Desnatado: " + yogurDesnatado.consulCal() + " kcal");
        }
    }

