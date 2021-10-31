package io.burkard.cdk.cloudassembly

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AssemblyManifest {

  def apply(
    artifacts: Option[Map[String, _ <: software.amazon.awscdk.cloudassembly.schema.ArtifactManifest]] = None,
    version: Option[String] = None,
    missing: Option[List[_ <: software.amazon.awscdk.cloudassembly.schema.MissingContext]] = None,
    runtime: Option[software.amazon.awscdk.cloudassembly.schema.RuntimeInfo] = None
  ): software.amazon.awscdk.cloudassembly.schema.AssemblyManifest =
    (new software.amazon.awscdk.cloudassembly.schema.AssemblyManifest.Builder)
      .artifacts(artifacts.map(_.asJava).orNull)
      .version(version.orNull)
      .missing(missing.map(_.asJava).orNull)
      .runtime(runtime.orNull)
      .build()
}
