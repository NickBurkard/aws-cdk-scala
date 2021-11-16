package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ActionBindOptions {

  def apply(
    role: software.amazon.awscdk.services.iam.IRole,
    bucket: software.amazon.awscdk.services.s3.IBucket
  ): software.amazon.awscdk.services.codepipeline.ActionBindOptions =
    (new software.amazon.awscdk.services.codepipeline.ActionBindOptions.Builder)
      .role(role)
      .bucket(bucket)
      .build()
}
