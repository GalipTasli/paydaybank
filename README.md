# paydaybank
İnfonal 2021 yaz stajı projesi java backend bölümü.
## Package.Entities.Concretes
![Ekran Alıntısı](https://user-images.githubusercontent.com/59477693/133037656-76f29873-7f28-4931-adb3-f3444db5956b.PNG)

Veri tabanındaki tablolara ve verilere ulaşabilmek için isimlendirme kurallarına dikkat ederek Entity(varlık) sınıflarımı oluşturdum. Spring Boot anotasyonları ile tabloları ilgili sınıflar ile kolonları da ilgili alanlar(fields) ile ilişkilendirdim
Veri tabanındaki tablolara ve verilere ulaşabilmek için isimlendirme kurallarına dikkat ederek Entity(varlık) sınıflarımı oluşturdum. Spring Boot anotasyonları ile tabloları ilgili sınıflar ile kolonları da ilgili alanlar(fields) ile ilişkilendirdim.

## Package.DataAccess.Abstracts

![dao](https://user-images.githubusercontent.com/59477693/133038047-44479d62-38e2-4aac-b096-4a5cfcdfa356.PNG)

Database tarafında verilere ulaşmak ve çeşitli sorgular oluşturmak için ilgili sınıflarımın Dao(DataAccessObject) interfacelerini oluşturdum ve bütün interface'leri JpaRepository'den extends ettim. JpaRepository'den gelen hazır metotlara/sorgulara ek olarak farklı sorgular ile kontroller gerçekleştirmek için isimlendirme kurallarına özen göstererek findBy metotlarımın imzalarını oluşturdum.

## Package.Core.Utilities.Results
![result](https://user-images.githubusercontent.com/59477693/133038429-0be89b78-81bf-4c24-952c-c78660a667cb.PNG)

Results ve DataResults yapılarını oluşturdum.

## Package.Business.Abstracts
![abstracts](https://user-images.githubusercontent.com/59477693/133038977-3787c126-ec36-4e16-802b-cef0ab1bb1d7.PNG)Veritabanındaki verileri listelemek ve veriler üzerinde değişiklik yapmak, aynı zamanda bu işlemleri gerçekleştirmeden önce belli kurallar belirleyerek bu kurallara göre işlemleri gerçekleştirmek için kullanacağım operasyonların servislerini(interface) ve metot imzalarını oluşturdum. İşlemleri datalar ile yapacağım için metot imzalarımı DataResult yapısında oluşturdum.

