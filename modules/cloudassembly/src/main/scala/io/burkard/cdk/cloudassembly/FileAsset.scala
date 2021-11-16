package io.burkard.cdk.cloudassembly

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FileAsset {

  def apply(
    source: software.amazon.awscdk.cloudassembly.schema.FileSource,
    destinations: Map[String, _ <: software.amazon.awscdk.cloudassembly.schema.FileDestination]
  ): software.amazon.awscdk.cloudassembly.schema.FileAsset =
    (new software.amazon.awscdk.cloudassembly.schema.FileAsset.Builder)
      .source(source)
      .destinations(destinations.asJava)
      .build()
}
