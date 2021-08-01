/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregar_quitar_modificar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Agregar_quitar_modificar {

    public static int matricula = 0;
    public static String c = "AYUDAS";

    static String email, tel, est;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a = 0;
        int i = 0;

        while (a != 6) {

            System.out.println("1.Escribir en archivo");
            System.out.println("2.Reporte/individiual/general");
            System.out.println("3.Elminar Datos");
            System.out.println("4.Modificar Datos");
            System.out.println("5.Ordenar Datos");
            System.out.println("6.Salir");
            System.out.print("Opcion:  ");
            a = teclado.nextInt();

            switch (a) {
                case 1:

                    Escribir_Archivo_texto();
                    ContinuID();
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("");
                    int b = teclado.nextInt();
                    switch (b) {

                        case 1:

                            Leer_Archivo();
                            break;
                        case 2:
                            Leer_Individual();
                            break;
                    }

                    break;
                case 3:
                    Eliminar_Individual_Archivo();
                    break;

                case 4:
                    Modificar_Individual_Archivo();
                    break;
                case 5:
                    Ordenar_Datos_Archivo();
                    break;

            }

        }

    }

    private static void ContinuID() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        Scanner teclado = new Scanner(System.in);

        String linea = "";

        String aux = "";

        FileWriter fichero = null;
        PrintWriter pw = null;
        File f = null;

        try {
            f = new File("ContinuID.txt");

            fichero = new FileWriter(f, true);

            pw = new PrintWriter(fichero);

            pw.println(c);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {

                if (null != fichero) {
                    fichero.close();
                }

            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

    private static void Escribir_Archivo_texto() {
        Scanner teclado = new Scanner(System.in);
        File Segundo = null;
        FileReader fr = null;
        BufferedReader br = null;
        int nuevo = 0;
        String linea = "";
        String bus = "";
        String aux = "";
        int cant = 0;
        FileWriter fichero = null;
        PrintWriter pw = null;
        File f = null;
        try {

            Segundo = new File("ContinuID.txt");
            fr = new FileReader(Segundo);
            br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null) {

                nuevo++;

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        String nom, app, apm, tod;

        try {

            f = new File("fichero.txt");
            fichero = new FileWriter(f, true);
            pw = new PrintWriter(fichero);

            System.out.print("Nombre:  ");
            nom = teclado.next();

            System.out.print("Apellido Paterno:  ");
            app = teclado.next();

            System.out.print("Apellido Materno:  ");
            apm = teclado.next();
            System.out.print("Estatura:  ");
            est = teclado.next();
            System.out.print("Telefono:  ");
            tel = teclado.next();

            System.out.print("Email:  ");
            email = teclado.next();
            matricula = nuevo;
            matricula += 1;

            tod = matricula + "," + nom.toUpperCase() + "," + app.toUpperCase() + "," + apm.toUpperCase() + "," + est + "," + tel + "," + email;

            pw.print(tod);
            pw.println("\n");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {

                if (null != fichero) {
                    fichero.close();
                }

            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

    public static void Leer_Archivo() {

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            archivo = new File("fichero.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {

                System.out.println(linea);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

    private static void Leer_Individual() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        Scanner teclado = new Scanner(System.in);
        String busc;
        try {
            int llenas = 0;
            archivo = new File("fichero.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            System.out.print("Que id quiere encontrar: ");
            busc = teclado.nextLine();

            String Leer;
            while ((Leer = br.readLine()) != null) {

                String auxi = Leer;
                String Partir[] = auxi.split(",");

                if (busc.equals(Partir[0])) {
                    String pocision1 = Partir[0];
                    System.out.println(Leer);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private static void Eliminar_Individual_Archivo() {

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        Scanner teclado = new Scanner(System.in);
        String Leer = "";
        String busc = "";
        String aux = "";

        FileWriter fichero = null;
        PrintWriter pw = null;
        File f = null;
        try {
            f = new File("Borrar_Modificar.txt");

            fichero = new FileWriter(f, false);

            pw = new PrintWriter(fichero);
            try {

                archivo = new File("fichero.txt");
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                System.out.println("Bucar id");
                busc = teclado.nextLine();

                while ((Leer = br.readLine()) != null) {

                    aux = Leer;
                    String partes[] = aux.split(",");

                    if (!busc.equals(partes[0])) {

                        pw.println(Leer);
                        pw.println("\n");
                    }

                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {

                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {

                if (null != fichero) {
                    fichero.close();
                }

            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        archivo = new File("fichero.txt");
        archivo.delete();

        try {
            f = new File("fichero.txt");

            fichero = new FileWriter(f);

            pw = new PrintWriter(fichero);
            try {

                archivo = new File("Borrar_Modificar.txt");
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);

                while ((Leer = br.readLine()) != null) {

                    if (!Leer.equals("")) {

                        pw.println(Leer);
                        pw.println("\n");
                    }

                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {

                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {

                if (null != fichero) {
                    fichero.close();
                }

            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

    private static void Modificar_Individual_Archivo() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        Scanner teclado = new Scanner(System.in);

        String linea = "";
        String busc = "";
        String aux = "";
        String nep;
        FileWriter fichero = null;
        PrintWriter pw = null;
        File f = null;
        try {
            f = new File("Borrar_Modificar.txt");

            fichero = new FileWriter(f, false);

            pw = new PrintWriter(fichero);
            try {

                archivo = new File("fichero.txt");
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                System.out.println("Bucar id");
                busc = teclado.nextLine();

                while ((linea = br.readLine()) != null) {

                    aux = linea;
                    String partes[] = aux.split(",");

                    if (!busc.equals(partes[0])) {

                        pw.println(linea);

                    }
                    if (busc.equals(partes[0])) {
                        System.out.println("Que vas a modificar?");

                        System.out.println("1.Estatura");
                        System.out.println("2.Telefono");
                        System.out.println("3.Email");
                        System.out.println("4.TODO");
                        int caso = teclado.nextInt();
                        switch (caso) {
                            case 1:
                                System.out.println("Estatura");
                                est = teclado.next();
                                nep = partes[0] + "," + partes[1] + "," + partes[2] + "," + partes[3] + "," + est + "," + partes[5] + "," + partes[6];
                                pw.println(nep);
                                break;
                            case 2:
                                System.out.println("Telefono");
                                tel = teclado.next();
                                nep = partes[0] + "," + partes[1] + "," + partes[2] + "," + partes[3] + "," + partes[4] + "," + tel + "," + partes[6];
                                pw.println(nep);
                                break;
                            case 3:
                                System.out.println("Email");
                                email = teclado.next();
                                nep = partes[0] + "," + partes[1] + "," + partes[2] + "," + partes[3] + "," + partes[4] + "," + partes[5] + "," + email;
                                pw.println(nep);
                                break;
                            case 4:
                                System.out.println("Estatura");
                                est = teclado.next();
                                System.out.println("Telefono");
                                tel = teclado.next();

                                System.out.println("Email");
                                email = teclado.next();
                                nep = partes[0] + "," + partes[1] + "," + partes[2] + "," + partes[3] + "," + est + "," + tel + "," + email + ",";
                                pw.println(nep);
                                break;
                        }

                    }

                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {

                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {

                if (null != fichero) {
                    fichero.close();
                }

            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        archivo = new File("fichero.txt");
        archivo.delete();

        try {
            f = new File("fichero.txt");

            fichero = new FileWriter(f);

            pw = new PrintWriter(fichero);
            try {

                archivo = new File("Borrar_Modificar.txt");
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);

                while ((linea = br.readLine()) != null) {

                    if (!linea.equals("")) {

                        pw.println(linea);

                    }

                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {

                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {

                if (null != fichero) {
                    fichero.close();
                }

            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private static void Ordenar_Datos_Archivo() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        int cant = 0;
        try {

            archivo = new File("fichero.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String Leer;
            while ((Leer = br.readLine()) != null) {

                if (!Leer.equals("")) {

                    cant++;
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        Tablas t = new Tablas(cant);

        t.ordnaNOM(cant);
    }

}
