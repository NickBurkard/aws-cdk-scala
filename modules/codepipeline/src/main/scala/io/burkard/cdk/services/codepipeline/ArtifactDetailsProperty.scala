package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ArtifactDetailsProperty {

  def apply(
    maximumCount: Option[Number] = None,
    minimumCount: Option[Number] = None
  ): software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty =
    (new software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty.Builder)
      .maximumCount(maximumCount.orNull)
      .minimumCount(minimumCount.orNull)
      .build()
}
