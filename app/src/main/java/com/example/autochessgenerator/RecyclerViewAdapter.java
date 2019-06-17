package com.example.autochessgenerator;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

        //vars
        private ArrayList<ArrayList<Piece>> mPiece;
        private Context mContext;
        private ArrayList<String> mCombo = new ArrayList<>();

        public RecyclerViewAdapter(Context context, ArrayList<ArrayList<Piece>> pieces) {
            mPiece = pieces;
            mContext = context;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_adapter_view_layout, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, final int position) {
            holder.teamText.setText("Team " + (position+1));

            holder.piece1Name.setText( mPiece.get(position).get(0).getPieceName());
            holder.piece1Race.setText( mPiece.get(position).get(0).getPieceRace());
            holder.piece1Race2.setText( mPiece.get(position).get(0).getPieceRace2());
            holder.piece1Class.setText( mPiece.get(position).get(0).getPieceClass());
            holder.piece1Cost.setText(Integer.toString(mPiece.get(position).get(0).getPieceCost()));

            holder.piece2Name.setText( mPiece.get(position).get(1).getPieceName());
            holder.piece2Race.setText( mPiece.get(position).get(1).getPieceRace());
            holder.piece2Race2.setText( mPiece.get(position).get(1).getPieceRace2());
            holder.piece2Class.setText( mPiece.get(position).get(1).getPieceClass());
            holder.piece2Cost.setText(Integer.toString(mPiece.get(position).get(1).getPieceCost()));

            holder.piece3Name.setText( mPiece.get(position).get(2).getPieceName());
            holder.piece3Race.setText( mPiece.get(position).get(2).getPieceRace());
            holder.piece3Race2.setText( mPiece.get(position).get(2).getPieceRace2());
            holder.piece3Class.setText( mPiece.get(position).get(2).getPieceClass());
            holder.piece3Cost.setText(Integer.toString(mPiece.get(position).get(2).getPieceCost()));

            holder.piece4Name.setText( mPiece.get(position).get(3).getPieceName());
            holder.piece4Race.setText( mPiece.get(position).get(3).getPieceRace());
            holder.piece4Race2.setText( mPiece.get(position).get(3).getPieceRace2());
            holder.piece4Class.setText( mPiece.get(position).get(3).getPieceClass());
            holder.piece4Cost.setText(Integer.toString(mPiece.get(position).get(3).getPieceCost()));

            holder.piece5Name.setText( mPiece.get(position).get(4).getPieceName());
            holder.piece5Race.setText( mPiece.get(position).get(4).getPieceRace());
            holder.piece5Race2.setText( mPiece.get(position).get(4).getPieceRace2());
            holder.piece5Class.setText( mPiece.get(position).get(4).getPieceClass());
            holder.piece5Cost.setText(Integer.toString(mPiece.get(position).get(4).getPieceCost()));

            holder.piece6Name.setText( mPiece.get(position).get(5).getPieceName());
            holder.piece6Race.setText( mPiece.get(position).get(5).getPieceRace());
            holder.piece6Race2.setText( mPiece.get(position).get(5).getPieceRace2());
            holder.piece6Class.setText( mPiece.get(position).get(5).getPieceClass());
            holder.piece6Cost.setText(Integer.toString(mPiece.get(position).get(5).getPieceCost()));

            holder.piece7Name.setText( mPiece.get(position).get(6).getPieceName());
            holder.piece7Race.setText( mPiece.get(position).get(6).getPieceRace());
            holder.piece7Race2.setText( mPiece.get(position).get(6).getPieceRace2());
            holder.piece7Class.setText( mPiece.get(position).get(6).getPieceClass());
            holder.piece7Cost.setText(Integer.toString(mPiece.get(position).get(6).getPieceCost()));

            holder.piece8Name.setText( mPiece.get(position).get(7).getPieceName());
            holder.piece8Race.setText( mPiece.get(position).get(7).getPieceRace());
            holder.piece8Race2.setText( mPiece.get(position).get(7).getPieceRace2());
            holder.piece8Class.setText( mPiece.get(position).get(7).getPieceClass());
            holder.piece8Cost.setText(Integer.toString(mPiece.get(position).get(7).getPieceCost()));

            holder.piece9Name.setText( mPiece.get(position).get(8).getPieceName());
            holder.piece9Race.setText( mPiece.get(position).get(8).getPieceRace());
            holder.piece9Race2.setText( mPiece.get(position).get(8).getPieceRace2());
            holder.piece9Class.setText( mPiece.get(position).get(8).getPieceClass());
            holder.piece9Cost.setText(Integer.toString(mPiece.get(position).get(8).getPieceCost()));

            holder.piece10Name.setText( mPiece.get(position).get(9).getPieceName());
            holder.piece10Race.setText( mPiece.get(position).get(9).getPieceRace());
            holder.piece10Race2.setText( mPiece.get(position).get(9).getPieceRace2());
            holder.piece10Class.setText( mPiece.get(position).get(9).getPieceClass());
            holder.piece10Cost.setText(Integer.toString(mPiece.get(position).get(9).getPieceCost()));


            checkCombos(position);

            System.out.println(mCombo.size());
            System.out.println(mCombo);



            if(mCombo.size() > 0) {
                holder.combo1.setText(mCombo.get(0));
            }
            else {
                holder.combo1.setText("No Combos");
            }

            if(mCombo.size() > 1) {
                holder.combo1amount.setText(mCombo.get(1));
            }
            else {
                holder.combo1amount.setText("");
            }

            if(mCombo.size() > 2) {
                holder.combo2.setText( mCombo.get(2));
            }
            else {
                holder.combo2.setText("");
            }

            if(mCombo.size() > 3) {
                holder.combo2amount.setText( mCombo.get(3));
            }
            else {
                holder.combo2amount.setText("");
            }

            if(mCombo.size() > 4) {
                holder.combo3.setText( mCombo.get(4));
            }
            else {
                holder.combo3.setText("");
            }

            if(mCombo.size() > 5) {
                holder.combo3amount.setText( mCombo.get(5));
            }
            else {
                holder.combo3amount.setText("");
            }

            if(mCombo.size() > 6) {
                holder.combo4.setText( mCombo.get(6));
            }
            else {
                holder.combo4.setText("");
            }

            if(mCombo.size() > 7) {
                holder.combo4amount.setText( mCombo.get(7));
            }
            else {
                holder.combo4amount.setText("");
            }

            if(mCombo.size() > 8) {
                holder.combo5.setText( mCombo.get(8));
            }
            else {
                holder.combo5.setText("");
            }

            if(mCombo.size() > 9) {
                holder.combo5amount.setText( mCombo.get(9));
            }
            else {
                holder.combo5amount.setText("");
            }

            if(mCombo.size() > 10) {
                holder.combo6.setText( mCombo.get(10));
            }
            else {
                holder.combo6.setText("");
            }

            if(mCombo.size() > 11) {
                holder.combo6amount.setText( mCombo.get(11));
            }
            else {
                holder.combo6amount.setText("");
            }

            if(mCombo.size() > 12) {
                holder.combo7.setText( mCombo.get(12));
            }
            else {
                holder.combo7.setText("");
            }

            if(mCombo.size() > 13) {
                holder.combo7amount.setText( mCombo.get(13));
            }

            else {
                holder.combo7amount.setText("");
            }
            if(mCombo.size() > 14) {
                holder.combo8.setText( mCombo.get(14));
            }
            else {
                holder.combo8.setText("");
            }

            if(mCombo.size() > 15) {
                holder.combo8amount.setText( mCombo.get(15));
            }
            else {
                holder.combo8amount.setText("");
            }

            if(mCombo.size() > 16) {
                holder.combo9.setText( mCombo.get(16));
            }
            else {
                holder.combo9.setText("");
            }

            if(mCombo.size() > 17) {
                holder.combo9amount.setText( mCombo.get(17));
            }
            else {
                holder.combo9amount.setText("");
            }
        }

        @Override
        public int getItemCount() {
            return mPiece.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder{

            TextView teamText;

            TextView piece1Name;
            TextView piece1Race;
            TextView piece1Race2;
            TextView piece1Class;
            TextView piece1Cost;

            TextView piece2Name;
            TextView piece2Race;
            TextView piece2Race2;
            TextView piece2Class;
            TextView piece2Cost;

            TextView piece3Name;
            TextView piece3Race;
            TextView piece3Race2;
            TextView piece3Class;
            TextView piece3Cost;

            TextView piece4Name;
            TextView piece4Race;
            TextView piece4Race2;
            TextView piece4Class;
            TextView piece4Cost;

            TextView piece5Name;
            TextView piece5Race;
            TextView piece5Race2;
            TextView piece5Class;
            TextView piece5Cost;

            TextView piece6Name;
            TextView piece6Race;
            TextView piece6Race2;
            TextView piece6Class;
            TextView piece6Cost;

            TextView piece7Name;
            TextView piece7Race;
            TextView piece7Race2;
            TextView piece7Class;
            TextView piece7Cost;

            TextView piece8Name;
            TextView piece8Race;
            TextView piece8Race2;
            TextView piece8Class;
            TextView piece8Cost;

            TextView piece9Name;
            TextView piece9Race;
            TextView piece9Race2;
            TextView piece9Class;
            TextView piece9Cost;

            TextView piece10Name;
            TextView piece10Race;
            TextView piece10Race2;
            TextView piece10Class;
            TextView piece10Cost;

            TextView combo1;
            TextView combo1amount;

            TextView combo2;
            TextView combo2amount;

            TextView combo3;
            TextView combo3amount;

            TextView combo4;
            TextView combo4amount;

            TextView combo5;
            TextView combo5amount;

            TextView combo6;
            TextView combo6amount;

            TextView combo7;
            TextView combo7amount;

            TextView combo8;
            TextView combo8amount;

            TextView combo9;
            TextView combo9amount;

            public ViewHolder(View itemView) {
                super(itemView);
                teamText = itemView.findViewById(R.id.textView);

                piece1Name = itemView.findViewById(R.id.piece1Name);
                piece1Race = itemView.findViewById(R.id.piece1Race);
                piece1Race2 = itemView.findViewById(R.id.piece1Race2);
                piece1Class = itemView.findViewById(R.id.piece1Class);
                piece1Cost = itemView.findViewById(R.id.piece1Cost);

                piece2Name = itemView.findViewById(R.id.piece2Name);
                piece2Race = itemView.findViewById(R.id.piece2Race);
                piece2Race2 = itemView.findViewById(R.id.piece2Race2);
                piece2Class = itemView.findViewById(R.id.piece2Class);
                piece2Cost = itemView.findViewById(R.id.piece2Cost);

                piece3Name = itemView.findViewById(R.id.piece3Name);
                piece3Race = itemView.findViewById(R.id.piece3Race);
                piece3Race2 = itemView.findViewById(R.id.piece3Race2);
                piece3Class = itemView.findViewById(R.id.piece3Class);
                piece3Cost = itemView.findViewById(R.id.piece3Cost);

                piece4Name = itemView.findViewById(R.id.piece4Name);
                piece4Race = itemView.findViewById(R.id.piece4Race);
                piece4Race2 = itemView.findViewById(R.id.piece4Race2);
                piece4Class = itemView.findViewById(R.id.piece4Class);
                piece4Cost = itemView.findViewById(R.id.piece4Cost);

                piece5Name = itemView.findViewById(R.id.piece5Name);
                piece5Race = itemView.findViewById(R.id.piece5Race);
                piece5Race2 = itemView.findViewById(R.id.piece5Race2);
                piece5Class = itemView.findViewById(R.id.piece5Class);
                piece5Cost = itemView.findViewById(R.id.piece5Cost);

                piece6Name = itemView.findViewById(R.id.piece6Name);
                piece6Race = itemView.findViewById(R.id.piece6Race);
                piece6Race2 = itemView.findViewById(R.id.piece6Race2);
                piece6Class = itemView.findViewById(R.id.piece6Class);
                piece6Cost = itemView.findViewById(R.id.piece6Cost);

                piece7Name = itemView.findViewById(R.id.piece7Name);
                piece7Race = itemView.findViewById(R.id.piece7Race);
                piece7Race2 = itemView.findViewById(R.id.piece7Race2);
                piece7Class = itemView.findViewById(R.id.piece7Class);
                piece7Cost = itemView.findViewById(R.id.piece7Cost);

                piece8Name = itemView.findViewById(R.id.piece8Name);
                piece8Race = itemView.findViewById(R.id.piece8Race);
                piece8Race2 = itemView.findViewById(R.id.piece8Race2);
                piece8Class = itemView.findViewById(R.id.piece8Class);
                piece8Cost = itemView.findViewById(R.id.piece8Cost);

                piece9Name = itemView.findViewById(R.id.piece9Name);
                piece9Race = itemView.findViewById(R.id.piece9Race);
                piece9Race2 = itemView.findViewById(R.id.piece9Race2);
                piece9Class = itemView.findViewById(R.id.piece9Class);
                piece9Cost = itemView.findViewById(R.id.piece9Cost);

                piece10Name = itemView.findViewById(R.id.piece10Name);
                piece10Race = itemView.findViewById(R.id.piece10Race);
                piece10Race2 = itemView.findViewById(R.id.piece10Race2);
                piece10Class = itemView.findViewById(R.id.piece10Class);
                piece10Cost = itemView.findViewById(R.id.piece10Cost);

                combo1 = itemView.findViewById(R.id.combo1);
                combo1amount = itemView.findViewById(R.id.combo1amount);

                combo2 = itemView.findViewById(R.id.combo2);
                combo2amount = itemView.findViewById(R.id.combo2amount);

                combo3 = itemView.findViewById(R.id.combo3);
                combo3amount = itemView.findViewById(R.id.combo3amount);

                combo4 = itemView.findViewById(R.id.combo4);
                combo4amount = itemView.findViewById(R.id.combo4amount);

                combo5 = itemView.findViewById(R.id.combo5);
                combo5amount = itemView.findViewById(R.id.combo5amount);

                combo6 = itemView.findViewById(R.id.combo6);
                combo6amount = itemView.findViewById(R.id.combo6amount);

                combo7 = itemView.findViewById(R.id.combo7);
                combo7amount = itemView.findViewById(R.id.combo7amount);

                combo8 = itemView.findViewById(R.id.combo8);
                combo8amount = itemView.findViewById(R.id.combo8amount);

                combo9 = itemView.findViewById(R.id.combo9);
                combo9amount = itemView.findViewById(R.id.combo9amount);
            }
        }

        private void checkCombos(int index){
            int orc = 0;
            int beast = 0;
            int undead = 0;
            int goblin = 0;
            int troll = 0;
            int elf = 0;
            int elemental = 0;
            int god = 0;
            int dragon = 0;
            int human = 0;
            int naga = 0;
            int demon = 0;
            int dwarf = 0;
            int ogre = 0;
            int dh = 0;
            int warrior = 0;
            int warlock = 0;
            int knight = 0;
            int druid = 0;
            int mage = 0;
            int shaman = 0;
            int priest = 0;
            int assassin = 0;
            int hunter = 0;
            int mech = 0;
            mCombo.clear();


            for(int i = 0; i < mPiece.get(index).size(); i++) {
                switch (mPiece.get(index).get(i).getPieceRace2().toLowerCase()){
                    case "":
                        break;
                    case "beast":
                        beast++;
                        break;
                    case "ogre":
                        ogre++;
                        break;
                    case "dragon":
                        dragon++;
                        break;
                }

                switch(mPiece.get(index).get(i).getPieceRace().toLowerCase()) {
                    case "orc":
                        orc++;
                        break;
                    case "beast":
                        beast++;
                        break;
                    case "undead":
                        undead++;
                        break;
                    case "goblin":
                        goblin++;
                        break;
                    case "troll":
                        troll++;
                        break;
                    case "elf":
                        elf++;
                        break;
                    case "elemental":
                        elemental++;
                        break;
                    case "god":
                        god++;
                        break;
                    case "dragon":
                        dragon++;
                        break;
                    case "human":
                        human++;
                        break;
                    case "naga":
                        naga++;
                        break;
                    case "demon":
                        demon++;
                        break;
                    case "dwarf":
                        dwarf++;
                        break;
                    case "ogre":
                        ogre++;
                        break;
                }

                switch(mPiece.get(index).get(i).getPieceClass().toLowerCase()) {
                    case "demon hunter":
                        dh++;
                        break;
                    case "warrior":
                        warrior++;
                        break;
                    case "warlock":
                        warlock++;
                        break;
                    case "knight":
                        knight++;
                        break;
                    case "druid":
                        druid++;
                        break;
                    case "mage":
                        mage++;
                        break;
                    case "shaman":
                        shaman++;
                        break;
                    case "priest":
                        priest++;
                        break;
                    case "assassin":
                        assassin++;
                        break;
                    case "hunter":
                        hunter++;
                        break;
                    case "mech":
                        mech++;
                        break;
                }
            }

            boolean godBonus = true;

            if(dwarf >= 1){
                mCombo.add("Dwarf");
                mCombo.add("x" + dwarf);
                godBonus = false;
            }
            if(demon >= 1){

                if(demon == 1) {
                    mCombo.add("Demon");
                    mCombo.add("x1");
                    godBonus = false;
                }
                else if(demon >= 2) {
                    if(dh == 2) {
                        mCombo.add("Demon");
                        mCombo.add("x" + demon);
                        godBonus = false;
                    }
                    else {
                        godBonus = true;
                    }
                }
            }
            if(ogre >= 1){
                mCombo.add("Ogre");
                mCombo.add("x" + ogre);
                godBonus = false;
            }
            if(beast >= 2) {
                mCombo.add("Beast");
                godBonus = false;

                if(beast == 2 || beast == 3) {
                    mCombo.add("x2");
                }
                else {
                    mCombo.add("x4");
                }
            }
            if(orc >= 2) {
                mCombo.add("Orc");
                godBonus = false;

                if(orc == 2 || orc == 3){
                    mCombo.add("x2");
                }
                else {
                    mCombo.add("x4");
                }
            }
            if(undead >= 2) {
                mCombo.add("Undead");
                godBonus = false;

                if(undead == 2 || undead == 3){
                    mCombo.add("x2");
                }
                else {
                    mCombo.add("x4");
                }
            }
            if(goblin >= 3) {
                mCombo.add("Goblin");
                godBonus = false;

                if(goblin >= 3 && goblin <= 5){
                    mCombo.add("x3");
                }
                else {
                    mCombo.add("x6");
                }
            }
            if(troll >= 2) {
                mCombo.add("Troll");
                godBonus = false;

                if(troll == 2 || troll == 3){
                    mCombo.add("x2");
                }
                else {
                    mCombo.add("x4");
                }
            }
            if(elf >= 3) {
                mCombo.add("Elf");
                godBonus = false;

                if(elf >= 3 && elf <= 5){
                    mCombo.add("x3");
                }
                else if(elf >= 6 && elf <= 8){
                    mCombo.add("x6");
                }
                else {
                    mCombo.add("x9");
                }
            }
            if(elemental >= 2) {
                mCombo.add("Elemental");
                godBonus = false;

                if(elemental == 2 || elemental == 3){
                    mCombo.add("x2");
                }
                else {
                    mCombo.add("x4");
                }
            }
            if(dragon == 3) {
                mCombo.add("Dragon");
                mCombo.add("x3");
                godBonus = false;

            }
            if(human >= 2) {
                mCombo.add("Human");
                godBonus = false;

                if(human >= 2 && human <= 3){
                    mCombo.add("x2");
                }
                else if(human >= 4 && human <= 5){
                    mCombo.add("x4");
                }
                else {
                    mCombo.add("x6");
                }
            }
            if(naga >= 2) {
                mCombo.add("Naga");
                mCombo.add("x2");
                godBonus = false;
            }
            if(god >= 1) {
                if(godBonus) {
                    mCombo.add("God");
                    mCombo.add("x" + god);
                }
            }

            if(warrior >= 3){
                mCombo.add("Warrior");
                if(warrior >= 3 && warrior <= 5){
                    mCombo.add("x3");
                }
                if(warrior >= 6 && warrior <= 8){
                    mCombo.add("x6");
                }
                if(warrior >= 9){
                    mCombo.add("x9");
                }
            }
            if(warlock >= 3){
                mCombo.add("Warlock");
                if(warlock >= 3 && warlock <= 5){
                    mCombo.add("x3");
                }
                if(warlock >= 6){
                    mCombo.add("x6");
                }
            }
            if(knight >= 3) {
                mCombo.add("Knight");
                if (knight >= 3 && knight <= 5) {
                    mCombo.add("x3");
                }
                if (knight >= 6) {
                    mCombo.add("x6");
                }
            }
            if(druid >= 2) {
                mCombo.add("Druid");
                if (druid >= 2 && druid <= 3) {
                    mCombo.add("x2");
                }
                if (druid >= 4) {
                    mCombo.add("x4");
                }
            }
            if(mage >= 3) {
                mCombo.add("Mage");
                if (mage >= 3 && mage <= 5) {
                    mCombo.add("x3");
                }
                if (mage >= 6) {
                    mCombo.add("x6");
                }
            }
            if (shaman >= 2) {
                mCombo.add("Shaman")
                ;mCombo.add("x2");
            }
            if (priest >= 1) {
                mCombo.add("Priest");
                mCombo.add("x1");
            }
            if (assassin >= 3) {
                mCombo.add("Assassin");
                if (assassin >= 3 && assassin <= 5) {
                    mCombo.add("x3");
                }
                if (assassin >= 6) {
                    mCombo.add("x6");
                }
            }
            if(dh >= 2) {
                mCombo.add("Demon Hunter");
                mCombo.add("x2");
            }
            if (hunter >= 3) {
                mCombo.add("Hunter");
                if (hunter >= 3 && hunter <= 5) {
                    mCombo.add("x3");
                }
                if (hunter >= 6) {
                    mCombo.add("x6");
                }
            }
            if (mech >= 2) {
                mCombo.add("Mech");
                if (mech >= 2 && mech <= 3) {
                    mCombo.add("x2");
                }
                if (mech >= 4) {
                    mCombo.add("x4");
                }
            }
        }
    }
