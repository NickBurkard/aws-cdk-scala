package io.burkard.cdk.services.config

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnOrganizationConformancePackProps {

  def apply(
    templateS3Uri: Option[String] = None,
    excludedAccounts: Option[List[String]] = None,
    templateBody: Option[String] = None,
    deliveryS3KeyPrefix: Option[String] = None,
    deliveryS3Bucket: Option[String] = None,
    conformancePackInputParameters: Option[List[_]] = None,
    organizationConformancePackName: Option[String] = None
  ): software.amazon.awscdk.services.config.CfnOrganizationConformancePackProps =
    (new software.amazon.awscdk.services.config.CfnOrganizationConformancePackProps.Builder)
      .templateS3Uri(templateS3Uri.orNull)
      .excludedAccounts(excludedAccounts.map(_.asJava).orNull)
      .templateBody(templateBody.orNull)
      .deliveryS3KeyPrefix(deliveryS3KeyPrefix.orNull)
      .deliveryS3Bucket(deliveryS3Bucket.orNull)
      .conformancePackInputParameters(conformancePackInputParameters.map(_.asJava).orNull)
      .organizationConformancePackName(organizationConformancePackName.orNull)
      .build()
}
