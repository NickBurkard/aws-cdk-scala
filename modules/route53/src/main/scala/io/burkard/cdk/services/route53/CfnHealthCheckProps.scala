package io.burkard.cdk.services.route53

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnHealthCheckProps {

  def apply(
    healthCheckConfig: software.amazon.awscdk.services.route53.CfnHealthCheck.HealthCheckConfigProperty,
    healthCheckTags: Option[List[_]] = None
  ): software.amazon.awscdk.services.route53.CfnHealthCheckProps =
    (new software.amazon.awscdk.services.route53.CfnHealthCheckProps.Builder)
      .healthCheckConfig(healthCheckConfig)
      .healthCheckTags(healthCheckTags.map(_.asJava).orNull)
      .build()
}
