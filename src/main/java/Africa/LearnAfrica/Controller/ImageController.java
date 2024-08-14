package Africa.LearnAfrica.Controller;

import Africa.LearnAfrica.Service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/images")
public class ImageController {

    @Autowired
    private ImageService imageService;

    @GetMapping("/{entity}/{id}")
    public ResponseEntity<Resource> getImage(@PathVariable String entity, @PathVariable Long id) {
        byte[] imageData = imageService.getImageById(entity, id); // Fetch image from service
        if (imageData == null) {
            return ResponseEntity.notFound().build();
        }
        ByteArrayResource resource = new ByteArrayResource(imageData);
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_JPEG) // Set correct MIME type if needed
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=image.jpg")
                .body(resource);
    }
}
