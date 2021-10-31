package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DataCaptureConfigProperty {

  def apply(
    initialSamplingPercentage: Option[Number] = None,
    captureOptions: Option[List[_]] = None,
    destinationS3Uri: Option[String] = None,
    kmsKeyId: Option[String] = None,
    enableCapture: Option[Boolean] = None,
    captureContentTypeHeader: Option[software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureContentTypeHeaderProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.DataCaptureConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.DataCaptureConfigProperty.Builder)
      .initialSamplingPercentage(initialSamplingPercentage.orNull)
      .captureOptions(captureOptions.map(_.asJava).orNull)
      .destinationS3Uri(destinationS3Uri.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .enableCapture(enableCapture.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .captureContentTypeHeader(captureContentTypeHeader.orNull)
      .build()
}
