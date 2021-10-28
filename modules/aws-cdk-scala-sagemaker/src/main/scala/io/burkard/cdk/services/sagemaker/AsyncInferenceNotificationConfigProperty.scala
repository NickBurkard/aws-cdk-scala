package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AsyncInferenceNotificationConfigProperty {

  def apply(
    successTopic: Option[String] = None,
    errorTopic: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceNotificationConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceNotificationConfigProperty.Builder)
      .successTopic(successTopic.orNull)
      .errorTopic(errorTopic.orNull)
      .build()
}
