package com.app.dataStructuresAndAlgarithms.hashtable;

public class HashTable {
	private HashNode[] buckets;
	private int numOfBuckets; // capacity
	private int size; // number of key value pairs in hash table

	public HashTable() {
		this(10); // default capacity
	}

	public HashTable(int capacity) {
		this.numOfBuckets = capacity;
		this.buckets = new HashNode[capacity];
		this.size = 0;
	}

	private class HashNode {
		private Integer key;
		private String value;
		private HashNode next;

		public HashNode(Integer key, String value) {
			this.key = key;
			this.value = value;
		}
	}
	
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	
	  public void put(Integer key, String value){
	        if(key == null || value == null){
	            throw new IllegalArgumentException("Key or Value is null !!!");
	        }
	        int bucketIndex = getBucketIndex(key);
	        HashNode head = buckets[bucketIndex];
	        while(head != null){
	            if(head.key.equals(key)){
	                head.value = value;
	                return;
	            }
	            head = head.next;
	        }
	        size++;
	        head = buckets[bucketIndex];
	        HashNode node = new HashNode(key, value); // (key, value) -> null
	        node.next = head;
	        buckets[bucketIndex] = node;
	    }

	    private int getBucketIndex(Integer key){
	        return key % numOfBuckets; // buckets.length
	    }
	    public String get(Integer key){
	        if(key == null){
	            throw new IllegalArgumentException("Key is null !!!");
	        }
	        int bucketIndex = getBucketIndex(key);
	        HashNode head = buckets[bucketIndex];   
	        while(head != null){
	            if(head.key.equals(key)){   
	                return head.value;
	            }
	            head = head.next;
	        }
	        return null;
	    }
	public String remove(Integer key) {
		return null;
	}
	public static void main(String[] args) {
		HashTable ht=new HashTable();
		ht.put(10,"kula");
	}

}
