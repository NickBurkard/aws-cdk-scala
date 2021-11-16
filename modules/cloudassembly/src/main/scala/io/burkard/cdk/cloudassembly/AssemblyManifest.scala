package io.burkard.cdk.cloudassembly

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssemblyManifest {

  def apply(
    version: String,
    artifacts: Option[Map[String, _ <: software.amazon.awscdk.cloudassembly.schema.ArtifactManifest]] = None,
    missing: Option[List[_ <: software.amazon.awscdk.cloudassembly.schema.MissingContext]] = None,
    runtime: Option[software.amazon.awscdk.cloudassembly.schema.RuntimeInfo] = None
  ): software.amazon.awscdk.cloudassembly.schema.AssemblyManifest =
    (new software.amazon.awscdk.cloudassembly.schema.AssemblyManifest.Builder)
      .version(version)
      .artifacts(artifacts.map(_.asJava).orNull)
      .missing(missing.map(_.asJava).orNull)
      .runtime(runtime.orNull)
      .build()
}
