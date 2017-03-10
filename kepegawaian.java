public class kepegawaian {
	public static void main (String[] args) {
	manager bos = new manager ("Supardi", "Bojong Koneng", 6750000);
	bos.setBonus(1500000);

		employee[] pegawai = new employee [3];
		pegawai [0] = bos;
		pegawai [1] = new staff("Ades Deliano", "Banjaran", 3000000);
		pegawai [2] = new staff("Giofanni Mowoka", "Suka Miskin", 2400000);

		for (int i = 0; i<pegawai.length; i++) {
		System.out.println(pegawai[i].getName()+"\t"+pegawai[i].getAddress()+"\t"+pegawai[i].getSalary());
		}
	}
}
