package org.kulasny.config;

import org.kulasny.domain.csv.Dostawcy;
import org.kulasny.domain.csv.MagazynP;
import org.kulasny.domain.csv.MagazynW;
import org.kulasny.domain.csv.Slownik;
import org.kulasny.domain.exercise.Exercise1;
import org.kulasny.domain.exercise.Exercise2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Config {
    final private String dostawcyPath = "src/main/resources/Dostawcy.csv";

    final private String magazynPPath = "src/main/resources/Magazynp.csv";

    final private String magazynWPath = "src/main/resources/MagazynW.csv";
    final private String slownikPath = "src/main/resources/Slownik.csv";
    final private List<Dostawcy> dostawcy = importCsvDostawcy(dostawcyPath);
    final private List<MagazynP> magazynP = importCsvMagazynP(magazynPPath);
    final private List<MagazynW> magazynW = importCsvMagazynW(magazynWPath);
    final private List<Slownik> slownik = importCsvSlownik(slownikPath);
    final private HashMap<Integer,Dostawcy> integerDostawcyHashMap = setHashMapDostawcy(dostawcy);
    final private HashMap<Integer,Slownik> integerSlownikHashMap = setHashMapSlownik(slownik);
    final private List<Exercise1> exercise1List = setListExercise1(integerDostawcyHashMap, integerSlownikHashMap, magazynP);
    final private List<Exercise2> exercise2List = setListExercise2(integerDostawcyHashMap, integerSlownikHashMap, magazynW);

    private  List<Exercise2> setListExercise2(HashMap<Integer, Dostawcy> dostawcyHashMap,
                                              HashMap<Integer, Slownik> slownikHashMap,
                                              List<MagazynW> magazynW){

        return magazynW
                .stream()
                .map(n -> new Exercise2(
                        n.getNrKarty(),
                        n.getDataW(),
                        slownikHashMap.get(n.getNrOdpadu()).getGr() +
                                slownikHashMap.get(n.getNrOdpadu()).getPodgr() +
                                slownikHashMap.get(n.getNrOdpadu()).getRodz(),
                        n.getMasa(),
                        n.getFirma(),
                        slownikHashMap.get(n.getNrOdpadu()).getTyp(),
                        dostawcyHashMap.get(n.getNrKlienta()).getNazwaSkrocona(),
                        slownikHashMap.get(n.getNrOdpadu()).getOpis()
                )).toList();
    }

    private  List<Exercise1> setListExercise1(HashMap<Integer, Dostawcy> dostawcyHashMap,
                                                    HashMap<Integer, Slownik> slownikHashMap,
                                                    List<MagazynP> magazynP){

        return magazynP
                .stream()
                .map(n -> new Exercise1(
                        n.getNrKarty(),
                        n.getDataD(),
                        slownikHashMap.get(n.getNrOdpadu()).getGr() +
                                slownikHashMap.get(n.getNrOdpadu()).getPodgr() +
                                slownikHashMap.get(n.getNrOdpadu()).getRodz(),
                        n.getMasa(),
                        n.getJedn(),
                        n.getFirma(),
                        slownikHashMap.get(n.getNrOdpadu()).getTyp(),
                        dostawcyHashMap.get(n.getNrKlienta()).getNazwaSkrocona(),
                        n.getNrMag(),
                        slownikHashMap.get(n.getNrOdpadu()).getOpis()
                )).toList();
    }
    private HashMap<Integer,Dostawcy> setHashMapDostawcy(List<Dostawcy> listOfRows){
        HashMap<Integer, Dostawcy> result = new HashMap<>();
        listOfRows.forEach(n-> result.put(n.getNrKlienta(),n));
        return result;
    }
    private HashMap<Integer,Slownik> setHashMapSlownik(List<Slownik> listOfRows){
        HashMap<Integer, Slownik> result = new HashMap<>();
        listOfRows.forEach(n-> result.put(n.getNrOdpadu(),n));
        return result;
    }

    private List<Dostawcy> importCsvDostawcy(String dostawcyPath) {
        Path path = Paths.get(dostawcyPath);
        Stream<String[]> file;
        List<Dostawcy> dostawcyList = null;

        try {
            file = Files.lines(path, Charset.forName("CP1250"))
                    .map(o -> o.split(";"))
                    .skip(1);

            dostawcyList = file
                    .map(n -> new Dostawcy(n[0], n[1], n[2], n[3]))
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return dostawcyList;
    }

    private List<MagazynP> importCsvMagazynP(String magazynpPath) {
        Path path = Paths.get(magazynpPath);
        Stream<String[]> file;
        List<MagazynP> magazynPList = null;

        try {
            file = Files.lines(path, Charset.forName("CP1250"))
                    .map(o -> o.split(";"))
                    .skip(1);

            magazynPList = file
                    .map(n -> new MagazynP(n[0], n[1], n[2], n[3], n[4], n[5], n[6], n[7]))
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return magazynPList;
    }


    private List<MagazynW> importCsvMagazynW(String magazynWPath) {
        Path path = Paths.get(magazynWPath);
        Stream<String[]> file;
        List<MagazynW> magazynWList = null;

        try {
            file = Files.lines(path, Charset.forName("CP1250"))
                    .map(o -> o.split(","))
                    .skip(1);

            magazynWList = file
                    .map(n -> new MagazynW(n[0], n[1], n[2], n[3], n[4], n[5], n[6],n[7]))
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return magazynWList;
    }

    private List<Slownik> importCsvSlownik(String slownikPath) {
        Path path = Paths.get(slownikPath);
        Stream<String[]> file;
        List<Slownik> slownikList = null;

        try {
            file = Files.lines(path, Charset.forName("CP1250"))
                    .map(o -> o.split(";"))
                    .skip(1);

            slownikList = file
                    .map(n -> new Slownik(n[0], n[1], n[2], n[3], n[4], n[5]))
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return slownikList;
    }

    public List<Exercise1> getExercise1List() {
        return exercise1List;
    }
    public List<Exercise2> getExercise2List() {return exercise2List;}
}
