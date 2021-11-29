package io.burkard.cdk.services.robomaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SourceConfigProperty {

  def apply(
    s3Bucket: String,
    architecture: String,
    s3Key: String
  ): software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SourceConfigProperty =
    (new software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SourceConfigProperty.Builder)
      .s3Bucket(s3Bucket)
      .architecture(architecture)
      .s3Key(s3Key)
      .build()
}
