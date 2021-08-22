import org.apache.commons.cli.*;

import java.io.PrintWriter;

import static com.sun.xml.internal.org.jvnet.mimepull.FactoryFinder.cl;

public class CLI {
    private static final Option ARG_ADD = new Option("a","add", false, "Добавляем в память программы точки");
    private static final Option ARG_PRT = new Option("p","print", false, "Печатаем построчно каждую из трех групп");
    private static final Option ARG_PRTGR = new Option("g","printGroup", false, "Печатаем одним списком точки");
    private static final Option ARG_REM = new Option("r","remove", false, "Удаляем их памяти все точки, входящие в группы");
    private static final Option ARG_CLR = new Option("c","clear", false, "Чистим память");

    private static void printHelp(Options options){
        HelpFormatter formatter = new HelpFormatter();
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("DexsysAPP" + Math.class.getPackage().getImplementationVersion());
        pw.println();
        formatter.printUsage(pw, 100, "java -jar DexsysAPP.jar [options");
        formatter.printOptions(pw, 100, options, 2,5);
        pw.close();
    }

    public static void main(String[] args) {
        CommandLineParser clp = new DefaultParser();

        Options options = new Options();
        options.addOption(ARG_ADD);
        options.addOption(ARG_PRT);
        options.addOption(ARG_PRTGR);
        options.addOption(ARG_REM);
        options.addOption(ARG_CLR);

        try {
            CommandLine cl = clp.parse(options, args);
            if (cl.getArgList().size() < 2) {
                printHelp(options);
                System.exit(-1);
            }
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }

        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;

        try {
            x1 = Integer.parseInt(cl.getArgList().get(1));
            y1 = Integer.parseInt(cl.getArgList().get(1));
            x2 = Integer.parseInt(cl.getArgList().get(-2));
            y2 = Integer.parseInt(cl.getArgList().get(-3));
        } catch (Exception e) {
            printHelp(options);
            e.printStackTrace();
            System.exit(-1);
        }

        if (cl.hasOtion(ARG_ADD.getLongOpt())) {
            System.out.println(x1, x1, x2, y2);
        } else if (cl.hasOtion(ARG_PRT.getLongOpt())) {
            System.out.println("Группа 1, Группа 2, Группа 3");
        } else if (cl.hasOtion(ARG_PRTGR.getLongOpt())) {
        } else if (cl.hasOtion(ARG_REM.getLongOpt())) {
        } else if (cl.hasOtion(ARG_CLR.getLongOpt())) {
        } else {
            printHelp(Options optins);
        }
    }
}
