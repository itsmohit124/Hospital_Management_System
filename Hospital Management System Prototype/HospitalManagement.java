import javax.swing.*;
import java.util.Calendar;
import java.util.Scanner;


class Employee
{
    String eid, ename, desg, sex ,epassword;
    int salary;
    void new_emp()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("id:-");
        eid = input.nextLine();

        System.out.print("name:-");
        ename = input.nextLine();

        System.out.print("desigination:-");
        desg = input.nextLine();

        System.out.print("sex:-");
        sex = input.nextLine();

        System.out.println("password:-");
        epassword=input.nextLine();

        System.out.print("salary:-");
        salary = input.nextInt();
    }

    void emp_info()

    {
        System.out.println(eid + "\t\t" + ename + "\t\t" + sex + "\t\t" + salary);
    }

}
class PaymentReceipt
{
    String Payid,pid,pname,type_of_test;
    float Amount;
    void new_receipt()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Payment id:-");
        Payid = input.nextLine();

        System.out.print("Patient id:-");
        pid = input.nextLine();

        System.out.print("patient name:-");
        pname = input.nextLine();

        System.out.print("Types of test performed:-");
        type_of_test = input.nextLine();

        System.out.print("Total payment amount:-");
        Amount=input.nextFloat();

    }

    void receipt_info()

    {
        System.out.println(Payid + "\t\t\t\t\t" + pid + "\t\t\t\t\t" + pname + "\t\t\t" + type_of_test + "\t\t" + Amount);
    }

}
class MedicalReport
{

    String rid,dname,pid,pname,type_of_test,disease,Meds;

    void new_med_rep(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enetr the report id:-");
        rid=input.nextLine();

        System.out.print("Enter name of doctor incharge:-");
        dname = input.nextLine();

        System.out.print("Patient id:-");
        pid = input.nextLine();

        System.out.print("patient name:-");
        pname = input.nextLine();

        System.out.print("Types of test performed:-");
        type_of_test = input.nextLine();

        System.out.print("Enter the type of disease patient have:-");
        disease=input.nextLine();

        System.out.print("Enter the name of medicines prescribed:-");
         Meds=input.nextLine();


    }

    void report_info(){
        System.out.println(rid+"\t\t\t\t\t" + pid + "\t\t\t\t\t" + pname + "\t\t\t" + disease + "\t\t" + type_of_test+ "\t\t" +dname+"\t\t"+Meds);
    }

}

class doctor

{
    String did, dname, specilist, appoint, doc_qual,dpassword;
    int droom;
    void new_doctor()

    {
        Scanner input = new Scanner(System.in);

        System.out.print("id:-");
        did = input.nextLine();

        System.out.print("name:-");
        dname = input.nextLine();

        System.out.print("specilization:-");
        specilist = input.nextLine();

        System.out.print("work time:-");
        appoint = input.nextLine();

        System.out.print("qualification:-");
        doc_qual = input.nextLine();

        System.out.print("password:-");
        dpassword=input.nextLine();

        System.out.print("room no.:-");
        droom = input.nextInt();

    }

    void doctor_info()

    {
        System.out.println(did + "\t\t" + dname + "  \t\t" + specilist + "     \t\t" + appoint + "    \t\t" + doc_qual + "       \t\t" + droom);

    }
}

class patient

{
    String pid, pname, disease, sex, admit_status,ppassword;
    int age;
    void new_patient()

    {
        Scanner input = new Scanner(System.in);

        System.out.print("id:-");
        pid = input.nextLine();

        System.out.print("name:-");
        pname = input.nextLine();

        System.out.print("disease:-");
        disease = input.nextLine();

        System.out.print("sex:-");
        sex = input.nextLine();

        System.out.print("admit_status:-");
        admit_status = input.nextLine();

        System.out.print("password:-");
        ppassword=input.nextLine();

        System.out.print("age:-");
        age = input.nextInt();

    }

    void patient_info()
    {
        System.out.println(pid + "\t\t" + pname + " \t\t" + disease + "     \t\t" + sex + "      \t\t" + admit_status + "\t\t" + age);
    }
}

class medical

{
    String med_name, med_comp, exp_date;
    int med_cost, count;
    void new_medi()
    {

        Scanner input = new Scanner(System.in);

        System.out.print("name:-");
        med_name = input.nextLine();

        System.out.print("comp:-");
        med_comp = input.nextLine();

        System.out.print("exp_date:-");
        exp_date = input.nextLine();

        System.out.print("cost:-");
        med_cost = input.nextInt();

        System.out.print("no of unit:-");
        count = input.nextInt();

    }

    void find_medi()
    {
        System.out.println(med_name + "  \t\t" + med_comp + "    \t\t" + exp_date + "     \t\t" + med_cost);
    }
}

class lab

{
    String fecility;
    int lab_cost;
    void new_feci()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("fecility:-");
        fecility = input.nextLine();

        System.out.print("cost:-");
        lab_cost = input.nextInt();

    }

    void feci_list()
    {
        System.out.println(fecility + "\t\t" + lab_cost);

    }
}

