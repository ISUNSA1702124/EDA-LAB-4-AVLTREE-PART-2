import datastructures.AVLTree;
import datastructures.AVLTreeInterface;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * DO NOT MODIFY THIS FILE without authorization
 */
public class AVLTreeTests {

    private AVLTreeInterface avlTreeBase;

    @Before
    public void initializeAVLTree() {
        avlTreeBase = new AVLTree();
    }

    /**
     * Suggested 10 points
     */
    @Test
    public void case_inserting() {

        List<Integer> data = Arrays.asList(50, 60, 70, 80, 90, 100, 10, 20, 30, 40, 15, 95, 85, 75, 65, 55, 45, 35, 25);

        HashMap<Integer, Vector<List<Integer>>> traversalResults = new HashMap<>();

        for (int i = 0; i < data.size(); i++) {
            traversalResults.put(data.get(i), new Vector<>());
        }

        //Inserting 50
        avlTreeBase.insert(50);
        traversalResults.get(50).add(Arrays.asList(50));
        Assert.assertEquals(avlTreeBase.inorder(), traversalResults.get(50).get(0));
        traversalResults.get(50).add(Arrays.asList(50));
        Assert.assertEquals(avlTreeBase.preorder(), traversalResults.get(50).get(1));
        traversalResults.get(50).add(Arrays.asList(50));
        Assert.assertEquals(avlTreeBase.postorder(), traversalResults.get(50).get(2));
//-----------------------------
//Inserting 60
        avlTreeBase.insert(60);
        traversalResults.get(60).add(Arrays.asList(50, 60));
        Assert.assertEquals(avlTreeBase.inorder(), traversalResults.get(60).get(0));
        traversalResults.get(60).add(Arrays.asList(50, 60));
        Assert.assertEquals(avlTreeBase.preorder(), traversalResults.get(60).get(1));
        traversalResults.get(60).add(Arrays.asList(60, 50));
        Assert.assertEquals(avlTreeBase.postorder(), traversalResults.get(60).get(2));
//-----------------------------
//Inserting 70
        avlTreeBase.insert(70);
        traversalResults.get(70).add(Arrays.asList(50, 60, 70));
        Assert.assertEquals(avlTreeBase.inorder(), traversalResults.get(70).get(0));
        traversalResults.get(70).add(Arrays.asList(60, 50, 70));
        Assert.assertEquals(avlTreeBase.preorder(), traversalResults.get(70).get(1));
        traversalResults.get(70).add(Arrays.asList(50, 70, 60));
        Assert.assertEquals(avlTreeBase.postorder(), traversalResults.get(70).get(2));
//-----------------------------
//Inserting 80
        avlTreeBase.insert(80);
        traversalResults.get(80).add(Arrays.asList(50, 60, 70, 80));
        Assert.assertEquals(avlTreeBase.inorder(), traversalResults.get(80).get(0));
        traversalResults.get(80).add(Arrays.asList(60, 50, 70, 80));
        Assert.assertEquals(avlTreeBase.preorder(), traversalResults.get(80).get(1));
        traversalResults.get(80).add(Arrays.asList(50, 80, 70, 60));
        Assert.assertEquals(avlTreeBase.postorder(), traversalResults.get(80).get(2));
//-----------------------------
//Inserting 90
        avlTreeBase.insert(90);
        traversalResults.get(90).add(Arrays.asList(50, 60, 70, 80, 90));
        Assert.assertEquals(avlTreeBase.inorder(), traversalResults.get(90).get(0));
        traversalResults.get(90).add(Arrays.asList(60, 50, 80, 70, 90));
        Assert.assertEquals(avlTreeBase.preorder(), traversalResults.get(90).get(1));
        traversalResults.get(90).add(Arrays.asList(50, 70, 90, 80, 60));
        Assert.assertEquals(avlTreeBase.postorder(), traversalResults.get(90).get(2));
//-----------------------------
//Inserting 100
        avlTreeBase.insert(100);
        traversalResults.get(100).add(Arrays.asList(50, 60, 70, 80, 90, 100));
        Assert.assertEquals(avlTreeBase.inorder(), traversalResults.get(100).get(0));
        traversalResults.get(100).add(Arrays.asList(80, 60, 50, 70, 90, 100));
        Assert.assertEquals(avlTreeBase.preorder(), traversalResults.get(100).get(1));
        traversalResults.get(100).add(Arrays.asList(50, 70, 60, 100, 90, 80));
        Assert.assertEquals(avlTreeBase.postorder(), traversalResults.get(100).get(2));
//-----------------------------
//Inserting 10
        avlTreeBase.insert(10);
        traversalResults.get(10).add(Arrays.asList(10, 50, 60, 70, 80, 90, 100));
        Assert.assertEquals(avlTreeBase.inorder(), traversalResults.get(10).get(0));
        traversalResults.get(10).add(Arrays.asList(80, 60, 50, 10, 70, 90, 100));
        Assert.assertEquals(avlTreeBase.preorder(), traversalResults.get(10).get(1));
        traversalResults.get(10).add(Arrays.asList(10, 50, 70, 60, 100, 90, 80));
        Assert.assertEquals(avlTreeBase.postorder(), traversalResults.get(10).get(2));
//-----------------------------
//Inserting 20
        avlTreeBase.insert(20);
        traversalResults.get(20).add(Arrays.asList(10, 20, 50, 60, 70, 80, 90, 100));
        Assert.assertEquals(avlTreeBase.inorder(), traversalResults.get(20).get(0));
        traversalResults.get(20).add(Arrays.asList(80, 60, 20, 10, 50, 70, 90, 100));
        Assert.assertEquals(avlTreeBase.preorder(), traversalResults.get(20).get(1));
        traversalResults.get(20).add(Arrays.asList(10, 50, 20, 70, 60, 100, 90, 80));
        Assert.assertEquals(avlTreeBase.postorder(), traversalResults.get(20).get(2));
//-----------------------------
//Inserting 30
        avlTreeBase.insert(30);
        traversalResults.get(30).add(Arrays.asList(10, 20, 30, 50, 60, 70, 80, 90, 100));
        Assert.assertEquals(avlTreeBase.inorder(), traversalResults.get(30).get(0));
        traversalResults.get(30).add(Arrays.asList(80, 50, 20, 10, 30, 60, 70, 90, 100));
        Assert.assertEquals(avlTreeBase.preorder(), traversalResults.get(30).get(1));
        traversalResults.get(30).add(Arrays.asList(10, 30, 20, 70, 60, 50, 100, 90, 80));
        Assert.assertEquals(avlTreeBase.postorder(), traversalResults.get(30).get(2));
//-----------------------------
//Inserting 40
        avlTreeBase.insert(40);
        traversalResults.get(40).add(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
        Assert.assertEquals(avlTreeBase.inorder(), traversalResults.get(40).get(0));
        traversalResults.get(40).add(Arrays.asList(50, 20, 10, 30, 40, 80, 60, 70, 90, 100));
        Assert.assertEquals(avlTreeBase.preorder(), traversalResults.get(40).get(1));
        traversalResults.get(40).add(Arrays.asList(10, 40, 30, 20, 70, 60, 100, 90, 80, 50));
        Assert.assertEquals(avlTreeBase.postorder(), traversalResults.get(40).get(2));
//-----------------------------
//Inserting 15
        avlTreeBase.insert(15);
        traversalResults.get(15).add(Arrays.asList(10, 15, 20, 30, 40, 50, 60, 70, 80, 90, 100));
        Assert.assertEquals(avlTreeBase.inorder(), traversalResults.get(15).get(0));
        traversalResults.get(15).add(Arrays.asList(50, 20, 10, 15, 30, 40, 80, 60, 70, 90, 100));
        Assert.assertEquals(avlTreeBase.preorder(), traversalResults.get(15).get(1));
        traversalResults.get(15).add(Arrays.asList(15, 10, 40, 30, 20, 70, 60, 100, 90, 80, 50));
        Assert.assertEquals(avlTreeBase.postorder(), traversalResults.get(15).get(2));
//-----------------------------
//Inserting 95
        avlTreeBase.insert(95);
        traversalResults.get(95).add(Arrays.asList(10, 15, 20, 30, 40, 50, 60, 70, 80, 90, 95, 100));
        Assert.assertEquals(avlTreeBase.inorder(), traversalResults.get(95).get(0));
        traversalResults.get(95).add(Arrays.asList(50, 20, 10, 15, 30, 40, 80, 60, 70, 95, 90, 100));
        Assert.assertEquals(avlTreeBase.preorder(), traversalResults.get(95).get(1));
        traversalResults.get(95).add(Arrays.asList(15, 10, 40, 30, 20, 70, 60, 90, 100, 95, 80, 50));
        Assert.assertEquals(avlTreeBase.postorder(), traversalResults.get(95).get(2));
//-----------------------------
//Inserting 85
        avlTreeBase.insert(85);
        traversalResults.get(85).add(Arrays.asList(10, 15, 20, 30, 40, 50, 60, 70, 80, 85, 90, 95, 100));
        Assert.assertEquals(avlTreeBase.inorder(), traversalResults.get(85).get(0));
        traversalResults.get(85).add(Arrays.asList(50, 20, 10, 15, 30, 40, 80, 60, 70, 95, 90, 85, 100));
        Assert.assertEquals(avlTreeBase.preorder(), traversalResults.get(85).get(1));
        traversalResults.get(85).add(Arrays.asList(15, 10, 40, 30, 20, 70, 60, 85, 90, 100, 95, 80, 50));
        Assert.assertEquals(avlTreeBase.postorder(), traversalResults.get(85).get(2));
//-----------------------------
//Inserting 75
        avlTreeBase.insert(75);
        traversalResults.get(75).add(Arrays.asList(10, 15, 20, 30, 40, 50, 60, 70, 75, 80, 85, 90, 95, 100));
        Assert.assertEquals(avlTreeBase.inorder(), traversalResults.get(75).get(0));
        traversalResults.get(75).add(Arrays.asList(50, 20, 10, 15, 30, 40, 80, 70, 60, 75, 95, 90, 85, 100));
        Assert.assertEquals(avlTreeBase.preorder(), traversalResults.get(75).get(1));
        traversalResults.get(75).add(Arrays.asList(15, 10, 40, 30, 20, 60, 75, 70, 85, 90, 100, 95, 80, 50));
        Assert.assertEquals(avlTreeBase.postorder(), traversalResults.get(75).get(2));
//-----------------------------
//Inserting 65
        avlTreeBase.insert(65);
        traversalResults.get(65).add(Arrays.asList(10, 15, 20, 30, 40, 50, 60, 65, 70, 75, 80, 85, 90, 95, 100));
        Assert.assertEquals(avlTreeBase.inorder(), traversalResults.get(65).get(0));
        traversalResults.get(65).add(Arrays.asList(50, 20, 10, 15, 30, 40, 80, 70, 60, 65, 75, 95, 90, 85, 100));
        Assert.assertEquals(avlTreeBase.preorder(), traversalResults.get(65).get(1));
        traversalResults.get(65).add(Arrays.asList(15, 10, 40, 30, 20, 65, 60, 75, 70, 85, 90, 100, 95, 80, 50));
        Assert.assertEquals(avlTreeBase.postorder(), traversalResults.get(65).get(2));
//-----------------------------
//Inserting 55
        avlTreeBase.insert(55);
        traversalResults.get(55).add(Arrays.asList(10, 15, 20, 30, 40, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100));
        Assert.assertEquals(avlTreeBase.inorder(), traversalResults.get(55).get(0));
        traversalResults.get(55).add(Arrays.asList(50, 20, 10, 15, 30, 40, 80, 70, 60, 55, 65, 75, 95, 90, 85, 100));
        Assert.assertEquals(avlTreeBase.preorder(), traversalResults.get(55).get(1));
        traversalResults.get(55).add(Arrays.asList(15, 10, 40, 30, 20, 55, 65, 60, 75, 70, 85, 90, 100, 95, 80, 50));
        Assert.assertEquals(avlTreeBase.postorder(), traversalResults.get(55).get(2));
//-----------------------------
//Inserting 45
        avlTreeBase.insert(45);
        traversalResults.get(45).add(Arrays.asList(10, 15, 20, 30, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100));
        Assert.assertEquals(avlTreeBase.inorder(), traversalResults.get(45).get(0));
        traversalResults.get(45).add(Arrays.asList(50, 20, 10, 15, 40, 30, 45, 80, 70, 60, 55, 65, 75, 95, 90, 85, 100));
        Assert.assertEquals(avlTreeBase.preorder(), traversalResults.get(45).get(1));
        traversalResults.get(45).add(Arrays.asList(15, 10, 30, 45, 40, 20, 55, 65, 60, 75, 70, 85, 90, 100, 95, 80, 50));
        Assert.assertEquals(avlTreeBase.postorder(), traversalResults.get(45).get(2));
//-----------------------------
//Inserting 35
        avlTreeBase.insert(35);
        traversalResults.get(35).add(Arrays.asList(10, 15, 20, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100));
        Assert.assertEquals(avlTreeBase.inorder(), traversalResults.get(35).get(0));
        traversalResults.get(35).add(Arrays.asList(50, 20, 10, 15, 40, 30, 35, 45, 80, 70, 60, 55, 65, 75, 95, 90, 85, 100));
        Assert.assertEquals(avlTreeBase.preorder(), traversalResults.get(35).get(1));
        traversalResults.get(35).add(Arrays.asList(15, 10, 35, 30, 45, 40, 20, 55, 65, 60, 75, 70, 85, 90, 100, 95, 80, 50));
        Assert.assertEquals(avlTreeBase.postorder(), traversalResults.get(35).get(2));
//-----------------------------
//Inserting 25
        avlTreeBase.insert(25);
        traversalResults.get(25).add(Arrays.asList(10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100));
        Assert.assertEquals(avlTreeBase.inorder(), traversalResults.get(25).get(0));
        traversalResults.get(25).add(Arrays.asList(50, 20, 10, 15, 40, 30, 25, 35, 45, 80, 70, 60, 55, 65, 75, 95, 90, 85, 100));
        Assert.assertEquals(avlTreeBase.preorder(), traversalResults.get(25).get(1));
        traversalResults.get(25).add(Arrays.asList(15, 10, 25, 35, 30, 45, 40, 20, 55, 65, 60, 75, 70, 85, 90, 100, 95, 80, 50));
        Assert.assertEquals(avlTreeBase.postorder(), traversalResults.get(25).get(2));
//-----------------------------
    }


    /**
     * Suggested 10 points
     */
    @Test
    public void case_removing() {

        List<Integer> data = Arrays.asList(50, 60, 70, 80, 90, 100, 10, 20, 30, 40, 15, 95, 85, 75, 65, 55, 45, 35, 25);

        HashMap<Integer, Vector<List<Integer>>> traversalResults = new HashMap<>();

        for (int i = 0; i < data.size(); i++) {
            traversalResults.put(data.get(i), new Vector<>());
            avlTreeBase.insert(data.get(i));
        }

        ArrayList<Integer> inorder = new ArrayList<>(data);
        inorder.sort(Integer::compareTo);

        for (int i = 0; i < data.size(); i++) {
            System.out.println("Removing " + data.get(i));
            avlTreeBase.remove(data.get(i));
            inorder.remove(data.get(i));
            Assert.assertEquals(avlTreeBase.inorder(), inorder);
        }

    }

}
