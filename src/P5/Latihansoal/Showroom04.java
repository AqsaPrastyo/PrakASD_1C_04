package P5.Latihansoal;

public class Showroom04 {
  public static class Mobil {
    String merk;
    String tipe;
    int tahun;
    int top_acceleration;
    int top_power;

    public Mobil(String merk, String tipe, int tahun, int top_acceleration, int top_power) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.top_acceleration = top_acceleration;
        this.top_power = top_power;
    }
}


public static int MaxTopAcceleration(Mobil[] mobil, int L, int H) {
    if (L == H) {
        return mobil[L].top_acceleration;
    }

    int mid = (L + H) / 2;
    int leftMax = MaxTopAcceleration(mobil, L, mid);
    int rightMax = MaxTopAcceleration(mobil, mid + 1, H);

    return Math.max(leftMax, rightMax);
}


public static int MinTopAcceleration(Mobil[] mobil, int L, int H) {
    if (L == H) {
        return mobil[L].top_acceleration;
    }

    int mid = (L + H) / 2;
    int leftMin = MinTopAcceleration(mobil, L, mid);
    int rightMin = MinTopAcceleration(mobil, mid + 1, H);

    return Math.min(leftMin, rightMin);
}


public static double rataTopPower(Mobil[] mobil) {
    int totalTopPower = 0;
    for (Mobil car : mobil) {
        totalTopPower += car.top_power;
    }
    return (double) totalTopPower / mobil.length;
}
}
