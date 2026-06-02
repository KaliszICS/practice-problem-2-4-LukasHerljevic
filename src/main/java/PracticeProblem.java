public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void selectionSortName(String[] names, int[] ages) {
   
    if (names == null || ages == null || names.length <= 1) {
        return;
    }

    int n = names.length;

    for (int i = 0; i < n - 1; i++) {
       
        int minIdx = i;
        for (int j = i + 1; j < n; j++) {
            if (names[j].compareToIgnoreCase(names[minIdx]) < 0) {
                minIdx = j;
            }
        }

        
        if (minIdx != i) {
            
            String tempName = names[i];
            names[i] = names[minIdx];
            names[minIdx] = tempName;

           
            int tempAge = ages[i];
            ages[i] = ages[minIdx];
            ages[minIdx] = tempAge;
        }
    }
}

	public static void selectionSortAge(String[] names, int[] ages) {
    
    if (names == null || ages == null || ages.length <= 1) {
        return;
    }

    int n = ages.length;

    
    for (int i = 0; i < n - 1; i++) {
        
        int minIdx = i;
        for (int j = i + 1; j < n; j++) {
            if (ages[j] < ages[minIdx]) {
                minIdx = j;
            }
        }

        
        if (minIdx != i) {
            
            int tempAge = ages[i];
            ages[i] = ages[minIdx];
            ages[minIdx] = tempAge;

            
            String tempName = names[i];
            names[i] = names[minIdx];
            names[minIdx] = tempName;
        }
    }
}

}
