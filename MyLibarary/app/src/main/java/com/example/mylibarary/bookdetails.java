package com.example.mylibarary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class bookdetails extends AppCompatActivity {
private TextView author,bookname,pages,desc;
private Button  current,want,already,favourties;
private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookdetails);
        initviews();
        String lor="The Lord of the Rings is a series of three epic fantasy adventure films directed by Peter Jackson, based on the novel The Lord of the Rings by J. R. R. Tolkien. The films are subtitled The Fellowship of the Ring (2001), The Two Towers (2002), and The Return of the King (2003). Produced and distributed by New Line Cinema with the co-production of WingNut Films, the series is an international venture between New Zealand and the United States. The films feature an ensemble cast including Elijah Wood, Ian McKellen, Liv Tyler, Viggo Mortensen, Sean Astin, Cate Blanchett, John Rhys-Davies, Christopher Lee, Billy Boyd, Dominic Monaghan, Orlando Bloom, Hugo Weaving, Andy Serkis and Sean Bean.\n" +
                "\n" +
                "Set in the fictional world of Middle-earth, the films follow the hobbit Frodo Baggins as he and the Fellowship embark on a quest to destroy the One Ring, to ensure the destruction of its maker, the Dark Lord Sauron. The Fellowship eventually splits up and Frodo continues the quest with his loyal companion Sam and the treacherous Gollum. Meanwhile, Aragorn, heir in exile to the throne of Gondor, along with the elf Legolas, the dwarf Gimli, Merry, Pippin, and the wizard Gandalf, unite to save the Free Peoples of Middle-earth from the forces of Sauron and rally them in the War of the Ring to aid Frodo by distracting Sauron's attention.\n" +
                "\n" +
                "The three films were shot simultaneously in Jackson's native New Zealand from 11 October 1999 until 22 December 2000, with pick-up shots done from 2001 to 2003. It was one of the biggest and most ambitious film projects ever undertaken, with a budget of $281 million (equivalent to $457 million in 2021). The first film in the series premiered at the Odeon Leicester Square in London on 10 December 2001; the second film premiered at the Ziegfeld Theatre in New York City on 5 December 2002; the third film premiered at the Embassy Theatre in Wellington on 1 December 2003. An extended edition of each film was released on home video a year after its release in cinemas.\n" +
                "\n" +
                "The Lord of the Rings is widely regarded as one of the greatest and most influential film series ever made. It was a major financial success and is among the highest-grossing film series of all time with $2.991 billion in worldwide receipts. All three films received widespread acclaim from critics and audiences, who lauded the acting, direction, writing, production values, score, ambition, emotional depth, groundbreaking special effects and faithfulness to the source material. The series received numerous accolades, winning 17 Academy Awards out of 30 total nominations, including Best Picture for The Return of the King. In 2021, The Fellowship of the Ring was selected for preservation in the United States National Film Registry by the Library of Congress for being \"culturally, historically, or aesthetically significant\".";
        String hp="Harry is an orphan living with his abusive aunt and uncle, Vernon and Petunia Dursley and their bullying son, Dudley. On his eleventh birthday, Harry discovers he is a wizard when Rubeus Hagrid delivers him an acceptance letter to Hogwarts School of Witchcraft and Wizardry. He learns that his parents, James and Lily Potter, were murdered by a powerful dark wizard, Lord Voldemort. Harry, instead, survived Voldemort's killing curse, which ended up bouncing back and apparently killing Voldemort, leaving a lightning bolt shaped scar on his forehead. Thus Harry became famous in the wizarding world.\n" +
                "\n" +
                "Hagrid takes Harry to Diagon Alley to shop for his school supplies. He gifts Harry an owl that he names Hedwig, while Harry buys his very first wand at Ollivanders. The owner reveals to him that the cores of Harry and Lord Voldemort's wands have feathers from the same phoenix bird, establishing a powerful connection between the two. At the end of the summer, Harry boards the Hogwarts Express, where he befriends Ronald Weasley and meets Hermione Granger, who both him and Ron initially dislike. Upon his arrival at Hogwarts, Harry is sorted into Gryffindor House after begging the Sorting Hat not to put him in Slytherin House. He finds mentors in Transfiguration professor and head of Gryffindor Minerva McGonagall and headmaster Albus Dumbledore, whereas he forms a rivalry with Draco Malfoy, a classmate from an elitist wizarding family, and the condescending Potions master, Severus Snape, Draco's mentor and the head of Slytherin House. Following an unfortunate accident during his Flying class, Harry becomes the youngest Seeker on the Gryffindor Quidditch team in a century. Harry and Ron are tricked by Malfoy into leaving their dorms at night and Hermione follows them. While trying to hide, they come across a gigantic three-headed dog guarding a trapdoor. The three finally become best friends when Harry and Ron save Hermione from a troll. During Christmas holidays, Harry receives an anonymous gift – his father's invisibility cloak. Aided by the cloak, he is able to explore the school undisturbed. On one of his nightly trips, he sees his parents in an abandoned mirror. It is the Mirror of Erised, which shows what the viewer most desires.";

        Books book=new Books(1,2,R.drawable.img_7,"Lord Of The Rings","J.R.R.Tolkien",lor);

   setdata(book);
    }

    private void setdata(Books book) {

        author.setText(book.getAuthor());
        bookname.setText(book.getName());
        pages.setText(String.valueOf(book.getPages()));
       desc.setText(book.getShortDesc());
        img.setImageResource(book.getImages());
    }

    private void initviews() {
        author=findViewById(R.id.nameoftheauthor);
        bookname=findViewById(R.id.booknamees);
        pages=findViewById(R.id.pagesinbook);
        desc=findViewById(R.id.description);
        current=findViewById(R.id.currentlyreading);
        want=findViewById(R.id.wanttoread);
        already=findViewById(R.id.alreadyread);
        favourties=findViewById(R.id.favorties);
        img=findViewById(R.id.imageView);
    }
}