class fecility //Sorry Facility but do not change the name 

{
    String fec_name;
    void add_feci()

    {
        Scanner input = new Scanner(System.in);

        System.out.print("fecility:-");
        fec_name = input.nextLine();
    }

    void show_feci()
    {
        System.out.println(fec_name);
    }
}

public class HospitalManagement

{
    public static void main(String []args)
    {
        String []months = {

            "Jan",
            "Feb",
            "Mar",
            "Apr",

            "May",
            "Jun",
            "Jul",
            "Aug",

            "Sep",
            "Oct",
            "Nov",
            "Dec"
        };

        Calendar calendar = Calendar.getInstance();


        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));

        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));

        doctor[] d = new doctor[25];

        patient[] p = new patient[100];

        lab[] l = new lab[100];

        fecility[] f = new fecility[100];

        medical[] m = new medical[100];

        Employee[] s = new Employee[100];

        PaymentReceipt[] pay=new PaymentReceipt[100];

        MedicalReport[] mr=new MedicalReport[100];


        Scanner in=new Scanner(System.in);

        int i;

        for (i = 0; i < 25; i++)

            d[i] = new doctor();

        for (i = 0; i < 100; i++)

            p[i] = new patient();

        for (i = 0; i < 100; i++)

            l[i] = new lab();

        for (i = 0; i < 100; i++)

            f[i] = new fecility();

        for (i = 0; i < 100; i++)

            m[i] = new medical();

        for (i = 0; i < 100; i++)

            s[i] = new Employee();

        for (i = 0; i < 100; i++)

            mr[i] = new MedicalReport();

        for (i = 0; i < 100; i++)

            pay[i] = new PaymentReceipt();

        d[0].did = "21";
        d[0].dname = "Dr.Ghanendra";
        d[0].specilist = "ENT";
        d[0].appoint = "5-11AM";
        d[0].doc_qual = "MBBS,MD";
        d[0].droom = 17;
        d[0].dpassword="1234";

        d[1].did = "32";
        d[1].dname = "Dr.Vikram";
        d[1].specilist = "Physician";
        d[1].appoint = "10-3AM";
        d[1].doc_qual = "MBBS,MD";
        d[1].droom = 45;
        d[1].dpassword="1234";

        d[2].did = "17";
        d[2].dname = "Dr.Rekha";
        d[2].specilist = "Surgeon";
        d[2].appoint = "8-2AM";
        d[2].doc_qual = "BDM";
        d[2].droom = 8;
        d[2].dpassword="1234";

        d[3].did = "33";
        d[3].dname = "Dr.Pramod";
        d[3].specilist = "Artho";
        d[3].appoint = "10-4PM";
        d[3].doc_qual = "MBBS,MS";
        d[3].droom = 40;
        d[3].dpassword="1234";

        p[0].pid = "12";
        p[0].pname = "Pankaj";
        p[0].disease = "Cancer";
        p[0].sex = "Male";
        p[0].admit_status = "y";
        p[0].age = 30;
        p[0].ppassword="1234";

        p[1].pid = "13";
        p[1].pname = "Sumit";
        p[1].disease = "Cold";
        p[1].sex = "Male";
        p[1].admit_status = "y";
        p[1].age = 23;
        p[1].ppassword="1234";

        p[2].pid = "14";
        p[2].pname = "Alok";
        p[2].disease = "Maleriya";
        p[2].sex = "Male";
        p[2].admit_status = "y";
        p[2].age = 45;
        p[2].ppassword="1234";

        p[3].pid = "15";
        p[3].pname = "Ravi";
        p[3].disease = "Diabetes";
        p[3].sex = "Male";
        p[3].admit_status = "y";
        p[3].age = 25;
        p[3].ppassword="1234";


        m[0].med_name = "Corex";
        m[0].med_comp = "Cino pvt";
        m[0].exp_date = "9-5-16";
        m[0].med_cost = 55;
        m[0].count = 8;

        m[1].med_name = "Nytra";
        m[1].med_comp = "Ace pvt";
        m[1].exp_date = "4-4-15";
        m[1].med_cost = 500;
        m[1].count = 5;

        m[2].med_name = "Brufa";
        m[2].med_comp = "Reckitt";
        m[2].exp_date = "12-7-17";
        m[2].med_cost = 50;
        m[2].count = 56;

        m[3].med_name = "Pride";
        m[3].med_comp = "DDF pvt";
        m[3].exp_date = "12-4-12";
        m[3].med_cost = 1100;
        m[3].count = 100;


        l[0].fecility = "X-ray     ";
        l[0].lab_cost = 800;

        l[1].fecility = "CT Scan   ";
        l[1].lab_cost = 1200;

        l[2].fecility = "OR Scan   ";
        l[2].lab_cost = 500;

        l[3].fecility = "Blood Bank";
        l[3].lab_cost = 50;


        f[0].fec_name = "Ambulance";

        f[1].fec_name = "Admit Facility ";

        f[2].fec_name = "Canteen";

        f[3].fec_name = "Emergency";


        s[0].eid = "22";
        s[0].ename = "Prakash";
        s[0].desg = "Worker";
        s[0].sex = "Male";
        s[0].salary = 5000;
        s[0].epassword="1234";

        s[1].eid = "23";
        s[1].ename = "Komal";
        s[1].desg = "Nurse";
        s[1].sex = "Female";
        s[1].salary = 2000;
        s[1].epassword="1234";

        s[2].eid = "24";
        s[2].ename = "Raju";
        s[2].desg = "Worker";
        s[2].sex = "Male";
        s[2].salary = 5000;
        s[2].epassword="1234";

        s[3].eid = "25";
        s[3].ename = "Rani";
        s[3].desg = "Nurse";
        s[3].sex = "Female";
        s[3].salary = 20000;
        s[3].epassword="1234";

        pay[0].Payid = "32";
        pay[0].pname = "Pankaj";
        pay[0].pid = "12";
        pay[0].type_of_test = "Blood,CT scan & Cancer Test";
        pay[0].Amount = 25000;

        pay[1].Payid = "33";
        pay[1].pname = "Sumit";
        pay[1].pid = "13";
        pay[1].type_of_test = "Blood Test";
        pay[1].Amount = 500;


        pay[3].Payid = "34";
        pay[3].pname = "Alok";
        pay[3].pid = "14";
        pay[3].type_of_test = "Platilates Test";
        pay[3].Amount = 800;

        pay[2].Payid = "35";
        pay[2].pname = "Ravi";
        pay[2].pid = "15";
        pay[2].type_of_test = "Sugar level Blood Test";
        pay[2].Amount = 1600;

        mr[1].rid = "11";
        mr[1].dname = "Dr.Vikram";
        mr[1].pid = "12";
        mr[1].pname = "Pankaj";
        mr[1].type_of_test = "Blood,CT scan & Cancer Test";
        mr[1].disease = "Cancer";
        mr[1].Meds="Carboplatin & Etoposide";

        mr[0].rid = "12";
        mr[0].dname = "Dr.Vikram";
        mr[0].pid = "13";
        mr[0].pname = "Sumit";
        mr[0].type_of_test = "Blood Test";
        mr[0].disease = "Cold";
        mr[0].Meds="Corex";

        mr[2].rid = "13";
        mr[2].dname = "Dr.Vikram";
        mr[2].pid = "14";
        mr[2].pname = "Alok";
        mr[2].type_of_test = "Platilates Test";
        mr[2].disease = "Maleriya";
        mr[2].Meds="Paracetamol & Chloroquine";

        mr[3].rid = "14";
        mr[3].dname = "Dr.Vikram";
        mr[3].pid = "15";
        mr[3].pname = "Ravi";
        mr[3].type_of_test = "Sugar level Blood Test";
        mr[3].disease = "Diabetes";
        mr[3].Meds="Metformin";

        String Aid = "2910";
        String Aname = "Mohit Sharma";
        String sex = "Male";
        int salary = 2500000;
        String Apassword="Mohit@123";


        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4,count7=4,count8=4;
        int  j;
        boolean  status1=true,status = true ,s1 = true,s2=true,s3 = true, s4 = true,s5 = true ,s6 = true,log=false;
        int []arr={count1,count2,count3,count4,count5,count6};
        String[] SelectionTypes = {"Doctor","Patient", "Employee","Admin","exit"};
            while (status)

            {
                String SelectionType = (String) JOptionPane.showInputDialog(null, "Select User:",
                        "Hospital Management System", JOptionPane.QUESTION_MESSAGE, null, SelectionTypes, SelectionTypes[0]);
                if (SelectionType.equals("Doctor"))
                {
                    String user = JOptionPane.showInputDialog("Enter your id:");
                    String pass = JOptionPane.showInputDialog("Enter your password:");
                    for(int k:arr){
                        for (j = 0; j < k; j++)
                        {
                            if (user.equals(d[j].did)&&pass.equals(d[j].dpassword)){
                                log=true;
                            }
                        }
                    }if (log) {
                    JOptionPane.showMessageDialog(null, "Login successful!");
                    String[] SelectionTypesDoc= {"Doctor","Patient","Medicines","Laboratories","Employee","Medical Report"};
                    while (s1) {
                        String SelectionTypeDoc = (String) JOptionPane.showInputDialog(null, "See Details Of:",
                                "Hospital Management System", JOptionPane.QUESTION_MESSAGE, null, SelectionTypesDoc, SelectionTypesDoc[0]);


                        if (SelectionTypeDoc.equals("Doctor")) {
                            JOptionPane.showMessageDialog(null,"Enter zero for more options");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("id \t\t Name\t\t Specilist \t\t Timing \t\t Qualification \t\t Room No.");
                            System.out.println("--------------------------------------------------------------------------------");
                            for (j = 0; j < count1; j++) {
                                d[j].doctor_info();
                            }
                            int x = in.nextInt();
                        } else if (SelectionTypeDoc.equals("Patient")) {
                            JOptionPane.showMessageDialog(null,"Enter zero for more options");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("id \t\t Name \t\t Disease \t\t Gender \t\t Admit Status \t\t Age");
                            System.out.println("--------------------------------------------------------------------------------");
                            for (j = 0; j < count2; j++) {
                                p[j].patient_info();
                            }int x=in.nextInt();
                        }
                        else if (SelectionTypeDoc.equals("Medicines")) {
                            JOptionPane.showMessageDialog(null,"Enter zero for more options");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("Name \t\t Company \t\t Expiry Date \t\t Cost");
                            System.out.println("--------------------------------------------------------------------------------");

                            for (j = 0; j < count3; j++) {
                                m[j].find_medi();
                            }int x=in.nextInt();
                        }
                        else if (SelectionTypeDoc.equals("Laboratories")) {
                            JOptionPane.showMessageDialog(null,"Enter zero for more options");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("Fecilities\t\t Cost");
                            System.out.println("--------------------------------------------------------------------------------");

                            for (j = 0; j < count4; j++) {
                                l[j].feci_list();
                            }int x=in.nextInt();
                        }
                        else if (SelectionTypeDoc.equals("Employee")) {
                            JOptionPane.showMessageDialog(null,"Enter zero for more options");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("id \t\t Name \t\t Gender \t\t Salary");
                            System.out.println("--------------------------------------------------------------------------------");

                            for (j = 0; j < count6; j++)
                            {
                                if ("Nurse".equals(s[j].desg))
                                    s[j].emp_info();
                            }int x=in.nextInt();
                        }
                        else if (SelectionTypeDoc.equals("Medical Report")) {
                            int option1 = JOptionPane.showOptionDialog(null, "Generate or view Report?",
                                    "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                    null, new String[]{"Show Report", "Generate Report"}, "Show Report");
                            if (option1 == JOptionPane.YES_OPTION) {
                                String Ptid = JOptionPane.showInputDialog("Enter Patient id:");
                                JOptionPane.showMessageDialog(null, "Enter zero for more options");
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Report Id \t\t Patient Id \t\t Patient Name \t\t Disease \t\t Type Of Tests \t\t Doctor Incharge \t\t Madicines Prescribed");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count7; j++) {
                                    if (Ptid.equals(mr[j].pid))
                                        mr[j].report_info();
                                }
                                int x = in.nextInt();
                            }
                            else{
                                mr[count7].new_med_rep();
                                count7++;
                                JOptionPane.showMessageDialog(null, "Credentials Added Succesfully");
                            }
                        }
                           int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                null, new String[]{"Last menu", "Main menu"}, "Last menu");
                            if (option1 == JOptionPane.YES_OPTION) {
                               s1 = true;
                            }
                            else {
                            s1 = false;
                            }
                    }
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Invalid username or password.");
                    }

                }
                else if(SelectionType.equals("Patient"))
                {
                    String user = JOptionPane.showInputDialog("Enter your id:");
                    String pass = JOptionPane.showInputDialog("Enter your password:");
                    for(int k:arr){
                        for (j = 0; j < k; j++)
                        {
                            if (user.equals(p[j].pid)&&pass.equals(p[j].ppassword)){
                                log=true;
                            }
                        }
                    }if (log) {
                    JOptionPane.showMessageDialog(null, "Login successful!");
                    String[] SelectionTypesDoc= {"Doctor","Patient","Medicines","Laboratories","Employee","Medical Report","Payment Receipt"};
                    while (s1) {
                        String SelectionTypeDoc = (String) JOptionPane.showInputDialog(null, "See Details Of:",
                                "Hospital Management System", JOptionPane.QUESTION_MESSAGE, null, SelectionTypesDoc, SelectionTypesDoc[0]);


                        if (SelectionTypeDoc.equals("Doctor")) {
                            JOptionPane.showMessageDialog(null,"Enter zero for more options");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("id \t\t Name\t\t Specilist \t\t Timing \t\t Qualification \t\t Room No.");
                            System.out.println("--------------------------------------------------------------------------------");
                            for (j = 0; j < count1; j++) {
                                d[j].doctor_info();
                            }
                            int x = in.nextInt();
                        } else if (SelectionTypeDoc.equals("Patient")) {
                            JOptionPane.showMessageDialog(null,"Enter zero for more options");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("id \t\t Name \t\t Disease \t\t Gender \t\t Admit Status \t\t Age");
                            System.out.println("--------------------------------------------------------------------------------");
                            for (j = 0; j < count2; j++) {
                                if (user.equals(p[j].pid))
                                    p[j].patient_info();
                            }int x=in.nextInt();
                        }
                        else if (SelectionTypeDoc.equals("Medicines")) {
                            JOptionPane.showMessageDialog(null,"Enter zero for more options");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("Name \t\t Company \t\t Expiry Date \t\t Cost");
                            System.out.println("--------------------------------------------------------------------------------");

                            for (j = 0; j < count3; j++) {
                                m[j].find_medi();
                            }int x=in.nextInt();
                        }
                        else if (SelectionTypeDoc.equals("Laboratories")) {
                            JOptionPane.showMessageDialog(null,"Enter zero for more options");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("Fecilities\t\t Cost");
                            System.out.println("--------------------------------------------------------------------------------");

                            for (j = 0; j < count4; j++) {
                                l[j].feci_list();
                            }int x=in.nextInt();
                        }
                        else if (SelectionTypeDoc.equals("Employee")) {
                            JOptionPane.showMessageDialog(null,"Enter zero for more options");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("id \t\t Name \t\t Gender \t\t Salary");
                            System.out.println("--------------------------------------------------------------------------------");

                            for (j = 0; j < count6; j++)
                            {
                                if ("Nurse".equals(s[j].desg))
                                    s[j].emp_info();
                            }int x=in.nextInt();
                        }
                        else if (SelectionTypeDoc.equals("Medical Report")) {
                                JOptionPane.showMessageDialog(null, "Enter zero for more options");
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Report Id \t\t Patient Id \t\t Patient Name \t\t Disease \t\t Type Of Tests \t\t Doctor Incharge \t\t Madicines Prescribed");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count7; j++) {
                                    if (user.equals(mr[j].pid))
                                        mr[j].report_info();
                                }
                                int x = in.nextInt();
                        }
                        if (SelectionTypeDoc.equals("Payment Receipt")) {
                            JOptionPane.showMessageDialog(null, "Enter zero for more options");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("Payment Id \t\t Patient Id \t\t Patient Name \t\t Type Of Tests \t\t Total Treatment Amount");
                            System.out.println("--------------------------------------------------------------------------------");
                            for (j = 0; j < count7; j++) {
                                if (user.equals(pay[j].pid))
                                    pay[j].receipt_info();
                            }
                            int x = in.nextInt();
                        }
                        int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                null, new String[]{"Last menu", "Main menu"}, "Last menu");
                        if (option1 == JOptionPane.YES_OPTION) {
                            s1 = true;
                        }
                        else {
                            s1 = false;
                        }
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password.");
                }

                }

                else if(SelectionType.equals("Employee"))
                {
                    String user = JOptionPane.showInputDialog("Enter your id:");
                    String pass = JOptionPane.showInputDialog("Enter your password:");
                    for(int k:arr){
                        for (j = 0; j < k; j++)
                        {
                            if (user.equals(s[j].eid)&&pass.equals(s[j].epassword)){
                                log=true;
                            }
                        }
                    }if (log) {
                    while (s6) {
                        JOptionPane.showMessageDialog(null, "Login successful!");
                        String[] Selection = {"Patient", "Nurse", "Worker", "Security","Medicines", "Laboratories", "Facilities","Payment Receipt"};
                        String optionEmp = (String) JOptionPane.showInputDialog(null, "Select your Option:",
                                "Hospital Management System", JOptionPane.QUESTION_MESSAGE, null, Selection, Selection[0]);

                        if (optionEmp.equals("Patient")) {
                            while (s2) {
                                int option = JOptionPane.showOptionDialog(null, "Do you want to add or see detials?",
                                        "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                        null, new String[]{"Add a Patient", "See patient details"}, "See patient details");


                                if (option == JOptionPane.YES_OPTION) {
                                    p[count2].new_patient();
                                    count2++;
                                    JOptionPane.showMessageDialog(null, "Credentials Added Succesfully");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Enter zero for more options");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("id \t\t Name \t\t Disease \t\t Gender \t\t Admit Status \t\t Age");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    for (j = 0; j < count2; j++) {
                                        p[j].patient_info();
                                    }
                                    int x = in.nextInt();
                                }

                                int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                        "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                        null, new String[]{"Last menu", "Main menu"}, "Last menu");
                                if (option1 == JOptionPane.YES_OPTION) {
                                    s2 = true;
                                } else {
                                    s2 = false;
                                }
                            }
                        } else if (optionEmp.equals("Nurse")) {
                            JOptionPane.showMessageDialog(null, "Enter zero for more options");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("id \t\t Name \t\t Gender \t\t Salary");
                            System.out.println("--------------------------------------------------------------------------------");

                            for (j = 0; j < count6; j++) {
                                if (optionEmp.equals(s[j].desg))
                                    s[j].emp_info();
                            }
                            int x = in.nextInt();
                        } else if (optionEmp.equals("Worker")) {
                            JOptionPane.showMessageDialog(null, "Enter zero for more options");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("id \t\t Name \t\t Gender \t\t Salary");
                            System.out.println("--------------------------------------------------------------------------------");

                            for (j = 0; j < count6; j++) {
                                if (optionEmp.equals(s[j].desg))
                                    s[j].emp_info();
                            }
                            int x = in.nextInt();
                        } else if (optionEmp.equals("Security")){
                            JOptionPane.showMessageDialog(null, "Enter zero for more options");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("id \t\t Name \t\t Gender \t\t Salary");
                            System.out.println("--------------------------------------------------------------------------------");

                            for (j = 0; j < count6; j++) {
                                if (optionEmp.equals(s[j].desg))
                                    s[j].emp_info();
                            }
                            int x = in.nextInt();
                        }
                        if (optionEmp.equals("Payment Receipt")) {
                            int option = JOptionPane.showOptionDialog(null, "Generate or View Payment Receipt?",
                                    "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                    null, new String[]{"Generate Payment Receipt", "Show Payment Receipt"}, "Show Payment Receipt");


                            if (option == JOptionPane.YES_OPTION) {
                                pay[count2].new_receipt();
                                count8++;
                                JOptionPane.showMessageDialog(null, "Credentials Added Succesfully");
                            } else {
                                String Ptid = JOptionPane.showInputDialog("Enter Patient id:");
                                JOptionPane.showMessageDialog(null, "Enter zero for more options");
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Payment Id \t\t Patient Id \t\t Patient Name \t\t Type Of Tests \t\t Total Treatment Amount");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count7; j++) {
                                    if (Ptid.equals(pay[j].pid))
                                        pay[j].receipt_info();
                                }
                                int x = in.nextInt();
                            }
                        }
                        else if (optionEmp.equals("Medicines")){
                            while (s3) {
                                int option = JOptionPane.showOptionDialog(null, "Do you want to add or see detials?",
                                        "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                        null, new String[]{"Add a Medicines", "See Medicines details"}, "See Medicines details");


                                if (option == JOptionPane.YES_OPTION) {
                                    m[count3].new_medi();
                                    count3++;
                                    JOptionPane.showMessageDialog(null, "Credentials Added Succesfully");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Enter zero for more options");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("Name \t\t Company \t\t Expiry Date \t\t Cost");
                                    System.out.println("--------------------------------------------------------------------------------");

                                    for (j = 0; j < count3; j++) {
                                        m[j].find_medi();
                                    }
                                    int x = in.nextInt();
                                }

                                int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                        "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                        null, new String[]{"Last menu", "Main menu"}, "Last menu");
                                if (option1 == JOptionPane.YES_OPTION) {
                                    s3 = true;
                                } else {
                                    s3 = false;
                                }
                            }
                        }else if (optionEmp.equals("Laboratories")){
                            while (s4) {
                                int option = JOptionPane.showOptionDialog(null, "Do you want to add or see detials?",
                                        "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                        null, new String[]{"Add Lab details", "See Lab details"}, "See Medicines details");


                                if (option == JOptionPane.YES_OPTION) {
                                    l[count4].new_feci();
                                    count4++;
                                    JOptionPane.showMessageDialog(null, "Credentials Added Succesfully");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Enter zero for more options");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("Fecilities\t\t Cost");
                                    System.out.println("--------------------------------------------------------------------------------");

                                    for (j = 0; j < count4; j++) {
                                        l[j].feci_list();
                                    }
                                    int x = in.nextInt();
                                }

                                int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                        "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                        null, new String[]{"Last menu", "Main menu"}, "Last menu");
                                if (option1 == JOptionPane.YES_OPTION) {
                                    s4 = true;
                                } else {
                                    s4 = false;
                                }
                            }
                        }else if (optionEmp.equals("Facilities")){
                            while (s5) {
                                int option = JOptionPane.showOptionDialog(null, "Do you want to add or see detials?",
                                        "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                        null, new String[]{"Add Facilities", "See Facilities detail"}, "See Medicines details");


                                if (option == JOptionPane.YES_OPTION) {
                                    f[count5].add_feci();
                                    count5++;
                                    JOptionPane.showMessageDialog(null, "Credentials Added Succesfully");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Enter zero for more options");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("Hospital  Facility are:");
                                    System.out.println("--------------------------------------------------------------------------------");

                                    for (j = 0; j < count5; j++) {
                                        f[j].show_feci();
                                    }
                                    int x = in.nextInt();
                                }

                                int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                        "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                        null, new String[]{"Last menu", "Main menu"}, "Last menu");
                                if (option1 == JOptionPane.YES_OPTION) {
                                    s5 = true;
                                } else {
                                    s5 = false;
                                }
                            }
                        }


                        int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                null, new String[]{"Last menu", "Main menu"}, "Last menu");
                        if (option1 == JOptionPane.YES_OPTION) {
                            s6 = true;
                        } else {
                            s6 = false;
                        }
                    }
                }else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password.");
                }

                }
                else if(SelectionType.equals("Admin")) {
                    String user = JOptionPane.showInputDialog("Enter your Admin id:");
                    String pass = JOptionPane.showInputDialog("Enter your password:");
                            if (user.equals(Aid) && pass.equals(Apassword)) {
                                log = true;
                            }
                    if (log) {
                        JOptionPane.showMessageDialog(null, "Login successful!");
                        String[] SelectionTypesAdmin = {"Doctor", "Patient", "Medicines", "Laboratories", "Facilities", "Employee", "Admin Info and Change Option","Medical Report","Payment Receipt", "exit"};
                        while (status1) {
                            String SelectionTypeAdmin = (String) JOptionPane.showInputDialog(null, "Select your Option:",
                                    "Hospital Management System", JOptionPane.QUESTION_MESSAGE, null, SelectionTypesAdmin, SelectionTypesAdmin[0]);

                            if (SelectionTypeAdmin.equals("Doctor")) {
                                while (s1) {
                                    int option = JOptionPane.showOptionDialog(null, "Do you want to add or see detials?",
                                            "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                            null, new String[]{"Add a Doctor", "See Doctor details"}, "See a Doctor details");


                                    if (option == JOptionPane.YES_OPTION) {
                                        d[count1].new_doctor();
                                        count1++;
                                        JOptionPane.showMessageDialog(null, "Credentials Added Succesfully");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Enter zero for more options");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t\t Name\t\t Specilist \t\t Timing \t\t Qualification \t\t Room No.");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count1; j++) {
                                            d[j].doctor_info();
                                        }
                                        int x = in.nextInt();
                                    }

                                    int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                            "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                            null, new String[]{"Last menu", "Main menu"}, "Last menu");
                                    if (option1 == JOptionPane.YES_OPTION) {
                                        s1 = true;
                                    } else {
                                        s1 = false;
                                    }
                                }
                            } else if (SelectionTypeAdmin.equals("Patient")) {
                                while (s2) {
                                    int option = JOptionPane.showOptionDialog(null, "Do you want to add or see detials?",
                                            "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                            null, new String[]{"Add a Patient", "See patient details"}, "See patient details");


                                    if (option == JOptionPane.YES_OPTION) {
                                        p[count2].new_patient();
                                        count2++;
                                        JOptionPane.showMessageDialog(null, "Credentials Added Succesfully");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Enter zero for more options");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t\t Name \t\t Disease \t\t Gender \t\t Admit Status \t\t Age");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count2; j++) {
                                            p[j].patient_info();
                                        }
                                        int x = in.nextInt();
                                    }

                                    int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                            "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                            null, new String[]{"Last menu", "Main menu"}, "Last menu");
                                    if (option1 == JOptionPane.YES_OPTION) {
                                        s2 = true;
                                    } else {
                                        s2 = false;
                                    }
                                }
                            } else if (SelectionTypeAdmin.equals("Medicines")) {
                                while (s3) {
                                    int option = JOptionPane.showOptionDialog(null, "Do you want to add or see detials?",
                                            "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                            null, new String[]{"Add a Medicines", "See Medicines details"}, "See Medicines details");


                                    if (option == JOptionPane.YES_OPTION) {
                                        m[count3].new_medi();
                                        count3++;
                                        JOptionPane.showMessageDialog(null, "Credentials Added Succesfully");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Enter zero for more options");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("Name \t\t Company \t\t Expiry Date \t\t Cost");
                                        System.out.println("--------------------------------------------------------------------------------");

                                        for (j = 0; j < count3; j++) {
                                            m[j].find_medi();
                                        }
                                        int x = in.nextInt();
                                    }

                                    int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                            "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                            null, new String[]{"Last menu", "Main menu"}, "Last menu");
                                    if (option1 == JOptionPane.YES_OPTION) {
                                        s3 = true;
                                    } else {
                                        s3 = false;
                                    }
                                }
                            } else if (SelectionTypeAdmin.equals("Laboratories")) {
                                while (s4) {
                                    int option = JOptionPane.showOptionDialog(null, "Do you want to add or see detials?",
                                            "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                            null, new String[]{"Add Lab details", "See Lab details"}, "See Medicines details");


                                    if (option == JOptionPane.YES_OPTION) {
                                        l[count4].new_feci();
                                        count4++;
                                        JOptionPane.showMessageDialog(null, "Credentials Added Succesfully");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Enter zero for more options");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("Fecilities\t\t Cost");
                                        System.out.println("--------------------------------------------------------------------------------");

                                        for (j = 0; j < count4; j++) {
                                            l[j].feci_list();
                                        }
                                        int x = in.nextInt();
                                    }

                                    int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                            "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                            null, new String[]{"Last menu", "Main menu"}, "Last menu");
                                    if (option1 == JOptionPane.YES_OPTION) {
                                        s4 = true;
                                    } else {
                                        s4 = false;
                                    }
                                }
                            } else if (SelectionTypeAdmin.equals("Facilities")) {
                                while (s5) {
                                    int option = JOptionPane.showOptionDialog(null, "Do you want to add or see detials?",
                                            "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                            null, new String[]{"Add Facilities", "See Facilities detail"}, "See Medicines details");


                                    if (option == JOptionPane.YES_OPTION) {
                                        f[count5].add_feci();
                                        count5++;
                                        JOptionPane.showMessageDialog(null, "Credentials Added Succesfully");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Enter zero for more options");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("Hospital  Facility are:");
                                        System.out.println("--------------------------------------------------------------------------------");

                                        for (j = 0; j < count5; j++) {
                                            f[j].show_feci();
                                        }
                                        int x = in.nextInt();
                                    }

                                    int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                            "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                            null, new String[]{"Last menu", "Main menu"}, "Last menu");
                                    if (option1 == JOptionPane.YES_OPTION) {
                                        s5 = true;
                                    } else {
                                        s5 = false;
                                    }
                                }
                            } else if (SelectionTypeAdmin.equals("Employee")) {
                                while (s6) {
                                    String[] Selection = {"Add Employee", "Nurse", "Worker", "Security"};
                                    String option = (String) JOptionPane.showInputDialog(null, "Select your Option:",
                                            "Hospital Management System", JOptionPane.QUESTION_MESSAGE, null, Selection, Selection[0]);

                                    if (option.equals("Add Employee")) {
                                        s[count6].new_emp();
                                        count6++;
                                        JOptionPane.showMessageDialog(null, "Credentials Added Succesfully");
                                    } else if (option.equals("Nurse")) {
                                        JOptionPane.showMessageDialog(null, "Enter zero for more options");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t\t Name \t\t Gender \t\t Salary");
                                        System.out.println("--------------------------------------------------------------------------------");

                                        for (j = 0; j < count6; j++) {
                                            if (option.equals(s[j].desg))
                                                s[j].emp_info();
                                        }
                                        int x = in.nextInt();
                                    } else if (option.equals("Worker")) {
                                        JOptionPane.showMessageDialog(null, "Enter zero for more options");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t\t Name \t\t Gender \t\t Salary");
                                        System.out.println("--------------------------------------------------------------------------------");

                                        for (j = 0; j < count6; j++) {
                                            if (option.equals(s[j].desg))
                                                s[j].emp_info();
                                        }
                                        int x = in.nextInt();
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Enter zero for more options");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t\t Name \t\t Gender \t\t Salary");
                                        System.out.println("--------------------------------------------------------------------------------");

                                        for (j = 0; j < count6; j++) {
                                            if (option.equals(s[j].desg))
                                                s[j].emp_info();
                                        }
                                        int x = in.nextInt();
                                    }

                                    int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                            "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                            null, new String[]{"Last menu", "Main menu"}, "Last menu");
                                    if (option1 == JOptionPane.YES_OPTION) {
                                        s6 = true;
                                    } else {
                                        s6 = false;
                                    }
                                }
                            }else if(SelectionTypeAdmin.equals("Admin Info and Change Option")){
                                int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                        "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                        null, new String[]{"View Info", "Change Admin"}, "Last menu");
                                if (option1 == JOptionPane.YES_OPTION) {
                                    JOptionPane.showMessageDialog(null, "Enter zero for more options");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("Admin id \t\t AdminName \t\t Gender \t\t Salary");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println(Aid + "\t\t\t" + Aname + "\t\t\t" + sex + "\t\t\t" + salary);
                                    int x=in.nextInt();
                                } else {
                                    Aid = JOptionPane.showInputDialog("Enter Admin id:");
                                    Aname =JOptionPane.showInputDialog("Enter Admin Name:");
                                    sex = JOptionPane.showInputDialog("Enter Sex:");
                                    salary = (Integer.parseInt (JOptionPane.showInputDialog("Enter Salary:")));
                                    Apassword=JOptionPane.showInputDialog("Enter Password:");
                                    JOptionPane.showMessageDialog(null, "Credentials changed Succesfully");
                                }

                            }
                            if (SelectionTypeAdmin.equals("Payment Receipt")) {
                                int option = JOptionPane.showOptionDialog(null, "Generate or View Payment Receipt?",
                                        "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                        null, new String[]{"Generate Payment Receipt", "Show Payment Receipt"}, "Show Payment Receipt");


                                if (option == JOptionPane.YES_OPTION) {
                                    pay[count2].new_receipt();
                                    count8++;
                                    JOptionPane.showMessageDialog(null, "Credentials Added Succesfully");
                                } else {
                                    String Ptid = JOptionPane.showInputDialog("Enter Patient id:");
                                    JOptionPane.showMessageDialog(null, "Enter zero for more options");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("Payment Id \t\t Patient Id \t\t Patient Name \t\t Type Of Tests \t\t Total Treatment Amount");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    for (j = 0; j < count7; j++) {
                                        if (Ptid.equals(pay[j].pid))
                                            pay[j].receipt_info();
                                    }
                                    int x = in.nextInt();
                                }
                            }
                            else if (SelectionTypeAdmin.equals("Medical Report")) {
                                String Ptid = JOptionPane.showInputDialog("Enter Patient id:");
                                JOptionPane.showMessageDialog(null, "Enter zero for more options");
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Report Id \t\t Patient Id \t\t Patient Name \t\t Disease \t\t Type Of Tests \t\t Doctor Incharge \t\t Madicines Prescribed");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count7; j++) {
                                    if (Ptid.equals(mr[j].pid))
                                        mr[j].report_info();
                                }
                                int x = in.nextInt();
                            }
                            else {
                                status1 = false;
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid id or password.");
                    }
                }
                    else{
                    status=false;
                }
        }

    }
}