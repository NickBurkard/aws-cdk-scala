package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AsyncInferenceOutputConfigProperty {

  def apply(
    s3OutputPath: String,
    kmsKeyId: Option[String] = None,
    notificationConfig: Option[software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceNotificationConfigProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceOutputConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceOutputConfigProperty.Builder)
      .s3OutputPath(s3OutputPath)
      .kmsKeyId(kmsKeyId.orNull)
      .notificationConfig(notificationConfig.orNull)
      .build()
}
