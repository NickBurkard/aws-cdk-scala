package io.burkard.cdk.services.route53recoveryreadiness

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ResourceProperty {

  def apply(
    readinessScopes: Option[List[String]] = None,
    resourceArn: Option[String] = None,
    componentId: Option[String] = None,
    dnsTargetResource: Option[software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.DNSTargetResourceProperty] = None
  ): software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.ResourceProperty =
    (new software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.ResourceProperty.Builder)
      .readinessScopes(readinessScopes.map(_.asJava).orNull)
      .resourceArn(resourceArn.orNull)
      .componentId(componentId.orNull)
      .dnsTargetResource(dnsTargetResource.orNull)
      .build()
}
