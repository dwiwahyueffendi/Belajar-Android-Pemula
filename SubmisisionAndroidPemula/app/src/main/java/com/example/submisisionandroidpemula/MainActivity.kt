package com.example.submisisionandroidpemula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_list_singer.*
import java.lang.reflect.Array.get
import java.nio.file.Paths.get

class MainActivity : AppCompatActivity() {

    private lateinit var Recycle: RecyclerView
    private val list = ArrayList<Singer>()

    override fun onResume() {
        super.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Recycle = findViewById(R.id.rv_list)
        Recycle.setHasFixedSize(true)
        Recycle.layoutManager = LinearLayoutManager(this)

        val model = ArrayList<Singer>()
        model.add(Singer(
                "https://1.bp.blogspot.com/-Vvzmb5MEwGU/X560qjjN7II/AAAAAAAAFZA/mJlPnjq8eycv2B4jrttNmTbQFQUSj6AUwCNcBGAsYHQ/s1440/Ariana-grande-Wiki.jpg",
                "Ariana Grande",
                "Genres: Pop",
                "Active: 2008–present",
                "Ariana Grande-Butera (born June 26, 1993) is an American singer and actress. Born in Boca Raton, Florida, Grande began her career at age 15 in the 2008 Broadway musical 13. She rose to fame for her role as Cat Valentine in the Nickelodeon television series Victorious (2010–2013) and Sam & Cat (2013–2014). She subsequently signed with Republic Records in 2011 after the label's executives discovered YouTube videos of her covering songs. Her 1950s doo-wop-influenced pop and R&B debut album, Yours Truly (2013), topped the US Billboard 200 chart, while its lead single, \"The Way\", charted in the top ten of the US Billboard Hot 100. Upon release, critics compared Grande to Mariah Carey for her wide vocal range and whistle register.\n" + "Grande maintained her pop and R&B sound on her second and third studio albums, My Everything (2014), and Dangerous Woman (2016), with the former exploring EDM and producing the UK number-one singles \"Problem\", and \"Bang Bang\", and the latter becoming her first of four consecutive number-one albums in the UK Singles Chart. Her personal struggles influenced her trap-infused fourth and fifth studio albums, Sweetener (2018) and Thank U, Next (2019), which were both critical and commercial successes. The former won Grande a Grammy Award for Best Pop Vocal Album, while the latter broke the record for the largest streaming week for a pop album, and was nominated for the Album of the Year. The singles \"Thank U, Next\", \"7 Rings\", and \"Break Up with Your Girlfriend, I'm Bored\" made Grande the first solo artist to hold the top three spots on the Billboard Hot 100 simultaneously, and the first woman to succeed herself at the top of the UK. In 2020, her collaborations \"Stuck with U\" with Justin Bieber and \"Rain on Me\" with Lady Gaga helped her break the record for most number-one debuts on the Hot 100. Grande's R&B-influenced sixth studio album, Positions (2020), and its title track, debuted at number-one in the UK and US."
            )
        )
        model.add(Singer(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Billie_Eilish_2019_by_Glenn_Francis_(cropped)_2.jpg/1200px-Billie_Eilish_2019_by_Glenn_Francis_(cropped)_2.jpg",
                "Billie Elish",
                "Genres: Dark",
                "Active: 2015–present",
                "Billie Eilish Pirate Baird O'Connell (born December 18, 2001) is an American singer-songwriter. She first gained attention in 2015 when she uploaded the song \"Ocean Eyes\" to SoundCloud, which was subsequently released by the Interscope Records subsidiary Darkroom. The song was written and produced by her brother Finneas O'Connell, with whom she collaborates on music and live shows. Her debut EP, Don't Smile at Me (2017), became a sleeper hit, reaching the top 15 in the US, UK, Canada, and Australia.\n" +
                        "Eilish's debut studio album, When We All Fall Asleep, Where Do We Go? (2019), debuted atop the US Billboard 200, reached number-one in the UK, and became one of the best-selling albums of 2019. The album's fifth single \"Bad Guy\" became her first number-one song on the Billboard Hot 100. In 2020, she performed the theme song \"No Time to Die\" for the James Bond film of the same name, which became her first number-one single in the UK. Her later singles \"Everything I Wanted\", \"My Future\", and \"Therefore I Am\" peaked within the top 10 in the US and UK."
            )
        )
        model.add(Singer(
                "https://fuzzable.com/wp-content/uploads/2019/01/Five-Outfits-From-Harry-Styles-That-We-Love-01.jpg",
                "Harry Styles",
                "Genres: Rock",
                "Active: 2010–present",
                "Harry Edward Styles (born 1 February 1994) is an English singer, songwriter, and actor. His musical career began in 2010 as a solo contestant on the British music competition series The X Factor. Following his elimination early on, he was brought back to join the boy band One Direction, which went on to become one of the best-selling boy bands of all time.\n" +
                        "Styles released his self-titled debut solo album through Columbia Records in 2017. It debuted at number one in the UK and the US, and became one of the world's top-ten best-selling albums of the year. Its lead single, \"Sign of the Times\", topped the UK Singles Chart. He made his acting debut in Christopher Nolan's 2017 war film Dunkirk. Styles' second album, Fine Line (2019), debuted atop the US Billboard 200 with the biggest first-week sales by an English male artist in history, and was listed among Rolling Stone's \"500 Greatest Albums of All Time\" in 2020. Its fourth single, \"Watermelon Sugar\", topped the US Billboard Hot 100."
            )
        )
        model.add(Singer(
                "https://www.hawtcelebs.com/wp-content/uploads/2019/11/dua-lipa-at-2019-america-music-awards-in-los-angeles-11-24-2019-4.jpg",
                "Dua Lipa",
                "Genres: Pop",
                "Active: 2014–present",
                "Dua Lipa (born 22 August 1995) is an English singer and songwriter. After working as a model, she signed with Warner Bros. Records in 2014 and released her eponymous debut album in 2017. The album peaked at number three on the UK Albums Chart, and yielded eight singles, including \"Be the One\", \"IDGAF\", and the UK number-one single \"New Rules\", which also peaked at number six in the US. The album has achieved platinum status worldwide. In 2018, Lipa won the Brit Awards for best British Female Solo Artist and British Breakthrough Act.\n" +
                        "Her 2018 single \"One Kiss\" with Calvin Harris peaked at number one in the UK and became the longest-running number-one single for a female artist in 2018. It won her the 2019 Brit Award for Song of the Year. In 2019, she won the Grammy Award for Best New Artist, and her Silk City-collaboration \"Electricity\" won the Grammy Award for Best Dance Recording. Her second studio album, Future Nostalgia (2020), received critical acclaim and garnered her six Grammy nominations, including Album of the Year, Record of the Year and Song of the Year. It became her first UK number-one album, with four top-ten singles including \"Physical\" and \"Break My Heart\". Its lead single \"Don't Start Now\" peaked at number two in the UK and US, and number four on the US Hot 100 year-ender chart, becoming the most successful 2020 song by a female artist in the US. The single \"Levitating\" peaked in the top-five in the US and UK."
            )
        )
        model.add(Singer(
                "https://celebmafia.com/wp-content/uploads/2019/12/taylor-swift-billboard-women-in-music-2019-14.jpg",
                "Taylor Swift",
                "Genres: Pop",
                "Active: 2004–present",
                "Taylor Alison Swift (born December 13, 1989) is an American singer-songwriter. Her narrative songwriting, which often takes inspiration from her personal life, has received widespread critical praise and media coverage.\n" +
                    "Born in West Reading, Pennsylvania, Swift relocated to Nashville, Tennessee, in 2004 to pursue a career in country music. She broke into the country music scene with her eponymous debut studio album in 2006, which featured the singles \"Teardrops on My Guitar\" and \"Our Song\". Swift rose to mainstream prominence with her second studio album, Fearless (2008), a country pop record with crossover appeal. Aided by the top-ten singles \"Love Story\" and \"You Belong with Me\", Fearless was certified Diamond by the Recording Industry Association of America (RIAA). Swift's third studio album, Speak Now (2010), blended country pop with elements of rock, featuring the top-ten singles \"Mine\" and \"Back to December\".\n"
            )
        )
        model.add(Singer(
                "https://media1.popsugar-assets.com/files/thumbor/jdrFs9YSK6wQfJf4QV63dIsfkFQ/fit-in/728xorig/filters:format_auto-!!-:strip_icc-!!-/2019/05/01/749/n/1922398/3c5e0f25372a5c72_GettyImages-960712430/i/Hot-Pictures-Shawn-Mendes.jpg",
                "Shawn Mendes",
                "Genres: Pop",
                "Active: 2013–present",
                "Shawn Peter Raul Mendes (born August 8, 1998) is a Canadian singer and songwriter. He gained a following in 2013, posting song covers on the video-sharing application Vine. The following year, he caught the attention of artist manager Andrew Gertler and Island Records A&R Ziggy Chareton, which led to him signing a deal with the record label. Mendes's self-titled debut EP was released in 2014, followed by his debut studio album Handwritten in 2015. Handwritten debuted atop the US Billboard 200, making Mendes one of five artists ever to debut at number one before the age of 18. The single \"Stitches\" reached number one in the UK and the top 10 in the US and Canada.\n" +
                        "His second studio album Illuminate (2016) also debuted at number one in the US, with its singles \"Treat You Better\" and \"There's Nothing Holdin' Me Back\" reaching the top 10 in several countries. His self-titled third studio album (2018) was supported by the lead single \"In My Blood\". The album's number one debut in the US made Mendes the third-youngest artist to achieve three number one albums. In 2019, he released the hit singles \"If I Can't Have You\" and \"Señorita\", with the latter peaking atop the US Billboard Hot 100. In December 2020, Mendes became the youngest male artist ever to top the Billboard 200 with four studio albums."
            )
        )

        model.add(Singer(
                "https://api.time.com/wp-content/uploads/2020/09/time-100-Selena-Gomez.jpg",
                "Selena Gomez",
                "Genres: Pop",
                "Active: 2002–present",
                "Selena Marie Gomez (/səˈliːnə ˈɡoʊˌmɛz/ sə-LEE-nə GOH-mez; born July 22, 1992) is an American singer, actress, and producer.[1] Born and raised in Texas, Gomez began her career by appearing on the children's television series Barney & Friends (2002–2004). In her teens, she rose to prominence for her role as Alex Russo in the Emmy Award–winning Disney Channel television series Wizards of Waverly Place (2007–2012).\n" +
                        "Alongside her television career, Gomez has starred in the films Another Cinderella Story (2008), Princess Protection Program (2009), Wizards of Waverly Place: The Movie (2009), Ramona and Beezus (2010), Monte Carlo (2011), Spring Breakers (2012), Getaway (2013), The Fundamentals of Caring (2016), The Dead Don't Die (2019), and A Rainy Day in New York (2019). She also voices the character of Mavis in the Hotel Transylvania film franchise (2012–present), and has served as executive producer for the Netflix television series 13 Reasons Why (2017–2020) and Living Undocumented (2019)."
            )
        )
        model.add(Singer(
                "https://www.hawtcelebs.com/wp-content/uploads/2019/09/camila-cabello-at-valentino-show-at-paris-fashion-week-09-29-2019-12.jpg",
                "Camila Cabello",
                "Genres: R&B",
                "Active: 2012–present",
                "Karla Camila Cabello Estrabao (Spanish: born March 3, 1997) is a Cuban-American singer and songwriter. She rose to prominence as a member of the girl group Fifth Harmony, formed on The X Factor USA in 2012, signing a joint record deal with Syco Music and Epic Records. While in Fifth Harmony, Cabello began to establish herself as a solo artist with the release of the collaborations \"I Know What You Did Last Summer\" with Shawn Mendes, and \"Bad Things\" with Machine Gun Kelly, the latter reaching number four on the US Billboard Hot 100. After leaving the group in late 2016, Cabello released several other collaborations, including \"Hey Ma\" with Pitbull and J Balvin for The Fate of the Furious soundtrack (2017), and her debut solo single \"Crying in the Club\".\n" +
                        "Cabello's debut studio album, Camila (2018), reached number one on the Billboard 200 chart. The Latin music-influenced pop album was critically well-received, and received a Platinum certification by the Recording Industry Association of America (RIAA). Its lead single \"Havana\" topped the charts in several countries including the US and UK, and follow-up single \"Never Be the Same\" reached the top ten in multiple countries. Cabello's 2019 duet with Mendes, \"Señorita\", became her second single to top the Billboard Hot 100. Her second studio album, Romance (2019), peaked at number three on the Billboard 200 chart and number one in Canada. Cabello is set to star in an upcoming film adaptation of Cinderella (2021), for Sony Pictures."
            )
        )
        model.add(Singer(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/The_Weeknd_(253662129).jpeg/1200px-The_Weeknd_(253662129).jpeg",
                "The Weeknd",
                "Genres: R&B",
                "Active: 2010–present",
                "Abel Makkonen Tesfaye (born February 16, 1990), known professionally as the Weeknd, is a Canadian singer, songwriter, and record producer.[1] Noted for his versatility in vocal style,[2] music production, and eccentric presentation,[3] the Weeknd is often cited as an influence to contemporary music, as well as by other artists.\n" +
                    "The Weeknd began his recording career in 2010, anonymously uploading several songs to YouTube. A year later, the Weeknd released the mixtapes House of Balloons, Thursday, and Echoes of Silence, and quickly earned a following and critical recognition from several mainstream publications due to his dark style of R&B and the mystique surrounding his identity. In 2012, he signed with Republic Records and re-released the mixtapes in the compilation album Trilogy (2012). His debut studio album, Kiss Land, was released in 2013. He followed it with Beauty Behind the Madness (2015), which was among the best-selling albums of 2015. With the Billboard Hot 100 number-one singles \"Can't Feel My Face\" and \"The Hills\", Beauty Behind the Madness won Best Urban Contemporary Album and was nominated for Album of the Year at the 2016 Grammy Awards."
            )
        )
        model.add(Singer(
                "https://www.fashiongonerogue.com/wp-content/uploads/2020/09/Lady-Gaga-Valentino-Voce-Viva-Fragrance-Campaign02.jpg",
                "Lady Gaga",
                "Genres: Pop",
                "Active: 2001–present",
                "Stefani Joanne Angelina Germanotta (born March 28, 1986), known professionally as Lady Gaga, is an American singer, songwriter, and actress. She is known for her image reinventions and musical versatility. Gaga began performing as a teenager, singing at open mic nights and acting in school plays. She studied at Collaborative Arts Project 21, through New York University's Tisch School of the Arts, before dropping out to pursue a career in music. After Def Jam Recordings canceled her contract, she worked as a songwriter for Sony/ATV Music Publishing, where she signed a joint deal with Interscope Records and Akon's label, KonLive Distribution, in 2007. Gaga rose to prominence the following year with her debut studio album, The Fame, and its chart-topping singles \"Just Dance\" and \"Poker Face\". The album was later reissued to include the EP, The Fame Monster (2009), which yielded the successful singles \"Bad Romance\", \"Telephone\", and \"Alejandro\".\n" +
                        "Gaga's five succeeding studio albums all debuted atop the US Billboard 200. Her second full-length album, Born This Way (2011), explored electronic rock and techno-pop and sold more than one million copies in its first week. Its title track became the fastest-selling song on the iTunes Store, with over one million downloads in less than one week. Following her EDM-influenced third album, Artpop (2013) and its lead single \"Applause\", Gaga released the jazz album Cheek to Cheek (2014) with Tony Bennett and the country pop and soft rock-influenced album Joanne (2016). She also ventured into acting, playing leading roles in the miniseries American Horror Story: Hotel (2015–2016), for which she received a Golden Globe Award for Best Actress, and the critically acclaimed musical drama film A Star Is Born (2018). Her contributions to the latter's soundtrack, which spawned the chart-topping single \"Shallow\", made her the first woman to win an Academy, Grammy, BAFTA, and Golden Globe Award in one year. Gaga returned to her dance-pop roots with her sixth studio album, Chromatica (2020), which yielded the number-one single \"Rain on Me\"."
            )
        )

        val adapter = SingerAdapter(model)
        Recycle.adapter = adapter

        adapter.setOnItemClickCallback(object : SingerAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Singer) {

                val detail = Intent(this@MainActivity, OnClickActivity::class.java)
                detail.putExtra(OnClickActivity.EXTRA_IMAGES, data.images)
                detail.putExtra(OnClickActivity.EXTRA_NAMA, data.singer)
                //detail.putExtra(OnClickActivity.EXTRA_GENRE, data.genre)
                //detail.putExtra(OnClickActivity.EXTRA_ACTIVE, data.active)
                detail.putExtra(OnClickActivity.EXTRA_DESC, data.desc)
                startActivity(detail)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.item_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_about -> {
                val aboutMe = Intent(this@MainActivity, AboutActivity::class.java)
                //aboutMe.putExtra(AboutActivity.EXTRA_IMAGE, R.drawable.myphoto)
                startActivity(aboutMe)
                return true
            }
            else -> return true
        }
    }

}