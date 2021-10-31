package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EdgeOutputConfigProperty {

  def apply(
    s3OutputLocation: Option[String] = None,
    kmsKeyId: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnDeviceFleet.EdgeOutputConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnDeviceFleet.EdgeOutputConfigProperty.Builder)
      .s3OutputLocation(s3OutputLocation.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .build()
}
