package io.burkard.cdk.cloudassembly

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DockerImageAsset {

  def apply(
    source: Option[software.amazon.awscdk.cloudassembly.schema.DockerImageSource] = None,
    destinations: Option[Map[String, _ <: software.amazon.awscdk.cloudassembly.schema.DockerImageDestination]] = None
  ): software.amazon.awscdk.cloudassembly.schema.DockerImageAsset =
    (new software.amazon.awscdk.cloudassembly.schema.DockerImageAsset.Builder)
      .source(source.orNull)
      .destinations(destinations.map(_.asJava).orNull)
      .build()
}
