package io.burkard.cdk.core


sealed abstract class FileAssetPackaging(val underlying: software.amazon.awscdk.FileAssetPackaging)
  extends Product
    with Serializable


object FileAssetPackaging {
  implicit def toAws(value: FileAssetPackaging): software.amazon.awscdk.FileAssetPackaging =
    Option(value).map(_.underlying).orNull

  case object ZipDirectory
    extends FileAssetPackaging(software.amazon.awscdk.FileAssetPackaging.ZIP_DIRECTORY)

  case object File
    extends FileAssetPackaging(software.amazon.awscdk.FileAssetPackaging.FILE)
}
