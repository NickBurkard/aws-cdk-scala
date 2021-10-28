package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3SourceVariables {

  def apply(
    versionId: Option[String] = None,
    eTag: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.actions.S3SourceVariables =
    (new software.amazon.awscdk.services.codepipeline.actions.S3SourceVariables.Builder)
      .versionId(versionId.orNull)
      .eTag(eTag.orNull)
      .build()
}
