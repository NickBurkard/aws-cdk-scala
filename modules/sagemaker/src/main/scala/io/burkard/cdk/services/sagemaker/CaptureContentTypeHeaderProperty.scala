package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CaptureContentTypeHeaderProperty {

  def apply(
    csvContentTypes: Option[List[String]] = None,
    jsonContentTypes: Option[List[String]] = None
  ): software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureContentTypeHeaderProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.CaptureContentTypeHeaderProperty.Builder)
      .csvContentTypes(csvContentTypes.map(_.asJava).orNull)
      .jsonContentTypes(jsonContentTypes.map(_.asJava).orNull)
      .build()
}
