package com.example.MakananSulawesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView lvProgram;
    String[] programName = {"burasa","cotomakasar","Kaledo","konroBakar","lalampa","milu","oyop","palubasa","panada","tinutuan"};
    String[] programDescription = {"Makanan asli masyarakat Bugis Sulawesi Selatan tersebut memiliki bentuk pipih namun sering disantap bersama dengan coto makassar maupun opor ayam, khususnya saat lebaran atau hari raya idul fitri.",
            "Makanan khas Sulawesi bernama coto merupakan makanan dengan bahan dasar berupa jeroan sapi yang dibuat dengan cara direbus dengan waktu lama.",
            "Sup kaledo ini banyak diminati oleh masyarakat Sulawesi karena rasanya yang pedas. Sup ini terbuat dari daging sapi dan juga sumsum tulang yang direbus hingga menghasilkan kaldu.",
            "Sebelumnya telah disinggung tentang sop konro bakar yang dibuat dengan cara membakar iga sapi terlebih dahulu lalu dibalut bumbu sop konro yang khas.",
            "Makanan ini terbuat dari beras yang dicampur dengan ikan cakalang. Mungkin sekilas makanan ini mirip makanan khas Jawa Tengah. Lalampa ini dibungkus dengan daun pisang dan dimasak dengan cara dibakar.",
            "milu siram ini adalah makanan semacam sup jagung. Makanan ini berasal dari jagung muda yang biasa juga disebut binte biluhuta.",
            "Makanan khas Sulawesi Tengah yang satu ini memang unik namanya. Onyop adalah semacam jenang pada masyarakat Jawa. Namun di Sulawesi, makanan ini disajikan dengan kuah asam",
            "Pallubasa merupakan makanan dengan tampilan dan bahan yang mirip seperti coto makassar, termasuk bahan utama pembuatannya yaitu jeroan sapi atau kerbau beserta dagingnya yang juga sama.",
            "Panada adalah cemilan yang mirip dengan pastel, namun memiliki perbedaan mendasar pada bahan kulitnya dan isiannya.",
            "Bubur ini terlihat sama dengan bubur pada umumnya. Yang membedakan adalah isian sayuran yang melimpah sehingga bubur ini lebih sehat"};
    int[]  programImages = {R.drawable.burasa,R.drawable.cotomakasar,R.drawable.kaledo,R.drawable.konrobakar,
                            R.drawable.lalampa,R.drawable.milu,R.drawable.onyop,R.drawable.palubasa,R.drawable.panada,
                            R.drawable.tinutuan};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvProgram = findViewById(R.id.lvProgram);
        ProgramAdapter programAdapter = new ProgramAdapter(this, programName, programImages, programDescription);
        lvProgram.setAdapter(programAdapter);
    }
}