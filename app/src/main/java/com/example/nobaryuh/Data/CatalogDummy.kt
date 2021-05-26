package com.example.nobaryuh.Data

import com.example.nobaryuh.R

object CatalogDummy {
    fun catalogueMovies(): List<Cataloque> {
        val movies = ArrayList<Cataloque>()

        movies.add(
            Cataloque(
                "movie01",
                R.drawable.poster_master_z,
                "Master Z: Ip Man Legacy",
                "26/12/2018 (TW)",
                "Action, Biography, Drama ",
                "1h 47m",
                "71%",
                "Following his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to expats. But it's not long before the mix of foreigners, money, and triad leaders draw him once again to the fight.",
                "Peace Yuen Woo-Ping"
            )
        )
        movies.add(
            Cataloque(
                "movie02",
                R.drawable.poster_overlord,
                "Overlord ",
                "09/11/2018 (US)",
                "Horror, Crime, Fiction Stories",
                "1h 50m",
                "67%",
                "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.",
                "Julius Avery"
            )
        )
        movies.add(
            Cataloque(
                "movie03",
                R.drawable.poster_aquaman,
                "Aquaman",
                "21/12/2018 (US)",
                "Action, Adventure, Fantasy",
                "2h 24m",
                "69%",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                "James Wan"
            )
        )
        movies.add(
            Cataloque(
                "movie04",
                R.drawable.poster_cold_persuit,
                "Cold Persuit",
                "08/02/2019 (US)",
                "Action, Crime, Thriller",
                "1h 59m",
                "56%",
                "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                "Hans Petter Moland",
            )
        )
        movies.add(
            Cataloque(
                "movie05",
                R.drawable.poster_robin_hood,
                "Robin Hood",
                "21/11/2018 (US)",
                "Adventure, Action, Exciting Story",
                "1h 56m",
                "60%",
                "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
                "Otto Bathurst"
            )
        )
        movies.add(
            Cataloque(
                "movie06",
                R.drawable.poster_crimes_full,
                "Fantastic Beasts: The Crimes of Grindelwald",
                "16/11/2018 (US)",
                "Adventure, Fantasy, Drama",
                "2h 14m",
                "69%",
                "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                "David Yates"
            )
        )
        movies.add(
            Cataloque(
                "movie07",
                R.drawable.poster_spiderman_full,
                "Spider-Man: Into the Spider-Verse",
                "12/14/2018 (US)",
                "Action, Adventure, Animation, Science Fiction, Comedy",
                "1h 57m",
                "84%",
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson Kingpin Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                "Peter Ramsey",
            )
        )
        movies.add(
            Cataloque(
                "movie08",
                R.drawable.poster_t34,
                "T-34",
                "01/01/2019 (RU)",
                "War, Action, Drama, History",
                "2h 19m",
                "69%",
                "In 1944, a courageous group of Russian soldiers managed to escape from German captivity in a half-destroyed legendary T-34 tank. Those were the times of unforgettable bravery, fierce fighting, unbreakable love, and legendary miracles.",
                "Alexey Sidorov"
            )
        )
        movies.add(
            Cataloque(
                "movie09",
                R.drawable.poster_infinity_war_full,
                "Avengers: Infinity War",
                "04/27/2018 (US)",
                "Adventure, Action, Science Fiction",
                "2h 29m",
                "83%",
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                "Anthony Russo",
            )
        )
        movies.add(
            Cataloque(
                "movie10",
                R.drawable.poster_mortal_engines_full,
                "Mortal Engines",
                "12/14/2018 (US)",
                "Adventure, Science Fiction",
                "2h 9m",
                "61%",
                "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                "Christian Rivers"
            )
        )
        return movies
    }

    fun catalogueTvShows(): List<Cataloque> {
        val tvShows = ArrayList<Cataloque>()

        tvShows.add(
            Cataloque(
                "tvShows01",
                R.drawable.tvshow_arrow,
                "Arrow",
                "2012",
                "Crime, Drama, Mystery, Action & Adventure",
                "42m",
                "66%",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "Greg Berlanti, Marc Guggenheim, Andrew Kreisberg"
            )
        )
        tvShows.add(
            Cataloque(
                "tvShows02",
                R.drawable.tvshow_dragon_ball,
                "Super Dragon Ball Heroes",
                "2018",
                "Animation, Action & Adventure, Sci-Fi & Fantasy",
                "30m",
                "75%",
                "Trunks returns from the future to train with Goku and Vegeta. However, it disappears without warning. Then the mysterious Fu bursts in, telling them that Trunks has been imprisoned in the Prison Planet, a mysterious complex in an unknown place in the universes. The group seeks the dragon balls to free Trunks, but an endless battle awaits them! Will Goku and the others rescue Trunks and escape the Prison Planet?",
                "Akira Toriyama"
            )
        )
        tvShows.add(
            Cataloque(
                "tvShows03",
                R.drawable.tvshow_flash,
                "The Flash",
                "2014",
                "Drama, Sci-Fi & Fantasy",
                "44m",
                "77%",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "Greg Berlanti, Geoff Johns, Andrew Kreisberg"
            )
        )
        tvShows.add(
            Cataloque(
                "tvShows04",
                R.drawable.tvshow_gotham,
                "Gotham",
                "2014",
                "Drama, Crime, Sci-Fi & Fantasy",
                "43m",
                "75%",
                "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                "Bruno Heller"
            )
        )
        tvShows.add(
            Cataloque(
                "tvShows05",
                R.drawable.tvshow_iron_fist,
                "Marvel's Iron Fist ",
                "2017",
                "Action & Adventure, Drama, Sci-Fi & Fantasy",
                "55m",
                "66%",
                "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.",
                "Scott Buck"
            )
        )
        tvShows.add(
            Cataloque(
                "tvShows06",
                R.drawable.tvshow_naruto_shipudden,
                "Naruto Shippūden",
                "2007",
                "Animation, Action & Adventure, Sci-Fi & Fantasy",
                "25m",
                "86%",
                "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
                "Masashi Kishimoto"
            )
        )
        tvShows.add(
            Cataloque(
                "tvShows07",
                R.drawable.tvshow_supergirl,
                "Supergirl",
                "2015",
                "Drama, Sci-Fi & Fantasy, Action & Adventure",
                "42m",
                "72%",
                "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
                "Greg Berlanti, Ali Adler, Andrew Kreisberg"
            )
        )
        tvShows.add(
            Cataloque(
                "tvShows08",
                R.drawable.tvshow_supernatural,
                "Supernatural",
                "2005",
                "Drama, Mystery, Sci-Fi & Fantasy",
                "45m",
                "82%",
                "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
                "Eric Kripke"
            )
        )
        tvShows.add(
            Cataloque(
                "tvShows09",
                R.drawable.tvshow_the_walking_dead,
                "The Walking Dead",
                "2010",
                "Action & Adventure, Drama, Sci-Fi & Fantasy",
                "42m",
                "81%",
                "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                "Frank Darabont"
            )
        )
        tvShows.add(
            Cataloque(
                "tvShows10",
                R.drawable.tvshow_fairytail,
                "Fairy Tail",
                "2009",
                "Action & Adventure, Animation, Comedy, Sci-Fi & Fantasy",
                "25m",
                "78%",
                "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
                "Hiro Mashima"
            )
        )
        return tvShows
    }

}