public class Menor {
    public static void main(String[] args) {
        int tam=21;
        String cadena="";
        int[ ] a = {7610580,-9741510,6525699,-9844184,-9178006,
		1319060,5537882,-3847890,2597112,-6254047,-1323299,184300,
		4498758,643732,8676537,1903804,-9208747,466456,
		-8721527,3488027,-3173544}; 
        int[ ] b = {-5727103,4179338,-883821,6171075,6204183,-7192740,
		330159,-4348201,5889604,-6888149,-5469988,4180121,-4334747,
		-1404011,6518355,6287118,2162293,7316952,622272,-7899534,-5192912};
        for (int i = 0; i < tam; i++) {
            
            if (a[i]<b[i]) {
               cadena+=a[i]+" ";
            }else{
                cadena+=b[i]+" ";
            }
            
        }
        System.out.println(cadena.substring(0, cadena.length()-1));
    }
}