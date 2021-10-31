package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSecurityProfile {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    additionalMetricsToRetainV2: Option[List[_]] = None,
    targetArns: Option[List[String]] = None,
    behaviors: Option[List[_]] = None,
    securityProfileName: Option[String] = None,
    securityProfileDescription: Option[String] = None,
    alertTargets: Option[Map[String, _]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot.CfnSecurityProfile =
    software.amazon.awscdk.services.iot.CfnSecurityProfile.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .additionalMetricsToRetainV2(additionalMetricsToRetainV2.map(_.asJava).orNull)
      .targetArns(targetArns.map(_.asJava).orNull)
      .behaviors(behaviors.map(_.asJava).orNull)
      .securityProfileName(securityProfileName.orNull)
      .securityProfileDescription(securityProfileDescription.orNull)
      .alertTargets(alertTargets.map(_.asJava).orNull)
      .build()
}
