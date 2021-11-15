package io.burkard.cdk.services.robomaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SourceConfigProperty {

  def apply(
    s3Bucket: Option[String] = None,
    architecture: Option[String] = None,
    s3Key: Option[String] = None
  ): software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SourceConfigProperty =
    (new software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SourceConfigProperty.Builder)
      .s3Bucket(s3Bucket.orNull)
      .architecture(architecture.orNull)
      .s3Key(s3Key.orNull)
      .build()
}
