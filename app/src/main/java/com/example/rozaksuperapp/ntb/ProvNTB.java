package com.example.rozaksuperapp.ntb;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProvNTB {
    private String name;
    private String description;
    public static final ProvNTB[] PROV_NTBS = {
            new ProvNTB("Lombok Tengah",
                    "Buoati: Moh Suhaili FT \nluas wilayah : 1,208.39 km2 \njumlah penduduk: 1,034,859"),
            new ProvNTB("Bima",
                    "Bupati: Hj. Indah Dhamayanti Putri, S.E.\nluas wilayah :3.405,63 km2\njumlah penduduk: 532.677"),
            new ProvNTB("Sumbawa",
                    "Bupati: Mahmud Abdullah\nluas wilayah: 6.643,98 km2\njumlah penduduk: 509.753 "),
            new ProvNTB("Mataram",
                    "Wali kota: Mohan Roliskana\nluas wilayah: 61,30 km2 \njumlah penduduk: 441.561")
    };
}
