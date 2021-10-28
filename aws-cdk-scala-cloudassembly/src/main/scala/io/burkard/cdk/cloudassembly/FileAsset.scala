package io.burkard.cdk.cloudassembly

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FileAsset {

  def apply(
    source: Option[software.amazon.awscdk.cloudassembly.schema.FileSource] = None,
    destinations: Option[Map[String, _ <: software.amazon.awscdk.cloudassembly.schema.FileDestination]] = None
  ): software.amazon.awscdk.cloudassembly.schema.FileAsset =
    (new software.amazon.awscdk.cloudassembly.schema.FileAsset.Builder)
      .source(source.orNull)
      .destinations(destinations.map(_.asJava).orNull)
      .build()
}
