package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BindToCodePipelineOptions {

  def apply(
    artifactBucket: software.amazon.awscdk.services.s3.IBucket
  ): software.amazon.awscdk.services.codebuild.BindToCodePipelineOptions =
    (new software.amazon.awscdk.services.codebuild.BindToCodePipelineOptions.Builder)
      .artifactBucket(artifactBucket)
      .build()
}
