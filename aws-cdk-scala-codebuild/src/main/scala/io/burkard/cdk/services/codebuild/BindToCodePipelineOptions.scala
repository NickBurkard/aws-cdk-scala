package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BindToCodePipelineOptions {

  def apply(
    artifactBucket: Option[software.amazon.awscdk.services.s3.IBucket] = None
  ): software.amazon.awscdk.services.codebuild.BindToCodePipelineOptions =
    (new software.amazon.awscdk.services.codebuild.BindToCodePipelineOptions.Builder)
      .artifactBucket(artifactBucket.orNull)
      .build()
}
