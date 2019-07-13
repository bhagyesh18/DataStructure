package Collection;

//https://github.com/AllenDowney/ThinkDataStructures/blob/master/solutions/src/com/allendowney/thinkdast/MyArrayList.java
public class MyArrayList<T> {
    private int size=0;
	private T[] list;
  
	public MyArrayList() {
    	
    	    list=(T[])new Object[10];
    }
    

    public int size() {
        try {
        	return size;
        }catch (Exception e) {
            throw new UnsupportedOperationException();
       	}
    }


    public T get( int idx ) {
      
    	try {
    		
    		if (idx < 0 || idx >= size) {
    			throw new ArrayIndexOutOfBoundsException("Out of index");
    		}
    		return list[idx];
		} catch (ArrayIndexOutOfBoundsException e) {
			
		}
    	return list[idx];
    }

    public void add( T o ) {
    		try {
    			if(size==list.length) {
        			T[] temp=(T[])new Object[size*2];
        			System.arraycopy(list, 0, temp, 0, size);
        			list=temp;
        		}
        		list[size]=o;
        		size++;
    		}catch (Exception e) {
				// TODO: handle exception
			}
    		
    }


    public void remove( int idx ) {
    	T element = get(idx);
		for (int i=idx; i<size-1; i++) {
			list[i] = list[i+1];
		}
		size--;
	}


    public void print() {
    	for (int i=0; i<size; i++) {
			System.out.println((i+1)+" = "+list[i]);
		}
	}

    
    public static void main(String[] args) {
    	MyArrayList<Integer> arrayList=new MyArrayList<Integer>();
    	arrayList.add(100);
    	arrayList.add(101);
    	arrayList.add(102);
    	arrayList.add(103);
    	arrayList.add(104);
    	arrayList.add(105);
    	arrayList.add(106);
    	arrayList.add(107);
    	arrayList.add(108);
    	arrayList.add(109);
    	arrayList.add(110);
    	arrayList.add(111);
    	arrayList.add(112);
    	arrayList.add(113);
    	arrayList.add(114);
    	arrayList.add(115);
    	arrayList.add(116);
    	arrayList.add(117);
    	arrayList.add(118);

    	
    	arrayList.print();
    	
    	arrayList.remove(3);
    	
    	arrayList.remove(14);
    	
    	arrayList.print();
    	
    	
    	
	}
    
 }