package io.burkard.cdk.cloudassembly


sealed abstract class FileAssetPackaging(val underlying: software.amazon.awscdk.cloudassembly.schema.FileAssetPackaging)
  extends Product
    with Serializable


object FileAssetPackaging {
  implicit def toAws(value: FileAssetPackaging): software.amazon.awscdk.cloudassembly.schema.FileAssetPackaging =
    Option(value).map(_.underlying).orNull

  case object File
    extends FileAssetPackaging(software.amazon.awscdk.cloudassembly.schema.FileAssetPackaging.FILE)

  case object ZipDirectory
    extends FileAssetPackaging(software.amazon.awscdk.cloudassembly.schema.FileAssetPackaging.ZIP_DIRECTORY)
}
