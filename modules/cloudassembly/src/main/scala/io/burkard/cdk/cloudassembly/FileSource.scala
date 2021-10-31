package io.burkard.cdk.cloudassembly

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FileSource {

  def apply(
    packaging: Option[software.amazon.awscdk.cloudassembly.schema.FileAssetPackaging] = None,
    path: Option[String] = None,
    executable: Option[List[String]] = None
  ): software.amazon.awscdk.cloudassembly.schema.FileSource =
    (new software.amazon.awscdk.cloudassembly.schema.FileSource.Builder)
      .packaging(packaging.orNull)
      .path(path.orNull)
      .executable(executable.map(_.asJava).orNull)
      .build()
}
