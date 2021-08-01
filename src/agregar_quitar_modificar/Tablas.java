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


public class Tablas {

    private Registro TOD[] = new Registro[Cantidades()];
    private String matricula[] = new String[Cantidades()];
    private String nombre[] = new String[Cantidades()];
    private String apellido[] = new String[Cantidades()];
    private String apellidoM[] = new String[Cantidades()];
    private String estatura[] = new String[Cantidades()];
    private String telefono[] = new String[Cantidades()];
    private String email[] = new String[Cantidades()];

    private int cont;

    public void PedirDatosTabla(String matricula, String nom, String app, String apm, String est, String tel, String email) {

        TOD[cont] = new Registro();
        TOD[cont].pedirDatos(matricula, nom, app, apm, est, tel, email);
        cont++;
        

    }

    public int Cantidades() {
  
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        int cantPaArr=0;
        try {

            archivo = new File("fichero.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {

                if (!linea.equals("")) {

                    cantPaArr++;
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
        return cantPaArr;
    }

    private String Matricula(int x) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
       
        String pos1 = "";
        
        int llenas = -1;
        
        try {

            archivo = new File("fichero.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                String aux = linea;
                String partes[] = aux.split(",");

                if (!linea.equalsIgnoreCase("")) {
                    llenas++;
                    pos1 = partes[0];
                    matricula[llenas] = pos1;

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

        return matricula[NUMCONSTA(x)];
    }

    private String Nom(int x) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        String pos1 = "";

        int llenas = -1;
      
        try {

            archivo = new File("fichero.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                String aux = linea;
                String partes[] = aux.split(",");

                if (!linea.equalsIgnoreCase("")) {
                    llenas++;
                    pos1 = partes[1];
                    nombre[llenas] = pos1;

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

        return nombre[NUMCONSTA(x)];
    }

    private String App(int x) {//PASA EL NUMERO DE DATOS
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
    
        int llenas = -1;
       
        String pos1 = "";
       
        try {

            archivo = new File("fichero.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {

                String aux = linea;
                String partes[] = aux.split(",");

                if (!linea.equals("")) {
                    llenas++;
                    pos1 = partes[2];
                   apellido[llenas] = pos1;

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
        return apellido[NUMCONSTA(x)];

    }

    private String Apm(int x) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        int llenas = -1;
        String pos1 = "";
        

        try {

            archivo = new File("fichero.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {

                String aux = linea;
                String partes[] = aux.split(",");

                if (!linea.equals("")) {
                    llenas++;
                    pos1 = partes[3];
                    apellidoM[llenas] = pos1;

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
        return apellidoM[NUMCONSTA(x)];

    }

    private String Est(int x) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
       
        String pos1 = "";
      
        int llenas = -1;
      
        try {

            archivo = new File("fichero.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                String aux = linea;
                String partes[] = aux.split(",");

                if (!linea.equalsIgnoreCase("")) {
                    llenas++;
                    pos1 = partes[4];
                    estatura[llenas] = pos1;

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

        return estatura[NUMCONSTA(x)];
    }

    private String Tel(int x) {//PASA EL NUMERO DE DATOS
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
       
        int llenas = -1;
        
        String pos1 = "";
       
        try {

            archivo = new File("fichero.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {

                String aux = linea;
                String partes[] = aux.split(",");

                if (!linea.equals("")) {
                    llenas++;
                    pos1 = partes[5];
                    telefono[llenas] = pos1;

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
        return telefono[NUMCONSTA(x)];//REGRESAME UN NOMBRE DE ACUERDO AL NUMERO ALEATORIO CREADO

    }

    private String Email(int x) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
    
        int llenas = -1;
    
        String pos1 = "";
   

        try {

            archivo = new File("fichero.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {

                String aux = linea;
                String partes[] = aux.split(",");

                if (!linea.equals("")) {
                    llenas++;
                    pos1 = partes[6];
                   email[llenas] = pos1;

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
        return email[NUMCONSTA(x)];//REGRESAME UN NOMBRE DE ACUERDO AL NUMERO ALEATORIO CREADO

    }

    public static int NUMCONSTA(int f) {

        return f;
    }

    public Tablas(int reg) {
        cont = 0;
        int y = -1;
        for (int vc = 0; vc < reg; vc++) {
            y++;
            TOD[vc] = new Registro();
            TOD[vc].pedirDatos(Matricula(y), Nom(y), App(y), Apm(y), Est(y), Tel(y), Email(y));

        }

    }

    public void VerTabla(int reg) {
        for (int vc = 0; vc < reg; vc++) {
            TOD[vc].verDtos();

        }
    }

    public void ordnaNOM(int reg) {
        int x, y, z;

        Registro temp;
        System.out.println("Ordenamiento ");
        for (int a = 0; a < reg; a++) {

            for (int j = 0; j < reg - 1; j++) {
                x = TOD[j].getNom().compareToIgnoreCase(TOD[j + 1].getNom());
                y = TOD[j].getApp().compareToIgnoreCase(TOD[j + 1].getApp());
                z = TOD[j].getApm().compareToIgnoreCase(TOD[j + 1].getApm());
                if (x > 0) {
                    temp = TOD[j];
                    TOD[j] = TOD[j + 1];
                    TOD[j + 1] = temp;

                }

                if (x == 0) {

                    if (y > 0) {
                        temp = TOD[j];
                        TOD[j] = TOD[j + 1];
                        TOD[j + 1] = temp;

                    }
                    if (y == 0) {

                        if (z > 0) {
                            temp = TOD[j];
                            TOD[j] = TOD[j + 1];
                            TOD[j + 1] = temp;

                        }
                    }
                }

            }
        }
        File archivo = null;
        archivo = new File("fichero.txt");
        archivo.delete();
        FileWriter fichero = null;
        PrintWriter pw = null;
        File f = null;
        String tod;
        try {

            f = new File("fichero.txt");
            fichero = new FileWriter(f, true);

            pw = new PrintWriter(fichero);

            for (int a = 0; a < reg; a++) {
                tod = TOD[a].getMatricula() + "," + TOD[a].getNom() + "," + TOD[a].getApp() + "," + TOD[a].getApm() + "," + TOD[a].getEst() + "," + TOD[a].getTel() + "," + TOD[a].getEmail();
                pw.print(tod);
                pw.println("\n");
            }

        } catch (IOException e) {
        } finally {

            try {

                if (null != fichero) {
                    fichero.close();

                } else {

                }

            } catch (IOException e2) {
            }

        }

        VerTabla(reg);
    }
}
