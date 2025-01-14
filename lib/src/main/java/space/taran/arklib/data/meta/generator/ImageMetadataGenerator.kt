package dev.arkbuilders.arklib.data.meta.generator

import dev.arkbuilders.arklib.data.index.Resource
import dev.arkbuilders.arklib.data.meta.Metadata
import dev.arkbuilders.arklib.data.meta.MetadataGenerator
import java.nio.file.Path

object ImageMetadataGenerator: MetadataGenerator {

    override val acceptedExtensions: Set<String>
        get() = setOf("bmp", "gif", "ico", "jpg", "jpeg",
            "png", "tif", "tiff",
            "webp", "heic", "heif",
            "avif")

    override val acceptedMimeTypes: Set<String>
        get() = setOf(
            "image/bmp",
            "image/gif",
            "image/vnd.microsoft.icon",
            "image/jpeg",
            "image/jpg",
            "image/png",
            "image/tiff",
            "image/webp",
            "image/heic",
            "image/avif"
        )

    override fun generate(path: Path, resource: Resource): Result<Metadata> =
        Result.success(Metadata.Image())
}
