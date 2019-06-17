package com.example.autochessgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private static final String TAG = MainActivity.class.getSimpleName();
    protected static Piece Piece;
    protected static ArrayList<Piece> ChampList = new ArrayList<>();
    protected static ArrayList<ArrayList<Piece>> teamList = new ArrayList<>();
    protected static RandomCollection<Piece> rc = new RandomCollection<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner spinner = findViewById(R.id.playerAmount);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.numbers, R.layout.spinner_items);
        adapter.setDropDownViewResource(R.layout.spinner_items);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        pieces();
        weightedAdded();



        Button addBtn = (Button) findViewById(R.id.teamGenerateButton);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String selected = spinner.getSelectedItem().toString();
                int amount = Integer.parseInt(selected);

                teamList.clear();
                teamList = getPlayerTeam(amount, teamList);

                Intent intent = new Intent(MainActivity.this, teamDisplay.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    protected static void pieces() {
        Log.e(TAG, "Started adding pieces");

        if(ChampList.size() > 0) {
            ChampList.clear();
        }

        ChampList.add(Piece = new Piece(0, "Axe", "Orc","","Warrior", 1));
        ChampList.add(Piece = new Piece(1, "Enchantress", "Beast","","Druid", 1));
        ChampList.add(Piece = new Piece(2, "Tusk", "Beast","","Warrior", 1));
        ChampList.add(Piece = new Piece(3, "Drow Ranger", "Undead","","Hunter", 1));
        ChampList.add(Piece = new Piece(4, "Bounty Hunter", "Goblin","","Assassin", 1));
        ChampList.add(Piece = new Piece(5, "Clockwerk", "Goblin","","Mech", 1));
        ChampList.add(Piece = new Piece(6, "Shadow Shaman", "Troll","","Shaman", 1));
        ChampList.add(Piece = new Piece(7, "Batrider", "Troll","","Knight", 1));
        ChampList.add(Piece = new Piece(8, "Tinker", "Goblin","","Mech", 1));
        ChampList.add(Piece = new Piece(9, "Anti-Mage", "Elf","","Demon Hunter", 1));
        ChampList.add(Piece = new Piece(10, "Tiny", "Elemental","","Warrior", 1));
        ChampList.add(Piece = new Piece(11, "Mars", "God","","Warrior", 1));
        ChampList.add(Piece = new Piece(12, "Winter Wyvern", "Dragon","","Mage", 1));

        ChampList.add(Piece = new Piece(13, "Crystal Maiden", "Human","","Mage", 2));
        ChampList.add(Piece = new Piece(14, "Beast Master", "Orc","","Hunter", 2));
        ChampList.add(Piece = new Piece(15, "Juggernaut", "Orc","","Warrior", 2));
        ChampList.add(Piece = new Piece(16, "Timbersaw", "Goblin","","Mech", 2));
        ChampList.add(Piece = new Piece(17, "Queen of pain", "Demon","","Assassin", 2));
        ChampList.add(Piece = new Piece(18, "Puck", "Elf","Dragon","Mage", 2));
        ChampList.add(Piece = new Piece(19, "Witch Doctor", "Troll","","Warlock", 2));
        ChampList.add(Piece = new Piece(20, "Slardar", "Naga","","Warrior", 2));
        ChampList.add(Piece = new Piece(21, "Chaos Knight", "Demon","","Knight", 2));
        ChampList.add(Piece = new Piece(22, "Luna", "Elf","","Knight", 2));
        ChampList.add(Piece = new Piece(23, "Furion", "Elf","","Druid", 2));
        ChampList.add(Piece = new Piece(24, "Morphling", "Elemental","","Assassin", 2));
        ChampList.add(Piece = new Piece(25, "Mirana", "Elf","","Hunter", 2));
        ChampList.add(Piece = new Piece(26, "Lich", "Undead","","Mage", 2));

        ChampList.add(Piece = new Piece(27, "Lycan", "Human","Beast","Warrior", 3));
        ChampList.add(Piece = new Piece(28, "Venomancer", "Beast","","Warlock", 3));
        ChampList.add(Piece = new Piece(29, "Omniknight", "Human","","Knight", 3));
        ChampList.add(Piece = new Piece(30, "Razor", "Elemental","","Mage", 3));
        ChampList.add(Piece = new Piece(31, "Windranger", "Elf","","Hunter", 3));
        ChampList.add(Piece = new Piece(32, "Phantom Assassin", "Elf","","Assassin", 3));
        ChampList.add(Piece = new Piece(33, "Abaddon", "Undead","","Knight", 3));
        ChampList.add(Piece = new Piece(34, "Sniper", "Dwarf","","Hunter", 3));
        ChampList.add(Piece = new Piece(35, "Viper", "Dragon","","Assassin", 3));
        ChampList.add(Piece = new Piece(36, "Shadow Fiend", "Demon","","Warlock", 3));
        ChampList.add(Piece = new Piece(37, "Lina", "Human","","Mage", 3));
        ChampList.add(Piece = new Piece(38, "Terrorblade", "Demon","","Demon Hunter", 3));
        ChampList.add(Piece = new Piece(39, "Treant Protector", "Elf","","Druid", 3));
        ChampList.add(Piece = new Piece(40, "Dazzle", "Troll","","Priest", 3));

        ChampList.add(Piece = new Piece(41, "Doom", "Demon","","Warrior", 4));
        ChampList.add(Piece = new Piece(42, "Kunkka", "Human","","Warrior", 4));
        ChampList.add(Piece = new Piece(43, "Troll Warlord", "Troll","","Warrior", 4));
        ChampList.add(Piece = new Piece(44, "Keeper of the Light", "Human","","Mage", 4));
        ChampList.add(Piece = new Piece(45, "Necrophos", "Undead","","Warlock", 4));
        ChampList.add(Piece = new Piece(46, "Templar Assassin", "Elf","","Assassin", 4));
        ChampList.add(Piece = new Piece(47, "Alchemist", "Goblin","Ogre","Warlock", 4));
        ChampList.add(Piece = new Piece(48, "Disruptor", "Orc","","Shaman", 4));
        ChampList.add(Piece = new Piece(49, "Medusa", "Naga","","Hunter", 4));
        ChampList.add(Piece = new Piece(50, "Dragon Knight", "Human","Dragon","Knight", 4));
        ChampList.add(Piece = new Piece(51, "Lone Druid", "Beast","","Druid", 4));

        ChampList.add(Piece = new Piece(52, "Gyrocopter", "Dwarf","","Mech", 5));
        ChampList.add(Piece = new Piece(53, "Tidehunter", "Naga","","Hunter", 5));
        ChampList.add(Piece = new Piece(54, "Enigma", "Elemental","","Warlock", 5));
        ChampList.add(Piece = new Piece(55, "Techies", "Goblin","","Mech", 5));
        ChampList.add(Piece = new Piece(56, "Death Prophet", "Undead","","Warlock", 5));
        ChampList.add(Piece = new Piece(57, "Zeus", "God","","Mage", 5));
        ChampList.add(Piece = new Piece(58, "Sven", "Demon","","Warrior", 5));


        Log.e(TAG, "adding pieces ended");
    }

    protected static void weightedAdded() {
        Log.e(TAG, "Weighting starting");

        for(Piece p : ChampList) {
            if(p.getPieceCost() == 1){
                rc.add(32.0, p);
            }
            else if(p.getPieceCost() == 2)
            {
                rc.add(28.0, p);
            }
            else if(p.getPieceCost() == 3) {
                rc.add(20.0, p);
            }
            else if(p.getPieceCost() == 4) {
                rc.add(15.0, p);
            }
            else {
                rc.add(5.0, p);
            }
        }

        Log.e(TAG, "Weighting done");
    }

    protected static ArrayList<ArrayList<Piece>> getPlayerTeam(int amount, ArrayList<ArrayList<Piece>> teamList) {
        Log.e(TAG, "Creating teams starting");

        for (int i = 0; i < amount; i++){
            ArrayList<Piece> playerChampList = new ArrayList<>();
            Piece newChamp;
            for (; playerChampList.size() < 10; ) {
                newChamp = rc.next();
                if (!playerChampList.contains(newChamp)) {
                    playerChampList.add(newChamp);
                }
            }
            teamList.add(playerChampList);
        }
        Log.e(TAG, "Teams finished being created");

        return teamList;
    }
}
