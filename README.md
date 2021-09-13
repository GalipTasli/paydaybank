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
![abstract](https://user-images.githubusercontent.com/59477693/133039637-d851c1f4-9de6-4b81-93ed-05e1b023eb05.PNG)

Veritabanındaki verileri listelemek ve veriler üzerinde değişiklik yapmak, aynı zamanda bu işlemleri gerçekleştirmeden önce belli kurallar belirleyerek bu kurallara göre işlemleri gerçekleştirmek için kullanacağım operasyonların servislerini(interface) ve metot imzalarını oluşturdum. İşlemleri datalar ile yapacağım için metot imzalarımı DataResult yapısında oluşturdum.
## Package.Business.Concretes
![concretes](https://user-images.githubusercontent.com/59477693/133040090-d05bdb4a-df59-422c-af30-5b30a484e85f.PNG)

İlgili servisin ilgili yönetici(Manager) sınıflarını oluşturdum ve implementasyonlarını gerçekleştirdim. Metotları sorumluluklarına göre iş kurallarını da belirleyerek doldurdum. İlgili tablolarda değişiklikler yapabilmek için ilgili sınıflarda gerekli dependency injectionları gerçekleştirdim. Inject ettiğim servislere(interface) instance olabilecek sınıfları otomatik olarak bulması ve bu sınıflardan instance oluşturması için Spring Boot ile gelen @Autowired anotasyonunu kullandım. Bu sınıfları ayrıca servis olarak kullanacağım için @Service anotasyonunu da bütün sınıflara ekledim.

## Package.Api.Controllers
![api](https://user-images.githubusercontent.com/59477693/133040394-59c32d0d-16f8-4689-a1e7-4beb92900531.PNG)

Request gönderilen sayfaların alakalı operasyonları yerine getirebilmesi için ilgili sınıfların controller yapılarını oluşturdum. Her bir sınıf için; controller(denetçi,kontrolör) olduğunu sisteme belirtmek için @RestController, belirtilen adrese istek geldiğinde controller'ın çalışmasını sağlamak için @RequestMapping, belirtilen servise istek geldiğinde veri getirmek için @GetMapping ve belirtilen servise istek geldiğinde veri göndermek için @PostMapping anotasyonlarını kullandım. Sınıfların ilgili tablolarda/verilerde işlem yapabilmesi için gerekli servislerin dependency injectionlarını yaptım ve bu servislere karşılık gelebilecek sınıfları otomatik bulup, instance oluşturması için @Autowired anotasyonunu kullandım. Son olarak controller sınıflarımın metotlarını oluşturdum.

![swagger](https://user-images.githubusercontent.com/59477693/133043281-33e9ae4e-6e56-4794-8c19-cd1248d3b363.PNG)

 Eksiklerim ve yanlışlarım için ya da görüş ve tavsiyeleriniz için galiptasli.gg@gmail.com email adresimden iletişim kurabilirsiniz.

