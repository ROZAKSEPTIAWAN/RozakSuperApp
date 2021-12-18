package com.example.rozaksuperapp.kalimantan;

import com.example.rozaksuperapp.ntb.ProvNTB;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProvKalimantan {

    private String name;
    private String description;
    public static final ProvKalimantan[] PROV_KALIMANTANS = {
            new ProvKalimantan("Kalimantan Barat",
                    "Gubernur : Sutarmidji FT \nluas wilayah : 147.307,00 km2 \njumlah penduduk: 5.414.540"),
            new ProvKalimantan("Kalimantan Tengah",
                    "Gubernur: H. Sugianto Sabran\nluas wilayah :153.564,50 km2\njumlah penduduk: 2.670.000"),
            new ProvKalimantan("Kalimantan Selatan",
                    "Gubernur: Sahbirin Noor\nluas wilayah: 38.744,00 km2\njumlah penduduk: 4.087.894"),
            new ProvKalimantan("Kalimantan Timur",
                    "Gubernur: Isran Noor\nluas wilayah: 127.346,92 km2 \njumlah penduduk: 3.793.152")
    };
}
