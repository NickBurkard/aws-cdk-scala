package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CaptureOptionProperty {

  def apply(
    captureMode: String
  ): software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureOptionProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureOptionProperty.Builder)
      .captureMode(captureMode)
      .build()
}
