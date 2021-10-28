package io.burkard.cdk.services.config

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnConformancePack {

  def apply(
    internalResourceId: String,
    conformancePackInputParameters: Option[List[_]] = None,
    templateS3Uri: Option[String] = None,
    templateBody: Option[String] = None,
    deliveryS3KeyPrefix: Option[String] = None,
    deliveryS3Bucket: Option[String] = None,
    conformancePackName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.config.CfnConformancePack =
    software.amazon.awscdk.services.config.CfnConformancePack.Builder
      .create(stackCtx, internalResourceId)
      .conformancePackInputParameters(conformancePackInputParameters.map(_.asJava).orNull)
      .templateS3Uri(templateS3Uri.orNull)
      .templateBody(templateBody.orNull)
      .deliveryS3KeyPrefix(deliveryS3KeyPrefix.orNull)
      .deliveryS3Bucket(deliveryS3Bucket.orNull)
      .conformancePackName(conformancePackName.orNull)
      .build()
}