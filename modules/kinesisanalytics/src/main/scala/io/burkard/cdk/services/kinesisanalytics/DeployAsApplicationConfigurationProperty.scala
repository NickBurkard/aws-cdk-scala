package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DeployAsApplicationConfigurationProperty {

  def apply(
    s3ContentLocation: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentBaseLocationProperty] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.DeployAsApplicationConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.DeployAsApplicationConfigurationProperty.Builder)
      .s3ContentLocation(s3ContentLocation.orNull)
      .build()
}
