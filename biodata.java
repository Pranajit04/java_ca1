import java.io.*;
class Jobdetails {
    public static void main(String[] args)throws IOException {
        int i = 0;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("Job Application Candidature: ");
        System.out.println("Enter the number of Candidates for application: ");
        int n = Integer.parseInt(br.readLine());
        String name[] = new String[n];
        int age[] = new int[n];
        
        for (i = 0; i < name.length; i++) {
            System.out.println("Job Applicant name: ");
            name[i] = br.readLine();
            System.out.println("Job Applicant 12th passing year: ");
            int year= Integer.parseInt(br.readLine());
            if (year < 2011 || year > 2025) {
                System.out.println("Invalid Age for the application!!");
                i--;
                continue;
            } else if (year == 2020 || year == 2021) {
                System.out.println("Covid batch passout detected!!");
                break;
            } else {
                
                age[i] = year;
            }
        }

        int j = 0;
        for (String applicantName : name) {
            if (applicantName != null && age[j]!=0){
                   System.out.println("The applicant Name: " + applicantName + "\nHis/her Passing year: " + age[j]+"\nStatus: Approved");
                   System.out.println();
                
                   j++;
            }
            else{
               System.out.println("No Valid candidates");
               break;
            }
            
        }
    }
}
