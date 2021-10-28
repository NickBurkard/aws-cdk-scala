package io.burkard.cdk.services.route53

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnHealthCheckProps {

  def apply(
    healthCheckConfig: Option[software.amazon.awscdk.services.route53.CfnHealthCheck.HealthCheckConfigProperty] = None,
    healthCheckTags: Option[List[_]] = None
  ): software.amazon.awscdk.services.route53.CfnHealthCheckProps =
    (new software.amazon.awscdk.services.route53.CfnHealthCheckProps.Builder)
      .healthCheckConfig(healthCheckConfig.orNull)
      .healthCheckTags(healthCheckTags.map(_.asJava).orNull)
      .build()
}
