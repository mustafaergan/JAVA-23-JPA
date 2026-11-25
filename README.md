# JPA ve Spring Boot ile Sunucu Yönetimi Örneği

JPA (Hibernate) ile varlık ilişkilerini anlatan ders örneği: sunucular, personel, adresler ve yöneticiler.
Önce düz JPA ile yazılmış, ardından aynı varlıklar Spring Boot projesine taşınmıştır.

> **Not:** Bu depo 2017 yılında eğitim amaçlı yazıldı ve artık güncellenmiyor. Bağımlılıkları eskidir ve
> bilinen güvenlik açıkları içerir; üretimde kullanmayın.

## İçerik

| Klasör | Ne yapar |
|---|---|
| `SunucuYonetim` | Düz JPA/Hibernate. `persistence.xml` ile MySQL'e bağlanır, `DAO` sınıfı `EntityManager` ile kayıt yapar. `main/Islem*.java` sınıfları sırasıyla kayıt ekleme, ilişkili kayıt ekleme ve okuma örnekleridir. |
| `ServerManagement` | Aynı varlıkların Spring Boot sürümü. `/main/hello` adresinde basit bir controller vardır; tablolar `ddl-auto=update` ile oluşturulur. |

Varlıklar ve ilişkiler (iki projede de aynı):

- `Server` (`Sunucu` tablosu) — `@ManyToOne` ile sorumlu kişiye bağlı.
- `Person` — `@OneToOne` ile `Adres`'e, `@ManyToMany` ile yöneticilere bağlı.
- `Yonetici` — `yonetici_person` ara tablosuyla birden çok personele bağlı.
- Getter/setter'lar Lombok `@Data` ile üretilir.

## Teknolojiler

- Java 8, Maven
- `SunucuYonetim`: Hibernate 5.2.10, MySQL Connector/J 5.1.9, Lombok 1.16.18
- `ServerManagement`: Spring Boot 1.5.6 (web, data-jpa), MySQL Connector/J, Lombok 1.16.18

## Çalıştırma

1. Yerelde MySQL çalıştırıp `sunucuyonetimi` adında boş bir veritabanı oluşturun.
2. Bağlantı bilgilerini kendi ortamınıza göre düzenleyin; depodaki değerler yalnızca yerel ders ortamı içindir:
   - `SunucuYonetim/src/META-INF/persistence.xml`
   - `ServerManagement/src/main/resources/application.properties`
3. IDE'de Lombok eklentisinin kurulu olduğundan emin olun.

```bash
# Spring Boot sürümü (8090 portunda açılır)
cd ServerManagement
mvn spring-boot:run
# http://localhost:8090/main/hello
```

`SunucuYonetim` için projeyi Eclipse/IntelliJ IDEA'ya Maven projesi olarak alıp `main` klasöründeki
`Islem`…`Islem4` sınıflarını çalıştırın. `Islem4`, veritabanında belirli bir numarayla kayıtlı yöneticiyi
okuduğu için önceki örneklerle veri eklenmiş olmalıdır.
