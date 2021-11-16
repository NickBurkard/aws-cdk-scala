package io.burkard.cdk.services.route53

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnHealthCheck {

  def apply(
    internalResourceId: String,
    healthCheckConfig: software.amazon.awscdk.services.route53.CfnHealthCheck.HealthCheckConfigProperty,
    healthCheckTags: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53.CfnHealthCheck =
    software.amazon.awscdk.services.route53.CfnHealthCheck.Builder
      .create(stackCtx, internalResourceId)
      .healthCheckConfig(healthCheckConfig)
      .healthCheckTags(healthCheckTags.map(_.asJava).orNull)
      .build()
}
