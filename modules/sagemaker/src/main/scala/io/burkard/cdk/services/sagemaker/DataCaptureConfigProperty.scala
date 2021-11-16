package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DataCaptureConfigProperty {

  def apply(
    initialSamplingPercentage: Number,
    captureOptions: List[_],
    destinationS3Uri: String,
    kmsKeyId: Option[String] = None,
    enableCapture: Option[Boolean] = None,
    captureContentTypeHeader: Option[software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureContentTypeHeaderProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.DataCaptureConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.DataCaptureConfigProperty.Builder)
      .initialSamplingPercentage(initialSamplingPercentage)
      .captureOptions(captureOptions.asJava)
      .destinationS3Uri(destinationS3Uri)
      .kmsKeyId(kmsKeyId.orNull)
      .enableCapture(enableCapture.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .captureContentTypeHeader(captureContentTypeHeader.orNull)
      .build()
}
