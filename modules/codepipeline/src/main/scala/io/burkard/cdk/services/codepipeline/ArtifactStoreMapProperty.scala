package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ArtifactStoreMapProperty {

  def apply(
    artifactStore: Option[software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty] = None,
    region: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreMapProperty =
    (new software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreMapProperty.Builder)
      .artifactStore(artifactStore.orNull)
      .region(region.orNull)
      .build()
}
