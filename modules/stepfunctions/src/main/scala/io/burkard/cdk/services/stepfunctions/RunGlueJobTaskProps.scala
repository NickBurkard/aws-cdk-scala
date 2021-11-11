package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RunGlueJobTaskProps {

  def apply(
    securityConfiguration: Option[String] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern] = None,
    notifyDelayAfter: Option[software.amazon.awscdk.Duration] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    arguments: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.RunGlueJobTaskProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.RunGlueJobTaskProps.Builder)
      .securityConfiguration(securityConfiguration.orNull)
      .integrationPattern(integrationPattern.orNull)
      .notifyDelayAfter(notifyDelayAfter.orNull)
      .timeout(timeout.orNull)
      .arguments(arguments.map(_.asJava).orNull)
      .build()
}
