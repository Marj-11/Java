package week8.Robo;

import java.util.List;
import java.util.Optional;

public class Sensor {

    public  Optional<String> getDecryptedTrick(String line) {

    List<Decryptor> decryptores = Decryptors.getDecryptors();
    for (Decryptor decryptore : decryptores) {

        if (decryptore.isThere(line)) {
            return Optional.of(decryptore.decriptor(line));
        }
    }
    return Optional.empty();

    }
}