package com.example.rozaksuperapp.lampung;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProvLampung

    {
        private String name;
        private String description;
        public static final ProvLampung[] PROV_LAMPUNGS = {
                new ProvLampung("Bandar Lampung",
                        "walikota : Eva Dwiana \nluas wilayah : 197.22 km2\njumlah penduduk: 1,166,066"),
                new ProvLampung("Tanggamus",
                        "Bupati: Samsul Hadi\nluas wilayah :4,654.96 km2\njumlah penduduk: 640,275"),
                new ProvLampung("Metro",
                        "Walikota: Wahdi\nluas wilayah: 68.74 km2\njumlah penduduk: 168,575"),
                new ProvLampung("Kotabumi",
                        "Bupati: Agung Ilmu Mangkunegara\nluas wilayah: 2,725.63 km2\njumlah penduduk: 633,099")
        };

        public static final ProvLampung[] PROV_JAKARTAS = {
                new ProvLampung("Bandar Lampung",
                        "walikota : Eva Dwiana \nluas wilayah : 197.22 km2\njumlah penduduk: 1,166,066"),
                new ProvLampung("Tanggamus",
                        "Bupati: Samsul Hadi\nluas wilayah :4,654.96 km2\njumlah penduduk: 640,275"),
                new ProvLampung("Metro",
                        "Walikota: Wahdi\nluas wilayah: 68.74 km2\njumlah penduduk: 168,575"),
                new ProvLampung("Kotabumi",
                        "Bupati: Agung Ilmu Mangkunegara\nluas wilayah: 2,725.63 km2\njumlah penduduk: 633,099")
        };
    }
