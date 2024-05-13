/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.project;

/**
 *
 * @author 90554
 */
public class Sözcü_Cücük_Node {
 String data;
    Sözcü_Cücük_LinkedList list;
    Sözcü_Cücük_Node left;
    Sözcü_Cücük_Node right;
    
    public Sözcü_Cücük_Node(String data) {
        this.data = data;
        this.list = new Sözcü_Cücük_LinkedList();
        this.left = null;
        this.right = null;
    }
    
    public int getTotalCount() {
        Sözcü_Cücük_ListNode current = list.head;
        int count = 0;
        while (current != null) {
            count += current.wordCount;
            current = current.next;
        }
        return count;
    }
    
}
