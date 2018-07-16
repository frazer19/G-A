/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleGA;


public class GA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Population population = new Population();
        population.createInitialPopulation();
        //population.evolveNGenerations(50);
         population.evolveUntilBestFitness(10);
        System.out.println("emp " + population.bestIndividual);
// testing mutation
//        Individual parent1 = new Individual();
//        int[] genes = {1, 1, 0, 1, 1, 1, 1,1,1,1};
//        parent1.setGenes(genes);
//        int index = 2;
//        parent1.setGene(index, 1 - parent1.getGene(index));
//        System.out.println(parent1.toString());


// testing crossover
//        Individual parent1 = new Individual();
//        Individual parent2 = new Individual();
//        int[] genes = {1, 1, 1, 1, 1, 1, 1,1,1,1};/
//        int[] genes2 = {0, 0, 0, 0, 0, 0, 0,0,0,0};
//        parent1.setGenes(genes);
//        parent2.setGenes(genes2);
//        
//        population.crossoverSingle(parent1, parent2);
        
    }

}
