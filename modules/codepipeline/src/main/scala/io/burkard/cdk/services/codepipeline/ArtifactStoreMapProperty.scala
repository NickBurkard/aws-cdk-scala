package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ArtifactStoreMapProperty {

  def apply(
    artifactStore: software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty,
    region: String
  ): software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreMapProperty =
    (new software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreMapProperty.Builder)
      .artifactStore(artifactStore)
      .region(region)
      .build()
}
