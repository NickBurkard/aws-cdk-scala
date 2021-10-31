package io.burkard.cdk.services.config

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnConformancePackProps {

  def apply(
    conformancePackInputParameters: Option[List[_]] = None,
    templateS3Uri: Option[String] = None,
    templateBody: Option[String] = None,
    deliveryS3KeyPrefix: Option[String] = None,
    deliveryS3Bucket: Option[String] = None,
    conformancePackName: Option[String] = None
  ): software.amazon.awscdk.services.config.CfnConformancePackProps =
    (new software.amazon.awscdk.services.config.CfnConformancePackProps.Builder)
      .conformancePackInputParameters(conformancePackInputParameters.map(_.asJava).orNull)
      .templateS3Uri(templateS3Uri.orNull)
      .templateBody(templateBody.orNull)
      .deliveryS3KeyPrefix(deliveryS3KeyPrefix.orNull)
      .deliveryS3Bucket(deliveryS3Bucket.orNull)
      .conformancePackName(conformancePackName.orNull)
      .build()
}
