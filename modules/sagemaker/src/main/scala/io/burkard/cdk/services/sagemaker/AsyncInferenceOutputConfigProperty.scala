package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AsyncInferenceOutputConfigProperty {

  def apply(
    s3OutputPath: Option[String] = None,
    kmsKeyId: Option[String] = None,
    notificationConfig: Option[software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceNotificationConfigProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceOutputConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceOutputConfigProperty.Builder)
      .s3OutputPath(s3OutputPath.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .notificationConfig(notificationConfig.orNull)
      .build()
}
