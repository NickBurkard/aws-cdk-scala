package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3SourceVariables {

  def apply(
    versionId: String,
    eTag: String
  ): software.amazon.awscdk.services.codepipeline.actions.S3SourceVariables =
    (new software.amazon.awscdk.services.codepipeline.actions.S3SourceVariables.Builder)
      .versionId(versionId)
      .eTag(eTag)
      .build()
}
