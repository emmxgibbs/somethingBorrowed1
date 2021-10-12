package com.Book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

//need to convert string to text rather than varchar

@Configuration
public class BookConfig {
    @Bean
    CommandLineRunner commandLineRunner(BookRepository bookRepository){
        return args -> {
            Book book1 = new Book(
                    "Harry Potter and the Philosopher's Stone",
                    "J.K.Rowling",
                    "Harry Potter has never even heard of Hogwarts when the letters start dropping on the doormat at number four, Privet Drive. Addressed in green ink on yellowish parchment with a purple seal, they are swiftly confiscated by his grisly aunt and uncle. Then, on Harry's eleventh birthday, a great beetle-eyed giant of a man called Rubeus Hagrid bursts in with some astonishing news: Harry Potter is a wizard, and he has a place at Hogwarts School of Witchcraft and Wizardry. The magic starts here!\n" +
                            "These editions of the classic and internationally bestselling Harry Potter series feature thrilling jacket artwork by award-winning illustrator Jonny Duddle. They are the perfect starting point for anyone who's ready to lose themselves in the greatest children's story of all time.",
                    "978-1-40-885565-2",
                    "Bloomsbury Children's Books",
                    1997,
                    5.0,
                    "https://www.waterstones.com/book/harry-potter-and-the-philosophers-stone/j-k-rowling/9781408855652",
                    "https://cdn.waterstones.com/bookjackets/large/9781/4088/9781408855652.jpg",
                    true,
                    "childrens"
            );
            Book book2 = new Book(
                    "Harry Potter and the Chamber of Secrets",
                    "J.K.Rowling",
                    "Harry Potter's summer has included the worst birthday ever, doomy warnings from a house-elf called Dobby, and rescue from the Dursleys by his friend Ron Weasley in a magical flying car! Back at Hogwarts School of Witchcraft and Wizardry for his second year, Harry hears strange whispers echo through empty corridors - and then the attacks start. Students are found as though turned to stone . Dobby's sinister predictions seem to be coming true.",
                    "978-1-40-885566-9",
                    "Bloomsbury Children's Books",
                    1998,
                    4.0,
                    "https://www.waterstones.com/book/harry-potter-and-the-chamber-of-secrets/j-k-rowling/9781408855669",
                    "https://cdn.waterstones.com/bookjackets/large/9781/4088/9781408855669.jpg",
                    false,
                    "childrens"
            );
            Book book3 = new Book(
                    "The Fellowship of the Ring - The Lord of the Rings",
                    "J.R.R.Tolkien",
                    "Sauron, the Dark Lord, has gathered to him all the Rings of Power - the means by which he intends to rule Middle-earth. All he lacks in his plans for dominion is the One Ring - the ring that rules them all - which has fallen into the hands of the hobbit, Bilbo Baggins.\n" +
                            "\n" +
                            "In a sleepy village in the Shire, young Frodo Baggins finds himself faced with an immense task, as his elderly cousin Bilbo entrusts the Ring to his care. Frodo must leave his home and make a perilous journey across Middle-earth to the Cracks of Doom, there to destroy the Ring and foil the Dark Lord in his evil purpose.",
                    "978-0-26-110357-3",
                    "HarperCollins",
                    1997,
                    4.7,
                    "https://www.waterstones.com/book/the-fellowship-of-the-ring/j-r-r-tolkien/9780261103573",
                    "https://cdn.waterstones.com/bookjackets/large/9780/2611/9780261103573.jpg",
                    false,
                    "fantasy"
            );
            Book book4 = new Book(
                    "Rebecca",
                    "Daphne Du Maurier",
                    "With these words a reader is swept up into a world of secrets and lies; one of the most passionate, psychologically twisting and complex stories of all-time. Working as a lady's companion, the orphaned heroine of Rebecca learns her place. Life begins to look very bleak until, on a trip to the South of France, she meets Maxim de Winter, a handsome widower whose sudden proposal of marriage takes her by surprise. Whisked from glamorous Monte Carlo to his brooding estate, Manderley, on the Cornish Coast, the new Mrs de Winter finds Max a changed man. And the memory of his dead wife Rebecca is forever kept alive by the forbidding Mrs Danvers . . .",
                    "978-1-84-408038-0",
                    "Little, Brown Book Group",
                    2003,
                    4.2,
                    "https://www.waterstones.com/book/rebecca/daphne-du-maurier/sally-beauman/9781844080380",
                    "https://cdn.waterstones.com/bookjackets/large/9781/8440/9781844080380.jpg",
                    true,
                    "classic"
            );
            Book book5 = new Book(
                    "Pride and Prejudice",
                    "Jane Austen",
                    "With its 'light and bright and sparkling' dialogue, its romantic denouement and its lively heroine, Pride and Prejudice is Jane Austen's most perennially popular novel. The love story of Elizabeth Bennet and Fitzwilliam Darcy, who misjudge, then challenge and change each other, is also a novel about the search for happiness and self- knowledge in a world of strict social rules, where a woman must marry well to survive.",
                    "978-0-14-143951-8",
                    "Penguin Books Ltd",
                    2003,
                    3.5,
                    "https://www.waterstones.com/book/pride-and-prejudice/jane-austen/vivien-jones/9780141439518",
                    "https://cdn.waterstones.com/bookjackets/large/9780/1414/9780141439518.jpg",
                    false,
                    "classic"
            );
            Book book6 = new Book(
                    "The Thursday Murder Club",
                    "Richard Osman",
                    "In a peaceful retirement village, four unlikely friends meet up once a week to investigate unsolved murders.\n" +
                            "\n" +
                            "But when a brutal killing takes place on their very doorstep, the Thursday Murder Club find themselves in the middle of their first live case.\n" +
                            "\n" +
                            "Elizabeth, Joyce, Ibrahim and Ron might be pushing eighty but they still have a few tricks up their sleeves.\n" +
                            "\n" +
                            "Can our unorthodox but brilliant gang catch the killer before it's too late?",
                    "978-0-24-198826-8",
                    "Penguin Books Ltd",
                    2021,
                    2.5,
                    "https://www.waterstones.com/book/the-thursday-murder-club/richard-osman/9780241988268",
                    "https://cdn.waterstones.com/bookjackets/large/9780/2419/9780241988268.jpg",
                    true,
                    "crime"
            );
            Book book7 = new Book(
                    "A Good Girl's Guide to Murder",
                    "Holly Jackson",
                    "The case is closed. Five years ago, schoolgirl Andie Bell was murdered by Sal Singh. The police know he did it. Everyone in town knows he did it. But having grown up in the same small town that was consumed by the crime, Pippa Fitz-Amobi isn't so sure. When she chooses the case as the topic for her final project, she starts to uncover secrets that someone in town desperately wants to stay hidden. And if the real killer is still out there, how far will they go to keep Pip from the truth . . .",
                    "978-1-40-529318-1",
                    "HarperCollins",
                    2019,
                    2.9,
                    "https://www.waterstones.com/book/a-good-girls-guide-to-murder/holly-jackson/9781405293181",
                    "https://cdn.waterstones.com/bookjackets/large/9781/4052/9781405293181.jpg",
                    true,
                    "crime"
            );
            Book book8 = new Book(
                    "The Priory of the Orange Tree",
                    "Samantha Shannon",
                    "A world divided. A queendom without an heir. An ancient enemy awakens.\n" +
                            "\n" +
                            "The House of Berethnet has ruled Inys for a thousand years. Still unwed, Queen Sabran the Ninth must conceive a daughter to protect her realm from destruction - but assassins are getting closer to her door. Ead Duryan is an outsider at court. Though she has risen to the position of lady-in-waiting, she is loyal to a hidden society of mages. Ead keeps a watchful eye on Sabran, secretly protecting her with forbidden magic. Across the dark sea, Tane has trained to be a dragonrider since she was a child, but is forced to make a choice that could see her life unravel. Meanwhile, the divided East and West refuse to parley, and forces of chaos are rising from their sleep.",
                    "978-1-40-888335-8",
                    "Bloomsbury Publishing PLC",
                    2020,
                    4.0,
                    "https://www.waterstones.com/book/the-priory-of-the-orange-tree/samantha-shannon/9781408883358",
                    "https://cdn.waterstones.com/bookjackets/large/9781/4088/9781408883358.jpg",
                    false,
                    "fantasy"
            );
            Book book9 = new Book(
                    "Heartstopper Volume One",
                    "Alice Oseman",
                    "Boy meets boy. Boys become friends. Boys fall in love. An LGBTQ+ graphic novel about life, love, and everything that happens in between - perfect for fans of The Art of Being Normal and Love, Simon.\n" +
                            "\n" +
                            "Charlie and Nick are at the same school, but they've never met ... until one day when they're made to sit together. They quickly become friends, and soon Charlie is falling hard for Nick, even though he doesn't think he has a chance.\n" +
                            "\n" +
                            "But love works in surprising ways, and Nick is more interested in Charlie than either of them realised.\n" +
                            "\n" +
                            "Heartstopper is about love, friendship, loyalty and mental illness. It encompasses all the small stories of Nick and Charlie's lives that together make up something larger, which speaks to all of us.\n" +
                            "\n" +
                            "This is the first volume of Heartstopper, with more to come.",
                    "978-1-44-495138-7",
                    "Hachette Children's Group",
                    2019,
                    4.8,
                    "https://www.waterstones.com/book/heartstopper-volume-one/alice-oseman/9781444951387",
                    "https://cdn.waterstones.com/bookjackets/large/9781/4449/9781444951387.jpg",
                    false,
                    "graphic novels"
            );
            Book book10 = new Book(
                    "The Seven Deaths of Evelyn Hardcastle",
                    "Stuart Turton",
                    "It is meant to be a celebration but it ends in tragedy. As fireworks explode overhead, Evelyn Hardcastle, the young and beautiful daughter of the house, is killed. But Evelyn will not die just once.\n" +
                            "\n" +
                            "Until Aiden - one of the guests summoned to Blackheath for the party - can solve her murder, the day will repeat itself, over and over again. Every time ending with the fateful pistol shot.\n" +
                            "\n" +
                            "The only way to break this cycle is to identify the killer. But each time the day begins again, Aiden wakes in the body of a different guest. And someone is determined to prevent him ever escaping Blackheath...\n" +
                            "\n" +
                            "‘Original’, ‘unique’, ‘fiendishly clever’ and ‘remarkable’: critics have been knocked for six by Stuart Turton’s mind-blowing take on the country house thriller. The setup – a murder, a set of assembled guests – seems familiar, but the execution is anything but. Simply unmissable.",
                    "978-1-40-888951-0",
                    "Bloomsbury Publishing PLC",
                    2018,
                    3.7,
                    "https://www.waterstones.com/book/the-seven-deaths-of-evelyn-hardcastle/stuart-turton/9781408889510",
                    "https://cdn.waterstones.com/bookjackets/large/9781/4088/9781408889510.jpg",
                    false,
                    "historical crime"
            );
            Book book11 = new Book(
                    "People of Abandoned Character",
                    "Clare Whitfield",
                    "What if you thought your husband was Jack the Ripper?\n" +
                            "\n" +
                            "London, 1888. Susannah rushes into marriage to a young and wealthy surgeon. After a passionate honeymoon, she returns home with her new husband wrapped around her little finger. But then everything changes. His behaviour becomes increasingly volatile and violent. He stays out all night, returning home bloodied and full of secrets.\n" +
                            "\n" +
                            "Lonely and frustrated, Susannah starts following the gruesome reports of a spate of murders in Whitechapel. But as the killings continue, her mind takes her down the darkest path imaginable. Every time he stays out late, another victim is found dead. Is it coincidence? Or is her husband the man the papers call Jack the Ripper?",
                    "978-1-83-893275-6",
                    "Head of Zeus",
                    2021,
                    3.5,
                    "https://www.waterstones.com/book/people-of-abandoned-character/clare-whitfield/9781838932756",
                    "https://cdn.waterstones.com/override/v1/large/9781/8389/9781838932756.jpg",
                    false,
                    "historical crime"
            );
            Book book12 = new Book(
                    "The Song of Achilles",
                    "Madeline Miller",
                    "Greece in the age of heroes. Patroclus, an awkward young prince, has been exiled to the court of King Peleus and his perfect son Achilles.\n" +
                            "\n" +
                            "Despite their differences, Achilles befriends the shamed prince, and as they grow into young men skilled in the arts of war and medicine, their bond blossoms into something deeper - despite the displeasure of Achilles's mother Thetis, a cruel sea goddess.\n" +
                            "\n" +
                            "But when word comes that Helen of Sparta has been kidnapped, Achilles must go to war in distant Troy and fulfill his destiny.\n" +
                            "\n" +
                            "Torn between love and fear for his friend, Patroclus goes with him, little knowing that the years that follow will test everything they hold dear.",
                    "978-1-40-889138-4",
                    "Bloomsbury Publishing PLC",
                    2017,
                    3.2,
                    "https://www.waterstones.com/book/the-song-of-achilles/madeline-miller/9781408891384",
                    "https://cdn.waterstones.com/override/v1/large/9781/4088/9781408891384.jpg",
                    true,
                    "historical fiction"
            );
            Book book13 = new Book(
                    "The Wolf Den",
                    "Elodie Harper",
                    "Sold by her mother. Enslaved in Pompeii's brothel. Determined to survive. Her name is Amara. Welcome to the Wolf Den...\n" +
                            "\n" +
                            "Amara was once a beloved daughter, until her father's death plunged her family into penury. Now she is a slave in Pompeii's infamous brothel, owned by a man she despises. Sharp, clever and resourceful, Amara is forced to hide her talents. For now her only value lies in the desire she can stir in others.\n" +
                            "\n" +
                            "But Amara's spirit is far from broken. By day, she walks the streets with the Wolf Den's other women, finding comfort in the laughter and dreams they share. For the streets of Pompeii are alive with opportunity. Out here, even the lowest slave can secure a reversal in fortune. Amara has learnt that everything in this city has its price. But how much is her freedom going to cost her?",
                    "978-1-83-893355-5",
                    "Head of Zeus",
                    2021,
                    4.6,
                    "https://www.waterstones.com/book/the-wolf-den/elodie-harper/9781838933555",
                    "https://cdn.waterstones.com/bookjackets/large/9781/8389/9781838933555.jpg",
                    true,
                    "historical fiction"
            );
            Book book14 = new Book(
                    "Necronomicon",
                    "H.P.Lovecraft",
                    "H.P. Lovecraft's tales of the tentacled Elder God Cthulhu and his pantheon of alien deities were initially written for the pulp magazines of the 1920s and '30s. These astonishing tales blend elements of horror, science fiction and cosmic terror that are as powerful today as they were when they were first published.\n" +
                            "\n" +
                            "This handsome leatherbound tome collects together the very best of Lovecraft's tales of terror, including the complete Cthulhu Mythos cycle, just the way they were originally published. It will introduce a whole new generation of readers to Lovecraft's fiction, as well as being a must-buy for those fans who want all his work in a single, definitive, highly attractive volume.",
                    "978-0-57-508156-7",
                    "Orion Publishing Co",
                    2008,
                    2.2,
                    "https://www.waterstones.com/book/necronomicon/h-p-lovecraft/9780575081567",
                    "https://cdn.waterstones.com/bookjackets/large/9780/5750/9780575081567.jpg",
                    false,
                    "horror"
            );
            Book book15 = new Book(
                    "The Shining",
                    "Stephen King",
                    "Danny is only five years old, but in the words of old Mr Hallorann he is a 'shiner', aglow with psychic voltage. When his father becomes caretaker of the Overlook Hotel, Danny's visions grow out of control.\n" +
                            "\n" +
                            "As winter closes in and blizzards cut them off, the hotel seems to develop a life of its own. It is meant to be empty. So who is the lady in Room 217 and who are the masked guests going up and down in the elevator? And why do the hedges shaped like animals seem so alive?\n" +
                            "\n" +
                            "Somewhere, somehow, there is an evil force in the hotel - and that, too, is beginning to shine...",
                    "978-1-44-472072-3",
                    "Hodder & Stoughton",
                    2007,
                    4.5,
                    "https://www.waterstones.com/book/the-shining/stephen-king/9781444720723",
                    "https://cdn.waterstones.com/bookjackets/large/9781/4447/9781444720723.jpg",
                    false,
                    "horror"
            );
            Book book16 = new Book(
                    "Chainsaw Man, Vol. 1 - Chainsaw Man 1",
                    "Tatsuki Fujimoto",
                    "Denji was a small-time devil hunter just trying to survive in a harsh world. After being killed on a job, he is revived by his pet devil-dog Pochita and becomes something new and dangerous-Chainsaw Man!\n" +
                            "\n" +
                            "Denji's a poor young man who'll do anything for money, even hunting down devils with his pet devil-dog Pochita. He's a simple man with simple dreams, drowning under a mountain of debt. But his sad life gets turned upside down one day when he's betrayed by someone he trusts. Now with the power of a devil inside him, Denji's become a whole new man-Chainsaw Man!\n",
                    "978-1-97-470993-9",
                    "Viz Media, Subs. of Shogakukan Inc",
                    2020,
                    4.0,
                    "https://www.waterstones.com/book/chainsaw-man-vol-1/tatsuki-fujimoto/9781974709939",
                    "https://cdn.waterstones.com/bookjackets/large/9781/9747/9781974709939.jpg",
                    false,
                    "manga"
            );
            Book book17 = new Book(
                    "Pandora's Jar: Women in the Greek Myths ",
                    "Natalie Haynes",
                    "The Greek myths are among the world's most important cultural building blocks and they have been retold many times, but rarely do they focus on the remarkable women at the heart of these ancient stories.\n" +
                            "\n" +
                            "Stories of gods and monsters are the mainstay of epic poetry and Greek tragedy, from Homer to Aeschylus, Sophocles and Euripides, from the Trojan War to Jason and the Argonauts. And still, today, a wealth of novels, plays and films draw their inspiration from stories first told almost three thousand years ago. But modern tellers of Greek myth have usually been men, and have routinely shown little interest in telling women's stories. And when they do, those women are often painted as monstrous, vengeful or just plain evil. But Pandora - the first woman, who according to legend unloosed chaos upon the world - was not a villain, and even Medea and Phaedra have more nuanced stories than generations of retellings might indicate.",
                    "978-1-50-987314-2",
                    "Pan Macmillan",
                    2021,
                    2.9,
                    "https://www.waterstones.com/book/pandoras-jar/natalie-haynes/9781509873142",
                    "https://cdn.waterstones.com/bookjackets/large/9781/5098/9781509873142.jpg",
                    true,
                    "poetry, drama & criticism"
            );

            Book book18 = new Book(
                    "Milk and Honey",
                    "Rupi Kaur",
                    "this is the journey of\n" +
                            "\n" +
                            "surviving through poetry\n" +
                            "\n" +
                            "this is the blood sweat tears\n" +
                            "\n" +
                            "of twenty-one years\n" +
                            "\n" +
                            "this is my heart\n" +
                            "\n" +
                            "in your hands\n" +
                            "\n" +
                            "this is\n" +
                            "\n" +
                            "the hurting\n" +
                            "\n" +
                            "the loving\n" +
                            "\n" +
                            "the breaking\n" +
                            "\n" +
                            "the healing,",
                    "978-1-44-947425-6",
                    "Andrews McMeel Publishing",
                    2015,
                    3.7,
                    "https://www.waterstones.com/book/milk-and-honey/rupi-kaur/9781449474256",
                    "https://cdn.waterstones.com/bookjackets/large/9781/4494/9781449474256.jpg",
                    false,
                    "poetry, drama & criticism"
            );
            Book book19 = new Book(
                    "It Ends With Us",
                    "Colleen Hoover",
                    "Sometimes the one who loves you is the one who hurts you the most.\n" +
                            "\n" +
                            "Lily hasn't always had it easy, but that's never stopped her from working hard for the life she wants. She's come a long way from the small town in Maine where she grew up - she graduated from college, moved to Boston, and started her own business. So when she feels a spark with a gorgeous neurosurgeon named Ryle Kincaid, everything in Lily's life suddenly seems almost too good to be true.\n" +
                            "\n" +
                            "Ryle is assertive, stubborn, maybe even a little arrogant. He's also sensitive, brilliant, and has a total soft spot for Lily, but Ryle's complete aversion to relationships is disturbing. Even as Lily finds herself becoming the exception to his \"no dating\" rule, she can't help but wonder what made him that way in the first place.\n" +
                            "\n" +
                            "As questions about her new relationship overwhelm her, so do thoughts of Atlas Corrigan - her first love and a link to the past she left behind. He was her kindred spirit, her protector. When Atlas suddenly reappears, everything Lily has built with Ryle is threatened.",
                    "978-1-47-115626-7",
                    "Simon & Schuster Ltd",
                    2016,
                    4.9,
                    "https://www.waterstones.com/book/it-ends-with-us/colleen-hoover/9781471156267",
                    "https://cdn.waterstones.com/bookjackets/large/9781/4711/9781471156267.jpg",
                    false,
                    "romance"
            );
            Book book20 = new Book(
                    "The Seven Husbands of Evelyn Hugo",
                    "Taylor Jenkins Reid",
                    "Aging and reclusive Hollywood movie icon Evelyn Hugo is finally ready to tell the truth about her glamorous and scandalous life. But when she chooses unknown magazine reporter Monique Grant for the job, no one is more astounded than Monique herself. Why her? Why now?\n" +
                            "\n" +
                            "Monique is not exactly on top of the world. Her husband has left her, and her professional life is going nowhere. Regardless of why Evelyn has selected her to write her biography, Monique is determined to use this opportunity to jumpstart her career.\n" +
                            "\n" +
                            "Summoned to Evelyn's luxurious apartment, Monique listens in fascination as the actress tells her story. From making her way to Los Angeles in the 1950s to her decision to leave show business in the '80s, and, of course, the seven husbands along the way, Evelyn unspools a tale of ruthless ambition, unexpected friendship, and a great forbidden love. Monique begins to feel a very real connection to the legendary star, but as Evelyn's story near its conclusion, it becomes clear that her life intersects with Monique's own in tragic and irreversible ways.\n" +
                            "\n" +
                            "A mesmerizing journey through the splendor of old Hollywood into the harsh realities of the present day as two women struggle with what it means-and what it costs-to face the truth.",
                    "978-1-98-214766-2",
                    "Simon & Schuster Ltd",
                    2020,
                    4.0,
                    "https://www.waterstones.com/book/the-seven-husbands-of-evelyn-hugo/taylor-jenkins-reid/9781982147662",
                    "https://cdn.waterstones.com/bookjackets/large/9781/9821/9781982147662.jpg",
                    false,
                    "romance"
            );
            Book book21 = new Book(
                    "Dune",
                    "Frank Herbert",
                    "Melange, or 'spice', is the most valuable - and rarest - element in the universe; a drug that does everything from increasing a person's life-span to making interstellar travel possible. And it can only be found on a single planet: the inhospitable desert world Arrakis.\n" +
                            "\n" +
                            "Whoever controls Arrakis controls the spice. And whoever controls the spice controls the universe.\n" +
                            "\n" +
                            "When the Emperor transfers stewardship of Arrakis from the noble House Harkonnen to House Atreides, the Harkonnens fight back, murdering Duke Leto Atreides. Paul, his son, and Lady Jessica, his concubine, flee into the desert. On the point of death, they are rescued by a band for Fremen, the native people of Arrakis, who control Arrakis' second great resource: the giant worms that burrow beneath the burning desert sands.\n" +
                            "\n" +
                            "In order to avenge his father and retake Arrakis from the Harkonnens, Paul must earn the trust of the Fremen and lead a tiny army against the innumerable forces aligned against them. And his journey will change the universe.",
                    "978-0-34-096019-6",
                    "Hodder & Stoughton",
                    2015,
                    3.8,
                    "https://www.waterstones.com/book/dune/frank-herbert/9780340960196",
                    "https://cdn.waterstones.com/override/v1/large/9780/3409/9780340960196.jpg",
                    true,
                    "science fiction"
            );
            Book book22 = new Book(
                    "The Hitchhiker's Guide to the Galaxy",
                    "Douglas Adams",
                    "It's an ordinary Thursday lunchtime for Arthur Dent until his house gets demolished. The Earth follows shortly afterwards to make way for a new hyperspace express route, and his best friend has just announced that he's an alien. At this moment, they're hurtling through space with nothing but their towels and an innocuous-looking book inscribed, in large friendly letters, with the words: DON'T PANIC.\n" +
                            "\n" +
                            "The weekend has only just begun . . .",
                    "978-1-52-903452-3",
                    "Pan Macmillan",
                    2020,
                    4.5,
                    "https://www.waterstones.com/book/the-hitchhikers-guide-to-the-galaxy/douglas-adams/9781529034523",
                    "https://cdn.waterstones.com/bookjackets/large/9781/5290/9781529034523.jpg",
                    true,
                    "science fiction"
            );
            Book book23 = new Book(
                    "Foundation",
                    "Isaac Asimov",
                    "The Galactic Empire has prospered for twelve thousand years. Nobody suspects that the heart of the thriving Empire is rotten, until psychohistorian Hari Seldon uses his new science to foresee its terrible fate.\n" +
                            "\n" +
                            "Exiled to the desolate planet Terminus, Seldon establishes a colony of the greatest minds in the Empire, a Foundation which holds the key to changing the fate of the galaxy.\n" +
                            "\n" +
                            "However, the death throes of the Empire breed hostile new enemies, and the young Foundation's fate will be threatened first.\n" +
                            "\n",
                    "978-0-00-811749-8",
                    "HarperCollins Publishers",
                    2016,
                    3.7,
                    "https://www.waterstones.com/book/foundation/isaac-asimov/9780008117498",
                    "https://cdn.waterstones.com/bookjackets/large/9780/0081/9780008117498.jpg",
                    false,
                    "science fiction"
            );
            Book book24 = new Book(
                    "Where the Crawdads Sing",
                    "Delia Owens",
                    "For years, rumors of the \"Marsh Girl\" have haunted Barkley Cove, a quiet town on the North Carolina coast. So in late 1969, when handsome Chase Andrews is found dead, the locals immediately suspect Kya Clark, the so-called Marsh Girl. But Kya is not what they say.\n" +
                            "\n" +
                            "Sensitive and intelligent, she has survived for years alone in the marsh that she calls home, finding friends in the gulls and lessons in the sand. Then the time comes when she yearns to be touched and loved. When two young men from town become intrigued by her wild beauty, Kya opens herself to a new life - until the unthinkable happens.",
                    "978-1-47-215466-8",
                    "Little, Brown Book Group",
                    2019,
                    4.4,
                    "https://www.waterstones.com/book/where-the-crawdads-sing/delia-owens/9781472154668",
                    "https://cdn.waterstones.com/bookjackets/large/9781/4721/9781472154668.jpg",
                    false,
                    "thriller"
            );
            Book book25 = new Book(
                    "The Survivors",
                    "Jane Harper",
                    "Kieran Elliott's life changed forever on a single day when a reckless mistake led to devastating consequences. The guilt that haunts him still resurfaces during a visit with his young family to the small coastal town he once called home.\n" +
                            "\n" +
                            "Kieran's parents are struggling in a community which is bound, for better or worse, to the sea that is both a lifeline and a threat. Between them all is his absent brother Finn.\n" +
                            "\n" +
                            "When a body is discovered on the beach, long-held secrets threaten to emerge in the murder investigation that follows. A sunken wreck, a missing girl, and questions that have never washed away...",
                    "978-0-34-914374-3",
                    "Little, Brown Book Group",
                    2021,
                    4.8,
                    "https://www.waterstones.com/book/the-survivors/jane-harper/9780349143743",
                    "https://cdn.waterstones.com/bookjackets/large/9780/3491/9780349143743.jpg",
                    false,
                    "thriller"
            );
            Book book26 = new Book(
                    "The Five: The Untold Lives of the Women Killed by Jack the Ripper",
                    "Hallie Rubenhold",
                    "Five devastating human stories and a dark and moving portrait of Victorian London - the untold lives of the women killed by Jack the Ripper.\n" +
                            "\n" +
                            "Annie, Elizabeth, Catherine and Mary-Jane are famous for the same thing, though they never met. They came from Fleet Street, Knightsbridge, Wolverhampton, Sweden and Wales. They wrote ballads, ran coffee houses, lived on country estates, they breathed ink-dust from printing presses and escaped people-traffickers. What they had in common was the year of their murders: 1888.\n" +
                            "\n" +
                            "The person responsible was never identified, but the character created by the press to fill that gap has become far more famous than any of these five women. For more than a century, newspapers have been keen to tell us that 'the Ripper' preyed on prostitutes. Not only is this untrue, as historian Hallie Rubenhold has discovered, it has prevented the real stories of these fascinating women from being told.\n" +
                            "\n" +
                            "Now, in this devastating narrative of five lives, Rubenhold finally sets the record straight, revealing a world not just of Dickens and Queen Victoria, but of poverty, homelessness and rampant misogyny. They died because they were in the wrong place at the wrong time - but their greatest misfortune was to be born a woman.",
                    "978-1-78-416234-4",
                    "Transworld Publishers Ltd",
                    2020,
                    3.5,
                    "https://www.waterstones.com/book/the-five/hallie-rubenhold/9781784162344",
                    "https://cdn.waterstones.com/bookjackets/large/9781/7841/9781784162344.jpg",
                    false,
                    "true crime"
            );
            Book book27 = new Book(
                    "The Secret Barrister: Stories of the Law and How It's Broken",
                    "The Secret Barrister",
                    "I'm a barrister, a job which requires the skills of a social worker, relationship counsellor, arm-twister, hostage negotiator, named driver, bus fare-provider, accountant, suicide watchman, coffee-supplier, surrogate parent and, on one memorable occasion, whatever the official term is for someone tasked with breaking the news to a prisoner that his girlfriend has been diagnosed with gonorrhoea.\n" +
                            "\n" +
                            "Welcome to the funny, often moving and ultimately life-changing stories of life inside the courtroom. Welcome to the world of the Secret Barrister.\n" +
                            "\n" +
                            "How can you defend a child-abuser you suspect to be guilty? What do you say to someone sentenced to ten years who you believe to be innocent? What is the law and why do we need it? And why do they wear those stupid wigs?\n" +
                            "\n" +
                            "From the criminals to the lawyers, the victims, witnesses and officers of the law, here is the best and worst of humanity, all struggling within a broken system which would never be off the front pages if the public knew what it was really like.",
                    "978-1-50-984114-1",
                    "Pan Macmillan",
                    2019,
                    3.8,
                    "https://www.waterstones.com/book/the-secret-barrister/the-secret-barrister/9781509841141",
                    "https://cdn.waterstones.com/bookjackets/large/9781/5098/9781509841141.jpg",
                    true,
                    "true crime"
            );
            Book book28 = new Book(
                    "The Secret Lives of Colour",
                    "Kassia St Clair",
                    "From its origins as a column in Elle Decoration, Kassia St Clair presents a dazzling catalogue of the hues that have shaped our planet.\n" +
                            "\n" +
                            "The Secret Lives of Colour peels back the hidden history of some 75 pigments and reveals their mesmeric relationship to our culture, from the origins of silver being the substance of choice for our tableware to Isaac Newton’s surprisingly arbitrary definition of the spectrum to entertain his own theories.",
                    "978-1-47-363083-3",
                    "John Murray Press",
                    2018,
                    4.0,
                    "https://www.waterstones.com/book/the-secret-lives-of-colour/kassia-st-clair/9781473630833",
                    "https://cdn.waterstones.com/bookjackets/large/9781/4736/9781473630833.jpg",
                    false,
                    "non-fiction"
            );
            Book book29 = new Book(
                    "The King's Painter: The Life and Times of Hans Holbein",
                    "Franny Moyle",
                    "Hans Holbein the Younger is chiefly celebrated for his beautiful and precisely realised portraiture, which includes representations of Henry VIII, Thomas More, Thomas Cromwell, Anne of Cleves, Jane Seymour and an array of the Tudor lords and ladies he encountered during the course of two sojourns in England. But beyond these familiar images, which have come to define our perception of the world of the Henrician court, Holbein was a protean and multi-faceted genius: a humanist, satirist, political propagandist, and contributor to the history of book design as well as a religious artist and court painter. The rich layers of symbolism and allusion that characterise his work have proved especially fascinating to scholars.\n" +
                            "\n" +
                            "Franny Moyle traces and analyses the life and work of an extraordinary artist against the backdrop of an era of political turbulence and cultural transformation, to which his art offers a subtle and endlessly refracting mirror.",
                    "978-1-78-854121-3",
                    "Head of Zeus",
                    2021,
                    3.0,
                    "https://www.waterstones.com/book/the-kings-painter/franny-moyle/9781788541213",
                    "https://cdn.waterstones.com/bookjackets/large/9781/7885/9781788541213.jpg",
                    true,
                    "non-fiction"
            );

            bookRepository.saveAll(
                    Arrays.asList(book1, book2, book3, book4, book5, book6, book7, book8, book9,
                            book10, book11, book12, book13, book14, book15, book15, book16, book17,
                            book18, book19, book20, book21, book22, book23, book24, book25, book26,
                            book27, book28, book29)
            );
        };
    }
}