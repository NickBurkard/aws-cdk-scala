package io.burkard.cdk.services.config

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnOrganizationConformancePackProps {

  def apply(
    organizationConformancePackName: String,
    templateS3Uri: Option[String] = None,
    excludedAccounts: Option[List[String]] = None,
    templateBody: Option[String] = None,
    deliveryS3KeyPrefix: Option[String] = None,
    deliveryS3Bucket: Option[String] = None,
    conformancePackInputParameters: Option[List[_]] = None
  ): software.amazon.awscdk.services.config.CfnOrganizationConformancePackProps =
    (new software.amazon.awscdk.services.config.CfnOrganizationConformancePackProps.Builder)
      .organizationConformancePackName(organizationConformancePackName)
      .templateS3Uri(templateS3Uri.orNull)
      .excludedAccounts(excludedAccounts.map(_.asJava).orNull)
      .templateBody(templateBody.orNull)
      .deliveryS3KeyPrefix(deliveryS3KeyPrefix.orNull)
      .deliveryS3Bucket(deliveryS3Bucket.orNull)
      .conformancePackInputParameters(conformancePackInputParameters.map(_.asJava).orNull)
      .build()
}
