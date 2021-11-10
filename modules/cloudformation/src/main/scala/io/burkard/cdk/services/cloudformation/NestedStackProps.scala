package io.burkard.cdk.services.cloudformation

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NestedStackProps {

  def apply(
    parameters: Option[Map[String, String]] = None,
    notifications: Option[List[_ <: software.amazon.awscdk.services.sns.ITopic]] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.cloudformation.NestedStackProps =
    (new software.amazon.awscdk.services.cloudformation.NestedStackProps.Builder)
      .parameters(parameters.map(_.asJava).orNull)
      .notifications(notifications.map(_.asJava).orNull)
      .timeout(timeout.orNull)
      .build()
}
