package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CaptureOptionProperty {

  def apply(
    captureMode: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureOptionProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureOptionProperty.Builder)
      .captureMode(captureMode.orNull)
      .build()
}
