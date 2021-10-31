package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FileAssetSource {

  def apply(
    packaging: Option[software.amazon.awscdk.FileAssetPackaging] = None,
    fileName: Option[String] = None,
    sourceHash: Option[String] = None,
    executable: Option[List[String]] = None
  ): software.amazon.awscdk.FileAssetSource =
    (new software.amazon.awscdk.FileAssetSource.Builder)
      .packaging(packaging.orNull)
      .fileName(fileName.orNull)
      .sourceHash(sourceHash.orNull)
      .executable(executable.map(_.asJava).orNull)
      .build()
}
