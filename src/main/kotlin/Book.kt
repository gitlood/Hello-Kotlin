class Book(
    val title: String,
    val author: String,
    val year: Int
) {
    fun getTitleAuthor(): Pair<String, String> {
        return Pair(title, author)
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}


fun main() {
    val book = Book("Elon Musk", "Ashlee Vance", 2012)

    val (title, author) = book.getTitleAuthor()
    val (title1, author1, year) = book.getTitleAuthorYear()

    println("Here is your book ${book.title} written by ${book.author} in ${book.year}")
}