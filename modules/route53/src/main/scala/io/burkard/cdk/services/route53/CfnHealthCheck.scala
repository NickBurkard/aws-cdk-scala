package io.burkard.cdk.services.route53

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnHealthCheck {

  def apply(
    internalResourceId: String,
    healthCheckConfig: Option[software.amazon.awscdk.services.route53.CfnHealthCheck.HealthCheckConfigProperty] = None,
    healthCheckTags: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53.CfnHealthCheck =
    software.amazon.awscdk.services.route53.CfnHealthCheck.Builder
      .create(stackCtx, internalResourceId)
      .healthCheckConfig(healthCheckConfig.orNull)
      .healthCheckTags(healthCheckTags.map(_.asJava).orNull)
      .build()
}
