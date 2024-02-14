//• Possuir um menu simples com as seguintes opções:
//        1. Cadastrar cavalo
//        2. Cadastrar girafa
//        3. Listar cavalos
//        4. Listar girafas
//        5. Listar todos os animais
//        6. Remover um animal por id
//        7. Exibir a quantidade de animais cadastrados por tipo
//        8. Sair

import br.com.entidades.Cavalo;
import br.com.entidades.Girafa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();
    }
    public static int instancesAnimals = 0;
    public static Scanner ler = new Scanner(System.in);
    public static List<Cavalo> listaCavalos = new ArrayList<Cavalo>();;
    public static List<Girafa> listaGirafas = new ArrayList<Girafa>();

    public static void menu(){
        int opcao = 9;
        while (opcao!=8){
        System.out.println("1. Cadastrar cavalo\n" +
                "2. Cadastrar girafa\n" +
                "3. Listar cavalos\n" +
                "4. Listar girafas\n" +
                "5. Listar todos os animais\n" +
                "6. Remover um animal por id\n" +
                "7. Exibir a quantidade de animais cadastrados por tipo\n" +
                "8. Sair");
        opcao = ler.nextInt();
        switch (opcao) {
            case 1:
                cadastrarCavalo();
                break;
            case 2:
                cadastrarGirafa();
                break;
            case 3:
                listarCavalos();
                break;
            case 4:
                listarGirafas();
                break;
            case 5:
              listarTodosOsAnimais();
                break;
            case 6:
                System.out.println("Digite o ID do animal que deseja remover.");
                int id = ler.nextInt();
                removerAnimalPorId(id);
                break;
            case 7:
                exibirQuantidadeDeAnimaisCadastradosPorTipo();
                break;
            case 8:
                System.out.println("Finalizado!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
            }
        }
    }
    public static void cadastrarCavalo(){
        instancesAnimals+=1;
        System.out.println("Digite o nome do cavalo: ");
        String nome = ler.next();
        Cavalo cavalo = new Cavalo(instancesAnimals, nome);
        listaCavalos.add(cavalo);
        System.out.println("O cavalo foi inserido com sucesso.");
    }
    public static void cadastrarGirafa(){
        instancesAnimals+=1;
        String nome;
        System.out.println("Digite o nome da girafa: ");
        nome = ler.next();
        Girafa girafa = new Girafa(instancesAnimals, nome);
        listaGirafas.add(girafa);
        System.out.println("A girafa foi inserida com sucesso.");
    }
    public static void listarCavalos(){
        if (listaCavalos.isEmpty()){
            System.out.println("A lista de cavalos se encontra vazia!");
        } else {
            for (Cavalo cavalo : listaCavalos) {
                System.out.println("Dados do cavalo: " + cavalo.getId() + " | " + cavalo.getNome());
            }
        }
    }
    public static void listarGirafas(){
        if (listaGirafas.isEmpty()){
            System.out.println("A lista de girafas se encontra vazia!");
        } else {
            for (Girafa girafa : listaGirafas) {
                System.out.println("Dados da girafa: " + girafa.getId() + " | " + girafa.getNome());
            }
        }
    }
    public static void listarTodosOsAnimais(){
        if (listaCavalos.isEmpty()){
            System.out.println("A lista de cavalos se encontra vazia!");
        } else {
            for (Cavalo cavalo : listaCavalos) {
                System.out.println("Dados do animal: Cavalo" + " | " + cavalo.getId() + " | " + cavalo.getNome());
            }
        }
        if (listaGirafas.isEmpty()){
            System.out.println("A lista de girafas se encontra vazia!");
        } else {
            for (Girafa girafa : listaGirafas) {
                System.out.println("Dados do animal: Girafa" + " | " + girafa.getId() + " | " + girafa.getNome());
            }
        }
    }
    public static void removerAnimalPorId(int id){
        boolean achou = false;
        if (listaCavalos.isEmpty()){
            System.out.println("Não há cavalo para ser removido.");
        } else {
            for (int i = 0; i < listaCavalos.size(); i++) {
                if (id == listaCavalos.get(i).getId()) {
                    listaCavalos.remove(listaCavalos.get(i));
                    System.out.println("Animal removido com sucesso.");
                    achou = true;
                }
            }
        }
        if (listaGirafas.isEmpty()){
            System.out.println("Não há girafa para ser removida.");
        } else {
            for (int i = 0; i < listaGirafas.size(); i++) {
                if (id == listaGirafas.get(i).getId()) {
                    listaGirafas.remove(listaGirafas.get(i));
                    System.out.println("Animal removido com sucesso.");
                    achou = true;
                }
            }
        }
        if (achou == false){
            System.out.println("Não há animal com o ID digitado.");
        }
    }
    public static void exibirQuantidadeDeAnimaisCadastradosPorTipo(){
        int TotalAnimaisCadastrados = listaCavalos.size()+listaGirafas.size();
        System.out.println("Número de cavalos cadastrados: " + listaCavalos.size());
        listarCavalos();
        System.out.println("Número de girafas cadastradas: " + listaGirafas.size());
        listarGirafas();
        System.out.println("Total de animais cadastrados: " + TotalAnimaisCadastrados);
    }
}