package io.burkard.cdk.cloudassembly

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ArtifactManifest {

  def apply(
    `type`: software.amazon.awscdk.cloudassembly.schema.ArtifactType,
    displayName: Option[String] = None,
    properties0: Option[software.amazon.awscdk.cloudassembly.schema.AssetManifestProperties] = None,
    properties1: Option[software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties] = None,
    properties2: Option[software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties] = None,
    properties3: Option[software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties] = None,
    environment: Option[String] = None,
    metadata: Option[Map[String, _ <: List[_ <: software.amazon.awscdk.cloudassembly.schema.MetadataEntry]]] = None,
    dependencies: Option[List[String]] = None
  ): software.amazon.awscdk.cloudassembly.schema.ArtifactManifest =
    (new software.amazon.awscdk.cloudassembly.schema.ArtifactManifest.Builder)
      .`type`(`type`)
      .displayName(displayName.orNull)
      .properties(properties0.orNull)
      .properties(properties1.orNull)
      .properties(properties2.orNull)
      .properties(properties3.orNull)
      .environment(environment.orNull)
      .metadata(metadata.map(_.mapValues(_.asJava).toMap.asJava).orNull)
      .dependencies(dependencies.map(_.asJava).orNull)
      .build()
}
