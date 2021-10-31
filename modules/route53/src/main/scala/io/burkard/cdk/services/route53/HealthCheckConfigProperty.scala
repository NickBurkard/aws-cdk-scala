package io.burkard.cdk.services.route53

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HealthCheckConfigProperty {

  def apply(
    enableSni: Option[Boolean] = None,
    inverted: Option[Boolean] = None,
    alarmIdentifier: Option[software.amazon.awscdk.services.route53.CfnHealthCheck.AlarmIdentifierProperty] = None,
    failureThreshold: Option[Number] = None,
    searchString: Option[String] = None,
    regions: Option[List[String]] = None,
    port: Option[Number] = None,
    `type`: Option[String] = None,
    fullyQualifiedDomainName: Option[String] = None,
    measureLatency: Option[Boolean] = None,
    healthThreshold: Option[Number] = None,
    resourcePath: Option[String] = None,
    childHealthChecks: Option[List[String]] = None,
    requestInterval: Option[Number] = None,
    ipAddress: Option[String] = None,
    insufficientDataHealthStatus: Option[String] = None
  ): software.amazon.awscdk.services.route53.CfnHealthCheck.HealthCheckConfigProperty =
    (new software.amazon.awscdk.services.route53.CfnHealthCheck.HealthCheckConfigProperty.Builder)
      .enableSni(enableSni.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .inverted(inverted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .alarmIdentifier(alarmIdentifier.orNull)
      .failureThreshold(failureThreshold.orNull)
      .searchString(searchString.orNull)
      .regions(regions.map(_.asJava).orNull)
      .port(port.orNull)
      .`type`(`type`.orNull)
      .fullyQualifiedDomainName(fullyQualifiedDomainName.orNull)
      .measureLatency(measureLatency.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .healthThreshold(healthThreshold.orNull)
      .resourcePath(resourcePath.orNull)
      .childHealthChecks(childHealthChecks.map(_.asJava).orNull)
      .requestInterval(requestInterval.orNull)
      .ipAddress(ipAddress.orNull)
      .insufficientDataHealthStatus(insufficientDataHealthStatus.orNull)
      .build()
}
