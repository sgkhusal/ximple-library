```mermaid

classDiagram
direction TB

Library *-- Member
Review --o Member
Review --o BookEdition
Review --* Book
Country -- Address
Country --o Author
Address -- Library
Author --o Book
Library *-- BookCopy
Library o-- Reservation
Library *-- WaitList
Reservation --o BookCopy
BookCopy --* Book
BookCopy --o BookEdition
BookEdition --* Book
BookEdition --o Publisher
Address -- Publisher

class Library {
    -String name
    -Adress address
    -BookCopy books
    makeReservation(book)
}
class Country {
    -String name
    -String country_code
}
class Author {
    -String firstName
    -String lastName
    -LocalDate birth
    -LocalDate death
    -Country nationality
}
class Publisher {
    -String name
    -String email
    -String phoneNumber
    -Adress address
    -LocalDate registerDate
}
class BookCopy {
    -Library library
    -Book book
    -BookEdition edition
    -BookCopyStatus status
}
class BookEdition {
    -Book book
    -Publisher publisher
    -int year
    -int editionNumber
    -int pages
    -Language language
}
class Book {
    -String ISBN
    -String ISSN
    -String title
    -Author author
    -Genre genre
}
class LibraryCatalog {
    -Library library
    -Book books
    addBook(bookEdition, qty)
}
class Reservation {
    -Library library
    -BookCopy bookCopy
    -Member member
    -LocalDate availableDate
    -LocalDate loanDate
    -LocalDate dueDate
    -LocalDate returnDate
    -ReservationStatus status
}
class WaitList {
    -Book book
    -Member member
    -LocalDateTime enterDate
}

class Member {
    -Library library
    -String email
    -String document
    -String phoneNumber
    -String firstName
    -String lastName
    -String password
    -Address address
    -Bool isStaff
    -LocalDate registerDate
}
class Review {
    -Member member
    -Book book
    -BookEdition edition
    -LocalDateTime reviewDateTime
    addReview()
}
```
